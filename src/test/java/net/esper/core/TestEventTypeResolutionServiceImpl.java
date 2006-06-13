package net.esper.core;

import net.esper.client.ConfigurationException;
import net.esper.event.EventType;
import junit.framework.TestCase;

import java.util.Map;
import java.util.HashMap;

public class TestEventTypeResolutionServiceImpl extends TestCase
{
    private EventTypeResolutionServiceImpl typeResService;

    public void setUp()
    {
        Map<String, String> nameClassMap = new HashMap<String, String>();
        nameClassMap.put("NAME", TestEventTypeResolutionServiceImpl.class.getName());

        typeResService = new EventTypeResolutionServiceImpl(nameClassMap);
    }

    public void testResolve()
    {
        EventType type = typeResService.resolveEventType("NAME");
        assertEquals(TestEventTypeResolutionServiceImpl.class, type.getUnderlyingType());

        EventType typeTwo = typeResService.resolveEventType(TestEventTypeResolutionServiceImpl.class.getName());
        assertSame(typeTwo, typeTwo);
    }

    public void testConstructorInvalid()
    {
        Map<String, String> nameClassMap = new HashMap<String, String>();
        nameClassMap.put("x", "xx");

        try
        {
            new EventTypeResolutionServiceImpl(nameClassMap);
            fail();
        }
        catch (ConfigurationException ex)
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
}
