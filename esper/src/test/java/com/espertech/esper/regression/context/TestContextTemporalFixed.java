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

package com.espertech.esper.regression.context;

import com.espertech.esper.client.*;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.client.time.CurrentTimeEvent;
import com.espertech.esper.core.context.mgr.ContextManagementService;
import com.espertech.esper.core.service.EPServiceProviderSPI;
import com.espertech.esper.core.service.EPStatementSPI;
import com.espertech.esper.filter.FilterServiceSPI;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.bean.SupportBean_S0;
import com.espertech.esper.support.bean.SupportDateTime;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportDatabaseService;
import com.espertech.esper.support.util.AgentInstanceAssertionUtil;
import com.espertech.esper.support.util.ArrayAssertionUtil;
import com.espertech.esper.support.util.SupportUpdateListener;
import junit.framework.TestCase;

import java.util.Properties;

public class TestContextTemporalFixed extends TestCase {

    private EPServiceProvider epService;
    private EPServiceProviderSPI spi;

    public void setUp()
    {
        ConfigurationDBRef configDB = new ConfigurationDBRef();
        configDB.setDriverManagerConnection(SupportDatabaseService.DRIVER, SupportDatabaseService.FULLURL, new Properties());

        Configuration configuration = SupportConfigFactory.getConfiguration();
        configuration.addDatabaseReference("MyDB", configDB);
        configuration.addEventType("SupportBean", SupportBean.class);
        configuration.addEventType("SupportBean_S0", SupportBean_S0.class);
        epService = EPServiceProviderManager.getDefaultProvider(configuration);
        epService.initialize();

        spi = (EPServiceProviderSPI) epService;
    }

    public void testContextCreateDestroy() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context EverySecond as start (*, *, *, *, *, *) end (*, *, *, *, *, *)");

        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatement statement = epService.getEPAdministrator().createEPL("context EverySecond select * from SupportBean");
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean());
        assertTrue(listener.getAndClearIsInvoked());

        sendTimeEvent("2002-05-1T8:00:00.999");
        epService.getEPRuntime().sendEvent(new SupportBean());
        assertTrue(listener.getAndClearIsInvoked());

        sendTimeEvent("2002-05-1T8:00:01.000");
        epService.getEPRuntime().sendEvent(new SupportBean());
        assertFalse(listener.getAndClearIsInvoked());

        long start = SupportDateTime.parseGetMSec("2002-05-1T8:00:01.999");
        for (int i = 0; i < 10; i++) {
            sendTimeEvent(start);

            sendEventAndAssert(listener, false);

            start += 1;
            sendTimeEvent(start);

            sendEventAndAssert(listener, true);

            start += 999;
            sendTimeEvent(start);

            sendEventAndAssert(listener, true);

            start += 1;
            sendTimeEvent(start);
            
            sendEventAndAssert(listener, false);

            start += 999;
        }
    }

    public void testDBHistorical() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        String[] fields = "s1.mychar".split(",");
        SupportUpdateListener listener = new SupportUpdateListener();
        String stmtText = "context NineToFive select * from SupportBean_S0 as s0, sql:MyDB ['select * from mytesttable where ${id} = mytesttable.mybigint'] as s1";
        EPStatement statement = epService.getEPAdministrator().createEPL(stmtText);
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean_S0(2));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"Y"});

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-2T9:00:00.000");

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"X"});
    }

    public void testPrevPriorAndAggregation() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        String[] fields = "col1,col2,col3,col4,col5".split(",");
        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatementSPI statement = (EPStatementSPI) epService.getEPAdministrator().createEPL("context NineToFive " +
                "select prev(string) as col1, prevwindow(sb) as col2, prevtail(string) as col3, prior(1, string) as col4, sum(intPrimitive) as col5 " +
                "from SupportBean.win:keepall() as sb");
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean());
        assertFalse(listener.isInvoked());
        
        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        SupportBean event1 = new SupportBean("E1", 1);
        epService.getEPRuntime().sendEvent(event1);
        Object[][] expected = new Object[][]{{null, new SupportBean[]{event1}, "E1", null, 1}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        SupportBean event2 = new SupportBean("E2", 2);
        epService.getEPRuntime().sendEvent(event2);
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E1", new SupportBean[]{event2, event1}, "E1", "E1", 3});

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, null);

        epService.getEPRuntime().sendEvent(new SupportBean());
        assertFalse(listener.isInvoked());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 0, 0, 0, 0);

        // now started
        sendTimeEvent("2002-05-2T9:00:00.000");

        SupportBean event3 = new SupportBean("E3", 9);
        epService.getEPRuntime().sendEvent(event3);
        expected = new Object[][] {{null, new SupportBean[]{event3}, "E3", null, 9}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 1, 0, 3, 1);
    }

    public void testJoin() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        String[] fields = "col1,col2,col3,col4".split(",");
        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatement statement = epService.getEPAdministrator().createEPL("context NineToFive " +
                "select sb.string as col1, sb.intPrimitive as col2, s0.id as col3, s0.p00 as col4 " +
                "from SupportBean.win:keepall() as sb full outer join SupportBean_S0.win:keepall() as s0 on p00 = string");
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{null, null, 1, "E1"});

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 5));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E1", 5, 1, "E1"});

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-2T9:00:00.000");

        sendTimeEvent("2002-05-1T9:00:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 4));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E1", 4, null, null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "E1"));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E1", 4, 2, "E1"});
    }

    public void testPatternWithTime() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatement statement = epService.getEPAdministrator().createEPL("context NineToFive select * from pattern[every timer:interval(10 sec)]");
        statement.addListener(listener);
        assertEquals(1, spi.getSchedulingService().getScheduleHandleCount());   // from the context
        
        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        assertEquals(2, spi.getSchedulingService().getScheduleHandleCount());   // context + pattern
        assertFalse(listener.isInvoked());

        sendTimeEvent("2002-05-1T9:00:10.000");
        assertTrue(listener.isInvoked());

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");
        listener.reset();   // it is not well defined whether the listener does get fired or not
        assertEquals(1, spi.getSchedulingService().getScheduleHandleCount());   // from the context

        // now started
        sendTimeEvent("2002-05-2T9:00:00.000");
        assertEquals(2, spi.getSchedulingService().getScheduleHandleCount());   // context + pattern
        assertFalse(listener.isInvoked());

        sendTimeEvent("2002-05-2T9:00:10.000");
        assertTrue(listener.isInvoked());
    }

    public void testSubselect() {
        FilterServiceSPI filterSPI = (FilterServiceSPI) spi.getFilterService();

        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        String[] fields = "string,col".split(",");
        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatementSPI statement = (EPStatementSPI) epService.getEPAdministrator().createEPL("context NineToFive select string, (select p00 from SupportBean_S0.std:lastevent()) as col from SupportBean");
        statement.addListener(listener);
        assertEquals(0, filterSPI.getFilterCountApprox());   // from the context

        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        assertEquals(2, filterSPI.getFilterCountApprox());   // from the context

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[] {"E1", null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(11, "S01"));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 2));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E2", "S01"});

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");
        assertEquals(0, filterSPI.getFilterCountApprox());   // from the context

        epService.getEPRuntime().sendEvent(new SupportBean("Ex", 0));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-2T9:00:00.000");
        assertEquals(2, filterSPI.getFilterCountApprox());   // from the context
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("E3", 3));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E3", null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(12, "S02"));
        epService.getEPRuntime().sendEvent(new SupportBean("E4", 4));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E4", "S02"});
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 1, 1, 0, 0);

        // now gone
        sendTimeEvent("2002-05-2T17:00:00.000");
        assertEquals(0, filterSPI.getFilterCountApprox());   // from the context

        epService.getEPRuntime().sendEvent(new SupportBean("Ey", 0));
        assertFalse(listener.isInvoked());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 0, 0, 0, 0);
    }

    public void testNWSameContextOnExpr() {
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("makeBean", this.getClass().getName(), "singleRowPluginMakeBean");
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        // no started yet
        String[] fields = "string,intPrimitive".split(",");
        SupportUpdateListener listener = new SupportUpdateListener();
        EPStatement stmt = epService.getEPAdministrator().createEPL("context NineToFive create window MyWindow.win:keepall() as SupportBean");
        stmt.addListener(listener);

        epService.getEPAdministrator().createEPL("context NineToFive insert into MyWindow select * from SupportBean");

        epService.getEPAdministrator().createEPL("context NineToFive " +
                "on SupportBean_S0 s0 merge MyWindow mw where mw.string = s0.p00 " +
                "when matched then update set intPrimitive = s0.id " +
                "when not matched then insert select makeBean(id, p00)");

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        assertFalse(listener.isInvoked());

        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[] {"E1", 1});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "E2"));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[] {"E2", 2});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3, "E1"));
        ArrayAssertionUtil.assertProps(listener.getLastNewData()[0], fields, new Object[] {"E1", 3});
        ArrayAssertionUtil.assertProps(listener.getLastOldData()[0], fields, new Object[] {"E1", 1});
        listener.reset();

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");

        // no longer updated
        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        assertFalse(listener.isInvoked());

        // now started again but empty
        sendTimeEvent("2002-05-2T9:00:00.000");

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[] {"E1", 1});
    }

    public void testNWFireAndForget() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");

        // no started yet
        epService.getEPAdministrator().createEPL("context NineToFive create window MyWindow.win:keepall() as SupportBean");
        epService.getEPAdministrator().createEPL("context NineToFive insert into MyWindow select * from SupportBean");

        // not queryable
        tryInvalidNWQuery();

        // now started
        sendTimeEvent("2002-05-1T9:00:00.000");
        tryNWQuery(0);

        // now not empty
        epService.getEPRuntime().sendEvent(new SupportBean());
        assertEquals(1, epService.getEPRuntime().executeQuery("select * from MyWindow").getArray().length);

        // now gone
        sendTimeEvent("2002-05-1T17:00:00.000");

        // no longer queryable
        tryInvalidNWQuery();
        epService.getEPRuntime().sendEvent(new SupportBean());

        // now started again but empty
        sendTimeEvent("2002-05-2T9:00:00.000");
        tryNWQuery(0);
        
        // fill some data
        epService.getEPRuntime().sendEvent(new SupportBean());
        epService.getEPRuntime().sendEvent(new SupportBean());
        sendTimeEvent("2002-05-2T9:10:00.000");
        tryNWQuery(2);
    }

    private void tryInvalidNWQuery() {
        try {
            epService.getEPRuntime().executeQuery("select * from MyWindow");
        }
        catch (EPException ex) {
            String expected = "Error executing statement: Named window 'MyWindow' is associated to context 'NineToFive' that is not available for querying [select * from MyWindow]";
            assertEquals(expected, ex.getMessage());
        }
    }

    private void tryNWQuery(int numRows) {
        EPOnDemandQueryResult result = epService.getEPRuntime().executeQuery("select * from MyWindow");
        assertEquals(numRows, result.getArray().length);
    }

    public void testStartTurnedOff() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        String contextEPL = "@Name('context') create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)";
        EPStatement stmtContext = epService.getEPAdministrator().createEPL("@Name('context') create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");
        assertContextEventType(stmtContext.getEventType());
        SupportUpdateListener contextListener = new SupportUpdateListener();
        stmtContext.addListener(contextListener);
        stmtContext.setSubscriber(new MiniSubscriber());

        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context NineToFive " +
                "select * from SupportBean");
        stmtOne.addListener(new SupportUpdateListener());

        sendTimeAndAssert("2002-05-1T8:59:30.000", false, 1);
        sendTimeAndAssert("2002-05-1T8:59:59.999", false, 1);
        sendTimeAndAssert("2002-05-1T9:00:00.000", true, 1);

        EPStatement stmtTwo = epService.getEPAdministrator().createEPL("@Name('B') context NineToFive select * from SupportBean");
        stmtTwo.addListener(new SupportUpdateListener());

        sendTimeAndAssert("2002-05-1T16:59:59.000", true, 2);
        sendTimeAndAssert("2002-05-1T17:00:00.000", false, 2);

        EPStatement stmtThree = epService.getEPAdministrator().createEPL("@Name('C') context NineToFive select * from SupportBean");
        stmtThree.addListener(new SupportUpdateListener());

        sendTimeAndAssert("2002-05-2T8:59:59.999", false, 3);
        sendTimeAndAssert("2002-05-2T9:00:00.000", true, 3);
        sendTimeAndAssert("2002-05-2T16:59:59.000", true, 3);
        sendTimeAndAssert("2002-05-2T17:00:00.000", false, 3);

        assertFalse(contextListener.isInvoked());

        epService.getEPAdministrator().destroyAllStatements();
        
        // test SODA
        sendTimeEvent("2002-05-3T16:59:59.000");
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(contextEPL);
        assertEquals(contextEPL, model.toEPL());
        EPStatement stmt = epService.getEPAdministrator().create(model);
        assertEquals(contextEPL, stmt.getText());

        // test built-in properties
        EPStatement stmtLast = epService.getEPAdministrator().createEPL("@Name('A') context NineToFive " +
                "select context.name as c1, context.startTime as c2, context.endTime as c3, string as c4 from SupportBean");
        SupportUpdateListener listener = new SupportUpdateListener();
        stmtLast.addListener(listener);
        
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 10));
        EventBean event = listener.assertOneGetNewAndReset();
        assertEquals("NineToFive", event.get("c1"));
        assertEquals("2002-05-03T16:59:59.000", SupportDateTime.print(event.get("c2")));
        assertEquals("2002-05-03T17:00:00.000", SupportDateTime.print(event.get("c3")));
        assertEquals("E1", event.get("c4"));
    }

    public void testStartTurnedOn() {

        ContextManagementService ctxMgmtService = spi.getContextManagementService();
        assertEquals(0, ctxMgmtService.getContextCount());

        sendTimeEvent("2002-05-1T9:15:00.000");
        EPStatement stmtContext = epService.getEPAdministrator().createEPL("@Name('context') create context NineToFive as start (0, 9, *, *, *) end (0, 17, *, *, *)");
        assertEquals(1, ctxMgmtService.getContextCount());

        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context NineToFive select * from SupportBean");
        stmtOne.addListener(new SupportUpdateListener());
        
        sendTimeAndAssert("2002-05-1T9:16:00.000", true, 1);
        sendTimeAndAssert("2002-05-1T16:59:59.000", true, 1);
        sendTimeAndAssert("2002-05-1T17:00:00.000", false, 1);

        EPStatement stmtTwo = epService.getEPAdministrator().createEPL("@Name('B') context NineToFive select * from SupportBean");
        stmtTwo.addListener(new SupportUpdateListener());

        sendTimeAndAssert("2002-05-2T8:59:59.999", false, 2);
        sendTimeAndAssert("2002-05-2T9:15:00.000", true, 2);
        sendTimeAndAssert("2002-05-2T16:59:59.000", true, 2);
        sendTimeAndAssert("2002-05-2T17:00:00.000", false, 2);

        // destroy context before stmts
        stmtContext.destroy();
        assertEquals(1, ctxMgmtService.getContextCount());

        stmtTwo.destroy();
        stmtOne.destroy();

        // context gone too
        assertEquals(0, ctxMgmtService.getContextCount());
    }

    private void assertContextEventType(EventType eventType) {
        assertEquals(0, eventType.getPropertyNames().length);
        assertEquals("EventType_Context_NineToFive", eventType.getName());
    }

    private void sendTimeAndAssert(String time, boolean isInvoked, int countStatements) {
        sendTimeEvent(time);
        epService.getEPRuntime().sendEvent(new SupportBean());

        String[] statements = epService.getEPAdministrator().getStatementNames();
        assertEquals(countStatements + 1, statements.length);

        for (int i = 0; i < statements.length; i++) {
            EPStatement stmt = epService.getEPAdministrator().getStatement(statements[i]);
            if (stmt.getName().equals("context")) {
                continue;
            }
            SupportUpdateListener listener = (SupportUpdateListener) stmt.getUpdateListeners().next();
            assertEquals("Failed for statement " + stmt.getName(), isInvoked, listener.getAndClearIsInvoked());
        }
    }

    private void sendTimeEvent(String time) {
        epService.getEPRuntime().sendEvent(new CurrentTimeEvent(SupportDateTime.parseGetMSec(time)));
    }

    private void sendTimeEvent(long time) {
        epService.getEPRuntime().sendEvent(new CurrentTimeEvent(time));
    }

    private void sendEventAndAssert(SupportUpdateListener listener, boolean expected) {
        epService.getEPRuntime().sendEvent(new SupportBean());
        assertEquals(expected, listener.isInvoked());
        listener.reset();
    }

    public static SupportBean singleRowPluginMakeBean(int id, String p00) {
        return new SupportBean(p00, id);
    }

    public static class MiniSubscriber {
        public static void update() {
            // no action
        }
    }
}
