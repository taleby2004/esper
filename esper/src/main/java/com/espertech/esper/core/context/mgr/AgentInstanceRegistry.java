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

import com.espertech.esper.core.context.factory.StatementAgentInstanceFactorySelectResult;
import com.espertech.esper.core.context.factory.StatementAgentInstanceFactorySelectResult;

import java.util.HashMap;
import java.util.Map;

public class AgentInstanceRegistry {

    private final Map<Integer, StatementAgentInstanceFactorySelectResult> instances;

    protected AgentInstanceRegistry() {
        instances = new HashMap<Integer, StatementAgentInstanceFactorySelectResult>();
    }

    public void add(int agentInstanceId, StatementAgentInstanceFactorySelectResult startResult) {
        instances.put(agentInstanceId, startResult);
    }

    public Map<Integer, StatementAgentInstanceFactorySelectResult> getInstances() {
        return instances;
    }
}
