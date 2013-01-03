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

import com.espertech.esper.client.EPStatementState;

/**
 * Data flow descriptor.
 */
public class EPDataFlowDescriptor {
    private final String dataFlowName;
    private final EPStatementState statementState;
    private final String statementName;

    public EPDataFlowDescriptor(String dataFlowName, EPStatementState statementState, String statementName) {
        this.dataFlowName = dataFlowName;
        this.statementState = statementState;
        this.statementName = statementName;
    }

    public String getDataFlowName() {
        return dataFlowName;
    }

    public EPStatementState getStatementState() {
        return statementState;
    }

    public String getStatementName() {
        return statementName;
    }
}
