package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeEventSender;
import com.espertech.esper.client.EventBean;

public class InboundUnitSendWrapped implements InboundUnitRunnable
{
    private final EventBean eventBean;
    private final EPRuntimeEventSender runtime;

    public InboundUnitSendWrapped(EventBean event, EPRuntimeEventSender runtime)
    {
        this.eventBean = event;
        this.runtime = runtime;
    }

    public void run()
    {
        runtime.processWrappedEvent(eventBean);
    }
}
