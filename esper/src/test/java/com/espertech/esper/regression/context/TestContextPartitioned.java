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
import com.espertech.esper.client.context.*;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.core.service.EPServiceProviderSPI;
import com.espertech.esper.filter.FilterServiceSPI;
import com.espertech.esper.support.bean.*;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

import java.util.*;

// Test invalid:
// - segmented context: validate if statement indeed has such filters

public class TestContextPartitioned extends TestCase {

    private EPServiceProvider epService;
    private SupportUpdateListener listener;
    private EPServiceProviderSPI spi;

    public void setUp()
    {
        Configuration configuration = SupportConfigFactory.getConfiguration();
        configuration.addEventType("SupportBean", SupportBean.class);
        configuration.addEventType("SupportBean_S0", SupportBean_S0.class);
        configuration.getEngineDefaults().getLogging().setEnableExecutionDebug(true);
        epService = EPServiceProviderManager.getDefaultProvider(configuration);
        epService.initialize();
        spi = (EPServiceProviderSPI) epService;

        listener = new SupportUpdateListener();
    }

    public void tearDown() {
        listener = null;
    }

    public void testIterateTargetedCP() {
        epService.getEPAdministrator().createEPL("create context PartitionedByString partition by string from SupportBean");
        String[] fields = "c0,c1".split(",");
        EPStatement stmt = epService.getEPAdministrator().createEPL("@Name('StmtOne') context PartitionedByString select context.key1 as c0, sum(intPrimitive) as c1 from SupportBean.win:length(5)");

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 20));
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 21));

        EPAssertionUtil.assertPropsPerRow(stmt.iterator(), stmt.safeIterator(), fields, new Object[][]{{"E1", 10}, {"E2", 41}});

        // test iterator targeted
        SupportSelectorPartitioned selector = new SupportSelectorPartitioned(Collections.singletonList(new Object[]{"E2"}));
        EPAssertionUtil.assertPropsPerRow(stmt.iterator(selector), stmt.safeIterator(selector), fields, new Object[][]{{"E2", 41}});
        assertFalse(stmt.iterator(new SupportSelectorPartitioned(null)).hasNext());
        assertFalse(stmt.iterator(new SupportSelectorPartitioned(Collections.singletonList(new Object[]{"EX"}))).hasNext());
        assertFalse(stmt.iterator(new SupportSelectorPartitioned(Collections.<Object[]>emptyList())).hasNext());

        // test iterator filtered
        MySelectorFilteredPartitioned filtered = new MySelectorFilteredPartitioned(new Object[] {"E2"});
        EPAssertionUtil.assertPropsPerRow(stmt.iterator(filtered), stmt.safeIterator(filtered), fields, new Object[][]{{"E2", 41}});

        // test always-false filter - compare context partition info
        MySelectorFilteredPartitioned filteredFalse = new MySelectorFilteredPartitioned(null);
        assertFalse(stmt.iterator(filteredFalse).hasNext());
        EPAssertionUtil.assertEqualsAnyOrder(new Object[]{new Object[]{"E1"}, new Object[]{"E2"}}, filteredFalse.getContexts().toArray());
        
        try {
            stmt.iterator(new ContextPartitionSelectorCategory() {
                public Set<String> getLabels() {
                    return null;
                }
            });
            fail();
        }
        catch (InvalidContextPartitionSelector ex) {
            assertTrue("message: " + ex.getMessage(), ex.getMessage().startsWith("Invalid context partition selector, expected an implementation class of any of [ContextPartitionSelectorAll, ContextPartitionSelectorFiltered, ContextPartitionSelectorById, ContextPartitionSelectorSegmented] interfaces but received com."));
        }
    }

    public void testInvalid() {
        String epl;

        // invalid filter spec
        epl = "create context SegmentedByAString partition by string from SupportBean(dummy = 1)";
        tryInvalid(epl, "Error starting statement: Property named 'dummy' is not valid in any stream [");

        // property not found
        epl = "create context SegmentedByAString partition by dummy from SupportBean";
        tryInvalid(epl, "Error starting statement: For context 'SegmentedByAString' property name 'dummy' not found on type SupportBean [");

        // mismatch number pf properties
        epl = "create context SegmentedByAString partition by string from SupportBean, id, p00 from SupportBean_S0";
        tryInvalid(epl, "Error starting statement: For context 'SegmentedByAString' expected the same number of property names for each event type, found 1 properties for event type 'SupportBean' and 2 properties for event type 'SupportBean_S0' [create context SegmentedByAString partition by string from SupportBean, id, p00 from SupportBean_S0]");

        // incompatible property types
        epl = "create context SegmentedByAString partition by string from SupportBean, id from SupportBean_S0";
        tryInvalid(epl, "Error starting statement: For context 'SegmentedByAString' for context 'SegmentedByAString' found mismatch of property types, property 'string' of type 'java.lang.String' compared to property 'id' of type 'java.lang.Integer' [");

        // duplicate type specification
        epl = "create context SegmentedByAString partition by string from SupportBean, string from SupportBean";
        tryInvalid(epl, "Error starting statement: For context 'SegmentedByAString' the event type 'SupportBean' is listed twice [");

        // duplicate type: subtype
        epService.getEPAdministrator().getConfiguration().addEventType(ISupportBaseAB.class);
        epService.getEPAdministrator().getConfiguration().addEventType(ISupportA.class);
        epl = "create context SegmentedByAString partition by baseAB from ISupportBaseAB, a from ISupportA";
        tryInvalid(epl, "Error starting statement: For context 'SegmentedByAString' the event type 'ISupportA' is listed twice: Event type 'ISupportA' is a subtype or supertype of event type 'ISupportBaseAB' [");

        // validate statement not applicable filters
        epService.getEPAdministrator().createEPL("create context SegmentedByAString partition by string from SupportBean");
        epl = "context SegmentedByAString select * from SupportBean_S0";
        tryInvalid(epl, "Error starting statement: Segmented context 'SegmentedByAString' requires that any of the event types that are listed in the segmented context also appear in any of the filter expressions of the statement [");
    }

    private void tryInvalid(String epl, String expected) {
        try {
            epService.getEPAdministrator().createEPL(epl);
            fail();
        }
        catch (EPStatementException ex) {
            if (!ex.getMessage().startsWith(expected)) {
                throw new RuntimeException("Expected/Received:\n" + expected + "\n" + ex.getMessage() + "\n");
            }
            assertTrue(expected.trim().length() != 0);
        }
    }

    public void testLargeNumberContexts() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByAString  partition by string from SupportBean");

        String[] fields = "col1".split(",");
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("context SegmentedByAString " +
                "select sum(intPrimitive) as col1," +
                "prev(1, intPrimitive)," +
                "prior(1, intPrimitive)," +
                "(select id from SupportBean_S0.std:lastevent())" +
                "  from SupportBean.win:keepall()");
        stmtOne.addListener(listener);
        
        for (int i = 0; i < 10000; i++) {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + i, i));
            EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{i});
        }
    }

    public void testAdditionalFilters() {
        FilterServiceSPI filterSPI = (FilterServiceSPI) spi.getFilterService();
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByAString " +
                "partition by string from SupportBean(intPrimitive>0), p00 from SupportBean_S0(id > 0)");

        // first send a view events
        epService.getEPRuntime().sendEvent(new SupportBean("B1", -1));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(-2, "S0"));
        assertEquals(0, filterSPI.getFilterCountApprox());

        String[] fields = "col1,col2".split(",");
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("context SegmentedByAString " +
                "select sum(sb.intPrimitive) as col1, sum(s0.id) as col2 " +
                "from pattern [every (s0=SupportBean_S0 or sb=SupportBean)]");
        stmtOne.addListener(listener);

        assertEquals(2, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(-3, "S0"));
        epService.getEPRuntime().sendEvent(new SupportBean("S0", -1));
        epService.getEPRuntime().sendEvent(new SupportBean("S1", -2));
        assertFalse(listener.isInvoked());
        assertEquals(2, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "S0"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{null, 2});

        epService.getEPRuntime().sendEvent(new SupportBean("S1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{10, null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(-2, "S0"));
        epService.getEPRuntime().sendEvent(new SupportBean("S1", -10));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(3, "S1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{10, 3});

        epService.getEPRuntime().sendEvent(new SupportBean("S0", 9));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{9, 2});

        epService.getEPAdministrator().destroyAllStatements();
        assertEquals(0, filterSPI.getFilterCountApprox());
    }

    public void testMultiStatementFilterCount() {
        FilterServiceSPI filterSPI = (FilterServiceSPI) spi.getFilterService();
        EPStatement stmtContext = epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByAString " +
                "partition by string from SupportBean, p00 from SupportBean_S0");
        assertEquals(0, filterSPI.getFilterCountApprox());

        // first send a view events
        epService.getEPRuntime().sendEvent(new SupportBean("B1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "S0"));

        String[] fields = new String[] {"col1"};
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("context SegmentedByAString select sum(id) as col1 from SupportBean_S0");
        stmtOne.addListener(listener);

        assertEquals(2, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "S0"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{10});

        assertEquals(3, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(8, "S1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{8});

        assertEquals(4, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(4, "S0"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{14});

        assertEquals(4, filterSPI.getFilterCountApprox());

        EPStatement stmtTwo = epService.getEPAdministrator().createEPL("context SegmentedByAString select sum(intPrimitive) as col1 from SupportBean");
        stmtTwo.addListener(listener);

        assertEquals(6, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean("S0", 5));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{5});

        assertEquals(6, filterSPI.getFilterCountApprox());

        epService.getEPRuntime().sendEvent(new SupportBean("S2", 6));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{6});

        assertEquals(8, filterSPI.getFilterCountApprox());

        stmtOne.destroy();
        assertEquals(5, filterSPI.getFilterCountApprox());  // 5 = 3 from context instances and 2 from context itself

        stmtTwo.destroy();
        assertEquals(0, filterSPI.getFilterCountApprox());

        stmtContext.destroy();
        assertEquals(0, filterSPI.getFilterCountApprox());
    }

    public void testSegmentedSubtype() {
        epService.getEPAdministrator().getConfiguration().addEventType("ISupportBaseAB", ISupportBaseAB.class);
        epService.getEPAdministrator().getConfiguration().addEventType("ISupportA", ISupportA.class);
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by baseAB from ISupportBaseAB");

        String[] fields = "col1".split(",");
        EPStatement stmt = epService.getEPAdministrator().createEPL("context SegmentedByString select count(*) as col1 from ISupportA");
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(new ISupportAImpl("A1", "AB1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{1L});

        epService.getEPRuntime().sendEvent(new ISupportAImpl("A2", "AB1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{2L});

        epService.getEPRuntime().sendEvent(new ISupportAImpl("A3", "AB2"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{1L});

        epService.getEPRuntime().sendEvent(new ISupportAImpl("A4", "AB1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{3L});
    }

    public void testSegmentedJoinMultitypeMultifield() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedBy2Fields " +
                "partition by string and intPrimitive from SupportBean, p00 and id from SupportBean_S0");

        String[] fields = "c1,c2,c3,c4,c5,c6".split(",");
        EPStatement stmt = epService.getEPAdministrator().createEPL("context SegmentedBy2Fields " +
                "select string as c1, intPrimitive as c2, id as c3, p00 as c4, context.key1 as c5, context.key2 as c6 " +
                "from SupportBean.std:lastevent(), SupportBean_S0.std:lastevent()");
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 1));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "G1"));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 2));
        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "G2"));
        assertFalse(listener.isInvoked());
        
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 1));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 1, 1, "G2", "G2", 1});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "G2"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 2, 2, "G2", "G2", 2});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "G1"));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 1, 1, "G1", "G1", 1});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 2));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 2, 2, "G1", "G1", 2});
    }

    public void testSegmentedSubselectPrevPrior() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");

        String[] fieldsPrev = new String[] {"string", "col1"};
        EPStatement stmtPrev = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select string, (select prev(0, id) from SupportBean_S0.win:keepall()) as col1 from SupportBean");
        stmtPrev.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrev, new Object[]{"G1", null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrev, new Object[]{"G1", 1});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrev, new Object[]{"G2", null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "E2"));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 21));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrev, new Object[]{"G2", 2});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 12));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrev, new Object[]{"G1", null});  // since returning multiple rows

        stmtPrev.stop();

        String[] fieldsPrior = new String[] {"string", "col1"};
        EPStatement stmtPrior = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select string, (select prior(0, id) from SupportBean_S0.win:keepall()) as col1 from SupportBean");
        stmtPrior.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrior, new Object[]{"G1", null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(1, "E1"));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrior, new Object[]{"G1", 1});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrior, new Object[]{"G2", null});    // since category started as soon as statement added

        epService.getEPRuntime().sendEvent(new SupportBean_S0(2, "E2"));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 21));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrior, new Object[]{"G2", 2}); // since returning multiple rows

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 12));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fieldsPrior, new Object[]{"G1", null});  // since returning multiple rows
    }

    public void testSegmentedPrior() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");

        String[] fields = new String[] {"val0", "val1"};
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select intPrimitive as val0, prior(1, intPrimitive) as val1 from SupportBean");
        stmtOne.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{10, null});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{20, null});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{11, 10});
        
        stmtOne.stop();

        stmtOne.destroy();
    }

    public void testSegmentedSubqueryFiltered() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");

        String[] fields = new String[] {"string", "intPrimitive", "val0"};
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select string, intPrimitive, (select p00 from SupportBean_S0.std:lastevent() as s0 where sb.intPrimitive = s0.id) as val0 " +
                "from SupportBean as sb");
        stmtOne.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "s1"));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "s2"));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, "s2"});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 10, null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "s3"));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 10, "s3"});

        epService.getEPRuntime().sendEvent(new SupportBean("G3", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G3", 10, null});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, "s3"});
    }

    public void testSegmentedSubqueryNamedWindowIndexShared() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");
        epService.getEPAdministrator().createEPL("@Hint('enable_window_subquery_indexshare') create window MyWindow.win:keepall() as SupportBean_S0");
        epService.getEPAdministrator().createEPL("insert into MyWindow select * from SupportBean_S0");

        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select string, intPrimitive, (select p00 from MyWindow as s0 where sb.intPrimitive = s0.id) as val0 " +
                "from SupportBean as sb");
        stmtOne.addListener(listener);

        runAssertionSubqueryNW();
    }

    public void testSegmentedSubqueryNamedWindowIndexUnShared() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");
        epService.getEPAdministrator().createEPL("create window MyWindow.win:keepall() as SupportBean_S0");
        epService.getEPAdministrator().createEPL("insert into MyWindow select * from SupportBean_S0");

        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select string, intPrimitive, (select p00 from MyWindow as s0 where sb.intPrimitive = s0.id) as val0 " +
                "from SupportBean as sb");
        stmtOne.addListener(listener);

        runAssertionSubqueryNW();
    }

    private void runAssertionSubqueryNW() {
        String[] fields = new String[] {"string", "intPrimitive", "val0"};

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "s1"));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, "s1"});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 10, "s1"});

        epService.getEPRuntime().sendEvent(new SupportBean("G3", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G3", 20, null});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(20, "s2"));
        epService.getEPRuntime().sendEvent(new SupportBean("G3", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G3", 20, "s2"});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 20, "s2"});
    }

    public void testSegmentedJoin() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");

        String[] fields = new String[] {"sb.string", "sb.intPrimitive", "s0.id"};
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select * from SupportBean.win:keepall() as sb, SupportBean_S0.win:keepall() as s0 " +
                "where intPrimitive = id");
        stmtOne.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(20));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 20, 20});

        epService.getEPRuntime().sendEvent(new SupportBean_S0(30));
        epService.getEPRuntime().sendEvent(new SupportBean("G3", 30));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 30));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 30, 30});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 30));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 30, 30});
    }

    public void testSegmentedPattern() {
        epService.getEPAdministrator().createEPL("@Name('context') create context SegmentedByString partition by string from SupportBean");

        String[] fields = new String[] {"a.string", "a.intPrimitive", "b.string", "b.intPrimitive"};
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select * from pattern [every a=SupportBean -> b=SupportBean(intPrimitive=a.intPrimitive+1)]");
        stmtOne.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 20));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 21));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 20, "G2", 21});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, "G1", 11});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 22));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 21, "G2", 22});

        stmtOne.destroy();

        // add another statement: contexts already exist, this one uses @Consume
        EPStatement stmtTwo = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select * from pattern [every a=SupportBean -> b=SupportBean(intPrimitive=a.intPrimitive+1)@Consume]");
        stmtTwo.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G1", 20));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 21));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G2", 20, "G2", 21});

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        EPAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{"G1", 10, "G1", 11});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 22));
        assertFalse(listener.isInvoked());

        stmtTwo.destroy();

        // test truly segmented consume
        String[] fieldsThree = new String[] {"a.string", "a.intPrimitive", "b.id", "b.p00"};
        EPStatement stmtThree = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select * from pattern [every a=SupportBean -> b=SupportBean_S0(id=a.intPrimitive)@Consume]");
        stmtThree.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        epService.getEPRuntime().sendEvent(new SupportBean("G2", 10));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean_S0(10, "E1"));   // should be 2 output rows
        EPAssertionUtil.assertPropsPerRowAnyOrder(listener.getLastNewData(), fieldsThree, new Object[][] {{"G1", 10, 10, "E1"}, {"G2", 10, 10, "E1"}});
    }

    public void testSegmentedViews() {
        String contextEPL = "@Name('context') create context SegmentedByString as partition by string from SupportBean";
        epService.getEPAdministrator().createEPL(contextEPL);

        String[] fieldsIterate = "intPrimitive".split(",");
        EPStatement stmtOne = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select irstream intPrimitive, prevwindow(items) as pw from SupportBean.win:length(2) as items");
        stmtOne.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        assertViewData(10, new Object[][]{{"G1", 10}}, null);
        EPAssertionUtil.assertPropsPerRow(stmtOne.iterator(), stmtOne.safeIterator(), fieldsIterate, new Object[][]{{10}});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 20));
        assertViewData(20, new Object[][]{{"G2", 20}}, null);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 11));
        assertViewData(11, new Object[][]{{"G1", 11}, {"G1", 10}}, null);
        EPAssertionUtil.assertPropsPerRow(stmtOne.iterator(), stmtOne.safeIterator(), fieldsIterate, new Object[][]{{10}, {11}, {20}});

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 21));
        assertViewData(21, new Object[][]{{"G2", 21}, {"G2", 20}}, null);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 12));
        assertViewData(12, new Object[][]{{"G1", 12}, {"G1", 11}}, 10);

        epService.getEPRuntime().sendEvent(new SupportBean("G2", 22));
        assertViewData(22, new Object[][]{{"G2", 22}, {"G2", 21}}, 20);

        stmtOne.destroy();
        
        // test SODA
        epService.getEPAdministrator().destroyAllStatements();
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(contextEPL);
        assertEquals(contextEPL, model.toEPL());
        EPStatement stmt = epService.getEPAdministrator().create(model);
        assertEquals(contextEPL, stmt.getText());

        // test built-in properties
        String[] fields = "c1,c2,c3,c4".split(",");
        String ctx = "SegmentedByString";
        EPStatement stmtTwo = epService.getEPAdministrator().createEPL("@Name('A') context SegmentedByString " +
                "select context.name as c1, context.id as c2, context.key1 as c3, string as c4 " +
                "from SupportBean.win:length(2) as items");
        stmtTwo.addListener(listener);

        epService.getEPRuntime().sendEvent(new SupportBean("G1", 10));
        EPAssertionUtil.assertProps(listener.assertOneGetNew(), fields, new Object[]{ctx, 0, "G1", "G1"});
    }

    private void assertViewData(int newIntExpected, Object[][] newArrayExpected, Integer oldIntExpected) {
        assertEquals(1, listener.getLastNewData().length);
        assertEquals(newIntExpected, listener.getLastNewData()[0].get("intPrimitive"));
        SupportBean[] beans = (SupportBean[]) listener.getLastNewData()[0].get("pw");
        assertEquals(newArrayExpected.length, beans.length);
        for (int i = 0; i < beans.length; i++) {
            assertEquals(newArrayExpected[i][0], beans[i].getString());
            assertEquals(newArrayExpected[i][1], beans[i].getIntPrimitive());
        }

        if (oldIntExpected != null) {
            assertEquals(1, listener.getLastOldData().length);
            assertEquals(oldIntExpected, listener.getLastOldData()[0].get("intPrimitive"));
        }
        else {
            assertNull(listener.getLastOldData());
        }
        listener.reset();
    }

    private static class MySelectorFilteredPartitioned implements ContextPartitionSelectorFiltered {

        private Object[] match;

        private List<Object[]> contexts = new ArrayList<Object[]>();
        private LinkedHashSet<Integer> cpids = new LinkedHashSet<Integer>();

        private MySelectorFilteredPartitioned(Object[] match) {
            this.match = match;
        }

        public boolean filter(ContextPartitionIdentifier contextPartitionIdentifier) {
            ContextPartitionIdentifierPartitioned id = (ContextPartitionIdentifierPartitioned) contextPartitionIdentifier;
            if (match == null && cpids.contains(id.getContextPartitionId())) {
                throw new RuntimeException("Already exists context id: " + id.getContextPartitionId());
            }
            cpids.add(id.getContextPartitionId());
            contexts.add(id.getKeys());
            return Arrays.equals(id.getKeys(), match);
        }

        public List<Object[]> getContexts() {
            return contexts;
        }
    }
}
