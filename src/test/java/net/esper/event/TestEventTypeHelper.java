package net.esper.event;

import junit.framework.TestCase;

import java.util.Map;
import java.util.HashMap;

public class TestEventTypeHelper extends TestCase
{
    private Map<String, EventType> types = new HashMap<String, EventType>();

    public void setUp()
    {
        types.put("string", EventTypeFactory.getInstance().createBeanType(String.class));
        types.put("int", EventTypeFactory.getInstance().createBeanType(Integer.class));
    }

    public void testGetUnderlyingTypes()
    {
        Map<String, Class> underlyings = EventTypeHelper.getUnderlyingTypes(types);

        assertEquals(String.class, underlyings.get("string"));
        assertEquals(Integer.class, underlyings.get("int"));
    }

    public void testCreateAddToEventType()
    {
        Map<String, Class> schema = new HashMap<String, Class>();
        schema.put("STDDEV", Double.class);
        EventType parentEventType = EventTypeFactory.getInstance().createMapType(schema);

        EventType newEventType = EventTypeHelper.createAddToEventType(parentEventType, new String[] {"test"}, new Class[] {Integer.class});

        assertTrue(newEventType.isProperty("test"));
        assertEquals(Integer.class, newEventType.getPropertyType("test"));
    }
}
