package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPStatementHandleCallback;
import com.espertech.esper.core.EPStatementHandle;
import com.espertech.esper.core.EPServicesContext;

public class TimerUnitSingle implements TimerUnit
{
    private final EPServicesContext services;
    private final EPRuntimeImpl runtime;
    private final EPStatementHandleCallback handleCallback;

    public TimerUnitSingle(EPServicesContext services, EPRuntimeImpl runtime, EPStatementHandleCallback handleCallback)
    {
        this.services = services;
        this.runtime = runtime;
        this.handleCallback = handleCallback;
    }

    public void run()
    {
        EPRuntimeImpl.processStatementScheduleSingle(handleCallback, services);

        runtime.dispatch();

        runtime.processThreadWorkQueue();
    }
}
