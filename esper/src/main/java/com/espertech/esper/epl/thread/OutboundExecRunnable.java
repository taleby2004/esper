package com.espertech.esper.epl.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;

public class OutboundExecRunnable implements Runnable
{
    private static final Log log = LogFactory.getLog(OutboundExecRunnable.class);
    private final BlockingQueue<OutboundUnit> queue;
    private final EPServicesContext services;
    private final EPRuntimeImpl epRuntime;

    public OutboundExecRunnable(EPServicesContext services, BlockingQueue<OutboundUnit> queue, EPRuntimeImpl epRuntime)
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
                OutboundUnit item = queue.take();
                item.getStatementResultService().processDispatch(item.getEvents());
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
