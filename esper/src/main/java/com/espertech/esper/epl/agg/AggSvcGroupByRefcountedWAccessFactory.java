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
import com.espertech.esper.epl.expression.ExprEvaluator;

/**
 * Implementation for handling aggregation with grouping by group-keys.
 */
public class AggSvcGroupByRefcountedWAccessFactory extends AggregationServiceFactoryBase
{
    private final AggregationAccessorSlotPair[] accessors;
    private final int[] streams;
    private final boolean isJoin;

    /**
     * Ctor.
     * @param evaluators - evaluate the sub-expression within the aggregate function (ie. sum(4*myNum))
     * @param prototypes - collect the aggregation state that evaluators evaluate to, act as prototypes for new aggregations
     * aggregation states for each group
     * @param accessors accessor definitions
     * @param streams streams in join
     * @param isJoin true for join, false for single-stream
     */
    public AggSvcGroupByRefcountedWAccessFactory(ExprEvaluator evaluators[],
                                                 AggregationMethodFactory prototypes[],
                                                 AggregationAccessorSlotPair[] accessors,
                                                 int[] streams,
                                                 boolean isJoin)
    {
        super(evaluators, prototypes);
        this.accessors = accessors;
        this.streams = streams;
        this.isJoin = isJoin;
    }

    public AggregationService makeService(AgentInstanceContext agentInstanceContext) {
        return new AggSvcGroupByRefcountedWAccessImpl(evaluators, aggregators, agentInstanceContext.getMethodResolutionService(), accessors, streams, isJoin);
    }
}
