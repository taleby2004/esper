package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

public class InboundExecRunnable implements Runnable
{
    private static final Log log = LogFactory.getLog(InboundExecRunnable.class);
    private final BlockingQueue<InboundUnit> queue;
    private final EPServicesContext services;
    private final EPRuntimeImpl epRuntime;

    public InboundExecRunnable(EPServicesContext services, BlockingQueue<InboundUnit> queue, EPRuntimeImpl epRuntime)
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
                InboundUnit item = queue.take();
                item.execute(services, epRuntime);
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
