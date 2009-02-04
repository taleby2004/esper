package com.espertech.esper.epl.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;

public class RouteExecRunnable implements Runnable
{
    private static final Log log = LogFactory.getLog(RouteExecRunnable.class);
    private final BlockingQueue<RouteUnit> queue;
    private final EPServicesContext services;
    private final EPRuntimeImpl epRuntime;

    public RouteExecRunnable(EPServicesContext services, BlockingQueue<RouteUnit> queue, EPRuntimeImpl epRuntime)
    {
        this.services = services;
        this.queue = queue;
        this.epRuntime = epRuntime;
    }

    public void run()
    {
        while(true)
        {
            try
            {
                RouteUnit item = queue.take();
                if (item.getCallbackList() != null)
                {
                    epRuntime.processStatementFilterMultiple(item.getHandle(), item.getCallbackList(), item.getEvent());
                }
                else
                {
                    epRuntime.processStatementFilterSingle(item.getHandleCallback().getEpStatementHandle(), item.getHandleCallback(), item.getEvent());
                }

                // Dispatch results to listeners
                // Done outside of the read-lock to prevent lockups when listeners create statements
                epRuntime.dispatch();

                // Work off the event queue if any events accumulated in there via a route() or insert-into
                epRuntime.processThreadWorkQueue();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();  //TODO
            }
            catch (RuntimeException e)
            {
                log.error(e); // TODO
            }
        }
    }
}
