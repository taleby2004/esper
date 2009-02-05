package com.espertech.esper.epl.thread;

import com.espertech.esper.client.ConfigurationEngineDefaults;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadingServiceImpl implements ThreadingService
{
    private static final Log log = LogFactory.getLog(ThreadingServiceImpl.class);

    private final ConfigurationEngineDefaults.Threading config;
    private final boolean isTimerThreading;
    private final boolean isInboundThreading;
    private final boolean isRouteThreading;
    private final boolean isOutboundThreading;

    private LinkedBlockingQueue<Runnable> timerQueue;
    private LinkedBlockingQueue<Runnable> inboundQueue;
    private LinkedBlockingQueue<Runnable> routeQueue;
    private LinkedBlockingQueue<Runnable> outboundQueue;

    private ThreadPoolExecutor timerThreadPool;
    private ThreadPoolExecutor inboundThreadPool;
    private ThreadPoolExecutor routeThreadPool;
    private ThreadPoolExecutor outboundThreadPool;

    public ThreadingServiceImpl(ConfigurationEngineDefaults.Threading threadingConfig)
    {
        this.config = threadingConfig;
        if (ThreadingOption.isThreadingEnabled())
        {
            isTimerThreading = threadingConfig.isThreadPoolTimerExec();
            isInboundThreading = threadingConfig.isThreadPoolInbound();
            isRouteThreading = threadingConfig.isThreadPoolRouteExec();
            isOutboundThreading = threadingConfig.isThreadPoolOutbound();
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
            inboundQueue = new LinkedBlockingQueue<Runnable>();
            inboundThreadPool = getThreadPool(services.getEngineURI(), "Inbound", inboundQueue, config.getThreadPoolInboundNumThreads());
        }

        if (isTimerThreading)
        {
            timerQueue = new LinkedBlockingQueue<Runnable>();
            timerThreadPool = getThreadPool(services.getEngineURI(), "TimerExec", timerQueue, config.getThreadPoolTimerExecNumThreads());
        }

        if (isRouteThreading)
        {
            routeQueue = new LinkedBlockingQueue<Runnable>();
            routeThreadPool = getThreadPool(services.getEngineURI(), "RouteExec", routeQueue, config.getThreadPoolRouteExecNumThreads());
        }

        if (isOutboundThreading)
        {
            outboundQueue = new LinkedBlockingQueue<Runnable>();
            outboundThreadPool = getThreadPool(services.getEngineURI(), "Outbound", outboundQueue, config.getThreadPoolOutboundNumThreads());
        }
    }

    public void submitRoute(RouteUnitRunnable unit)
    {
        routeQueue.add(unit);
    }

    public void submitInbound(InboundUnitRunnable unit)
    {
        inboundQueue.add(unit);
    }

    public void submitOutbound(OutboundUnitRunnable unit)
    {
        outboundQueue.add(unit);
    }

    public void submitTimerWork(TimerUnit unit)
    {
        timerQueue.add(unit);
    }

    public LinkedBlockingQueue<Runnable> getOutboundQueue()
    {
        return outboundQueue;
    }

    public ThreadPoolExecutor getOutboundThreadPool()
    {
        return outboundThreadPool;
    }

    public LinkedBlockingQueue<Runnable> getRouteQueue()
    {
        return routeQueue;
    }

    public ThreadPoolExecutor getRouteThreadPool()
    {
        return routeThreadPool;
    }

    public LinkedBlockingQueue<Runnable> getTimerQueue()
    {
        return timerQueue;
    }

    public ThreadPoolExecutor getTimerThreadPool()
    {
        return timerThreadPool;
    }

    public LinkedBlockingQueue<Runnable> getInboundQueue()
    {
        return inboundQueue;
    }

    public ThreadPoolExecutor getInboundThreadPool()
    {
        return inboundThreadPool;
    }

    public void destroy()
    {
        if (timerThreadPool != null)
        {
            stopPool(timerThreadPool, "TimerExec");
        }
        if (routeThreadPool != null)
        {
            stopPool(routeThreadPool, "RouteExec");
        }
        if (outboundThreadPool != null)
        {
            stopPool(outboundThreadPool, "Outbound");
        }
        if (inboundThreadPool != null)
        {
            stopPool(inboundThreadPool, "Inbound");
        }
    }

    private ThreadPoolExecutor getThreadPool(String engineURI, String name, LinkedBlockingQueue<Runnable> queue, int numThreads)
    {
        if (log.isInfoEnabled())
        {
            log.info("Starting pool " + name + " with " + numThreads + " threads");
        }

        if (engineURI == null)
        {
            engineURI = "default";
        }

        String threadGroupName = "com.espertech.esper." + engineURI + "-" + name;
        ThreadGroup threadGroup = new ThreadGroup(threadGroupName);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(numThreads, numThreads, 1, TimeUnit.SECONDS, queue, new ThreadFactory(engineURI, name, threadGroup, Thread.NORM_PRIORITY));
        pool.prestartAllCoreThreads();
        return pool;
    }

    private void stopPool(ThreadPoolExecutor threadPool, String name)
    {
        if (log.isInfoEnabled())
        {
            log.info("Shutting down pool " + name);
        }

        threadPool.shutdown();
        try
        {
            threadPool.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            log.error("Interruped awaiting termination", e);
        }
    }
}
