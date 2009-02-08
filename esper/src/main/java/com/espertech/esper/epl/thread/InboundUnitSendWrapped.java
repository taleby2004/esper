package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeEventSender;
import com.espertech.esper.client.EventBean;

/**
 * Inbound unit for wrapped events.
 */
public class InboundUnitSendWrapped implements InboundUnitRunnable
{
    private final EventBean eventBean;
    private final EPRuntimeEventSender runtime;

    /**
     * Ctor.
     * @param event inbound event, wrapped
     * @param runtime to process
     */
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
