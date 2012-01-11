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

public class EventProcessorCloseContext {
    private final String engineURI;
    private final String sinkName;

    public EventProcessorCloseContext(String engineURI, String sinkName) {
        this.engineURI = engineURI;
        this.sinkName = sinkName;
    }

    public String getEngineURI() {
        return engineURI;
    }

    public String getSinkName() {
        return sinkName;
    }
}
