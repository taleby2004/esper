package net.esper.core;

import net.esper.event.EventType;
import net.esper.event.EventBean;

import java.util.Map;

/**
 * Interface for a service to resolve event names to event type.
 */
public interface EventTypeResolutionService
{
    /**
     * Return the event type for a given event name.
     * @param eventName is the event name to return type for
     * @return event type for named event
     * @throws EventTypeResolutionException to indicate that the event name cannot be resolved
     */
    public EventType resolveEventType(String eventName) throws EventTypeResolutionException;

    /**
     * Add an event type with the given alias and a given set of properties.
     * <p>
     * If the alias already exists with the same event property information, returns the
     * existing EventType instance.
     * <p>
     * If the alias already exists with different event property information, throws an exception.
     * <p>
     * If the alias does not already exists, adds the alias and constructs a new {@link net.esper.event.MapEventType}.
     * @param eventTypeAlias is the alias name for the event type
     * @param propertyTypes is the names and types of event properties
     * @return event type is the type added
     * @throws EventTypeResolutionException if alias already exists and doesn't match property type info
     */
    public EventType add(String eventTypeAlias, Map<String, Class> propertyTypes) throws EventTypeResolutionException;

    /**
     * Add an event type with the given alias and Java fully-qualified class name.
     * <p>
     * If the alias already exists with the same class name, returns the existing EventType instance.
     * <p>
     * If the alias already exists with different class name, throws an exception.
     * <p>
     * If the alias does not already exists, adds the alias and constructs a new {@link net.esper.event.BeanEventType}.
     * @param eventTypeAlias is the alias name for the event type
     * @param fullyQualClassName is the fully qualified class name
     * @return event type is the type added
     * @throws EventTypeResolutionException if alias already exists and doesn't match class names
     */
    public EventType add(String eventTypeAlias, String fullyQualClassName) throws EventTypeResolutionException;

    /**
     * Wrap the native event returning an {@link EventBean}.
     * @param event to be wrapped
     * @return event bean wrapping native underlying event
     */
    public EventBean wrap(Object event);

    /**
     * Wrap the native event returning an {@link EventBean} using the event type alias name
     * to identify the EventType that the event should carry.
     * @param event to be wrapped
     * @param eventTypeAlias alias for the event type of the event
     * @return event bean wrapping native underlying event
     * @throws EventTypeResolutionException if the alias has not been declared, or the event cannot be wrapped using that
     * alias's event type
     */
    public EventBean wrap(Object event, String eventTypeAlias) throws EventTypeResolutionException;
}
