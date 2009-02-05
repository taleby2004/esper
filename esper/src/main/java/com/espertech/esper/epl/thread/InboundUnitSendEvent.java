package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;

public class InboundUnitSendEvent implements InboundUnitRunnable
{
    private final Object event;
    private final EPRuntimeImpl runtime;

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
