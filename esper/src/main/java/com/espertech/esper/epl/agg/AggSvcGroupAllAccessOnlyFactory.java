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

package com.espertech.esper.epl.agg;

import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.epl.core.MethodResolutionService;

/**
 * Aggregation service for use when only first/last/window aggregation functions are used an none other.
 */
public class AggSvcGroupAllAccessOnlyFactory implements AggregationServiceFactory
{
    private final MethodResolutionService methodResolutionService;
    private final AggregationAccessorSlotPair[] accessors;
    private final int[] streams;
    private final boolean isJoin;

    public AggSvcGroupAllAccessOnlyFactory(MethodResolutionService methodResolutionService, AggregationAccessorSlotPair[] accessors, int[] streams, boolean join) {
        this.methodResolutionService = methodResolutionService;
        this.accessors = accessors;
        this.streams = streams;
        isJoin = join;
    }

    public AggregationService makeService(AgentInstanceContext agentInstanceContext) {
        AggregationAccess[] accesses = AggregationAccessUtil.getNewAccesses(agentInstanceContext.getAgentInstanceIds(), isJoin, streams, methodResolutionService, null);
        return new AggSvcGroupAllAccessOnlyImpl(accessors, accesses);
    }
}