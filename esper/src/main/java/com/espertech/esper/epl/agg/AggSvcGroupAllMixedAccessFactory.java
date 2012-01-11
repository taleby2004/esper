/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.agg;

import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.epl.core.MethodResolutionService;
import com.espertech.esper.epl.expression.ExprEvaluator;

/**
 * Implementation for handling aggregation without any grouping (no group-by).
 */
public class AggSvcGroupAllMixedAccessFactory extends AggregationServiceFactoryBase
{
    private final AggregationAccessorSlotPair[] accessors;
    private final int[] streams;
    private final boolean isJoin;

    public AggSvcGroupAllMixedAccessFactory(ExprEvaluator evaluators[], AggregationMethodFactory aggregators[], AggregationAccessorSlotPair[] accessors, int[] streams, boolean join) {
        super(evaluators, aggregators);
        this.accessors = accessors;
        this.streams = streams;
        isJoin = join;
    }

    public AggregationService makeService(AgentInstanceContext agentInstanceContext, MethodResolutionService methodResolutionService) {
        AggregationAccess[] accesses = AggregationAccessUtil.getNewAccesses(agentInstanceContext.getAgentInstanceId(), isJoin, streams, methodResolutionService, null);
        AggregationMethod[] aggregatorsAgentInstance = methodResolutionService.newAggregators(super.aggregators, agentInstanceContext.getAgentInstanceId());
        return new AggSvcGroupAllMixedAccessImpl(evaluators, aggregatorsAgentInstance, accessors, accesses);
    }
}