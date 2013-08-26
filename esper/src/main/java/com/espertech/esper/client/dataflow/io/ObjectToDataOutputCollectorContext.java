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

package com.espertech.esper.client.dataflow.io;

import java.io.DataOutput;

public class ObjectToDataOutputCollectorContext {
    private DataOutput dataOutput;
    private Object event;

    public DataOutput getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(DataOutput dataOutput) {
        this.dataOutput = dataOutput;
    }

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }
}
