package net.esper.core;

import net.esper.event.*;
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
     */
    public EventTypeResolutionServiceImpl()
    {
        eventTypes = new HashMap<String, EventType>();
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

    public EventType add(String eventTypeAlias, Map<String, Class> propertyTypes) throws EventTypeResolutionException
    {
        MapEventType newEventType = new MapEventType(propertyTypes);

        EventType existingType = eventTypes.get(eventTypeAlias);
        if (existingType != null)
        {
            // The existing type must be the same as the type created
            if (!newEventType.equals(existingType))
            {
                throw new EventTypeResolutionException("Event type named '" + eventTypeAlias +
                        "' has already been declared with differing type information");
            }

            // Since it's the same, return the existing type
            return existingType;
        }

        eventTypes.put(eventTypeAlias, newEventType);

        return newEventType;
    }

    public EventType add(String eventTypeAlias, String fullyQualClassName) throws EventTypeResolutionException
    {
        EventType existingType = eventTypes.get(eventTypeAlias);
        if (existingType != null)
        {
            if (existingType.getUnderlyingType().getName().equals(fullyQualClassName))
            {
                return existingType;
            }

            throw new EventTypeResolutionException("Event type named '" + eventTypeAlias +
                    "' has already been declared with differing type information");
        }

        Class clazz = null;
        try
        {
            clazz = Class.forName(fullyQualClassName);
        }
        catch (ClassNotFoundException ex)
        {
            throw new EventTypeResolutionException("Failed to load class " + fullyQualClassName, ex);
        }

        EventType eventType = EventTypeFactory.getInstance().createBeanType(clazz);
        eventTypes.put(eventTypeAlias, eventType);

        return eventType;
    }

    /**
     * Lookup a Java class using Class.forName and return the event type.
     * @param className is the fully qualified Java class name to get event type
     * @return event type for java class
     */ 
    private static EventType lookupClass(String className)
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

    public EventBean wrap(Object event)
    {
        return EventBeanFactory.createObject(event);
    }

    public EventBean wrap(Object event, String eventTypeAlias) throws EventTypeResolutionException
    {
        EventType existingType = eventTypes.get(eventTypeAlias);
        if (existingType == null)
        {
            throw new EventTypeResolutionException("Event type alias '" + eventTypeAlias + "' has not been defined");
        }

        Class underlyingType = existingType.getUnderlyingType();
        if (!underlyingType.equals(event.getClass()))
        {
            throw new EventTypeResolutionException("Event type alias '" + eventTypeAlias
                    + "' underlying type mismatches");
        }

        if (underlyingType.equals(Map.class))
        {
            Map<String, Object> propValues = (Map<String, Object>) event;
            return EventBeanFactory.createMapFromValues(propValues, existingType);
        }
        else
        {
            return EventBeanFactory.createObject(event);
        }
    }
}
