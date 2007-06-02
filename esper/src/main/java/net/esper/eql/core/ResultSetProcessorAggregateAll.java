/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package net.esper.eql.core;

import net.esper.collection.MultiKey;
import net.esper.collection.Pair;
import net.esper.eql.agg.AggregationService;
import net.esper.eql.expression.ExprNode;
import net.esper.event.EventBean;
import net.esper.event.EventType;
import net.esper.view.Viewable;

import java.util.Iterator;
import java.util.Set;
import java.util.NoSuchElementException;

/**
 * Result set processor for the case: aggregation functions used in the select clause, and no group-by,
 * and not all of the properties in the select clause are under an aggregation function.
 * <p>
 * This processor does not perform grouping, every event entering and leaving is in the same group.
 * The processor generates one row for each event entering (new event) and one row for each event leaving (old event).
 * Aggregation state is simply one row holding all the state.
 */
public class ResultSetProcessorAggregateAll implements ResultSetProcessor
{
    private final SelectExprProcessor selectExprProcessor;
    private final OrderByProcessor orderByProcessor;
    private final AggregationService aggregationService;
    private final ExprNode optionalHavingNode;
    private final boolean isOutputLimiting;
    private final boolean isOutputLimitLastOnly;

    /**
     * Ctor.
     * @param selectExprProcessor - for processing the select expression and generting the final output rows
     * @param orderByProcessor - for sorting the outgoing events according to the order-by clause
     * @param aggregationService - handles aggregation
     * @param optionalHavingNode - having clause expression node
     * @param isOutputLimiting - true to indicate that we limit output
     * @param isOutputLimitLastOnly - true to indicate that we limit output to the last event
     */
    public ResultSetProcessorAggregateAll(SelectExprProcessor selectExprProcessor,
                                          OrderByProcessor orderByProcessor,
                                          AggregationService aggregationService,
                                          ExprNode optionalHavingNode,
                                          boolean isOutputLimiting,
                                          boolean isOutputLimitLastOnly)
    {
        this.selectExprProcessor = selectExprProcessor;
        this.orderByProcessor = orderByProcessor;
        this.aggregationService = aggregationService;
        this.optionalHavingNode = optionalHavingNode;
        this.isOutputLimiting = isOutputLimiting;
        this.isOutputLimitLastOnly = isOutputLimitLastOnly;
    }

    public EventType getResultEventType()
    {
        return selectExprProcessor.getResultEventType();
    }

    public Pair<EventBean[], EventBean[]> processJoinResult(Set<MultiKey<EventBean>> newEvents, Set<MultiKey<EventBean>> oldEvents)
    {
        EventBean[] selectOldEvents = null;
        EventBean[] selectNewEvents = null;

        if (optionalHavingNode == null)
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectEventsNoHaving(selectExprProcessor, orderByProcessor, oldEvents, isOutputLimiting, isOutputLimitLastOnly, false);
        }
        else
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectEventsHaving(selectExprProcessor, orderByProcessor, oldEvents, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly, false);
        }

        if (!newEvents.isEmpty())
        {
            // apply new data to aggregates
            for (MultiKey<EventBean> events : newEvents)
            {
                aggregationService.applyEnter(events.getArray(), null);
            }
        }

        if (!oldEvents.isEmpty())
        {
            // apply old data to aggregates
            for (MultiKey<EventBean> events : oldEvents)
            {
                aggregationService.applyLeave(events.getArray(), null);
            }
        }

        if (optionalHavingNode == null)
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectEventsNoHaving(selectExprProcessor, orderByProcessor, newEvents, isOutputLimiting, isOutputLimitLastOnly, true);
        }
        else
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectEventsHaving(selectExprProcessor, orderByProcessor, newEvents, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly, true);
        }

        if ((selectNewEvents == null) && (selectOldEvents == null))
        {
            return null;
        }
        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    public Pair<EventBean[], EventBean[]> processViewResult(EventBean[] newData, EventBean[] oldData)
    {
        EventBean[] selectOldEvents = null;
        EventBean[] selectNewEvents = null;

        // generate old events using select expressions
        if (optionalHavingNode == null)
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectEventsNoHaving(selectExprProcessor, orderByProcessor, oldData, isOutputLimiting, isOutputLimitLastOnly, false);
        }
        // generate old events using having then select
        else
        {
            selectOldEvents = ResultSetProcessorSimple.getSelectEventsHaving(selectExprProcessor, orderByProcessor, oldData, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly, false);
        }

        EventBean[] eventsPerStream = new EventBean[1];
        if (newData != null)
        {
            // apply new data to aggregates
            for (int i = 0; i < newData.length; i++)
            {
                eventsPerStream[0] = newData[i];
                aggregationService.applyEnter(eventsPerStream, null);
            }
        }
        if (oldData != null)
        {
            // apply old data to aggregates
            for (int i = 0; i < oldData.length; i++)
            {
                eventsPerStream[0] = oldData[i];
                aggregationService.applyLeave(eventsPerStream, null);
            }
        }

        // generate new events using select expressions
        if (optionalHavingNode == null)
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectEventsNoHaving(selectExprProcessor, orderByProcessor, newData, isOutputLimiting, isOutputLimitLastOnly, true);
        }
        else
        {
            selectNewEvents = ResultSetProcessorSimple.getSelectEventsHaving(selectExprProcessor, orderByProcessor, newData, optionalHavingNode, isOutputLimiting, isOutputLimitLastOnly, true);
        }

        if ((selectNewEvents == null) && (selectOldEvents == null))
        {
            return null;
        }

        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    public Iterator<EventBean> getIterator(Viewable parent)
    {
        return new ResultSetAggregateAllIterator(parent.iterator(), this);
    }

    /**
     * Method to transform an event based on the select expression.
     */
    public static class ResultSetAggregateAllIterator implements Iterator<EventBean>
    {
        private final Iterator<EventBean> sourceIterator;
        private final ResultSetProcessorAggregateAll resultSetProcessor;
        private EventBean nextResult;
        private final EventBean[] eventsPerStream;

        public ResultSetAggregateAllIterator(Iterator<EventBean> sourceIterator, ResultSetProcessorAggregateAll resultSetProcessor)
        {
            this.sourceIterator = sourceIterator;
            this.resultSetProcessor = resultSetProcessor;
            eventsPerStream = new EventBean[1];
        }

        public boolean hasNext()
        {
            if (nextResult != null)
            {
                return true;
            }
            findNext();
            if (nextResult != null)
            {
                return true;
            }
            return false;
        }

        public EventBean next()
        {
            if (nextResult != null)
            {
                EventBean result = nextResult;
                nextResult = null;
                return result;
            }
            findNext();
            if (nextResult != null)
            {
                EventBean result = nextResult;
                nextResult = null;
                return result;
            }
            throw new NoSuchElementException();
        }

        private void findNext()
        {
            while(sourceIterator.hasNext())
            {
                EventBean candidate = sourceIterator.next();
                eventsPerStream[0] = candidate;

                Boolean pass = true;
                if (resultSetProcessor.optionalHavingNode != null)
                {
                    pass = (Boolean) resultSetProcessor.optionalHavingNode.evaluate(eventsPerStream, true);
                }
                if (!pass)
                {
                    continue;
                }

                if(resultSetProcessor.selectExprProcessor == null)
                {
                    nextResult = candidate;
                }
                else
                {
                    nextResult = resultSetProcessor.selectExprProcessor.process(eventsPerStream, true);
                }

                break;
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
