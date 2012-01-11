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

package com.espertech.esper.regression.client;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.epn.*;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.core.service.EPAdministratorSPI;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TestNetworkAdmin extends TestCase {

    private EPServiceProvider epService;
    private EPNetworkAdmin networkAdmin;
    private SupportUpdateListener listener;

    public void setUp() {
        epService = EPServiceProviderManager.getDefaultProvider(SupportConfigFactory.getConfiguration());
        epService.initialize();
        networkAdmin = ((EPAdministratorSPI) epService.getEPAdministrator()).getNetworkAdmin();
        listener = new SupportUpdateListener();
        SupportEventProducerPolled.throwException = false;
    }
    
    public void tearDown() {
        listener = null;
        networkAdmin = null;
        SupportEventProducerPolled.throwException = true;
    }

    public void testAddProducer() throws Exception {
        networkAdmin.addSource("p1", new SupportEventProducerPolled(), new EventSourceOptions().setNoThreading(true));
        assertEquals(EventSourceState.CLOSED, networkAdmin.getSource("p1").getState());
        assertTrue(networkAdmin.getSource("p1").getProducer() instanceof SupportEventProducerPolled);
        
        networkAdmin.openSource("p1");
        OpenAction openAction = getResetSupportProducerLastActions(networkAdmin, "p1");
        assertTrue(openAction.getCollector() != null);
        assertEquals("default", openAction.getContext().getEngineURI());
        assertEquals("p1", openAction.getContext().getProducerName());
        assertEquals(EventSourceState.OPEN, networkAdmin.getSource("p1").getState());

        networkAdmin.closeSource("p1");
        CloseAction closeAction = getResetSupportProducerLastActions(networkAdmin, "p1");
        assertEquals("default", closeAction.getContext().getEngineURI());
        assertEquals("p1", closeAction.getContext().getProducerName());
        assertNotNull(closeAction);
        assertEquals(EventSourceState.CLOSED, networkAdmin.getSource("p1").getState());

        networkAdmin.openSource("p1");
        assertEquals(EventSourceState.OPEN, networkAdmin.getSource("p1").getState());
        openAction = getResetSupportProducerLastActions(networkAdmin, "p1");
        assertTrue(openAction.getCollector() != null);
        
        networkAdmin.closeRemoveSource("p1");
        assertNull(networkAdmin.getSource("p1"));

        networkAdmin.addSource("p1", new SupportEventProducerPolled(), null);
        assertEquals(EventSourceState.CLOSED, networkAdmin.getSource("p1").getState());

        networkAdmin.removeSource("p1");
        assertNull(networkAdmin.getSource("p1"));
    }

    public void testSendEvents() throws Exception {
        epService.getEPAdministrator().getConfiguration().addEventType(SupportBean.class);
        epService.getEPAdministrator().createEPL("select * from SupportBean").addListener(listener);
        networkAdmin.addSource("p1", new SupportEventProducerPolled(), null);
        networkAdmin.openSource("p1");

        SupportEventProducerPolled supportProducer = getSupportProducer(networkAdmin, "p1");
        supportProducer.nextEvent(null);
        assertTrue(listener.isInvoked());

        networkAdmin.closeRemoveSource("p1");
    }

    public void testInvalid() throws Exception {
        networkAdmin.addSource("p1", new SupportEventProducerPolled(), null);

        try {
            networkAdmin.addSource("p1", new SupportEventProducerPolled(), null);
            fail();
        }
        catch (NetworkAlreadyExistsException ex) {
            assertEquals("Source 'p1' already exists", ex.getMessage());
        }

        // already closed, is fine
        networkAdmin.closeSource("p1");

        try {
            networkAdmin.closeSource("p2");
            fail();
        }
        catch (NetworkNotFoundException ex) {
            assertEquals("Source 'p2' not found", ex.getMessage());
        }

        // already open, is fine
        networkAdmin.openSource("p1");
        networkAdmin.openSource("p1");
        networkAdmin.closeSource("p1");
    }

    private static <T> T getResetSupportProducerLastActions(EPNetworkAdmin networkAdmin, String name) {
        SupportEventProducerPolled supportProducer = getSupportProducer(networkAdmin, name);
        List<Object> actions = supportProducer.getAndResetActions();
        assertTrue(actions.size() == 1);
	    return (T) actions.get(0);
    }

    private static SupportEventProducerPolled getSupportProducer(EPNetworkAdmin networkAdmin, String name) {
        return (SupportEventProducerPolled) networkAdmin.getSource(name).getProducer();
    }

    public static class SupportEventProducerPolled implements EventSourcePolled {

        private static boolean throwException;

        private List<Object> actions = new ArrayList<Object>();
        private EventCollector collector;

        public List<Object> getAndResetActions() {
            List<Object> dup = new ArrayList<Object>(actions);
            actions.clear();
            return dup;
        }

        public void open(EventSourceOpenContext context, EventCollector collector) {
            this.collector = collector;
            actions.add(new OpenAction(context, collector));
        }

        public static void setThrowException(boolean throwException) {
            SupportEventProducerPolled.throwException = throwException;
        }

        public void nextEvent(EventSourceNextEventContext nextEventContext) {

            if (throwException) {
                throw new RuntimeException("Triggered exception by throw-exception flag");
            }

            actions.add(new NextEventAction(nextEventContext));
            collector.sendEvent(new SupportBean("E1", 1));
        }

        public void close(EventSourceCloseContext context) {
            actions.add(new CloseAction(context));
        }
    }

    public static class CloseAction {
        private final EventSourceCloseContext context;

        public CloseAction(EventSourceCloseContext context) {
            this.context = context;
        }

        public EventSourceCloseContext getContext() {
            return context;
        }
    }

    public static class NextEventAction {
        private EventSourceNextEventContext nextEventContext;

        public NextEventAction(EventSourceNextEventContext nextEventContext) {
            this.nextEventContext = nextEventContext;
        }

        public EventSourceNextEventContext getNextEventContext() {
            return nextEventContext;
        }
    }

    public static class OpenAction {
        private EventSourceOpenContext context;
        private EventCollector collector;

        public OpenAction(EventSourceOpenContext context, EventCollector collector) {
            this.context = context;
            this.collector = collector;
        }

        public EventSourceOpenContext getContext() {
            return context;
        }

        public EventCollector getCollector() {
            return collector;
        }
    }
}
