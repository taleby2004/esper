package net.esper.core;

import net.esper.client.EPException;

/**
 * This exception is thrown to indicate a problem resolving an event type by name.
 */
public class EventTypeResolutionException extends EPException
{
    /**
     * Ctor.
     * @param message - error message
     */
    public EventTypeResolutionException(final String message)
    {
        super(message);
    }
}
