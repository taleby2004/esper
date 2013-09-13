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
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.support.bean.*;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportStaticMethodLib;
import com.espertech.esper.support.util.SupportModelHelper;
import junit.framework.TestCase;

public class TestSelectExprEventBeanAnnotation extends TestCase {

    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        listener = new SupportUpdateListener();
        Configuration config = SupportConfigFactory.getConfiguration();
        config.addEventType("SupportBean", SupportBean.class);
        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
    }

    protected void tearDown() throws Exception {
        listener = null;
    }

    public void testEventAggregationAndPrevWindow()
    {
        epService.getEPAdministrator().createEPL("create objectarray schema MyEvent(col1 string)");
        String eplInsert = "insert into DStream select " +
                "last(*) @eventbean as c0, " +
                "window(*) @eventbean as c1, " +
                "prevwindow(s0) @eventbean as c2 " +
                "from MyEvent.win:length(2) as s0";
        EPStatement stmtInsert = epService.getEPAdministrator().createEPL(eplInsert);

        for (String prop : "c0,c1,c2".split(",")){
            assertFragment(prop, stmtInsert.getEventType(), "MyEvent", prop.equals("c1") || prop.equals("c2"));
        }

        // test consuming statement
        String[] fields = "f0,f1,f2,f3,f4,f5".split(",");
        epService.getEPAdministrator().createEPL("select " +
                "c0 as f0, " +
                "c0.col1 as f1, " +
                "c1 as f2, " +
                "c1.lastOf().col1 as f3, " +
                "c1 as f4, " +
                "c1.lastOf().col1 as f5 " +
                "from DStream").addListener(listener);

        Object[] eventOne = new Object[] {"E1"};
        epService.getEPRuntime().sendEvent(eventOne, "MyEvent");
        EventBean out = listener.assertOneGetNewAndReset();
        EPAssertionUtil.assertProps(out, fields, new Object[] {eventOne, "E1", new Object[] {eventOne}, "E1", new Object[] {eventOne}, "E1"});

        Object[] eventTwo = new Object[] {"E2"};
        epService.getEPRuntime().sendEvent(eventTwo, "MyEvent");
        out = listener.assertOneGetNewAndReset();
        EPAssertionUtil.assertProps(out, fields, new Object[]{eventTwo, "E2", new Object[]{eventOne, eventTwo}, "E2", new Object[]{eventOne, eventTwo}, "E2"});

        // test SODA
        SupportModelHelper.compileCreate(epService, eplInsert);

        // test invalid
        try {
            epService.getEPAdministrator().createEPL("select last(*) @xxx from MyEvent");
            fail();
        }
        catch (EPStatementException ex) {
            assertEquals("Failed to recognize select-expression annotation 'xxx', expected 'eventbean' [select last(*) @xxx from MyEvent]", ex.getMessage());
        }
    }

    public void testSubquery()
    {
        epService.getEPAdministrator().createEPL("create objectarray schema MyEvent(col1 string, col2 string)");
        epService.getEPAdministrator().getConfiguration().addEventType(SupportBean.class);
        String eplInsert = "insert into DStream select " +
                "(select * from MyEvent.win:keepall()) @eventbean as c0 " +
                "from SupportBean";
        EPStatement stmtInsert = epService.getEPAdministrator().createEPL(eplInsert);

        for (String prop : "c0".split(",")){
            assertFragment(prop, stmtInsert.getEventType(), "MyEvent", true);
        }

        // test consuming statement
        String[] fields = "f0,f1".split(",");
        epService.getEPAdministrator().createEPL("select " +
                "c0 as f0, " +
                "c0.lastOf().col1 as f1 " +
                "from DStream").addListener(listener);

        Object[] eventOne = new Object[] {"E1"};
        epService.getEPRuntime().sendEvent(eventOne, "MyEvent");
        epService.getEPRuntime().sendEvent(new SupportBean());
        EventBean out = listener.assertOneGetNewAndReset();
        EPAssertionUtil.assertProps(out, fields, new Object[] {new Object[] {eventOne}, "E1"});

        Object[] eventTwo = new Object[] {"E2"};
        epService.getEPRuntime().sendEvent(eventTwo, "MyEvent");
        epService.getEPRuntime().sendEvent(new SupportBean());
        out = listener.assertOneGetNewAndReset();
        EPAssertionUtil.assertProps(out, fields, new Object[]{new Object[]{eventOne, eventTwo}, "E2"});
    }

    private void assertFragment(String prop, EventType eventType, String fragmentTypeName, boolean indexed) {
        EventPropertyDescriptor desc = eventType.getPropertyDescriptor(prop);
        assertEquals(true, desc.isFragment());
        FragmentEventType fragment = eventType.getFragmentType(prop);
        assertEquals(fragmentTypeName, fragment.getFragmentType().getName());
        assertEquals(false, fragment.isNative());
        assertEquals(indexed, fragment.isIndexed());
    }
}
