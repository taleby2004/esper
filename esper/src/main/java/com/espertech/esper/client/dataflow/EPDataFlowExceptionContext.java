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

public class EPDataFlowExceptionContext {

    private final String dataFlowName;
    private final String operatorName;
    private final Object operatorNumber;
    private final Object operatorPrettyPrint;
    private final Throwable throwable;

    public EPDataFlowExceptionContext(String dataFlowName, String operatorName, Object operatorNumber, Object operatorPrettyPrint, Throwable throwable) {
        this.dataFlowName = dataFlowName;
        this.operatorName = operatorName;
        this.operatorNumber = operatorNumber;
        this.operatorPrettyPrint = operatorPrettyPrint;
        this.throwable = throwable;
    }

    public String getDataFlowName() {
        return dataFlowName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public Object getOperatorNumber() {
        return operatorNumber;
    }

    public Object getOperatorPrettyPrint() {
        return operatorPrettyPrint;
    }
}
