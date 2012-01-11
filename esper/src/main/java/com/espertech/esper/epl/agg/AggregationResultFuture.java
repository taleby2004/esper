/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.agg;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;

import java.util.Collection;
import java.util.Iterator;

/**
 * Interface for use by aggregate expression nodes representing aggregate functions such as 'sum' or 'avg' to use
 * to obtain the current value for the function at time of expression evaluation.
 */
public interface AggregationResultFuture
{
    /**
     * Returns current aggregation state, for use by expression node representing an aggregation function.
     *
     * @param column is assigned to the aggregation expression node and passed as an column (index) into a row
     * @param agentInstanceIds
     * @return current aggragation state
     */
    public Object getValue(int column, int agentInstanceId);

    public Collection<EventBean> getCollection(int column, ExprEvaluatorContext context);

    public EventBean getEventBean(int column, ExprEvaluatorContext context);
}
