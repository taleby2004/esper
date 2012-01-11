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

import com.espertech.esper.client.epn.EventSourceNextEventContext;
import com.espertech.esper.client.epn.EventSourcePolled;

public class EventSourcePolledRunnable implements Runnable {

    private final String engineURI;
    private final String sourceName;
    private final EventSourcePolled source;
    
    private boolean shutdown;

    public EventSourcePolledRunnable(String engineURI, String sourceName, EventSourcePolled source) {
        this.engineURI = engineURI;
        this.sourceName = sourceName;
        this.source = source;
    }

    public void run() {
        EventSourceNextEventContext context = new EventSourceNextEventContext(engineURI, sourceName);
        while(true) {
            source.nextEvent(context);
            if (shutdown) {
                break;
            }
        }
    }

    public void setShutdown() {
        shutdown = true;
    }
}
