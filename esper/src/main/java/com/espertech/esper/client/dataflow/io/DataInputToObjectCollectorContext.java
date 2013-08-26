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

import com.espertech.esper.dataflow.interfaces.EPDataFlowEmitter;

import java.io.DataInput;

public class DataInputToObjectCollectorContext {
    private EPDataFlowEmitter emitter;
    private DataInput dataInput;

    public EPDataFlowEmitter getEmitter() {
        return emitter;
    }

    public void setEmitter(EPDataFlowEmitter emitter) {
        this.emitter = emitter;
    }

    public DataInput getDataInput() {
        return dataInput;
    }

    public void setDataInput(DataInput dataInput) {
        this.dataInput = dataInput;
    }
}
