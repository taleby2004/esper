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

package com.espertech.esper.client.dataflow;

import com.espertech.esper.client.EPException;

public class EPDataFlowExecutionException extends EPException {

    private final String dataFlowName;

    public EPDataFlowExecutionException(String message, String dataFlowName) {
        super(message);
        this.dataFlowName = dataFlowName;
    }

    public EPDataFlowExecutionException(String message, Throwable cause, String dataFlowName) {
        super(message, cause);
        this.dataFlowName = dataFlowName;
    }

    public EPDataFlowExecutionException(Throwable cause, String dataFlowName) {
        super(cause);
        this.dataFlowName = dataFlowName;
    }
}
