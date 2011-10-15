/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.context.subselect;

import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.epl.lookup.SubordTableLookupStrategy;

import java.util.Map;

/**
 * Entry holding lookup resource references for use by {@link com.espertech.esper.core.context.subselect.SubSelectActivationCollection}.
 */
public class SubSelectStrategyRealization
{
    private final SubordTableLookupStrategy strategy;
    private final SubselectAggregationPreprocessor subselectAggregationPreprocessor;
    private final AggregationService subselectAggregationService;
    private final Map<ExprPriorNode, ExprPriorEvalStrategy> priorNodeStrategies;
    private final Map<ExprPreviousNode, ExprPreviousEvalStrategy> previousNodeStrategies;

    public SubSelectStrategyRealization(SubordTableLookupStrategy strategy, SubselectAggregationPreprocessor subselectAggregationPreprocessor, AggregationService subselectAggregationService, Map<ExprPriorNode, ExprPriorEvalStrategy> priorNodeStrategies, Map<ExprPreviousNode, ExprPreviousEvalStrategy> previousNodeStrategies) {
        this.strategy = strategy;
        this.subselectAggregationPreprocessor = subselectAggregationPreprocessor;
        this.subselectAggregationService = subselectAggregationService;
        this.priorNodeStrategies = priorNodeStrategies;
        this.previousNodeStrategies = previousNodeStrategies;
    }

    public SubordTableLookupStrategy getStrategy() {
        return strategy;
    }

    public SubselectAggregationPreprocessor getSubselectAggregationPreprocessor() {
        return subselectAggregationPreprocessor;
    }

    public AggregationService getSubselectAggregationService() {
        return subselectAggregationService;
    }

    public Map<ExprPriorNode, ExprPriorEvalStrategy> getPriorNodeStrategies() {
        return priorNodeStrategies;
    }

    public Map<ExprPreviousNode, ExprPreviousEvalStrategy> getPreviousNodeStrategies() {
        return previousNodeStrategies;
    }
}
