/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.expression;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.service.ExpressionResultCacheService;
import com.espertech.esper.schedule.TimeProvider;

/**
 * Represents a minimal enginel-level context for expression evaluation, not allowing for agents instances and result cache.
 */
public class ExprEvaluatorContextTimeOnly implements ExprEvaluatorContext
{
    private final TimeProvider timeProvider;
    private final ExpressionResultCacheService expressionResultCacheService;

    public ExprEvaluatorContextTimeOnly(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
        this.expressionResultCacheService = new ExpressionResultCacheService();
    }

    public ExprEvaluatorContextTimeOnly(TimeProvider timeProvider, ExpressionResultCacheService expressionResultCacheService) {
        this.timeProvider = timeProvider;
        this.expressionResultCacheService = expressionResultCacheService;
    }

    /**
     * Returns the time provider.
     * @return time provider
     */
    public TimeProvider getTimeProvider() {
        return timeProvider;
    }

    public ExpressionResultCacheService getExpressionResultCacheService() {
        return expressionResultCacheService;
    }

    public int[] getAgentInstanceIds() {
        return null;
    }

    public EventBean getContextProperties() {
        return null;
    }
}