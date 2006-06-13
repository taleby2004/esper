package net.esper.core;

import net.esper.event.EventType;

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
}
