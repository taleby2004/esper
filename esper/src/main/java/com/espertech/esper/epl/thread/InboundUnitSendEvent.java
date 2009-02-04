package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.client.EventBean;

import java.util.Map;

public class InboundUnitSendEvent implements InboundUnit
{
    private final Object event;

    public InboundUnitSendEvent(Object event)
    {
        this.event = event;
    }

    public void execute(EPServicesContext services, EPRuntimeImpl runtime)
    {
        runtime.processEvent(event);
    }
}
