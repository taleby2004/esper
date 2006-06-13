package net.esper.event;

import java.util.Map;
import java.util.HashMap;

/**
 * Helper for utility functions dealing with event types.
 */
public class EventTypeHelper
{
    /**
     * Return a map of property name and types for a given map of property name and event type,
     * by extracting the underlying type for the event types.
     * @param types is the various event types returned.
     * @return map of property name and type
     */
    public static Map<String, Class> getUnderlyingTypes(Map<String, EventType> types)
    {
        Map<String, Class> classes = new HashMap<String, Class>();

        for (Map.Entry<String, EventType> type : types.entrySet())
        {
            classes.put(type.getKey(), type.getValue().getUnderlyingType());
        }

        return classes;
    }

    /**
     * Create an event type based on the original type passed in adding a property.
     * @param originalType - event type to add property to
     * @param fieldNames - names of properties
     * @param fieldTypes - types of properties
     * @return new event type
     */
    public static EventType createAddToEventType(EventType originalType, String[] fieldNames, Class[] fieldTypes)
    {
        Map<String, Class> types = new HashMap<String, Class>();

        // Copy properties of original event, add property value
        for (String property : originalType.getPropertyNames())
        {
            types.put(property, originalType.getPropertyType(property));
        }

        // Copy new properties
        for (int i = 0; i < fieldNames.length; i++)
        {
            types.put(fieldNames[i], fieldTypes[i]);
        }

        EventType eventType = EventTypeFactory.getInstance().createMapType(types);
        return eventType;
    }
}
