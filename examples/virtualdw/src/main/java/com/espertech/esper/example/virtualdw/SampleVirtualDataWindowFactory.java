package com.espertech.esper.example.virtualdw;

import com.espertech.esper.client.hook.VirtualDataWindow;
import com.espertech.esper.client.hook.VirtualDataWindowContext;
import com.espertech.esper.client.hook.VirtualDataWindowFactory;
import com.espertech.esper.client.hook.VirtualDataWindowFactoryContext;

public class SampleVirtualDataWindowFactory implements VirtualDataWindowFactory {

    public void initialize(VirtualDataWindowFactoryContext factoryContext) {
    }

    public VirtualDataWindow create(VirtualDataWindowContext context) {
        return new SampleVirtualDataWindow(context);
    }

    public void destroyAllContextPartitions() {
        // cleanup can be performed here
    }
}
