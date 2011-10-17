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
import com.espertech.esper.core.service.EPServiceProviderSPI;
import com.espertech.esper.core.service.EPStatementSPI;
import com.espertech.esper.filter.FilterServiceSPI;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.bean.SupportBean_S0;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.util.AgentInstanceAssertionUtil;
import com.espertech.esper.support.util.ArrayAssertionUtil;
import com.espertech.esper.support.util.SupportUpdateListener;
import junit.framework.TestCase;

public class TestContextCategory extends TestCase {

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

    public void testInvalid() {
        String epl;

        // invalid filter spec
        epl = "create context ACtx group string is not null as cat1 from SupportBean(dummy = 1)";
        tryInvalid(epl, "Error starting statement: Property named 'dummy' is not valid in any stream [");

        // not a boolean expression
        epl = "create context ACtx group intPrimitive as grp1 from SupportBean";
        tryInvalid(epl, "Error starting statement: Filter expression not returning a boolean value: 'intPrimitive' [");

        // validate statement not applicable filters
        epService.getEPAdministrator().createEPL("create context ACtx group intPrimitive < 10 as cat1 from SupportBean");
        epl = "context ACtx select * from SupportBean_S0";
        tryInvalid(epl, "Error starting statement: Category context requires that any of the events types that are listed in the category context also appear in any of the filter expressions of the statement [");
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

    public void testCategory() {
        FilterServiceSPI filterSPI = (FilterServiceSPI) spi.getFilterService();
        String ctx = "CategorizedContext";
        epService.getEPAdministrator().createEPL("@Name('context') create context " + ctx + " " +
                "group intPrimitive < 10 as cat1, " +
                "group intPrimitive between 10 and 20 as cat2, " +
                "group intPrimitive > 20 as cat3 " +
                "from SupportBean");

        String[] fields = "c0,c1,c2,c3".split(",");
        EPStatementSPI statement = (EPStatementSPI) epService.getEPAdministrator().createEPL("context CategorizedContext " +
                "select context.name as c0, context.id as c1, context.label as c2, sum(intPrimitive) as c3 from SupportBean");
        statement.addListener(listener);
        assertEquals(3, filterSPI.getFilterCountApprox());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 3, 0, 0, 0);

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 5));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 0, "cat1", 5});
        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, new Object[][] {{ctx, 0, "cat1", 5}, {ctx, 1, "cat2", null}, {ctx, 2, "cat3", null}});

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 4));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 0, "cat1", 9});

        epService.getEPRuntime().sendEvent(new SupportBean("E3", 11));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 1, "cat2", 11});

        epService.getEPRuntime().sendEvent(new SupportBean("E4", 25));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 2, "cat3", 25});

        epService.getEPRuntime().sendEvent(new SupportBean("E5", 25));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 2, "cat3", 50});

        epService.getEPRuntime().sendEvent(new SupportBean("E6", 3));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 0, "cat1", 12});

        ArrayAssertionUtil.assertPropsPerRow(statement.iterator(), statement.safeIterator(), fields, new Object[][] {{ctx, 0, "cat1", 12}, {ctx, 1, "cat2", 11}, {ctx, 2, "cat3", 50}});

        statement.stop();
        assertEquals(0, filterSPI.getFilterCountApprox());
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 0, 0, 0, 0);

        assertEquals(1, spi.getContextManagementService().getContextCount());
        epService.getEPAdministrator().getStatement("context").destroy();
        assertEquals(1, spi.getContextManagementService().getContextCount());

        statement.destroy();
        assertEquals(0, spi.getContextManagementService().getContextCount());
    }

    public void testSingleCategorySODAPrior() {
        String ctx = "CategorizedContext";
        String eplCtx = "@Name('context')create context " + ctx + " as " +
                "group intPrimitive < 10 as cat1 " +
                "from SupportBean";
        epService.getEPAdministrator().createEPL(eplCtx);

        String eplStmt = "context CategorizedContext select context.name as c0, context.id as c1, context.label as c2, prior(1, intPrimitive) as c3 from SupportBean";
        EPStatementSPI statementOne = (EPStatementSPI) epService.getEPAdministrator().createEPL(eplStmt);

        runAssertion(ctx, statementOne);

        // test SODA
        EPStatementObjectModel modelContext = epService.getEPAdministrator().compileEPL(eplCtx);
        assertEquals(eplCtx, modelContext.toEPL());
        EPStatement stmt = epService.getEPAdministrator().create(modelContext);
        assertEquals(eplCtx, stmt.getText());

        EPStatementObjectModel modelStmt = epService.getEPAdministrator().compileEPL(eplStmt);
        assertEquals(eplStmt, modelStmt.toEPL());
        EPStatementSPI statementTwo = (EPStatementSPI) epService.getEPAdministrator().create(modelStmt);
        assertEquals(eplStmt, statementTwo.getText());

        runAssertion(ctx, statementTwo);
    }

    private void runAssertion(String ctx, EPStatementSPI statement) {
        statement.addListener(listener);

        String[] fields = "c0,c1,c2,c3".split(",");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 5));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 0, "cat1", null});

        epService.getEPRuntime().sendEvent(new SupportBean("E2", 20));
        assertFalse(listener.isInvoked());

        epService.getEPRuntime().sendEvent(new SupportBean("E1", 4));
        ArrayAssertionUtil.assertProps(listener.assertOneGetNewAndReset(), fields, new Object[]{ctx, 0, "cat1", 5});

        epService.getEPAdministrator().getStatement("context").destroy();
        assertEquals(1, spi.getContextManagementService().getContextCount());

        epService.getEPAdministrator().destroyAllStatements();
        AgentInstanceAssertionUtil.assertInstanceCounts(statement.getStatementContext(), 0, 0, 0, 0);
        assertEquals(0, spi.getContextManagementService().getContextCount());
    }
}
