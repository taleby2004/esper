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

public class EventProcessorOptions implements Serializable {
    private boolean isIgnoreIfExists;
    private boolean logMessages;

    public boolean isIgnoreIfExists() {
        return isIgnoreIfExists;
    }

    public EventProcessorOptions setIgnoreIfExists(boolean ignoreIfExists) {
        isIgnoreIfExists = ignoreIfExists;
        return this;
    }

    public boolean isLogMessages() {
        return logMessages;
    }

    public EventProcessorOptions setLogMessages(boolean logMessages) {
        this.logMessages = logMessages;
        return this;
    }
}
