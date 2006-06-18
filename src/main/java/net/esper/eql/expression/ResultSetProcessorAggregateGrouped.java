package net.esper.eql.expression;

import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.collection.Pair;
import net.esper.collection.MultiKey;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Result-set processor for the aggregate-grouped case:
 * there is a group-by and one or more non-aggregation event properties in the select clause are not listed in the group by,
 * and there are aggregation functions.
 * <p>
 * This processor does perform grouping by computing MultiKey group-by keys for each row.
 * The processor generates one row for each event entering (new event) and one row for each event leaving (old event).
 * <p>
 * Aggregation state is a table of rows held by ${AggregationService} where the row key is the group-by MultiKey.
 */
public class ResultSetProcessorAggregateGrouped implements ResultSetProcessor
{
    private static final Log log = LogFactory.getLog(ResultSetProcessorAggregateGrouped.class);

    private final SelectExprProcessor selectExprProcessor;
    private final AggregationService aggregationService;
    private final List<ExprNode> groupKeyNodes;
    private final ExprNode optionalHavingNode;
    private final boolean isOutputLimiting;
    private final boolean isOutputLimitLastOnly;
    private final Map<MultiKey, EventBean> oldEventGroupReps = new LinkedHashMap<MultiKey, EventBean>();
    private final Map<MultiKey, EventBean> newEventGroupReps = new LinkedHashMap<MultiKey, EventBean>();

    /**
     * Ctor.
     * @param selectExprProcessor - for processing the select expression and generting the final output rows
     * @param aggregationService - handles aggregation
     * @param groupKeyNodes - list of group-by expression nodes needed for building the group-by keys
     * @param optionalHavingNode - expression node representing validated HAVING clause, or null if none given.
     * Aggregation functions in the having node must have been pointed to the AggregationService for evaluation.
     * @param isOutputLimiting - set if output limiting required
     * @param isOutputLimitLastOnly - set if output limiting to last row
     */
    public ResultSetProcessorAggregateGrouped(SelectExprProcessor selectExprProcessor,
                                      AggregationService aggregationService,
                                      List<ExprNode> groupKeyNodes,
                                      ExprNode optionalHavingNode, 
                                      boolean isOutputLimiting,
                                      boolean isOutputLimitLastOnly)
    {
        this.selectExprProcessor = selectExprProcessor;
        this.aggregationService = aggregationService;
        this.groupKeyNodes = groupKeyNodes;
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
        // Generate group-by keys for all events
        MultiKey[] newDataGroupByKeys = generateGroupKeys(newEvents);
        MultiKey[] oldDataGroupByKeys = generateGroupKeys(oldEvents);

        // generate old events
        log.debug(".processJoinResults creating old output events");
        EventBean[] selectOldEvents = generateOutputEventsJoin(oldEvents, oldDataGroupByKeys, optionalHavingNode, oldEventGroupReps);

        // update aggregates
        if (!oldEvents.isEmpty())
        {
            // apply old data to aggregates
            int count = 0;
            for (MultiKey<EventBean> eventsPerStream : oldEvents)
            {
                aggregationService.applyLeave(eventsPerStream.getArray(), oldDataGroupByKeys[count]);
                count++;
            }
        }
        if (!newEvents.isEmpty())
        {
            // apply old data to aggregates
            int count = 0;
            for (MultiKey<EventBean> eventsPerStream : newEvents)
            {
                aggregationService.applyEnter(eventsPerStream.getArray(), newDataGroupByKeys[count]);
                count++;
            }
        }

        // generate new events using select expressions
        log.debug(".processJoinResults creating new output events");
        EventBean[] selectNewEvents = generateOutputEventsJoin(newEvents, newDataGroupByKeys, optionalHavingNode, newEventGroupReps);

        if ((selectNewEvents != null) || (selectOldEvents != null))
        {
            return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
        }
        return null;
    }

    public Pair<EventBean[], EventBean[]> processViewResult(EventBean[] newData, EventBean[] oldData)
    {
        // Generate group-by keys for all events
        MultiKey[] newDataGroupByKeys = generateGroupKeys(newData);
        MultiKey[] oldDataGroupByKeys = generateGroupKeys(oldData);

        // generate old events
        log.debug(".processJoinResults creating old output events");
        EventBean[] selectOldEvents = generateOutputEventsView(oldData, oldDataGroupByKeys, optionalHavingNode, oldEventGroupReps);

        // update aggregates
        EventBean[] eventsPerStream = new EventBean[1];
        if (oldData != null)
        {
            // apply old data to aggregates
            for (int i = 0; i < oldData.length; i++)
            {
                eventsPerStream[0] = oldData[i];
                aggregationService.applyLeave(eventsPerStream, oldDataGroupByKeys[i]);
            }
        }
        if (newData != null)
        {
            // apply new data to aggregates
            for (int i = 0; i < newData.length; i++)
            {
                eventsPerStream[0] = newData[i];
                aggregationService.applyEnter(eventsPerStream, newDataGroupByKeys[i]);
            }
        }

        // generate new events using select expressions
        log.debug(".processJoinResults creating new output events");
        EventBean[] selectNewEvents = generateOutputEventsView(newData, newDataGroupByKeys, optionalHavingNode, newEventGroupReps);

        if ((selectNewEvents != null) || (selectOldEvents != null))
        {
            return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
        }
        return null;
    }

	private EventBean[] applyOutputLimit(MultiKey[] keys, EventBean[] events, Map<MultiKey, EventBean> groupReps)
	{
		if(!isOutputLimitLastOnly)
		{
			log.debug(".applyOutputLimit running map size="+groupReps.size());
		
			// Update the running map.
			int count = 0;
			for(MultiKey key : keys)
			{
				groupReps.remove(key);
				groupReps.put(key, events[count++]);
			}
			
			// Make the running map into a list.
			List<EventBean> runningList = new LinkedList<EventBean>(groupReps.values());
			
			// Make the incoming array into a list.
			List<EventBean> eventList = Arrays.asList(events);
			
			// Remove from the running map list all the elements 
			// that are contained in the incoming array list.
			// The running array list should now contain
			// only groups that weren't updated this time.
			runningList.removeAll(eventList);
			
			// Combine the two lists.
			runningList.addAll(eventList);
			
			// Convert to array and return.
			return runningList.toArray(new EventBean[0]);
		}
		else
		{
			return events;
		}
	}

	private EventBean[] generateOutputEventsView(EventBean[] outputEvents, MultiKey[] groupByKeys, ExprNode optionalHavingExpr, Map<MultiKey, EventBean> groupReps)
    {
        if (outputEvents == null)
        {
            return null;
        }

        EventBean[] eventsPerStream = new EventBean[1];
        EventBean[] events = new EventBean[outputEvents.length];
        MultiKey[] keys = new MultiKey[outputEvents.length];
        
        int count = 0;
        for (int i = 0; i < outputEvents.length; i++)
        {
            aggregationService.setCurrentRow(groupByKeys[count]);
            eventsPerStream[0] = outputEvents[count];

            // Filter the having clause
            if (optionalHavingExpr != null)
            {
                Boolean result = (Boolean) optionalHavingExpr.evaluate(eventsPerStream);
                if (!result)
                {
                    continue;
                }
            }

            events[count] = selectExprProcessor.process(eventsPerStream);
            keys[count] = groupByKeys[count];
            count++;
        }

        // Resize if some rows were filtered out
        if (count != events.length)
        {
            if (count == 0)
            {
                return null;
            }
            EventBean[] out = new EventBean[count];
            System.arraycopy(events, 0, out, 0, count);
            
            MultiKey[] outKeys = new MultiKey[count];
            System.arraycopy(keys, 0, outKeys, 0, count);

            keys = outKeys;
            events = out;
        }

        if (!isOutputLimiting)
        {
            return events;
        }
        return applyOutputLimit(keys, events, groupReps);
    }

    private MultiKey[] generateGroupKeys(Set<MultiKey<EventBean>> resultSet)
    {
        if (resultSet.isEmpty())
        {
            return null;
        }

        MultiKey keys[] = new MultiKey[resultSet.size()];

        int count = 0;
        for (MultiKey<EventBean> eventsPerStream : resultSet)
        {
            keys[count] = generateGroupKey(eventsPerStream.getArray());
            count++;
        }

        return keys;
    }

    private MultiKey[] generateGroupKeys(EventBean[] events)
    {
        if (events == null)
        {
            return null;
        }

        EventBean[] eventsPerStream = new EventBean[1];
        MultiKey keys[] = new MultiKey[events.length];

        for (int i = 0; i < events.length; i++)
        {
            eventsPerStream[0] = events[i];
            keys[i] = generateGroupKey(eventsPerStream);
        }

        return keys;
    }

    private MultiKey generateGroupKey(EventBean[] eventsPerStream)
    {
        Object[] keys = new Object[groupKeyNodes.size()];

        int count = 0;
        for (ExprNode exprNode : groupKeyNodes)
        {
            keys[count] = exprNode.evaluate(eventsPerStream);
            count++;
        }

        return new MultiKey(keys);
    }

    private EventBean[] generateOutputEventsJoin(Set<MultiKey<EventBean>> resultSet, MultiKey[] groupByKeys, ExprNode optionalHavingExpr, Map<MultiKey, EventBean> groupReps)
    {
        if (resultSet.isEmpty())
        {
            return null;
        }

        EventBean[] events = new EventBean[resultSet.size()];
        MultiKey[] keys = new MultiKey[resultSet.size()];
        
        int count = 0;
        for (MultiKey<EventBean> row : resultSet)
        {
            EventBean[] eventsPerStream = row.getArray();

            aggregationService.setCurrentRow(groupByKeys[count]);

            // Filter the having clause
            if (optionalHavingExpr != null)
            {
                Boolean result = (Boolean) optionalHavingExpr.evaluate(eventsPerStream);
                if (!result)
                {
                    continue;
                }
            }

            events[count] = selectExprProcessor.process(eventsPerStream);
            keys[count] = groupByKeys[count];
            count++;
        }

        // Resize if some rows were filtered out
        if (count != events.length)
        {
            if (count == 0)
            {
                return null;
            }
            EventBean[] out = new EventBean[count];
            System.arraycopy(events, 0, out, 0, count);
            
            MultiKey[] outKeys = new MultiKey[count];
            System.arraycopy(keys, 0, outKeys, 0, count);
            
            keys = outKeys;
            events = out;
        }

        if (!isOutputLimiting)
        {
            return events;
        }
        return applyOutputLimit(keys, events, groupReps);
    }
}
