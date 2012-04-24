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

public class EPGraphOperatorParameterProviderContext {

    private final String operatorName;
    private final String parameterName;
    private final Object operatorInstance;
    private final int operatorNum;
    private final Object providedValue;
    private final String dataFlowName;

    public EPGraphOperatorParameterProviderContext(String operatorName, String parameterName, Object operatorInstance, int operatorNum, Object providedValue, String dataFlowName) {
        this.operatorName = operatorName;
        this.parameterName = parameterName;
        this.operatorInstance = operatorInstance;
        this.operatorNum = operatorNum;
        this.providedValue = providedValue;
        this.dataFlowName = dataFlowName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public String getParameterName() {
        return parameterName;
    }

    public Object getOperatorInstance() {
        return operatorInstance;
    }

    public int getOperatorNum() {
        return operatorNum;
    }

    public Object getProvidedValue() {
        return providedValue;
    }

    public String getDataFlowName() {
        return dataFlowName;
    }
}
