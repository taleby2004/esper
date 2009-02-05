package com.espertech.esper.epl.thread;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPStatementHandleCallback;
import com.espertech.esper.core.EPStatementHandle;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.filter.FilterHandleCallback;
import com.espertech.esper.collection.ArrayDequeJDK6Backport;

public class RouteUnitSingle implements RouteUnitRunnable
{
    private static final Log log = LogFactory.getLog(RouteUnitSingle.class);

    private final EPRuntimeImpl epRuntime;
    private EPStatementHandleCallback handleCallback;
    private final EventBean event;

    public RouteUnitSingle(EPRuntimeImpl epRuntime, EPStatementHandleCallback handleCallback, EventBean event)
    {
        this.epRuntime = epRuntime;
        this.event = event;
        this.handleCallback = handleCallback;
    }

    public void run()
    {
        try
        {
            epRuntime.processStatementFilterSingle(handleCallback.getEpStatementHandle(), handleCallback, event);

            epRuntime.dispatch();

            epRuntime.processThreadWorkQueue();
        }
        catch (RuntimeException e)
        {
            log.error(e); // TODO
        }
    }

}
