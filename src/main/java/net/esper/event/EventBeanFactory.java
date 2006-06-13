package net.esper.event;

import java.util.Map;

/**
 * Factory for {@link EventBean} event object wrappers. Creates wrappers for any Java object as well as for
 * maps containing key-value pairs.
 */
public class EventBeanFactory
{
    private EventBeanFactory()
    {
    }

    /**
     * Create an event wrapper bean from a set of event properties (name and value objectes) stored in a Map.
     * @param properties is key-value pairs for the event properties
     * @param eventType is the type metadata for any maps of that type
     * @return EventBean instance
     */
    public static EventBean createMapFromValues(Map<String, Object> properties, EventType eventType)
    {
        return new MapEventBean(properties, eventType);
    }

    /**
     * Create an aggregate event wrapper bean from a set of named events stored in a Map.
     * @param events is key-value pairs where the key is the event name and the value is the event
     * @param eventType is the type metadata for any maps of that type
     * @return EventBean instance
     */
    public static EventBean createMapFromUnderlying(Map<String, EventBean> events, EventType eventType)
    {
        return new MapEventBean(eventType, events);
    }

    /**
     * Create an event wrapper for an event object.
     * @param event is the event object
     * @return EventBean instance wrapping the event object
     */
    public static EventBean createObject(Object event)
    {
        Class eventClass = event.getClass();
        EventType eventType = EventTypeFactory.getInstance().createBeanType(eventClass);
        return new BeanEventBean(event, eventType);
    }
}
