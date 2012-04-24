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

import com.espertech.esper.epl.spec.GraphOperatorSpec;

public class EPGraphOperatorProviderContext {

    private final String dataFlowName;
    private final String operatorName;
    private final GraphOperatorSpec spec;

    public EPGraphOperatorProviderContext(String dataFlowName, String operatorName, GraphOperatorSpec spec) {
        this.dataFlowName = dataFlowName;
        this.operatorName = operatorName;
        this.spec = spec;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public String getDataFlowName() {
        return dataFlowName;
    }

    public GraphOperatorSpec getSpec() {
        return spec;
    }
}
