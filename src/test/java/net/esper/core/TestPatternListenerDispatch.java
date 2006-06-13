package net.esper.core;

import net.esper.client.UpdateListener;
import net.esper.support.util.SupportUpdateListener;
import net.esper.event.EventBean;
import net.esper.event.EventBeanFactory;

import java.util.Set;
import java.util.HashSet;

import junit.framework.TestCase;

public class TestPatternListenerDispatch extends TestCase
{
    private PatternListenerDispatch dispatch;

    private EventBean eventOne = EventBeanFactory.createObject("a");
    private EventBean eventTwo = EventBeanFactory.createObject("b");

    private SupportUpdateListener listener = new SupportUpdateListener();

    public void setUp()
    {
        Set<UpdateListener> listeners = new HashSet<UpdateListener>();
        listeners.add(listener);
        dispatch = new PatternListenerDispatch(listeners);
    }

    public void testSingle()
    {
        listener.reset();

        assertFalse(dispatch.hasData());
        dispatch.add(eventOne);
        assertTrue(dispatch.hasData());

        dispatch.execute();

        assertFalse(dispatch.hasData());
        assertEquals(1, listener.getLastNewData().length);
        assertEquals(eventOne, listener.getLastNewData()[0]);
    }

    public void testTwo()
    {
        listener.reset();
        assertFalse(dispatch.hasData());

        dispatch.add(eventOne);
        dispatch.add(eventTwo);
        assertTrue(dispatch.hasData());

        dispatch.execute();

        assertFalse(dispatch.hasData());
        assertEquals(2, listener.getLastNewData().length);
        assertEquals(eventOne, listener.getLastNewData()[0]);
        assertEquals(eventTwo, listener.getLastNewData()[1]);
    }
}
