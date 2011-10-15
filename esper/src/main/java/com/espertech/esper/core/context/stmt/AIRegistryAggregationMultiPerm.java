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

package com.espertech.esper.core.context.stmt;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.ArrayWrap;
import com.espertech.esper.collection.MultiKeyUntyped;
import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;

import java.util.Collection;

public class AIRegistryAggregationMultiPerm implements AIRegistryAggregation {
    private final ArrayWrap<AggregationService> services;
    private int count;

    public AIRegistryAggregationMultiPerm() {
        this.services = new ArrayWrap<AggregationService>(AggregationService.class, 2);
    }

    public void assignService(int serviceId, AggregationService aggregationService) {
        if (serviceId > services.getArray().length - 1) {
            services.expand(100);
        }
        services.getArray()[serviceId] = aggregationService;
        count++;
    }

    public void deassignService(int serviceId) {
        services.getArray()[serviceId] = null;
        count--;
    }

    public int getInstanceCount() {
        return count;
    }

    public void applyEnter(EventBean[] eventsPerStream, MultiKeyUntyped optionalGroupKeyPerRow, ExprEvaluatorContext exprEvaluatorContext) {
        services.getArray()[exprEvaluatorContext.getAgentInstanceIds()[0]].applyEnter(eventsPerStream, optionalGroupKeyPerRow, exprEvaluatorContext);
    }

    public void applyLeave(EventBean[] eventsPerStream, MultiKeyUntyped optionalGroupKeyPerRow, ExprEvaluatorContext exprEvaluatorContext) {
        services.getArray()[exprEvaluatorContext.getAgentInstanceIds()[0]].applyLeave(eventsPerStream, optionalGroupKeyPerRow, exprEvaluatorContext);
    }

    public void setCurrentAccess(MultiKeyUntyped groupKey, int[] agentInstanceIds) {
        services.getArray()[agentInstanceIds[0]].setCurrentAccess(groupKey, agentInstanceIds);
    }

    public void clearResults(ExprEvaluatorContext exprEvaluatorContext) {
        services.getArray()[exprEvaluatorContext.getAgentInstanceIds()[0]].clearResults(exprEvaluatorContext);
    }

    public Object getValue(int column, int[] agentInstanceIds) {
        return services.getArray()[agentInstanceIds[0]].getValue(column, agentInstanceIds);
    }

    public Collection<EventBean> getCollection(int column, ExprEvaluatorContext context) {
        return services.getArray()[context.getAgentInstanceIds()[0]].getCollection(column, context);
    }

    public EventBean getEventBean(int column, ExprEvaluatorContext context) {
        return services.getArray()[context.getAgentInstanceIds()[0]].getEventBean(column, context);
    }
}
