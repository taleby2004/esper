package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPStatementHandle;

public class TimerUnitMultiple implements TimerUnit
{
    private final EPServicesContext services;
    private final EPRuntimeImpl runtime;
    private final Object callbackObject;
    private final EPStatementHandle handle;

    public TimerUnitMultiple(EPServicesContext services, EPRuntimeImpl runtime, EPStatementHandle handle, Object callbackObject)
    {
        this.services = services;
        this.handle = handle;
        this.runtime = runtime;
        this.callbackObject = callbackObject;
    }

    public void run()
    {
        EPRuntimeImpl.processStatementScheduleMultiple(handle, callbackObject, services);

        // Let listeners know of results
        runtime.dispatch();

        // Work off the event queue if any events accumulated in there via a route()
        runtime.processThreadWorkQueue();
    }
}
