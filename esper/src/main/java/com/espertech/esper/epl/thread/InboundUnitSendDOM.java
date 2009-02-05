package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.client.EventBean;

public class InboundUnitSendDOM implements InboundUnitRunnable
{
    private final org.w3c.dom.Node event;
    private final EPServicesContext services;
    private final EPRuntimeImpl runtime;

    public InboundUnitSendDOM(org.w3c.dom.Node event, EPServicesContext services, EPRuntimeImpl runtime)
    {
        this.event = event;
        this.services = services;
        this.runtime = runtime;
    }

    public void run()
    {
        EventBean eventBean = services.getEventAdapterService().adapterForDOM(event);
        runtime.processEvent(eventBean);
    }
}
