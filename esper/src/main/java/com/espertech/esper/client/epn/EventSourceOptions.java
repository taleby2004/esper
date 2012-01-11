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

package com.espertech.esper.client.epn;

import java.io.Serializable;

public class EventSourceOptions implements Serializable {
    private transient EventCollector overrideCollector;
    private boolean ignoreIfExists;
    private boolean logMessages;
    private boolean noThreading;

    public EventCollector getOptionalOverrideCollector() {
        return overrideCollector;
    }

    public EventSourceOptions setOverrideCollector(EventCollector overrideCollector) {
        this.overrideCollector = overrideCollector;
        return this;
    }

    public boolean isIgnoreIfExists() {
        return ignoreIfExists;
    }

    public EventSourceOptions setIgnoreIfExists(boolean ignoreIfExists) {
        this.ignoreIfExists = ignoreIfExists;
        return this;
    }

    public boolean isLogMessages() {
        return logMessages;
    }

    public EventSourceOptions setLogMessages(boolean logMessages) {
        this.logMessages = logMessages;
        return this;
    }

    public boolean isNoThreading() {
        return noThreading;
    }

    public EventSourceOptions setNoThreading(boolean noThreading) {
        this.noThreading = noThreading;
        return this;
    }
}
