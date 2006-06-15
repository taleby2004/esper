package net.esper.core;

import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.support.bean.SupportBean;
import net.esper.support.bean.SupportBean_A;
import junit.framework.TestCase;

import java.util.Map;
import java.util.HashMap;

public class TestEventTypeResolutionServiceImpl extends TestCase
{
    private EventTypeResolutionServiceImpl typeResService;

    public void setUp()
    {
        typeResService = new EventTypeResolutionServiceImpl();
    }

    public void testResolve()
    {
        typeResService.add("NAME", TestEventTypeResolutionServiceImpl.class.getName());

        EventType type = typeResService.resolveEventType("NAME");
        assertEquals(TestEventTypeResolutionServiceImpl.class, type.getUnderlyingType());

        EventType typeTwo = typeResService.resolveEventType(TestEventTypeResolutionServiceImpl.class.getName());
        assertSame(typeTwo, typeTwo);
    }

    public void testAddInvalid()
    {
        try
        {
            typeResService.add("x", "xx");
            fail();
        }
        catch (EventTypeResolutionException ex)
        {
            // Expected
        }
    }

    public void testResolveInvalid()
    {
        try
        {
            typeResService.resolveEventType("xx");
            fail();
        }
        catch (EventTypeResolutionException ex)
        {
            // expected
        }
    }

    public void testAddMap()
    {
        Map<String, Class> props = new HashMap<String, Class>();
        props.put("a", Long.class);
        props.put("b", String.class);

        // check result type
        EventType typeOne = typeResService.add("latencyEvent", props);
        assertEquals(Long.class, typeOne.getPropertyType("a"));
        assertEquals(String.class, typeOne.getPropertyType("b"));
        assertEquals(2, typeOne.getPropertyNames().length);

        // add the same type with the same name, should succeed and return the same reference
        EventType typeTwo = typeResService.add("latencyEvent", props);
        assertSame(typeOne, typeTwo);

        // add the same name with a different type, should fail
        props.put("b", boolean.class);
        try
        {
            typeResService.add("latencyEvent", props);
            fail();
        }
        catch (EventTypeResolutionException ex)
        {
            // expected
        }
    }

    public void testAddClassName()
    {
        EventType typeOne = typeResService.add("latencyEvent", SupportBean.class.getName());
        assertEquals(SupportBean.class, typeOne.getUnderlyingType());

        EventType typeTwo = typeResService.add("latencyEvent", SupportBean.class.getName());
        assertSame(typeOne, typeTwo);

        try
        {
            typeResService.add("latencyEvent", SupportBean_A.class.getName());
            fail();
        }
        catch (EventTypeResolutionException ex)
        {
            // expected
        }
    }

    public void testWrap()
    {
        SupportBean bean = new SupportBean();
        EventBean event = typeResService.wrap(bean);
        assertSame(event.getUnderlying(), bean);



    }
}
