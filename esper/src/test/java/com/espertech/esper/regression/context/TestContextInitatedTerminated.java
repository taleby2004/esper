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

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.client.time.CurrentTimeEvent;
import com.espertech.esper.core.service.EPServiceProviderSPI;
import com.espertech.esper.core.service.EPStatementSPI;
import com.espertech.esper.filter.*;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.bean.SupportBean_S0;
import com.espertech.esper.support.bean.SupportBean_S1;
import com.espertech.esper.support.bean.SupportDateTime;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.util.AgentInstanceAssertionUtil;
import com.espertech.esper.support.util.ArrayAssertionUtil;
import com.espertech.esper.support.util.SupportUpdateListener;
import junit.framework.TestCase;

import java.util.Collections;

public class TestContextInitatedTerminated extends TestCase {

    private EPServiceProvider epService;
    private EPServiceProviderSPI spi;
    private SupportUpdateListener listener;

    public void setUp()
    {
        Configuration configuration = SupportConfigFactory.getConfiguration();
        configuration.addEventType("SupportBean", SupportBean.class);
        configuration.addEventType("SupportBean_S0", SupportBean_S0.class);
        configuration.addEventType("SupportBean_S1", SupportBean_S1.class);
        epService = EPServiceProviderManager.getDefaultProvider(configuration);
        epService.initialize();
        spi = (EPServiceProviderSPI) epService;

        listener = new SupportUpdateListener();
    }

    public void tearDown() {
        listener = null;
    }

    public void testScheduleFilterResources() {
        // test no-context statement
        EPStatement stmt = epService.getEPAdministrator().createEPL("select * from SupportBean.win:time(30)");

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));
        assertEquals(1, spi.getSchedulingService().getScheduleHandleCount());

        stmt.destroy();
        assertEquals(0, spi.getSchedulingService().getScheduleHandleCount());

        // test initiated
        FilterServiceSPI filterServiceSPI = (FilterServiceSPI) spi.getFilterService();

        sendTimeEvent("2002-05-1T8:00:00.000");
        String eplCtx = "create context EverySupportBean as " +
                "initiated by SupportBean as sb " +
                "terminated after 1 minutes";
        epService.getEPAdministrator().createEPL(eplCtx);

        epService.getEPAdministrator().createEPL("context EverySupportBean select * from SupportBean_S0.win:time(2 min) sb0");
        assertEquals(0, spi.getSchedulingService().getScheduleHandleCount());
        assertEquals(1, filterServiceSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 0));
        assertEquals(1, spi.getSchedulingService().getScheduleHandleCount());
        assertEquals(2, filterServiceSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(0, "S0_1"));
        assertEquals(2, spi.getSchedulingService().getScheduleHandleCount());
        assertEquals(2, filterServiceSPI.getFilterCountApprox());

        sendTimeEvent("2002-05-1T8:01:00.000");
        assertEquals(0, spi.getSchedulingService().getScheduleHandleCount());
        assertEquals(1, filterServiceSPI.getFilterCountApprox());

        epService.getEPAdministrator().destroyAllStatements();
        assertEquals(0, spi.getSchedulingService().getScheduleHandleCount());
        assertEquals(0, filterServiceSPI.getFilterCountApprox());
    }

    public void testPatternInitiatedStraightSelect() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        String eplCtx = "create context EverySupportBean as " +
                "initiated by pattern [every (a=SupportBean_S0 or b=SupportBean_S1)] " +
                "terminated after 1 minutes";
        epService.getEPAdministrator().createEPL(eplCtx);

        String[] fields = "c1,c2,c3,c4".split(",");
        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EverySupportBean " +
                "select context.id as c1, context.a.id as c2, context.b.id as c3, string as c4 from SupportBean");
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean_S1(2));

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 0));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, null, 2, "E1"});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3));

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 0));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, null, 2, "E2"}, {1, 3, null, "E2"}});

        epService.getEPAdministrator().destroyAllStatements();
        
        // test SODA
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(eplCtx);
        assertEquals(eplCtx, model.toEPL());
        EPStatement stmtModel = epService.getEPAdministrator().create(model);
        assertEquals(eplCtx, stmtModel.getText());
    }

    public void testFilterInitiatedStraightEquals() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context EverySupportBean as " +
                "initiated by SupportBean(string like 'I%') as sb " +
                "terminated after 1 min");

        String[] fields = "c1,c2".split(",");
        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EverySupportBean " +
                "select context.id as c1, sum(longPrimitive) as c2 from SupportBean(intPrimitive = context.sb.intPrimitive)");
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(makeEvent("E1", -1, -2L));
        assertFalse(listener.isInvoked());
        
        epService.getEPRuntime().sendEvent(makeEvent("I1", 2, 4L)); // counts towards stuff
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 4L});

        epService.getEPRuntime().sendEvent(makeEvent("E2", 2, 3L));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 7L});

        epService.getEPRuntime().sendEvent(makeEvent("I2", 3, 14L)); // counts towards stuff
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{1, 14L});

        epService.getEPRuntime().sendEvent(makeEvent("E3", 2, 2L));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 9L});

        epService.getEPRuntime().sendEvent(makeEvent("E4", 3, 15L));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{1, 29L});

        sendTimeEvent("2002-05-1T8:01:30.000");
        
        epService.getEPRuntime().sendEvent(makeEvent("E", -1, -2L));
        assertFalse(listener.isInvoked());
    }

    public void testFilterAllOperators() {

        // test plain
        epService.getEPAdministrator().createEPL("create context EverySupportBean as " +
                "initiated by SupportBean_S0 as sb " +
                "terminated after 10 days 5 hours 2 minutes 1 sec 11 milliseconds");

        tryOperator("context.sb.id = intBoxed", new Object[][] {{10, true}, {9, false}, {null, false}});
        tryOperator("intBoxed = context.sb.id", new Object[][] {{10, true}, {9, false}, {null, false}});

        tryOperator("context.sb.id > intBoxed", new Object[][] {{11, false}, {10, false}, {9, true}, {8, true}});
        tryOperator("context.sb.id >= intBoxed", new Object[][] {{11, false}, {10, true}, {9, true}, {8, true}});
        tryOperator("context.sb.id < intBoxed", new Object[][] {{11, true}, {10, false}, {9, false}, {8, false}});
        tryOperator("context.sb.id <= intBoxed", new Object[][] {{11, true}, {10, true}, {9, false}, {8, false}});

        tryOperator("intBoxed < context.sb.id", new Object[][] {{11, false}, {10, false}, {9, true}, {8, true}});
        tryOperator("intBoxed <= context.sb.id", new Object[][] {{11, false}, {10, true}, {9, true}, {8, true}});
        tryOperator("intBoxed > context.sb.id", new Object[][] {{11, true}, {10, false}, {9, false}, {8, false}});
        tryOperator("intBoxed >= context.sb.id", new Object[][] {{11, true}, {10, true}, {9, false}, {8, false}});

        tryOperator("intBoxed in (context.sb.id)", new Object[][] {{11, false}, {10, true}, {9, false}, {8, false}});
        tryOperator("intBoxed between context.sb.id and context.sb.id", new Object[][] {{11, false}, {10, true}, {9, false}, {8, false}});

        tryOperator("context.sb.id != intBoxed", new Object[][] {{10, false}, {9, true}, {null, false}});
        tryOperator("intBoxed != context.sb.id", new Object[][] {{10, false}, {9, true}, {null, false}});

        tryOperator("intBoxed not in (context.sb.id)", new Object[][] {{11, true}, {10, false}, {9, true}, {8, true}});
        tryOperator("intBoxed not between context.sb.id and context.sb.id", new Object[][] {{11, true}, {10, false}, {9, true}, {8, true}});

        tryOperator("context.sb.id is intBoxed", new Object[][] {{10, true}, {9, false}, {null, false}});
        tryOperator("intBoxed is context.sb.id", new Object[][] {{10, true}, {9, false}, {null, false}});

        tryOperator("context.sb.id is not intBoxed", new Object[][] {{10, false}, {9, true}, {null, true}});
        tryOperator("intBoxed is not context.sb.id", new Object[][] {{10, false}, {9, true}, {null, true}});

        // try coercion
        tryOperator("context.sb.id = shortBoxed", new Object[][] {{(short)10, true}, {(short)9, false}, {null, false}});
        tryOperator("shortBoxed = context.sb.id", new Object[][] {{(short)10, true}, {(short)9, false}, {null, false}});
        
        tryOperator("context.sb.id > shortBoxed", new Object[][] {{(short)11, false}, {(short)10, false}, {(short)9, true}, {(short)8, true}});
        tryOperator("shortBoxed < context.sb.id", new Object[][] {{(short)11, false}, {(short)10, false}, {(short)9, true}, {(short)8, true}});

        tryOperator("shortBoxed in (context.sb.id)", new Object[][] {{(short)11, false}, {(short)10, true}, {(short)9, false}, {(short)8, false}});
    }

    private void tryOperator(String operator, Object[][] testdata) {
        FilterServiceSPI filterSpi = (FilterServiceSPI) spi.getFilterService();

        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EverySupportBean " +
                "select string as c0,intPrimitive as c1,context.sb.p00 as c2 " +
                "from SupportBean(" + operator + ")");
        stmt.addListener(listener);

        // initiate
        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "S01"));

        for (int i = 0; i < testdata.length; i++) {
            SupportBean bean = new SupportBean();
            Object testValue = testdata[i][0];
            if (testValue instanceof Integer) {
                bean.setIntBoxed((Integer) testValue);
            }
            else {
                bean.setShortBoxed((Short) testValue);
            }
            boolean expected = (Boolean) testdata[i][1];

            epService.getEPRuntime().sendEvent(bean);
            assertEquals("Failed at " + i, expected, listener.getAndClearIsInvoked());
        }

        // assert type of expression
        FilterSet set = filterSpi.take(Collections.singleton(stmt.getStatementId()));
        assertEquals(1, set.getFilters().size());
        FilterValueSet valueSet = set.getFilters().get(0).getFilterValueSet();
        assertEquals(1, valueSet.getParameters().size());
        FilterValueSetParam para = valueSet.getParameters().getFirst();
        assertTrue(para.getFilterOperator() != FilterOperator.BOOLEAN_EXPRESSION);

        stmt.destroy();
    }

    public void testFilterBooleanOperator() {
        epService.getEPAdministrator().createEPL("create context EverySupportBean as " +
                "initiated by SupportBean_S0 as sb " +
                "terminated after 10 days 5 hours 2 minutes 1 sec 11 milliseconds");

        String[] fields = "c0,c1,c2".split(",");
        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EverySupportBean " +
                "select string as c0,intPrimitive as c1,context.sb.p00 as c2 " +
                "from SupportBean(intPrimitive + context.sb.id = 5)");
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 2));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3, "S01"));

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 2));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"E2", 2, "S01"});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3, "S02"));

        epService.getEPRuntime().sendEvent(new SupportBean("E3", 2));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"E3", 2, "S01"}, {"E3", 2, "S02"}});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(4, "S03"));

        epService.getEPRuntime().sendEvent(new SupportBean("E4", 2));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"E4", 2, "S01"}, {"E4", 2, "S02"}});

        epService.getEPRuntime().sendEvent(new SupportBean("E5", 1));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"E5", 1, "S03"}});
    }

    public void testOutputSnapshotWhenTerminated() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context EveryMinute as " +
                "initiated by pattern[every timer:at(*, *, *, *, *)] " +
                "terminated after 1 min");

        // test when-terminated and snapshot
        String[] fields = "c0,c1".split(",");
        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EveryMinute " +
                "select context.id as c0, sum(intPrimitive) as c1 from SupportBean output snapshot when terminated");
        stmt.addListener(listener);

        sendTimeEvent("2002-05-1T8:01:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));

        sendTimeEvent("2002-05-1T8:01:10.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 2));

        sendTimeEvent("2002-05-1T8:01:59.999");
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 3));
        assertFalse(listener.getAndClearIsInvoked());

        // terminate
        sendTimeEvent("2002-05-1T8:02:00.000");
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 1+2+3});

        sendTimeEvent("2002-05-1T8:02:01.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E4", 4));
        epService.getEPRuntime().sendEvent(new SupportBean("E5", 5));
        epService.getEPRuntime().sendEvent(new SupportBean("E6", 6));
        assertFalse(listener.getAndClearIsInvoked());

        // terminate
        sendTimeEvent("2002-05-1T8:03:00.000");
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 4+5+6});

        stmt.destroy();

        // test late-coming statement without "terminated"
        EPStatementSPI stmtTwo = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EveryMinute " +
                "select context.id as c0, sum(intPrimitive) as c1 from SupportBean output snapshot every 2 events");
        stmtTwo.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("E10", 1));
        epService.getEPRuntime().sendEvent(new SupportBean("E11", 2));
        assertFalse(listener.isInvoked());

        sendTimeEvent("2002-05-1T8:04:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E12", 3));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("E13", 4));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{0, 7});
        
        // terminate
        sendTimeEvent("2002-05-1T8:05:00.000");
        assertFalse(listener.isInvoked());
    }

    public void testOutputAllEvery2AndTerminated() {
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context EveryMinute as " +
                "initiated by pattern[every timer:at(*, *, *, *, *)] " +
                "terminated after 1 min");

        // test when-terminated and every 2 events output all with group by
        String[] fields = "c0,c1,c2".split(",");
        EPStatementSPI stmt = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EveryMinute " +
                "select context.id as c0, string as c1, sum(intPrimitive) as c2 from SupportBean group by string output all every 2 events and when terminated order by string asc");
        stmt.addListener(listener);

        sendTimeEvent("2002-05-1T8:01:00.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 1));

        sendTimeEvent("2002-05-1T8:01:10.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 2));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E1", 1+2}});

        sendTimeEvent("2002-05-1T8:01:59.999");
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 3));
        assertFalse(listener.getAndClearIsInvoked());

        // terminate
        sendTimeEvent("2002-05-1T8:02:00.000");
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E1", 1+2}, {0, "E2", 3}});

        sendTimeEvent("2002-05-1T8:02:01.000");
        epService.getEPRuntime().sendEvent(new SupportBean("E4", 4));
        epService.getEPRuntime().sendEvent(new SupportBean("E5", 5));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E4", 4}, {0, "E5", 5}});

        epService.getEPRuntime().sendEvent(new SupportBean("E6", 6));
        assertFalse(listener.getAndClearIsInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("E4", 10));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E4", 14}, {0, "E5", 5}, {0, "E6", 6}});

        // terminate
        sendTimeEvent("2002-05-1T8:03:00.000");
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E4", 14}, {0, "E5", 5}, {0, "E6", 6}});

        epService.getEPRuntime().sendEvent(new SupportBean("E1", -1));
        epService.getEPRuntime().sendEvent(new SupportBean("E6", -2));
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{0, "E1", -1}, {0, "E6", -2}});
    }

    public void testCrontab() {
        FilterServiceSPI filterSPI = (FilterServiceSPI) spi.getFilterService();
        sendTimeEvent("2002-05-1T8:00:00.000");
        epService.getEPAdministrator().createEPL("create context EveryMinute as " +
                "initiated by pattern[every timer:at(*, *, *, *, *)] " +
                "terminated after 3 min");

        String[] fields = "c0,c1,c2".split(",");
        EPStatementSPI statement = (EPStatementSPI) epService.getEPAdministrator().createEPL("context EveryMinute select context.id as c0, string as c1, sum(intPrimitive) as c2 from SupportBean");
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 10));
        assertFalse(listener.getAndClearIsInvoked());
        assertEquals(0, filterSPI.getFilterCountApprox());   
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 0);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, null);

        sendTimeEvent("2002-05-1T8:01:00.000");

        assertEquals(1, filterSPI.getFilterCountApprox());   
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 1);
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 5));
        Object[][] expected = new Object[][]{{0, "E2", 5}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:01:59.999");

        assertEquals(1, filterSPI.getFilterCountApprox());   
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 1);
        epService.getEPRuntime().sendEvent(new SupportBean("E3", 6));
        expected = new Object[][]{{0, "E3", 11}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:02:00.000");

        assertEquals(2, filterSPI.getFilterCountApprox());   
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 2);
        epService.getEPRuntime().sendEvent(new SupportBean("E4", 7));
        expected = new Object[][]{{0, "E4", 18}, {1, "E4", 7}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:02:59.999");

        assertEquals(2, filterSPI.getFilterCountApprox());   
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 2);
        epService.getEPRuntime().sendEvent(new SupportBean("E5", 8));
        expected = new Object[][]{{0, "E5", 26}, {1, "E5", 15}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:03:00.000");

        assertEquals(3, filterSPI.getFilterCountApprox());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 3);
        epService.getEPRuntime().sendEvent(new SupportBean("E6", 9));
        expected = new Object[][]{{0, "E6", 35}, {1, "E6", 24}, {2, "E6", 9}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:04:00.000");

        assertEquals(3, filterSPI.getFilterCountApprox());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 3);
        epService.getEPRuntime().sendEvent(new SupportBean("E7", 10));
        expected = new Object[][]{{1, "E7", 34}, {2, "E7", 19}, {0, "E7", 10}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);

        sendTimeEvent("2002-05-1T8:05:00.000");

        assertEquals(3, filterSPI.getFilterCountApprox());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 3);
        epService.getEPRuntime().sendEvent(new SupportBean("E8", 11));
        expected = new Object[][]{{2, "E8", 30}, {0, "E8", 21}, {1, "E8", 11}};
        ArrayAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, expected);
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, expected);
    }

    private void sendTimeEvent(String time) {
        epService.getEPRuntime().sendEvent(new CurrentTimeEvent(SupportDateTime.parseGetMSec(time)));
    }

    private SupportBean makeEvent(String string, int intPrimitive, long longPrimitive) {
        SupportBean bean = new SupportBean(string, intPrimitive);
        bean.setLongPrimitive(longPrimitive);
        return bean;
    }
}
