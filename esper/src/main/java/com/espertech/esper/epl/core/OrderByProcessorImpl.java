/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.core;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.MultiKeyUntyped;
import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.expression.ExprEvaluator;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * An order-by processor that sorts events according to the expressions
 * in the order_by clause.
 */
public class OrderByProcessorImpl implements OrderByProcessor {

	private static final Log log = LogFactory.getLog(OrderByProcessorImpl.class);

	private final OrderByProcessorFactoryImpl factory;
	private final AggregationService aggregationService;

    public OrderByProcessorImpl(OrderByProcessorFactoryImpl factory, AggregationService aggregationService) {
        this.factory = factory;
        this.aggregationService = aggregationService;
    }

    public MultiKeyUntyped getSortKey(EventBean[] eventsPerStream, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
    {
        Object[] values = new Object[factory.getOrderBy().length];
        int count = 0;
        for (OrderByElement sortPair : factory.getOrderBy())
        {
            values[count++] = sortPair.getExpr().evaluate(eventsPerStream, isNewData, exprEvaluatorContext);
        }

        return new MultiKeyUntyped(values);
    }

    public MultiKeyUntyped[] getSortKeyPerRow(EventBean[] generatingEvents, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
    {
        if (generatingEvents == null)
        {
            return null;
        }

        MultiKeyUntyped[] sortProperties = new MultiKeyUntyped[generatingEvents.length];

        int count = 0;
        EventBean[] evalEventsPerStream = new EventBean[1];
        for (EventBean event : generatingEvents)
        {
            Object[] values = new Object[factory.getOrderBy().length];
            int countTwo = 0;
            evalEventsPerStream[0] = event;
            for (OrderByElement sortPair : factory.getOrderBy())
            {
                values[countTwo++] = sortPair.getExpr().evaluate(evalEventsPerStream, isNewData, exprEvaluatorContext);
            }

            sortProperties[count] = new MultiKeyUntyped(values);
            count++;
        }

        return sortProperties;
    }

	public EventBean[] sort(EventBean[] outgoingEvents, EventBean[][] generatingEvents, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
	{
		if (outgoingEvents == null || outgoingEvents.length < 2)
		{
			return outgoingEvents;
		}

		// Get the group by keys if needed
		MultiKeyUntyped[] groupByKeys = null;
		if (factory.isNeedsGroupByKeys())
		{
			groupByKeys = generateGroupKeys(generatingEvents, isNewData, exprEvaluatorContext);
		}

		return sort(outgoingEvents, generatingEvents, groupByKeys, isNewData, exprEvaluatorContext);
	}

	public EventBean[] sort(EventBean[] outgoingEvents, EventBean[][] generatingEvents, MultiKeyUntyped[] groupByKeys, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
	{
        if (outgoingEvents == null || outgoingEvents.length < 2)
		{
			return outgoingEvents;
		}

		// Create the multikeys of sort values
		List<MultiKeyUntyped> sortValuesMultiKeys = createSortProperties(generatingEvents, groupByKeys, isNewData, exprEvaluatorContext);

		// Map the sort values to the corresponding outgoing events
		Map<MultiKeyUntyped, List<EventBean>> sortToOutgoing = new HashMap<MultiKeyUntyped, List<EventBean>>();
		int countOne = 0;
		for (MultiKeyUntyped sortValues : sortValuesMultiKeys)
		{
			List<EventBean> list = sortToOutgoing.get(sortValues);
			if (list == null)
			{
				list = new ArrayList<EventBean>();
			}
			list.add(outgoingEvents[countOne++]);
			sortToOutgoing.put(sortValues, list);
		}

		// Sort the sort values
		Collections.sort(sortValuesMultiKeys, factory.getComparator());

		// Sort the outgoing events in the same order
		Set<MultiKeyUntyped> sortSet = new LinkedHashSet<MultiKeyUntyped>(sortValuesMultiKeys);
		EventBean[] result = new EventBean[outgoingEvents.length];
		int countTwo = 0;
		for (MultiKeyUntyped sortValues : sortSet)
		{
			Collection<EventBean> output = sortToOutgoing.get(sortValues);
			for(EventBean event : output)
			{
				result[countTwo++] = event;
			}
		}

		return result;
	}

	private List<MultiKeyUntyped> createSortProperties(EventBean[][] generatingEvents, MultiKeyUntyped[] groupByKeys, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
	{
		MultiKeyUntyped[] sortProperties = new MultiKeyUntyped[generatingEvents.length];

		int count = 0;
		for (EventBean[] eventsPerStream : generatingEvents)
		{
			// Make a new multikey that contains the sort-by values.
			if (factory.isNeedsGroupByKeys())
			{
				aggregationService.setCurrentAccess(groupByKeys[count], exprEvaluatorContext.getAgentInstanceId());
			}

			Object[] values = new Object[factory.getOrderBy().length];
			int countTwo = 0;
			for (OrderByElement sortPair : factory.getOrderBy())
			{
				values[countTwo++] = sortPair.getExpr().evaluate(eventsPerStream, isNewData, exprEvaluatorContext);
			}

			sortProperties[count] = new MultiKeyUntyped(values);
			count++;
		}
		return Arrays.asList(sortProperties);
	}

	private MultiKeyUntyped generateGroupKey(EventBean[] eventsPerStream, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
	{
		Object[] keys = new Object[factory.getGroupByNodes().length];

		int count = 0;
		for (ExprEvaluator exprNode : factory.getGroupByNodes())
		{
			keys[count] = exprNode.evaluate(eventsPerStream, isNewData, exprEvaluatorContext);
			count++;
		}

		return new MultiKeyUntyped(keys);
	}

    public EventBean[] sort(EventBean[] outgoingEvents, MultiKeyUntyped[] orderKeys, ExprEvaluatorContext exprEvaluatorContext)
    {
        TreeMap<MultiKeyUntyped, Object> sort = new TreeMap<MultiKeyUntyped, Object>(factory.getComparator());

        if (outgoingEvents == null || outgoingEvents.length < 2)
        {
            return outgoingEvents;
        }

        for (int i = 0; i < outgoingEvents.length; i++)
        {
            Object entry = sort.get(orderKeys[i]);
            if (entry == null)
            {
                sort.put(orderKeys[i], outgoingEvents[i]);
            }
            else if (entry instanceof EventBean)
            {
                List<EventBean> list = new ArrayList<EventBean>();
                list.add((EventBean)entry);
                list.add(outgoingEvents[i]);
                sort.put(orderKeys[i], list);
            }
            else
            {
                List<EventBean> list = (List<EventBean>) entry;
                list.add(outgoingEvents[i]);
            }
        }

        EventBean[] result = new EventBean[outgoingEvents.length];
        int count = 0;
        for (Object entry : sort.values())
        {
            if (entry instanceof List)
            {
                List<EventBean> output = (List<EventBean>) entry;
                for(EventBean event : output)
                {
                    result[count++] = event;
                }
            }
            else
            {
                result[count++] = (EventBean) entry;
            }
        }
        return result;
    }

    private MultiKeyUntyped[] generateGroupKeys(EventBean[][] generatingEvents, boolean isNewData, ExprEvaluatorContext exprEvaluatorContext)
	{
		MultiKeyUntyped keys[] = new MultiKeyUntyped[generatingEvents.length];

		int count = 0;
		for (EventBean[] eventsPerStream : generatingEvents)
		{
			keys[count++] = generateGroupKey(eventsPerStream, isNewData, exprEvaluatorContext);
		}

		return keys;
	}

	private static boolean[] getIsDescendingValues(OrderByElement[] orderBy)
	{
		boolean[] isDescendingValues  = new boolean[orderBy.length];
		int count = 0;
		for(OrderByElement pair : orderBy)
		{
			isDescendingValues[count++] = pair.isDescending();
		}
		return isDescendingValues;
	}

}
