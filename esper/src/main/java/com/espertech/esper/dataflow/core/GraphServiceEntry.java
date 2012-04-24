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

package com.espertech.esper.dataflow.core;

import com.espertech.esper.client.EPStatementState;

public class GraphServiceEntry {
    private final GraphStmtDesc graphDesc;
    private EPStatementState state;

    public GraphServiceEntry(GraphStmtDesc graphDesc, EPStatementState state) {
        this.graphDesc = graphDesc;
        this.state = state;
    }

    public GraphStmtDesc getGraphDesc() {
        return graphDesc;
    }

    public EPStatementState getState() {
        return state;
    }

    public void setState(EPStatementState state) {
        this.state = state;
    }
}
