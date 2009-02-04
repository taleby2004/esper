package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.client.EventBean;

public class InboundUnitSendWrapped implements InboundUnit
{
    private final EventBean eventBean;

    public InboundUnitSendWrapped(EventBean event)
    {
        this.eventBean = event;
    }

    public void execute(EPServicesContext services, EPRuntimeImpl runtime)
    {
        runtime.processWrappedEvent(eventBean);
    }
}
