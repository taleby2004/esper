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

import com.espertech.esper.client.epn.EventSource;
import com.espertech.esper.client.epn.EventSourceOptions;
import com.espertech.esper.client.epn.EventSourceState;

public class SourceEntry {

    private final EventSource source;
    private final EventSourceOptions options;
    private EventSourceState state;

    private Thread thread;
    private EventSourcePolledRunnable runnable;

    public SourceEntry(EventSource source, EventSourceOptions options, EventSourceState state) {
        this.source = source;
        this.options = options;
        this.state = state;
    }

    public EventSourceOptions getOptions() {
        return options;
    }

    public EventSource getSource() {
        return source;
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

    public EventSourceState getState() {
        return state;
    }

    public void setState(EventSourceState state) {
        this.state = state;
    }
}
