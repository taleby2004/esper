package com.espertech.esper.epl.thread;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.ArrayDequeJDK6Backport;
import com.espertech.esper.core.EPStatementHandleCallback;
import com.espertech.esper.core.EPStatementHandle;
import com.espertech.esper.filter.FilterHandleCallback;

public class RouteUnit
{
    private EPStatementHandleCallback handleCallback;
    private final EventBean event;
    private ArrayDequeJDK6Backport<FilterHandleCallback> callbackList;
    private EPStatementHandle handle;

    public RouteUnit(EPStatementHandleCallback handleCallback, EventBean event)
    {
        this.callbackList = null;
        this.event = event;
        this.handleCallback = handleCallback;
    }

    public RouteUnit(ArrayDequeJDK6Backport<FilterHandleCallback> callbackList, EventBean event, EPStatementHandle handle)
    {
        this.callbackList = callbackList;
        this.event = event;
        this.handleCallback = null;
        this.handle = handle;
    }

    public ArrayDequeJDK6Backport<FilterHandleCallback> getCallbackList()
    {
        return callbackList;
    }

    public EventBean getEvent()
    {
        return event;
    }

    public EPStatementHandleCallback getHandleCallback()
    {
        return handleCallback;
    }

    public EPStatementHandle getHandle()
    {
        return handle;
    }
}
