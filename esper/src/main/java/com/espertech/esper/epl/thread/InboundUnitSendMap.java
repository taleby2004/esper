package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.client.EventBean;

import java.util.Map;

public class InboundUnitSendMap implements InboundUnit
{
    private final Map map;
    private final String eventTypeName;

    public InboundUnitSendMap(Map map, String eventTypeName)
    {
        this.eventTypeName = eventTypeName;
        this.map = map;
    }

    public void execute(EPServicesContext services, EPRuntimeImpl runtime)
    {
        // Process event
        EventBean eventBean = services.getEventAdapterService().adapterForMap(map, eventTypeName);
        runtime.processWrappedEvent(eventBean);
    }
}
