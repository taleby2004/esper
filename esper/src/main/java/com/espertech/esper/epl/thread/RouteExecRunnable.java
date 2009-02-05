package com.espertech.esper.epl.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;

public class RouteExecRunnable implements Runnable
{
    private final BlockingQueue<RouteUnit> queue;
    private final EPServicesContext services;
    private final EPRuntimeImpl epRuntime;

    public RouteExecRunnable(EPServicesContext services, BlockingQueue<RouteUnit> queue, EPRuntimeImpl epRuntime)
    {
        this.services = services;
        this.queue = queue;
        this.epRuntime = epRuntime;
    }

}
