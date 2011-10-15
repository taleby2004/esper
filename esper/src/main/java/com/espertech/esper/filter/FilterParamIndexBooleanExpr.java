/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.filter;

import com.espertech.esper.client.EventBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Index that simply maintains a list of boolean expressions.
 */
public final class FilterParamIndexBooleanExpr extends FilterParamIndexBase
{
    private final Map<ExprNodeAdapterBase, EventEvaluator> evaluatorsMap;
    private final ReadWriteLock constantsMapRWLock;

    /**
     * Constructs the index for multiple-exact matches.
     */
    public FilterParamIndexBooleanExpr()
    {
        super(FilterOperator.BOOLEAN_EXPRESSION);

        evaluatorsMap = new HashMap<ExprNodeAdapterBase, EventEvaluator>();
        constantsMapRWLock = new ReentrantReadWriteLock();
    }

    public final EventEvaluator get(Object filterConstant)
    {
        ExprNodeAdapterBase keyValues = (ExprNodeAdapterBase) filterConstant;
        return evaluatorsMap.get(keyValues);
    }

    public final void put(Object filterConstant, EventEvaluator evaluator)
    {
        ExprNodeAdapterBase keys = (ExprNodeAdapterBase) filterConstant;
        evaluatorsMap.put(keys, evaluator);
    }

    public final boolean remove(Object filterConstant)
    {
        ExprNodeAdapterBase keys = (ExprNodeAdapterBase) filterConstant;
        return evaluatorsMap.remove(keys) != null;
    }

    public final int size()
    {
        return evaluatorsMap.size();
    }

    public final ReadWriteLock getReadWriteLock()
    {
        return constantsMapRWLock;
    }

    public final void matchEvent(EventBean eventBean, Collection<FilterHandle> matches)
    {
        List<EventEvaluator> evaluators = new ArrayList<EventEvaluator>();
        constantsMapRWLock.readLock().lock();
        for (ExprNodeAdapterBase exprNodeAdapter : evaluatorsMap.keySet())
        {
            if (exprNodeAdapter.evaluate(eventBean))
            {
                evaluators.add(evaluatorsMap.get(exprNodeAdapter));
            }
        }
        constantsMapRWLock.readLock().unlock();

        for (EventEvaluator evaluator : evaluators)
        {
            evaluator.matchEvent(eventBean, matches);
        }
    }

    private static final Log log = LogFactory.getLog(FilterParamIndexBooleanExpr.class);
}
