package com.espertech.esper.epl.thread;

import com.espertech.esper.core.EPServicesContext;
import com.espertech.esper.core.EPRuntimeImpl;

public interface InboundUnit
{
    public void execute(EPServicesContext services, EPRuntimeImpl runtime);
}
