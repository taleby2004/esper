package com.espertech.esper.epl.thread;

import com.espertech.esper.client.ConfigurationEngineDefaults;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPStatementHandle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingServiceImpl implements ThreadingService
{
    private static final Log log = LogFactory.getLog(ThreadingServiceImpl.class);

    private final boolean isTimerThreading;
    private final boolean isInboundThreading;
    private final boolean isRouteThreading;
    private final boolean isOutboundThreading;

    private ArrayBlockingQueue<Pair<EPStatementHandle, Object>> timerQueue;
    private ArrayBlockingQueue<InboundUnit> inboundQueue;
    private ArrayBlockingQueue<RouteUnit> routeQueue;
    private ArrayBlockingQueue<OutboundUnit> outboundQueue;

    private ExecutorService timerThreadPool;
    private ExecutorService inboundThreadPool;
    private ExecutorService routeThreadPool;
    private ExecutorService outboundThreadPool;

    public ThreadingServiceImpl(ConfigurationEngineDefaults.Threading threadingConfig)
    {
        if (ThreadingOption.isThreadingEnabled())
        {
            isTimerThreading = threadingConfig.isMicroThreadingTimer();
            isInboundThreading = threadingConfig.isMicroThreadingInbound();
            isRouteThreading = threadingConfig.isMicroThreadingRoute();
            isOutboundThreading = threadingConfig.isMicroThreadingOutbound();
        }
        else
        {
            isTimerThreading = false;
            isInboundThreading = false;
            isRouteThreading = false;
            isOutboundThreading = false;
        }
    }

    public boolean isRouteThreading()
    {
        return isRouteThreading;
    }

    public boolean isInboundThreading()
    {
        return isInboundThreading;
    }

    public boolean isTimerThreading()
    {
        return isTimerThreading;
    }

    public boolean isOutboundThreading()
    {
        return isOutboundThreading;
    }

    public void initThreading(EPServicesContext services, EPRuntimeImpl runtime)
    {
        if (isInboundThreading)
        {
            int numThreads = 5;
            int threadPrio = 5;
            int maxQueueSize = 1000000;
            String threadGroupName = "com.espertech.esper.InbExec-" + services.getEngineURI();
            ThreadGroup threadGroup = new ThreadGroup(threadGroupName);
            inboundThreadPool = Executors.newFixedThreadPool(numThreads, new MicroThreadFactory(services.getEngineURI(), "InbExec", threadGroup, threadPrio));
            InboundExecRunnable[] runnables = new InboundExecRunnable[numThreads];
            inboundQueue = new ArrayBlockingQueue<InboundUnit>(maxQueueSize);
            for (int i = 0; i < numThreads; i++)
            {
                runnables[i] = new InboundExecRunnable(services, inboundQueue, runtime);
                inboundThreadPool.submit(runnables[i]);
            }
        }

        if (isTimerThreading)
        {
            int numThreads = 5;
            int threadPrio = 5;
            int maxQueueSize = 1000000;
            String threadGroupName = "com.espertech.esper.TimerExec-" + services.getEngineURI();
            ThreadGroup threadGroup = new ThreadGroup(threadGroupName);
            timerThreadPool = Executors.newFixedThreadPool(numThreads, new MicroThreadFactory(services.getEngineURI(), "TimerExec", threadGroup, threadPrio));
            TimerExecRunnable[] runnables = new TimerExecRunnable[numThreads];
            timerQueue = new ArrayBlockingQueue<Pair<EPStatementHandle, Object>>(maxQueueSize);
            for (int i = 0; i < numThreads; i++)
            {
                runnables[i] = new TimerExecRunnable(services, timerQueue, runtime);
                timerThreadPool.submit(runnables[i]);
            }
        }

        if (isRouteThreading)
        {
            int numThreads = 5;
            int threadPrio = 5;
            int maxQueueSize = 1000000;
            String threadGroupName = "com.espertech.esper.Route-" + services.getEngineURI();
            ThreadGroup threadGroup = new ThreadGroup(threadGroupName);
            routeThreadPool = Executors.newFixedThreadPool(numThreads, new MicroThreadFactory(services.getEngineURI(), "Route", threadGroup, threadPrio));
            RouteExecRunnable[] runnables = new RouteExecRunnable[numThreads];
            routeQueue = new ArrayBlockingQueue<RouteUnit>(maxQueueSize);
            for (int i = 0; i < numThreads; i++)
            {
                runnables[i] = new RouteExecRunnable(services, routeQueue, runtime);
                routeThreadPool.submit(runnables[i]);
            }
        }

        if (isOutboundThreading)
        {
            int numThreads = 5;
            int threadPrio = 5;
            int maxQueueSize = 1000000;
            String threadGroupName = "com.espertech.esper.Outb-" + services.getEngineURI();
            ThreadGroup threadGroup = new ThreadGroup(threadGroupName);
            outboundThreadPool = Executors.newFixedThreadPool(numThreads, new MicroThreadFactory(services.getEngineURI(), "Outb", threadGroup, threadPrio));
            OutboundExecRunnable[] runnables = new OutboundExecRunnable[numThreads];
            outboundQueue = new ArrayBlockingQueue<OutboundUnit>(maxQueueSize);
            for (int i = 0; i < numThreads; i++)
            {
                runnables[i] = new OutboundExecRunnable(services, outboundQueue, runtime);
                outboundThreadPool.submit(runnables[i]);
            }
        }
    }

    public void submitRoute(RouteUnit unit)
    {
        routeQueue.add(unit);
    }

    public void submitInbound(InboundUnit unit)
    {
        inboundQueue.add(unit);
    }

    public void submitOutbound(OutboundUnit unit)
    {
        outboundQueue.add(unit);
    }

    public void submitTimerWork(Pair<EPStatementHandle, Object> pair)
    {
        timerQueue.add(pair);
    }

    public void destroy()
    {

    }
}
