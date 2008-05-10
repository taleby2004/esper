package com.espertech.esper.client;

/**
 * Returns a facility to process event objects that are of a known type.
 * <p>
 * Obtained via the method {@link EPRuntime#getEventSender(String)} the sender is specific to a given
 * event type and may not process event objects of any other event type; See the method documentatiom for more details.
 * <p>
 * Obtained via the method {@link EPRuntime#getEventSender(java.net.URI[])} the sender
 * cooperates with plug-in event representations to reflect upon the event object to determine an appropriate event type
 * to process the event.
 */
public interface EventSender
{
    /**
     * Processes the event object.
     * @param event to process
     * @throws EPException if a runtime error occured.
     */
    public void sendEvent(Object event) throws EPException;
}
