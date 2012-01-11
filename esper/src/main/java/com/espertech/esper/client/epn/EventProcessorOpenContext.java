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

public class EventProcessorOpenContext {
    private final String engineURI;
    private final String processorName;

    public EventProcessorOpenContext(String engineURI, String processorName) {
        this.engineURI = engineURI;
        this.processorName = processorName;
    }

    public String getProcessorName() {
        return processorName;
    }

    public String getEngineURI() {
        return engineURI;
    }
}
