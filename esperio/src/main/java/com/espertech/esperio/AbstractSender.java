package com.espertech.esperio;

import java.util.Map;

import com.espertech.esper.client.EPRuntime;

/**
 * Sender that abstracts the send processin terms of threading or further pre-processing.
 */
public abstract class AbstractSender {

    /**
     * Runtime.
     */
    protected EPRuntime runtime;

    /**
     * Set the engine runtime to use.
     * @param runtime runtime to use
     */
    public void setRuntime(EPRuntime runtime) {
		this.runtime = runtime;
	}

    /**
     * Send an event
     * @param event wrapper
     * @param beanToSend event object
     */
    public abstract void sendEvent(AbstractSendableEvent event, Object beanToSend);

    /**
     * Send an event.
     * @param event wrapper
     * @param mapToSend event object
     * @param eventTypeAlias alias of event
     */
    public abstract void sendEvent(AbstractSendableEvent event, Map mapToSend, String eventTypeAlias);

    /**
     * Indicate that sender should stop.
     */
    public abstract void onFinish();
}
