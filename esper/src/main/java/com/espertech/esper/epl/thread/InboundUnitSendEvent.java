package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;

/**
 * Inbound unit for unwrapped events.
 */
public class InboundUnitSendEvent implements InboundUnitRunnable
{
    private final Object event;
    private final EPRuntimeImpl runtime;

    /**
     * Ctor.
     * @param event to process
     * @param runtime to process event
     */
    public InboundUnitSendEvent(Object event, EPRuntimeImpl runtime)
    {
        this.event = event;
        this.runtime = runtime;
    }

    public void run()
    {
        runtime.processEvent(event);
    }
}
