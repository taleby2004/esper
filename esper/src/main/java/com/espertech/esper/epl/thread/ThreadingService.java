package com.espertech.esper.epl.thread;

import com.espertech.esper.collection.Pair;
import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPStatementHandle;

public interface ThreadingService
{
    public void destroy();
    public void initThreading(EPServicesContext services,  EPRuntimeImpl runtime);

    public boolean isTimerThreading();
    public void submitTimerWork(Pair<EPStatementHandle, Object> pair);

    public boolean isInboundThreading();
    public void submitInbound(InboundUnit unit);

    public boolean isRouteThreading();
    public void submitRoute(RouteUnit unit);

    public boolean isOutboundThreading();
    public void submitOutbound(OutboundUnit outboundUnit);
}
