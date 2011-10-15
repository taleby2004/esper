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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.filter.FilterSpecCompiled;

import java.util.ArrayList;
import java.util.List;

public class ContextManagerPartitionedStatementDesc {
    private final ContextManagedStatementBase statement;
    private final List<FilterSpecCompiled> filtersSpecs;
    private final List<AgentInstance> instances = new ArrayList<AgentInstance>();

    public ContextManagerPartitionedStatementDesc(ContextManagedStatementBase statement, List<FilterSpecCompiled> filtersSpecs) {
        this.statement = statement;
        this.filtersSpecs = filtersSpecs;
    }

    public ContextManagedStatementBase getStatement() {
        return statement;
    }

    public List<FilterSpecCompiled> getFiltersSpecs() {
        return filtersSpecs;
    }

    public List<AgentInstance> getInstances() {
        return instances;
    }
}
