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

package com.espertech.esper.core.context.util;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.mgr.AgentInstanceFilterProxy;
import com.espertech.esper.core.service.ExpressionResultCacheService;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.core.MethodResolutionService;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;
import com.espertech.esper.schedule.TimeProvider;
import com.espertech.esper.util.StopCallback;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgentInstanceContext implements ExprEvaluatorContext {

    private final StatementContext statementContext;
    private final EPStatementAgentInstanceHandle epStatementAgentInstanceHandle;
    private final int[] agentInstanceIds;
    private final AgentInstanceFilterProxy agentInstanceFilterProxy;
    private final EventBean agentInstanceProperties;
    private final Set<StopCallback> terminationCallbacks = new HashSet<StopCallback>();

    public AgentInstanceContext(StatementContext statementContext, EPStatementAgentInstanceHandle epStatementAgentInstanceHandle, int[] agentInstanceIds, AgentInstanceFilterProxy agentInstanceFilterProxy, EventBean agentInstanceProperties) {
        this.statementContext = statementContext;
        this.epStatementAgentInstanceHandle = epStatementAgentInstanceHandle;
        this.agentInstanceIds = agentInstanceIds;
        this.agentInstanceFilterProxy = agentInstanceFilterProxy;
        this.agentInstanceProperties = agentInstanceProperties;
    }

    public AgentInstanceFilterProxy getAgentInstanceFilterProxy() {
        return agentInstanceFilterProxy;
    }

    public TimeProvider getTimeProvider() {
        return statementContext.getTimeProvider();
    }

    public ExpressionResultCacheService getExpressionResultCacheService() {
        return statementContext.getExpressionResultCacheService();
    }

    public int[] getAgentInstanceIds() {
        return agentInstanceIds;
    }

    public StatementContext getStatementContext() {
        return statementContext;
    }

    public EPStatementAgentInstanceHandle getEpStatementAgentInstanceHandle() {
        return epStatementAgentInstanceHandle;
    }

    public MethodResolutionService getMethodResolutionService() {
        return statementContext.getMethodResolutionService();
    }

    public EventBean getContextProperties() {
        return agentInstanceProperties;
    }

    public Set<StopCallback> getTerminationCallbacks() {
        return terminationCallbacks;
    }
}
