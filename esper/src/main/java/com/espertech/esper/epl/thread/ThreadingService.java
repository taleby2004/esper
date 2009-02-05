package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

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

    public BlockingQueue<Runnable> getOutboundQueue();
    public ThreadPoolExecutor getOutboundThreadPool();
    public BlockingQueue<Runnable> getRouteQueue();
    public ThreadPoolExecutor getRouteThreadPool();
    public BlockingQueue<Runnable> getTimerQueue();
    public ThreadPoolExecutor getTimerThreadPool();
    public BlockingQueue<Runnable> getInboundQueue();
    public ThreadPoolExecutor getInboundThreadPool();
}
