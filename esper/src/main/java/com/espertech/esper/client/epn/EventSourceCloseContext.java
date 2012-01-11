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

public class EventSourceCloseContext {
    private final String engineURI;
    private final String producerName;

    public EventSourceCloseContext(String engineURI, String producerName) {
        this.engineURI = engineURI;
        this.producerName = producerName;
    }

    public String getEngineURI() {
        return engineURI;
    }

    public String getProducerName() {
        return producerName;
    }
}
