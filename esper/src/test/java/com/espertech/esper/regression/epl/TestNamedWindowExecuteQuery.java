/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.regression.epl;

import com.espertech.esper.client.*;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.client.deploy.DeploymentOptions;
import com.espertech.esper.client.deploy.EPDeploymentAdmin;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.regression.context.SupportHashCodeFuncGranularCRC32;
import com.espertech.esper.regression.context.SupportSelectorByHashCode;
import com.espertech.esper.regression.context.SupportSelectorCategory;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.bean.SupportBean_A;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportQueryPlanIndexHook;
import com.espertech.esper.support.util.IndexBackingTableInfo;
import com.espertech.esper.util.EventRepresentationEnum;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestNamedWindowExecuteQuery extends TestCase implements IndexBackingTableInfo
{
    private final static String[] FIELDS = new String[] {"theString", "intPrimitive"};

    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        listener = new SupportUpdateListener();

        Configuration config = SupportConfigFactory.getConfiguration();
        config.getEngineDefaults().getLogging().setEnableQueryPlan(true);
        config.addEventType("SupportBean", SupportBean.class.getName());
        config.addEventType("SupportBean_A", SupportBean_A.class.getName());
        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();

        String namedWin = "@Name('TheWindow') create window MyWindow.win:keepall() as select * from SupportBean";
        epService.getEPAdministrator().createEPL(namedWin);
        String insert = "insert into MyWindow select * from SupportBean";
        epService.getEPAdministrator().createEPL(insert);
    }

    public void tearDown() {
        listener = null;
    }

    public void testFAFInsert() {        
        EPStatement stmt = epService.getEPAdministrator().getStatement("TheWindow");
        String[] propertyNames = "theString,intPrimitive".split(",");

        // try column name provided with insert-into
        String epl = "insert into MyWindow (theString, intPrimitive) select 'a', 1";
        EPOnDemandQueryResult resultOne = epService.getEPRuntime().executeQuery(epl);
        assertFAFInsertResult(resultOne, new Object[]{"a", 1}, propertyNames, stmt);
        EPAssertionUtil.assertPropsPerRow(stmt.iterator(), propertyNames, new Object[][] {{"a", 1}});

        // try SODA and column name not provided with insert-into
        String eplTwo = "insert into MyWindow select 'b' as theString, 2 as intPrimitive";
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(eplTwo);
        EPOnDemandQueryResult resultTwo = epService.getEPRuntime().executeQuery(model);
        assertFAFInsertResult(resultTwo, new Object[]{"b", 2}, propertyNames, stmt);
        EPAssertionUtil.assertPropsPerRow(stmt.iterator(), propertyNames, new Object[][] {{"a", 1}, {"b", 2}});

        // create unique index, insert duplicate row
        epService.getEPAdministrator().createEPL("create unique index I1 on MyWindow (theString)");
        try {
            String eplThree = "insert into MyWindow (theString) select 'a' as theString";
            epService.getEPRuntime().executeQuery(eplThree);
        }
        catch (EPException ex) {
            assertEquals("Error executing statement: Unique index violation, index 'I1' is a unique index and key 'a' already exists [insert into MyWindow (theString) select 'a' as theString]", ex.getMessage());
        }
        EPAssertionUtil.assertPropsPerRow(stmt.iterator(), propertyNames, new Object[][] {{"a", 1}, {"b", 2}});

        // try second no-column-provided version
        EPStatement windowTwo = epService.getEPAdministrator().createEPL("create window WindowTwo.win:keepall() as (p0 string, p1 int)");
        epService.getEPRuntime().executeQuery("insert into WindowTwo select 'a' as p0, 1 as p1");
        EPAssertionUtil.assertPropsPerRow(windowTwo.iterator(), "p0,p1".split(","), new Object[][] {{"a", 1}});
    }

    public void testParameterizedQuery() {

        for (int i = 0; i < 10; i++) {
            epService.getEPRuntime().sendEvent(makeBean("E" + i, i, i*1000));
        }

        // test one parameter
        String eplOneParam = "select * from MyWindow where intPrimitive = ?";
        EPOnDemandPreparedQueryParameterized pqOneParam = epService.getEPRuntime().prepareQueryWithParameters(eplOneParam);
        for (int i = 0; i < 10; i++) {
            runParameterizedQuery(pqOneParam, new Object[] {i}, new String[] {"E" + i});
        }
        runParameterizedQuery(pqOneParam, new Object[] {-1}, null); // not found

        // test two parameter
        String eplTwoParam = "select * from MyWindow where intPrimitive = ? and longPrimitive = ?";
        EPOnDemandPreparedQueryParameterized pqTwoParam = epService.getEPRuntime().prepareQueryWithParameters(eplTwoParam);
        for (int i = 0; i < 10; i++) {
            runParameterizedQuery(pqTwoParam, new Object[] {i, (long) i*1000}, new String[] {"E" + i});
        }
        runParameterizedQuery(pqTwoParam, new Object[] {-1, 1000}, null); // not found

        // test in-clause with string objects
        String eplInSimple = "select * from MyWindow where theString in (?, ?, ?)";
        EPOnDemandPreparedQueryParameterized pqInSimple = epService.getEPRuntime().prepareQueryWithParameters(eplInSimple);
        runParameterizedQuery(pqInSimple, new Object[] {"A", "A", "A"}, null); // not found
        runParameterizedQuery(pqInSimple, new Object[] {"A", "E3", "A"}, new String[] {"E3"});

        // test in-clause with string array
        String eplInArray = "select * from MyWindow where theString in (?)";
        EPOnDemandPreparedQueryParameterized pqInArray = epService.getEPRuntime().prepareQueryWithParameters(eplInArray);
        runParameterizedQuery(pqInArray, new Object[] { new String[] {"E3", "E6", "E8"}}, new String[] {"E3", "E6", "E8"});

        // various combinations
        runParameterizedQuery(epService.getEPRuntime().prepareQueryWithParameters("select * from MyWindow where theString in (?) and longPrimitive = 4000"),
                new Object[] { new String[] {"E3", "E4", "E8"}}, new String[] {"E4"});
        runParameterizedQuery(epService.getEPRuntime().prepareQueryWithParameters("select * from MyWindow where longPrimitive > 8000"),
                new Object[] {}, new String[] {"E9"});
        runParameterizedQuery(epService.getEPRuntime().prepareQueryWithParameters("select * from MyWindow where longPrimitive < ?"),
                new Object[] { 2000}, new String[] {"E0", "E1"});
        runParameterizedQuery(epService.getEPRuntime().prepareQueryWithParameters("select * from MyWindow where longPrimitive between ? and ?"),
                new Object[] { 2000, 4000}, new String[] {"E2", "E3", "E4"});
    }

    private void runParameterizedQuery(EPOnDemandPreparedQueryParameterized parameterizedQuery, Object[] parameters, String[] expected) {

        for (int i = 0; i < parameters.length; i++) {
            parameterizedQuery.setObject(i+1, parameters[i]);
        }
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(parameterizedQuery);
        if (expected == null) {
            assertEquals(0, result.getArray().length);
        }
        else {
            assertEquals(expected.length, result.getArray().length);
            String[] resultStrings = new String[result.getArray().length];
            for (int i = 0; i < resultStrings.length; i++) {
                resultStrings[i] = (String) result.getArray()[i].get("theString");
            }
            EPAssertionUtil.assertEqualsAnyOrder(expected, resultStrings);
        }
    }

    public void testFAFUpdate() {
        // test update-all
        for (int i = 0; i < 2; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("update MyWindow set theString = 'ABC'");
        EPAssertionUtil.assertPropsPerRow(epService.getEPAdministrator().getStatement("TheWindow").iterator(), FIELDS, new Object[][] {{"ABC", 0}, {"ABC", 1}});
        EPAssertionUtil.assertPropsPerRow(result.getArray(), FIELDS, new Object[][] {{"ABC", 0}, {"ABC", 1}});

        // test update with where-clause
        epService.getEPRuntime().executeQuery("delete from MyWindow");
        for (int i = 0; i < 3; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        result = epService.getEPRuntime().executeQuery("update MyWindow set theString = 'X', intPrimitive=-1 where theString = 'E1'");
        EPAssertionUtil.assertPropsPerRow(result.getArray(), FIELDS, new Object[][] {{"X", -1}});
        EPAssertionUtil.assertPropsPerRow(epService.getEPAdministrator().getStatement("TheWindow").iterator(), FIELDS, new Object[][] {{"E0", 0}, {"E2", 2}, {"X", -1}});

        // test update with SODA
        String epl = "update MyWindow set intPrimitive = intPrimitive + 10 where theString = \"E2\"";
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(epl);
        assertEquals(epl, model.toEPL());
        result = epService.getEPRuntime().executeQuery(model);
        EPAssertionUtil.assertPropsPerRow(result.getArray(), FIELDS, new Object[][] {{"E2", 12}});
        EPAssertionUtil.assertPropsPerRow(epService.getEPAdministrator().getStatement("TheWindow").iterator(), FIELDS, new Object[][] {{"E0", 0}, {"X", -1}, {"E2", 12}});

        // test update with initial value
        result = epService.getEPRuntime().executeQuery("update MyWindow set intPrimitive=5, theString = 'x', theString = initial.theString || 'y', intPrimitive=initial.intPrimitive+100 where theString = 'E0'");
        EPAssertionUtil.assertPropsPerRow(result.getArray(), FIELDS, new Object[][] {{"E0y", 100}});
        EPAssertionUtil.assertPropsPerRow(epService.getEPAdministrator().getStatement("TheWindow").iterator(), FIELDS, new Object[][] {{"X", -1}, {"E2", 12}, {"E0y", 100}});
        epService.getEPRuntime().executeQuery("delete from MyWindow");

        // test with index
        epService.getEPAdministrator().createEPL("create unique index Idx1 on MyWindow (theString)");
        for (int i = 0; i < 5; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        runQueryAssertCountNonNegative(INDEX_CALLBACK_HOOK + "update MyWindow set intPrimitive=-1 where theString = 'E1' and intPrimitive = 0", 5, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCountNonNegative(INDEX_CALLBACK_HOOK + "update MyWindow set intPrimitive=-1 where theString = 'E1' and intPrimitive = 1", 4, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCountNonNegative(INDEX_CALLBACK_HOOK + "update MyWindow set intPrimitive=-1 where theString = 'E2'", 3, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCountNonNegative(INDEX_CALLBACK_HOOK + "update MyWindow set intPrimitive=-1 where intPrimitive = 4", 2, null, null);

        // test with alias
        runQueryAssertCountNonNegative(INDEX_CALLBACK_HOOK + "update MyWindow as w1 set intPrimitive=-1 where w1.theString = 'E3'", 1, "Idx1", BACKING_SINGLE_UNIQUE);

        // test consumption
        EPStatement stmt = epService.getEPAdministrator().createEPL("select irstream * from MyWindow");
        stmt.addListener(listener);
        epService.getEPRuntime().executeQuery("update MyWindow set intPrimitive=1000 where theString = 'E0'");
        EPAssertionUtil.assertProps(listener.assertPairGetIRAndReset(), FIELDS, new Object[] {"E0", 1000}, new Object[] {"E0", 0});

        // test update via UDF and setter
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("doubleInt", this.getClass().getName(), "doubleInt");
        epService.getEPRuntime().executeQuery("delete from MyWindow");
        epService.getEPRuntime().sendEvent(new SupportBean("A", 10));
        epService.getEPRuntime().executeQuery("update MyWindow mw set mw.setTheString('XYZ'), doubleInt(mw)");
        EPAssertionUtil.assertPropsPerRow(epService.getEPAdministrator().getStatement("TheWindow").iterator(),
                "theString,intPrimitive".split(","), new Object[][] {{"XYZ", 20}});
    }

    public void testFAFDelete() {
        // test delete-all
        for (int i = 0; i < 10; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        assertEquals(10L, getMyWindowCount());
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("delete from MyWindow");
        assertEquals(0L, getMyWindowCount());
        assertEquals(epService.getEPAdministrator().getConfiguration().getEventType("MyWindow"), result.getEventType());
        assertEquals(10, result.getArray().length);
        assertEquals("E0", result.getArray()[0].get("theString"));

        // test SODA + where-clause
        for (int i = 0; i < 10; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        assertEquals(10L, getMyWindowCount());
        String eplWithWhere = "delete from MyWindow where theString = \"E1\"";
        EPStatementObjectModel modelWithWhere = epService.getEPAdministrator().compileEPL(eplWithWhere);
        assertEquals(eplWithWhere, modelWithWhere.toEPL());
        result = epService.getEPRuntime().executeQuery(modelWithWhere);
        assertEquals(9L, getMyWindowCount());
        assertEquals(epService.getEPAdministrator().getConfiguration().getEventType("MyWindow"), result.getEventType());
        EPAssertionUtil.assertPropsPerRow(result.getArray(), "theString".split(","), new Object[][] {{"E1"}});

        // test SODA delete-all
        String eplDelete = "delete from MyWindow";
        EPStatementObjectModel modelDeleteOnly = epService.getEPAdministrator().compileEPL(eplDelete);
        assertEquals(eplDelete, modelDeleteOnly.toEPL());
        epService.getEPRuntime().executeQuery(modelDeleteOnly);
        assertEquals(0L, getMyWindowCount());

        // test with index
        epService.getEPAdministrator().createEPL("create unique index Idx1 on MyWindow (theString)");
        for (int i = 0; i < 5; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
        }
        runQueryAssertCount(INDEX_CALLBACK_HOOK + "delete from MyWindow where theString = 'E1' and intPrimitive = 0", 5, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCount(INDEX_CALLBACK_HOOK + "delete from MyWindow where theString = 'E1' and intPrimitive = 1", 4, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCount(INDEX_CALLBACK_HOOK + "delete from MyWindow where theString = 'E2'", 3, "Idx1", BACKING_SINGLE_UNIQUE);
        runQueryAssertCount(INDEX_CALLBACK_HOOK + "delete from MyWindow where intPrimitive = 4", 2, null, null);

        // test with alias
        runQueryAssertCount(INDEX_CALLBACK_HOOK + "delete from MyWindow as w1 where w1.theString = 'E3'", 1, "Idx1", BACKING_SINGLE_UNIQUE);

        // test consumption
        EPStatement stmt = epService.getEPAdministrator().createEPL("select rstream * from MyWindow");
        stmt.addListener(listener);
        epService.getEPRuntime().executeQuery("delete from MyWindow");
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), FIELDS, new Object[] {"E0", 0});
    }

    public void testFAFDeleteContextPartitioned() {

        // test hash-segmented context
        String eplCtx = "create context MyCtx coalesce consistent_hash_crc32(theString) from SupportBean granularity 4 preallocate";
        epService.getEPAdministrator().createEPL(eplCtx);

        epService.getEPAdministrator().createEPL("context MyCtx create window CtxWindow.win:keepall() as SupportBean");
        epService.getEPAdministrator().createEPL("context MyCtx insert into CtxWindow select * from SupportBean");

        SupportHashCodeFuncGranularCRC32 codeFunc = new SupportHashCodeFuncGranularCRC32(4);
        int[] codes = new int[5];
        for (int i = 0; i < 5; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
            codes[i] = codeFunc.codeFor("E" + i);
        }
        EPAssertionUtil.assertEqualsExactOrder(new int[] {3, 1, 3, 1, 2}, codes);   // just to make sure CRC32 didn't change

        // assert counts individually per context partition
        assertCtxWindowCountPerCode(new long[] {0, 2, 1, 2});

        // delete per context partition (E0 ended up in '3')
        epService.getEPRuntime().executeQuery("delete from CtxWindow where theString = 'E0'", new ContextPartitionSelector[] {new SupportSelectorByHashCode(1)});
        assertCtxWindowCountPerCode(new long[] {0, 2, 1, 2});

        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("delete from CtxWindow where theString = 'E0'", new ContextPartitionSelector[] {new SupportSelectorByHashCode(3)});
        assertCtxWindowCountPerCode(new long[] {0, 2, 1, 1});
        EPAssertionUtil.assertPropsPerRow(result.getArray(), "theString".split(","), new Object[][] {{"E0"}});

        // delete per context partition (E1 ended up in '1')
        epService.getEPRuntime().executeQuery("delete from CtxWindow where theString = 'E1'", new ContextPartitionSelector[] {new SupportSelectorByHashCode(0)});
        assertCtxWindowCountPerCode(new long[] {0, 2, 1, 1});

        epService.getEPRuntime().executeQuery("delete from CtxWindow where theString = 'E1'", new ContextPartitionSelector[] {new SupportSelectorByHashCode(1)});
        assertCtxWindowCountPerCode(new long[] {0, 1, 1, 1});
        epService.getEPAdministrator().destroyAllStatements();

        // test category-segmented context
        String eplCtxCategory = "create context MyCtxCat group by intPrimitive < 0 as negative, group by intPrimitive > 0 as positive from SupportBean";
        epService.getEPAdministrator().createEPL(eplCtxCategory);
        epService.getEPAdministrator().createEPL("context MyCtxCat create window CtxWindowCat.win:keepall() as SupportBean");
        epService.getEPAdministrator().createEPL("context MyCtxCat insert into CtxWindowCat select * from SupportBean");

        epService.getEPRuntime().sendEvent(new SupportBean("E1", -2));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 1));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", -3));
        epService.getEPRuntime().sendEvent(new SupportBean("E4", 2));
        assertEquals(2L, getCtxWindowCatCount("positive"));
        assertEquals(2L, getCtxWindowCatCount("negative"));

        result = epService.getEPRuntime().executeQuery("context MyCtxCat delete from CtxWindowCat where context.label = 'negative'");
        assertEquals(2L, getCtxWindowCatCount("positive"));
        assertEquals(0L, getCtxWindowCatCount("negative"));
        EPAssertionUtil.assertPropsPerRow(result.getArray(), "theString".split(","), new Object[][] {{"E1"}, {"E3"}});
    }

    public void test3StreamInnerJoin() throws Exception {
        runAssertion3StreamInnerJoin(EventRepresentationEnum.OBJECTARRAY);
        runAssertion3StreamInnerJoin(EventRepresentationEnum.MAP);
        runAssertion3StreamInnerJoin(EventRepresentationEnum.DEFAULT);
    }

    private void runAssertion3StreamInnerJoin(EventRepresentationEnum eventRepresentationEnum) throws Exception {
        Configuration config = new Configuration();
        config.getEngineDefaults().getLogging().setEnableQueryPlan(true);
        EPServiceProvider epService = EPServiceProviderManager.getProvider("ESPER1", config);

        String epl = "" +
        eventRepresentationEnum.getAnnotationText() + " create schema Product (productId string, categoryId string);" +
        eventRepresentationEnum.getAnnotationText() + " create schema Category (categoryId string, owner string);" +
        eventRepresentationEnum.getAnnotationText() + " create schema ProductOwnerDetails (productId string, owner string);" +
        eventRepresentationEnum.getAnnotationText() + " create window WinProduct.win:keepall() as select * from Product;" +
        eventRepresentationEnum.getAnnotationText() + " create window WinCategory.win:keepall() as select * from Category;" +
        eventRepresentationEnum.getAnnotationText() + " create window WinProductOwnerDetails.win:keepall() as select * from ProductOwnerDetails;" +
        "insert into WinProduct select * from Product;" +
        "insert into WinCategory select * from Category;" +
        "insert into WinProductOwnerDetails select * from ProductOwnerDetails;";
        EPDeploymentAdmin dAdmin = epService.getEPAdministrator().getDeploymentAdmin();
        dAdmin.deploy(dAdmin.parse(epl), new DeploymentOptions());

        sendEvent(eventRepresentationEnum, epService, "Product", new String[] {"productId=Product1", "categoryId=Category1"});
        sendEvent(eventRepresentationEnum, epService, "Product", new String[] {"productId=Product2", "categoryId=Category1"});
        sendEvent(eventRepresentationEnum, epService, "Product", new String[] {"productId=Product3", "categoryId=Category1"});
        sendEvent(eventRepresentationEnum, epService, "Category", new String[] {"categoryId=Category1", "owner=Petar"});
        sendEvent(eventRepresentationEnum, epService, "ProductOwnerDetails", new String[] {"productId=Product1", "owner=Petar"});

        String[] fields = "WinProduct.productId".split(",");
        EventBean[] queryResults;
        queryResults = epService.getEPRuntime().executeQuery("" +
                "select WinProduct.productId " +
                " from WinProduct" +
                " inner join WinCategory on WinProduct.categoryId=WinCategory.categoryId" +
                " inner join WinProductOwnerDetails on WinProduct.productId=WinProductOwnerDetails.productId"
                ).getArray();
        EPAssertionUtil.assertPropsPerRow(queryResults, fields, new Object[][]{{"Product1"}});

        queryResults = epService.getEPRuntime().executeQuery("" +
                "select WinProduct.productId " +
                " from WinProduct" +
                " inner join WinCategory on WinProduct.categoryId=WinCategory.categoryId" +
                " inner join WinProductOwnerDetails on WinProduct.productId=WinProductOwnerDetails.productId" +
                " where WinCategory.owner=WinProductOwnerDetails.owner"
                ).getArray();
        EPAssertionUtil.assertPropsPerRow(queryResults, fields, new Object[][]{{"Product1"}});

        queryResults = epService.getEPRuntime().executeQuery("" +
                "select WinProduct.productId " +
                " from WinProduct, WinCategory, WinProductOwnerDetails" +
                " where WinCategory.owner=WinProductOwnerDetails.owner" +
                " and WinProduct.categoryId=WinCategory.categoryId" +
                " and WinProduct.productId=WinProductOwnerDetails.productId"
                ).getArray();
        EPAssertionUtil.assertPropsPerRow(queryResults, fields, new Object[][]{{"Product1"}});

        String eplQuery = "select WinProduct.productId " +
                " from WinProduct" +
                " inner join WinCategory on WinProduct.categoryId=WinCategory.categoryId" +
                " inner join WinProductOwnerDetails on WinProduct.productId=WinProductOwnerDetails.productId" +
                " having WinCategory.owner=WinProductOwnerDetails.owner";
        queryResults = epService.getEPRuntime().executeQuery(eplQuery).getArray();
        EPAssertionUtil.assertPropsPerRow(queryResults, fields, new Object[][]{{"Product1"}});

        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(eplQuery);
        queryResults = epService.getEPRuntime().executeQuery(model).getArray();
        EPAssertionUtil.assertPropsPerRow(queryResults, fields, new Object[][]{{"Product1"}});

        epService.destroy();
    }
	
    private void sendEvent(EventRepresentationEnum eventRepresentationEnum, EPServiceProvider epService, String eventName, String[] attributes) {
        Map<String, Object> eventMap = new HashMap<String, Object>();
        List<Object> eventObjectArray = new ArrayList<Object>();
        for (String attribute: attributes) {
            String key = attribute.split("=")[0];
            String value = attribute.split("=")[1];
            eventMap.put(key, value);
            eventObjectArray.add(value);
        }
        if (eventRepresentationEnum.isObjectArrayEvent()) {
            epService.getEPRuntime().sendEvent(eventObjectArray.toArray(), eventName);
        }
        else {
            epService.getEPRuntime().sendEvent(eventMap, eventName);
        }
    }

    public void testNamedWindowJoinWhere() throws Exception
    {
        epService.getEPAdministrator().createEPL(EventRepresentationEnum.MAP.getAnnotationText() + " create window Win1.win:keepall() (key String, keyJoin String)");
        epService.getEPAdministrator().createEPL(EventRepresentationEnum.MAP.getAnnotationText() + " create window Win2.win:keepall() (keyJoin String, value double)");
        String queryAgg = "select w1.key, sum(value) from Win1 w1, Win2 w2 WHERE w1.keyJoin = w2.keyJoin GROUP BY w1.key order by w1.key";
        String[] fieldsAgg = "w1.key,sum(value)".split(",");
        String queryNoagg = "select w1.key, w2.value from Win1 w1, Win2 w2 where w1.keyJoin = w2.keyJoin and value = 1 order by w1.key";
        String[] fieldsNoagg = "w1.key,w2.value".split(",");

        EventBean[] result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        assertEquals(0, result.length);
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        assertNull(result);

        sendWin1Event("key1", "keyJoin1");

        result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        assertEquals(0, result.length);
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        assertNull(result);

        sendWin2Event("keyJoin1", 1d);

        result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsAgg, new Object[][]{{"key1", 1d}});
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsNoagg, new Object[][]{{"key1", 1d}});

        sendWin2Event("keyJoin2", 2d);

        result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsAgg, new Object[][]{{"key1", 1d}});
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsNoagg, new Object[][]{{"key1", 1d}});

        sendWin1Event("key2", "keyJoin2");

        result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsAgg, new Object[][]{{"key1", 1d}, {"key2", 2d}});
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsNoagg, new Object[][]{{"key1", 1d}});

        sendWin2Event("keyJoin2", 1d);

        result = epService.getEPRuntime().executeQuery(queryAgg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsAgg, new Object[][]{{"key1", 1d}, {"key2", 3d}});
        result = epService.getEPRuntime().executeQuery(queryNoagg).getArray();
        EPAssertionUtil.assertPropsPerRow(result, fieldsNoagg, new Object[][]{{"key1", 1d}, {"key2", 1d}});
    }

    private void sendWin1Event(String key, String keyJoin) {
        Map<String, Object> theEvent = new HashMap<String, Object>();
        theEvent.put("key", key);
        theEvent.put("keyJoin", keyJoin);
        epService.getEPRuntime().sendEvent(theEvent, "Win1");
    }

    private void sendWin2Event(String keyJoin, double value) {
        Map<String, Object> theEvent = new HashMap<String, Object>();
        theEvent.put("keyJoin", keyJoin);
        theEvent.put("value", value);
        epService.getEPRuntime().sendEvent(theEvent, "Win2");
    }

    public void testExecuteSimple() throws Exception
    {
        String query = "select * from MyWindow";
        EPOnDemandPreparedQuery prepared = epService.getEPRuntime().prepareQuery(query);
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        for (EventBean row : result.getArray()) {
            // System.out.println("name=" + row.get("name"));
        }
        EPAssertionUtil.assertPropsPerRow(result.iterator(), FIELDS, null);
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), FIELDS, null);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), FIELDS, new Object[][]{{"E1", 1}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), FIELDS, new Object[][]{{"E1", 1}});

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 2));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), FIELDS, new Object[][]{{"E1", 1}, {"E2", 2}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), FIELDS, new Object[][]{{"E1", 1}, {"E2", 2}});
    }

    public void testExecuteCount() throws Exception
    {
        String[] fields = new String[] {"cnt"};
        String query = "select count(*) as cnt from MyWindow";
        EPOnDemandPreparedQuery prepared = epService.getEPRuntime().prepareQuery(query);

        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{0L}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), fields, new Object[][]{{0L}});

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{1L}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), fields, new Object[][]{{1L}});
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{1L}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), fields, new Object[][]{{1L}});

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 2));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{2L}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), fields, new Object[][]{{2L}});

        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(query);
        result = epService.getEPRuntime().executeQuery(model);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{2L}});
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), fields, new Object[][]{{2L}});

        EPOnDemandPreparedQuery preparedFromModel = epService.getEPRuntime().prepareQuery(model);
        EPAssertionUtil.assertPropsPerRow(preparedFromModel.execute().iterator(), fields, new Object[][]{{2L}});
    }

    public void testExecuteFilter() throws Exception
    {
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 0));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 11));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 5));

        String query = "select * from MyWindow(intPrimitive > 1, intPrimitive < 10)";
        runAssertionFilter(query);

        query = "select * from MyWindow(intPrimitive > 1) where intPrimitive < 10";
        runAssertionFilter(query);

        query = "select * from MyWindow where intPrimitive < 10 and intPrimitive > 1";
        runAssertionFilter(query);
    }

    public void testAggUngroupedRowForAll() throws Exception
    {
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 0));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 11));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 5));
        String fields[] = new String[] {"total"};

        String query = "select sum(intPrimitive) as total from MyWindow";
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{16}});

        epService.getEPRuntime().sendEvent(new SupportBean("E4", -2));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{14}});
    }

    public void testInClause() {
        epService.getEPRuntime().sendEvent(makeBean("E1", 10, 100L));
        epService.getEPRuntime().sendEvent(makeBean("E2", 20, 200L));
        epService.getEPRuntime().sendEvent(makeBean("E3", 30, 300L));
        epService.getEPRuntime().sendEvent(makeBean("E4", 40, 400L));

        // try no index
        runAssertionIn();

        // try suitable index
        EPStatement stmtIdx1 = epService.getEPAdministrator().createEPL("create index Idx1 on MyWindow(theString, intPrimitive)");
        runAssertionIn();
        stmtIdx1.destroy();

        // backwards index
        EPStatement stmtIdx2 = epService.getEPAdministrator().createEPL("create index Idx2 on MyWindow(intPrimitive, theString)");
        runAssertionIn();
        stmtIdx2.destroy();

        // partial index
        EPStatement stmtIdx3 = epService.getEPAdministrator().createEPL("create index Idx3 on MyWindow(intPrimitive)");
        runAssertionIn();
        stmtIdx3.destroy();
    }

    private void runAssertionIn() {
        tryAssertionIn("theString in ('E2', 'E3') and intPrimitive in (10, 20)", new Long[]{200L});
        tryAssertionIn("intPrimitive in (30, 20) and theString in ('E4', 'E1')", new Long[]{});
        tryAssertionIn("intPrimitive in (30, 20) and theString in ('E2', 'E1')", new Long[]{200L});
        tryAssertionIn("theString in ('E2', 'E3') and intPrimitive in (20, 30)", new Long[]{200L, 300L});
        tryAssertionIn("theString in ('E2', 'E3') and intPrimitive in (30, 20)", new Long[]{200L, 300L});
        tryAssertionIn("theString in ('E1', 'E2', 'E3', 'E4') and intPrimitive in (10, 20, 30)", new Long[]{100L, 200L, 300L});
    }

    private void tryAssertionIn(String filter, Long[] expected) {
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("select * from MyWindow where " + filter);
        assertEquals(result.getArray().length, expected.length);
        List<Long> values = new ArrayList<Long>();
        for (EventBean event : result.getArray()) {
            values.add((Long) event.get("longPrimitive"));
        }
        EPAssertionUtil.assertEqualsAnyOrder(expected, values.toArray());
    }

    public void testAggUngroupedRowForEvent() throws Exception
    {
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 0));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 11));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 5));
        String fields[] = new String[] {"theString", "total"};

        String query = "select theString, sum(intPrimitive) as total from MyWindow";
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E1", 16}, {"E2", 16}, {"E3", 16}});

        epService.getEPRuntime().sendEvent(new SupportBean("E4", -2));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E1", 14}, {"E2", 14}, {"E3", 14}, {"E4", 14}});
    }

    public void testAggUngroupedRowForGroup() throws Exception
    {
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 11));
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 5));
        String fields[] = new String[] {"theString", "total"};

        String query = "select theString, sum(intPrimitive) as total from MyWindow group by theString order by theString asc";
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E1", 6}, {"E2", 11}});

        epService.getEPRuntime().sendEvent(new SupportBean("E2", -2));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 3));
        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E1", 6}, {"E2", 9}, {"E3", 3}});
    }

    public void testJoin() throws Exception
    {
        String namedWin = "create window MySecondWindow.win:keepall() as select * from SupportBean_A";
        epService.getEPAdministrator().createEPL(namedWin);
        String insert = "insert into MySecondWindow select * from SupportBean_A";
        epService.getEPAdministrator().createEPL(insert);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 11));
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 5));
        epService.getEPRuntime().sendEvent(new SupportBean_A("E2"));
        String fields[] = new String[] {"theString", "intPrimitive", "id"};

        String query = "select theString, intPrimitive, id from MyWindow nw1, " +
                            "MySecondWindow nw2 where nw1.theString = nw2.id";
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E2", 11, "E2"}});

        epService.getEPRuntime().sendEvent(new SupportBean("E3", 1));
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 2));
        epService.getEPRuntime().sendEvent(new SupportBean_A("E3"));

        result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), fields, new Object[][]{{"E2", 11, "E2"}, {"E3", 1, "E3"}, {"E3", 2, "E3"}});
    }

    public void testInvalid()
    {
        String epl = "selectoo man";
        tryInvalidSyntax(epl, "Incorrect syntax near 'selectoo' [selectoo man]");

        epl = "select (select * from MyWindow) from MyWindow";
        tryInvalid(epl, "Error executing statement: Subqueries are not a supported feature of on-demand queries [select (select * from MyWindow) from MyWindow]");

        epl = "select * from MyWindow.stat:uni(intPrimitive)";
        tryInvalid(epl, "Error executing statement: Views are not a supported feature of on-demand queries [select * from MyWindow.stat:uni(intPrimitive)]");

        epl = "select * from MyWindow output every 10 seconds";
        tryInvalid(epl, "Error executing statement: Output rate limiting is not a supported feature of on-demand queries [select * from MyWindow output every 10 seconds]");

        epl = "select * from pattern [every MyWindow]";
        tryInvalid(epl, "Error executing statement: On-demand queries require named windows and do not allow event streams or patterns [select * from pattern [every MyWindow]]");

        epl = "select prev(1, theString) from MyWindow";
        tryInvalid(epl, "Error executing statement: Previous function cannot be used in this context [select prev(1, theString) from MyWindow]");

        epl = "insert into MyWindow select 1";
        tryInvalid(epl, "Error executing statement: Column '1' could not be assigned to any of the properties of the underlying type (missing column names, event property, setter method or constructor?) [insert into MyWindow select 1]");

        epl = "insert into MyWindow(intPrimitive) select 'a'";
        tryInvalid(epl, "Error executing statement: Invalid assignment of column 'intPrimitive' of type 'java.lang.String' to event property 'intPrimitive' typed as 'int', column and parameter types mismatch [insert into MyWindow(intPrimitive) select 'a']");

        epl = "insert into MyWindow(intPrimitive, theString) select 1";
        tryInvalid(epl, "Error executing statement: Number of supplied values in the select clause does not match insert-into clause [insert into MyWindow(intPrimitive, theString) select 1]");

        epl = "insert into MyWindow select 1 as intPrimitive from MyWindow";
        tryInvalid(epl, "Error executing statement: Insert-into fire-and-forget query can only consist of an insert-into clause and a select-clause [insert into MyWindow select 1 as intPrimitive from MyWindow]");
    }

    private void tryInvalid(String epl, String message)
    {
        try
        {
            epService.getEPRuntime().executeQuery(epl);
            fail();
        }
        catch(EPStatementException ex)
        {
            assertEquals(message, ex.getMessage());
        }
    }

    private void tryInvalidSyntax(String epl, String message)
    {
        try
        {
            epService.getEPRuntime().executeQuery(epl);
            fail();
        }
        catch(EPStatementSyntaxException ex)
        {
            assertEquals(message, ex.getMessage());
        }
    }

    private void runAssertionFilter(String query)
    {
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery(query);
        EPAssertionUtil.assertPropsPerRow(result.iterator(), FIELDS, new Object[][]{{"E3", 5}});

        EPOnDemandPreparedQuery prepared = epService.getEPRuntime().prepareQuery(query);
        EPAssertionUtil.assertPropsPerRow(prepared.execute().iterator(), FIELDS, new Object[][]{{"E3", 5}});
    }

    private void runQueryAssertCount(String epl, int count, String indexName, String backingClass) {
        epService.getEPRuntime().executeQuery(epl);
        assertEquals(count, getMyWindowCount());
        SupportQueryPlanIndexHook.assertFAFAndReset(indexName, backingClass);
    }

    private void runQueryAssertCountNonNegative(String epl, int count, String indexName, String backingClass) {
        epService.getEPRuntime().executeQuery(epl);
        long actual = (Long) epService.getEPRuntime().executeQuery("select count(*) as c0 from MyWindow where intPrimitive >= 0").getArray()[0].get("c0");
        assertEquals(count, actual);
        SupportQueryPlanIndexHook.assertFAFAndReset(indexName, backingClass);
    }

    private long getMyWindowCount() {
        return (Long) epService.getEPRuntime().executeQuery("select count(*) as c0 from MyWindow").getArray()[0].get("c0");
    }

    private void assertCtxWindowCountPerCode(long[] expectedCountPerCode) {
        for (int i = 0; i < expectedCountPerCode.length; i++) {
            assertEquals("for code " + i, expectedCountPerCode[i], getCtxWindowCount(i));
        }
    }

    private long getCtxWindowCount(int hashCode) {
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("select count(*) as c0 from CtxWindow", new ContextPartitionSelector[] {new SupportSelectorByHashCode(hashCode)});
        return (Long) result.getArray()[0].get("c0");
    }

    private long getCtxWindowCatCount(String categoryName) {
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("select count(*) as c0 from CtxWindowCat", new ContextPartitionSelector[] {new SupportSelectorCategory(categoryName)});
        return (Long) result.getArray()[0].get("c0");
    }

    private SupportBean makeBean(String theString, int intPrimitive, long longPrimitive) {
        SupportBean bean = new SupportBean(theString, intPrimitive);
        bean.setLongPrimitive(longPrimitive);
        return bean;
    }

    private void assertFAFInsertResult(EPOnDemandQueryResult resultOne, Object[] objects, String[] propertyNames, EPStatement stmt) {
        assertSame(resultOne.getEventType(), stmt.getEventType());
        assertEquals(1, resultOne.getArray().length);
        EPAssertionUtil.assertPropsPerRow(resultOne.getArray(), propertyNames, new Object[][] {objects});
    }

    public static void doubleInt(SupportBean bean) {
        bean.setIntPrimitive(bean.getIntPrimitive() * 2);
    }
}
