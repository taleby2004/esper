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

package com.espertech.esper.core.context.factory;

import com.espertech.esper.core.context.subselect.SubSelectStrategyHolder;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.util.StopCallback;
import com.espertech.esper.view.Viewable;

import java.util.Map;

public abstract class StatementAgentInstanceFactoryResult {

    private final Viewable finalView;
    private final StopCallback stopCallback;
    private final AgentInstanceContext agentInstanceContext;

    private final AggregationService optionalAggegationService;
    private final Map<ExprSubselectNode, SubSelectStrategyHolder> subselectStrategies;
    private final Map<ExprPriorNode, ExprPriorEvalStrategy> priorNodeStrategies;
    private final Map<ExprPreviousNode, ExprPreviousEvalStrategy> previousNodeStrategies;

    protected StatementAgentInstanceFactoryResult(Viewable finalView, StopCallback stopCallback, AgentInstanceContext agentInstanceContext, AggregationService optionalAggegationService, Map<ExprSubselectNode, SubSelectStrategyHolder> subselectStrategies, Map<ExprPriorNode, ExprPriorEvalStrategy> priorNodeStrategies, Map<ExprPreviousNode, ExprPreviousEvalStrategy> previousNodeStrategies) {
        this.finalView = finalView;
        this.stopCallback = stopCallback;
        this.agentInstanceContext = agentInstanceContext;
        this.optionalAggegationService = optionalAggegationService;
        this.subselectStrategies = subselectStrategies;
        this.priorNodeStrategies = priorNodeStrategies;
        this.previousNodeStrategies = previousNodeStrategies;
    }

    public Viewable getFinalView() {
        return finalView;
    }

    public StopCallback getStopCallback() {
        return stopCallback;
    }

    public AgentInstanceContext getAgentInstanceContext() {
        return agentInstanceContext;
    }

    public AggregationService getOptionalAggegationService() {
        return optionalAggegationService;
    }

    public Map<ExprSubselectNode, SubSelectStrategyHolder> getSubselectStrategies() {
        return subselectStrategies;
    }

    public Map<ExprPriorNode, ExprPriorEvalStrategy> getPriorNodeStrategies() {
        return priorNodeStrategies;
    }

    public Map<ExprPreviousNode, ExprPreviousEvalStrategy> getPreviousNodeStrategies() {
        return previousNodeStrategies;
    }
}
