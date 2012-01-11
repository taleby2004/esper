/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.core.epn;

import com.espertech.esper.client.epn.EventProcessor;
import com.espertech.esper.client.epn.EventProcessorOptions;
import com.espertech.esper.client.epn.EventProcessorState;

public class ProcessorEntry {

    private final EventProcessor processor;
    private final EventProcessorOptions options;
    private EventProcessorState state;

    private Thread thread;
    private EventSourcePolledRunnable runnable;

    public ProcessorEntry(EventProcessor processor, EventProcessorOptions options, EventProcessorState state) {
        this.processor = processor;
        this.options = options;
        this.state = state;
    }

    public EventProcessorOptions getOptions() {
        return options;
    }

    public EventProcessor getProcessor() {
        return processor;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public EventSourcePolledRunnable getRunnable() {
        return runnable;
    }

    public void setRunnable(EventSourcePolledRunnable runnable) {
        this.runnable = runnable;
    }

    public EventProcessorState getState() {
        return state;
    }

    public void setState(EventProcessorState state) {
        this.state = state;
    }
}
