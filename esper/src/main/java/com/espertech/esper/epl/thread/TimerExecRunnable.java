package com.espertech.esper.epl.thread;

import com.espertech.esper.collection.Pair;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPStatementHandle;
import com.espertech.esper.core.EPStatementHandleCallback;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

public class TimerExecRunnable implements Runnable
{
    private static final Log log = LogFactory.getLog(TimerExecRunnable.class);
    private final BlockingQueue<Pair<EPStatementHandle, Object>> queue;
    private final EPServicesContext services;
    private final EPRuntimeImpl epRuntime;

    public TimerExecRunnable(EPServicesContext services, BlockingQueue<Pair<EPStatementHandle, Object>> queue, EPRuntimeImpl epRuntime)
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
                Pair<EPStatementHandle, Object> item = queue.take();
                EPStatementHandle statementHandle = item.getFirst();
                Object callbackObject = item.getSecond();

                if (statementHandle != null)
                {
                    epRuntime.processStatementScheduleMultiple(statementHandle, callbackObject, services);
                }
                else
                {
                    EPStatementHandleCallback handleCallback = (EPStatementHandleCallback) callbackObject;
                    epRuntime.processStatementScheduleSingle(handleCallback, services);
                }

                // Let listeners know of results
                epRuntime.dispatch();

                // Work off the event queue if any events accumulated in there via a route()
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
