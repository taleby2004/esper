package net.esper.event;

import junit.framework.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class TestMapEventType extends TestCase
{
    EventType eventType;

    public void setUp()
    {
        Map<String, Class> testTypesMap = new LinkedHashMap<String, Class>();
        testTypesMap.put("myInt", int.class);
        testTypesMap.put("myString", String.class);
        eventType = EventTypeFactory.getInstance().createMapType(testTypesMap);
    }

    public void testGetPropertyNames()
    {
        String[] properties = eventType.getPropertyNames();
        assertTrue(properties.length == 2);
        assertTrue(properties[0].equals("myInt"));
        assertTrue(properties[1].equals("myString"));
    }

    public void testGetPropertyType()
    {
        assertEquals(int.class, eventType.getPropertyType("myInt"));
        assertEquals(String.class, eventType.getPropertyType("myString"));

        assertEquals(null, eventType.getPropertyType("dummy"));
    }

    public void testGetUnderlyingType()
    {
        assertEquals(Map.class, eventType.getUnderlyingType());
    }

    public void testIsValidProperty()
    {
        assertTrue(eventType.isProperty("myInt"));
        assertTrue(eventType.isProperty("myString"));

        assertFalse(eventType.isProperty("dummy"));
    }

    public void testGetGetter()
    {
        assertEquals(null, eventType.getGetter("dummy"));

        Map<String, Object> valuesMap = new HashMap<String, Object>();
        valuesMap.put("myInt", 20);
        valuesMap.put("myString", "a");
        EventBean eventBean = EventBeanFactory.createObject(valuesMap);

        EventPropertyGetter getter = eventType.getGetter("myInt");
        assertEquals(20, getter.get(eventBean));

        getter = eventType.getGetter("myString");
        assertEquals("a", getter.get(eventBean));

        try
        {
            eventBean = EventBeanFactory.createObject(new Object());
            getter.get(eventBean);
            assertTrue(false);
        }
        catch (PropertyAccessException ex)
        {
            // Expected
            log.debug(".testGetGetter Expected exception, msg=" + ex.getMessage());
        }
    }

    public void testGetSuperTypes()
    {
        assertNull(eventType.getSuperTypes());
    }

    private static final Log log = LogFactory.getLog(TestMapEventType.class);
}