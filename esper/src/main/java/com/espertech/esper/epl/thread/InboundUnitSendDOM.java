package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.client.EventBean;

public class InboundUnitSendDOM implements InboundUnit
{
    private final org.w3c.dom.Node event;

    public InboundUnitSendDOM(org.w3c.dom.Node event)
    {
        this.event = event;
    }

    public void execute(EPServicesContext services, EPRuntimeImpl runtime)
    {
        EventBean eventBean = services.getEventAdapterService().adapterForDOM(event);
        runtime.processEvent(eventBean);
    }
}
