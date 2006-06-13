package net.esper.core;

import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.client.ConfigurationException;

import java.util.Map;
import java.util.HashMap;

/**
 * Implementation for resolving event name to event type.
 */
public class EventTypeResolutionServiceImpl implements EventTypeResolutionService
{
    private Map<String, EventType> eventTypes;

    /**
     * Ctor.
     * @param eventNameClassNameMap is a mapping of event name to fully qualified java class name
     * @throws ConfigurationException is throw to indicate the mapped-to classes are invalid
     */
    public EventTypeResolutionServiceImpl(Map<String, String> eventNameClassNameMap) throws ConfigurationException
    {
        eventTypes = mapToTypes(eventNameClassNameMap);
    }

    public EventType resolveEventType(String eventName)
    {
        // Check the configuration first for the known event name
        EventType configuredType = eventTypes.get(eventName);
        if (configuredType != null)
        {
            return configuredType;
        }

        // Use class.forName to find class
        return lookupClass(eventName);
    }

    /**
     * Returns a map of event name and event type for a map of event name and Java class name.
     * @param mappedEventClasses map of event name and java class name
     * @return map of event name and event type
     */
    protected static Map<String, EventType> mapToTypes(Map<String, String> mappedEventClasses)
    {
        Map<String, EventType> eventTypes = new HashMap<String, EventType>();

        for (Map.Entry<String, String> entry : mappedEventClasses.entrySet())
        {
            String eventName = entry.getKey();
            String className = entry.getValue();

            Class clazz = null;
            try
            {
                clazz = Class.forName(entry.getValue());
            }
            catch (ClassNotFoundException ex)
            {
                throw new ConfigurationException("Failed to load class " + className, ex);
            }

            EventType eventType = EventTypeFactory.getInstance().createBeanType(clazz);
            eventTypes.put(eventName, eventType);
        }

        return eventTypes;
    }

    /**
     * Lookup a Java class using Class.forName and return the event type.
     * @param className is the fully qualified Java class name to get event type
     * @return event type for java class
     */ 
    protected static EventType lookupClass(String className)
    {
        Class clazz;
        try
        {
            clazz = Class.forName(className);
        }
        catch (ClassNotFoundException e)
        {
            throw new EventTypeResolutionException("Class named '" + className + "' could not be loaded and no alias is defined");
        }

        EventType eventType = EventTypeFactory.getInstance().createBeanType(clazz);
        return eventType;
    }
}
