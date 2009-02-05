package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;

public interface ThreadingService
{
    public void destroy();
    public void initThreading(EPServicesContext services,  EPRuntimeImpl runtime);

    public boolean isTimerThreading();
    public void submitTimerWork(TimerUnit timerUnit);

    public boolean isInboundThreading();
    public void submitInbound(InboundUnitRunnable unit);

    public boolean isRouteThreading();
    public void submitRoute(RouteUnitRunnable unit);

    public boolean isOutboundThreading();
    public void submitOutbound(OutboundUnitRunnable outboundUnit);
}
