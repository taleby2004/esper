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

package com.espertech.esper.regression.view;

import com.espertech.esper.client.*;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.core.service.EPStatementSPI;
import com.espertech.esper.filter.*;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.bean.SupportTradeEvent;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;

public class TestFilterExpressionsOptimizable extends TestCase
{
    private static final Log log = LogFactory.getLog(TestFilterExpressionsOptimizable.class);

    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        listener = new SupportUpdateListener();

        Configuration config = SupportConfigFactory.getConfiguration();
        config.addEventType("SupportEvent", SupportTradeEvent.class);
        config.addEventType("SupportBean", SupportBean.class);

        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
    }

    protected void tearDown() throws Exception {
        listener = null;
    }

    public void testOptimizablePerf() {

        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("libSplit", MyLib.class.getName(), "libSplit", ConfigurationPlugInSingleRowFunction.FilterOptimizable.ENABLED);
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("libE1True", MyLib.class.getName(), "libE1True", ConfigurationPlugInSingleRowFunction.FilterOptimizable.ENABLED);

        // create listeners
        int count = 10;
        SupportUpdateListener[] listeners = new SupportUpdateListener[count];
        for (int i = 0; i < count; i++) {
            listeners[i] = new SupportUpdateListener();
        }

        // func(...) = value
        runAssertionEquals("select * from SupportBean(libSplit(theString) = !NUM!)", listeners);

        // func(...) implied true
        runAssertionBoolean("select * from SupportBean(libE1True(theString))");

        // declared expression (...) = value
        epService.getEPAdministrator().createEPL("create expression thesplit {theString => libSplit(theString)}");
        runAssertionEquals("select * from SupportBean(thesplit(*) = !NUM!)", listeners);

        // declared expression (...) implied true
        epService.getEPAdministrator().createEPL("create expression theE1Test {theString => libE1True(theString)}");
        runAssertionBoolean("select * from SupportBean(theE1Test(*))");
    }

    public void testOptimizableInspectFilter() {

        String epl;

        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("funcOne", MyLib.class.getName(), "libSplit", ConfigurationPlugInSingleRowFunction.FilterOptimizable.DISABLED);
        epl = "select * from SupportBean(funcOne(theString) = 0)";
        assertFilterSingle(epl, FilterSpecCompiler.PROPERTY_NAME_BOOLEAN_EXPRESSION, FilterOperator.BOOLEAN_EXPRESSION);
        
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("funcOneWDefault", MyLib.class.getName(), "libSplit");
        epl = "select * from SupportBean(funcOneWDefault(theString) = 0)";
        assertFilterSingle(epl, "funcOneWDefault(theString)", FilterOperator.EQUAL);

        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("funcTwo", MyLib.class.getName(), "libSplit", ConfigurationPlugInSingleRowFunction.FilterOptimizable.ENABLED);
        epl = "select * from SupportBean(funcTwo(theString) = 0)";
        assertFilterSingle(epl, "funcTwo(theString)", FilterOperator.EQUAL);
        
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("libE1True", MyLib.class.getName(), "libE1True", ConfigurationPlugInSingleRowFunction.FilterOptimizable.ENABLED);
        epl = "select * from SupportBean(libE1True(theString))";
        assertFilterSingle(epl, "libE1True(theString)", FilterOperator.EQUAL);

        epl = "select * from SupportBean(funcTwo( theString ) > 10)";
        assertFilterSingle(epl, "funcTwo(theString)", FilterOperator.GREATER);

        epService.getEPAdministrator().createEPL("create expression thesplit {theString => funcOne(theString)}");

        epl = "select * from SupportBean(thesplit(*) = 0)";
        assertFilterSingle(epl, "thesplit(*)", FilterOperator.EQUAL);

        epl = "select * from SupportBean(libE1True(theString))";
        assertFilterSingle(epl, "libE1True(theString)", FilterOperator.EQUAL);

        epl = "select * from SupportBean(thesplit(*) > 10)";
        assertFilterSingle(epl, "thesplit(*)", FilterOperator.GREATER);
    }

    private void runAssertionEquals(String epl, SupportUpdateListener[] listeners) {

        // test function returns lookup value and "equals"
        for (int i = 0; i < listeners.length; i++) {
            EPStatement stmt = epService.getEPAdministrator().createEPL(epl.replace("!NUM!", Integer.toString(i)));
            stmt.addListener(listeners[i]);
        }

        long startTime = System.currentTimeMillis();
        MyLib.resetCountInvoked();
        int loops = 1000;
        for (int i = 0; i < loops; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E_" + i % listeners.length, 0));
            SupportUpdateListener listener = listeners[i % listeners.length];
            assertTrue(listener.getAndClearIsInvoked());
        }
        long delta = System.currentTimeMillis() - startTime;
        assertEquals(loops, MyLib.getCountInvoked());

        log.info("Equals delta=" + delta);
        assertTrue("Delta is " + delta, delta < 1000);
        epService.getEPAdministrator().destroyAllStatements();
    }

    private void runAssertionBoolean(String epl) {

        // test function returns lookup value and "equals"
        int count = 10;
        for (int i = 0; i < count; i++) {
            EPStatement stmt = epService.getEPAdministrator().createEPL(epl);
            stmt.addListener(listener);
        }

        long startTime = System.currentTimeMillis();
        MyLib.resetCountInvoked();
        int loops = 10000;
        for (int i = 0; i < loops; i++) {
            String key = "E_" + i % 100;
            epService.getEPRuntime().sendEvent(new SupportBean(key, 0));
            if (key.equals("E_1")) {
                assertEquals(count, listener.getNewDataList().size());
                listener.reset();
            }
            else {
                assertFalse(listener.isInvoked());
            }
        }
        long delta = System.currentTimeMillis() - startTime;
        assertEquals(loops, MyLib.getCountInvoked());

        log.info("Boolean delta=" + delta);
        assertTrue("Delta is " + delta, delta < 1000);
        epService.getEPAdministrator().destroyAllStatements();
    }

    private void assertFilterSingle(String epl, String expression, FilterOperator op) {
        EPStatementSPI statementSPI = (EPStatementSPI) epService.getEPAdministrator().createEPL(epl);
        FilterValueSetParam param = getFilterSingle(statementSPI);
        assertEquals(op, param.getFilterOperator());
        assertEquals(expression, param.getLookupable().getExpression());
    }

    private FilterValueSetParam getFilterSingle(EPStatementSPI statementSPI) {
        FilterServiceSPI filterServiceSPI = (FilterServiceSPI) statementSPI.getStatementContext().getFilterService();
        FilterSet set = filterServiceSPI.take(Collections.singleton(statementSPI.getStatementId()));
        assertEquals(1, set.getFilters().size());
        FilterValueSet valueSet = set.getFilters().get(0).getFilterValueSet();
        assertEquals(1, valueSet.getParameters().length);
        return valueSet.getParameters()[0];
    }

    public static class MyLib {

        private static int countInvoked;

        public static int libSplit(String theString) {
            String[] key = theString.split("_");
            countInvoked++;
            return Integer.parseInt(key[1]);
        }

        public static boolean libE1True(String theString) {
            countInvoked++;
            return theString.equals("E_1");
        }

        public static int getCountInvoked() {
            return countInvoked;
        }

        public static void resetCountInvoked() {
            countInvoked = 0;
        }
    }
}
