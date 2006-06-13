package net.esper.eql.expression;

import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.collection.Pair;
import net.esper.collection.MultiKey;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Result set processor for the simplest case: no aggregation functions used in the select clause, and no group-by.
 * <p>
 * The processor generates one row for each event entering (new event) and one row for each event leaving (old event).
 */
public class ResultSetProcessorSimple implements ResultSetProcessor
{
    private SelectExprProcessor selectExprProcessor;
    private final boolean isOutputLimiting;
    private final boolean isOutputLimitLastOnly;

    /**
     * Ctor.
     * @param selectExprProcessor - for processing the select expression and generting the final output rows
     * @param isOutputLimiting - true to indicate we are output limiting and must keep producing
     * a row per group even if groups didn't change
     * @param isOutputLimitLastOnly - true if output limiting and interested in last event only
     */
    public ResultSetProcessorSimple(SelectExprProcessor selectExprProcessor,
                                    boolean isOutputLimiting,
                                    boolean isOutputLimitLastOnly)
    {
    	this.selectExprProcessor = selectExprProcessor;
        this.isOutputLimiting = isOutputLimiting;
        this.isOutputLimitLastOnly = isOutputLimitLastOnly;
    }

    public EventType getResultEventType()
    {
        return selectExprProcessor.getResultEventType();
    }

    public Pair<EventBean[], EventBean[]> processJoinResult(Set<MultiKey<EventBean>> newEvents, Set<MultiKey<EventBean>> oldEvents)
    {
        EventBean[] selectOldEvents = getSelectListEvents(selectExprProcessor, oldEvents, isOutputLimiting, isOutputLimitLastOnly);
        EventBean[] selectNewEvents = getSelectListEvents(selectExprProcessor, newEvents, isOutputLimiting, isOutputLimitLastOnly);

        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    public Pair<EventBean[], EventBean[]> processViewResult(EventBean[] newData, EventBean[] oldData)
    {
        EventBean[] selectOldEvents = getSelectListEvents(selectExprProcessor, oldData, isOutputLimiting, isOutputLimitLastOnly);
        EventBean[] selectNewEvents = getSelectListEvents(selectExprProcessor, newData, isOutputLimiting, isOutputLimitLastOnly);

        return new Pair<EventBean[], EventBean[]>(selectNewEvents, selectOldEvents);
    }

    /**
     * Applies the select-clause to the given events returning the selected events. The number of events stays the
     * same, i.e. this method does not filter it just transforms the result set.
     * @param exprProcessor - processes each input event and returns output event
     * @param events - input events
     * @return output events, one for each input event
     */
    protected static EventBean[] getSelectListEvents(SelectExprProcessor exprProcessor, EventBean[] events, boolean isOutputLimiting, boolean isOutputLimitLastOnly)
    {
        if (isOutputLimiting)
        {
            events = applyOutputLimit(events, isOutputLimitLastOnly);
        }

        if (events == null)
        {
            return null;
        }
        
        EventBean[] result = new EventBean[events.length];

        EventBean[] eventsPerStream = new EventBean[1];
        for (int i = 0; i < events.length; i++)
        {
            eventsPerStream[0] = events[i];
            result[i] = exprProcessor.process(eventsPerStream);
        }

        return result;
    }

    /**
     * Applies the last/all event output limit clause.
     * @param events to output
     * @param isOutputLimitLastOnly - flag to indicate output all versus output last
     * @return events to output
     */
    protected static EventBean[] applyOutputLimit(EventBean[] events, boolean isOutputLimitLastOnly)
    {
    	if(isOutputLimitLastOnly && events != null && events.length > 0)
    	{
    		return new EventBean[] {events[events.length - 1]};
    	}
    	else
    	{
    		return events;
    	}
    }
    
    /**
     * Applies the last/all event output limit clause.
     * @param eventSet to output
     * @param isOutputLimitLastOnly - flag to indicate output all versus output last
     * @return events to output
     */
    protected static Set<MultiKey<EventBean>> applyOutputLimit(Set<MultiKey<EventBean>> eventSet, boolean isOutputLimitLastOnly)
    {
    	if(isOutputLimitLastOnly && eventSet != null && eventSet.size() > 0)
    	{
    		Object[] events = eventSet.toArray();
    		Set<MultiKey<EventBean>> resultSet = new LinkedHashSet<MultiKey<EventBean>>();
    		resultSet.add((MultiKey<EventBean>)events[events.length - 1]);
    		return resultSet;
    	}
    	else
    	{
    		return eventSet;
    	}
    }

    /**
     * Applies the select-clause to the given events returning the selected events. The number of events stays the
     * same, i.e. this method does not filter it just transforms the result set.
     * @param exprProcessor - processes each input event and returns output event
     * @param events - input events
     * @return output events, one for each input event
     */
    protected static EventBean[] getSelectListEvents(SelectExprProcessor exprProcessor, Set<MultiKey<EventBean>> events, boolean isOutputLimiting, boolean isOutputLimitLastOnly)
    {
        if (isOutputLimiting)
        {
    	    events = applyOutputLimit(events, isOutputLimitLastOnly);
        }

        int length = events.size();
        if (length == 0)
        {
            return null;
        }        
        
        EventBean[] result = new EventBean[length];

        int count = 0;
        for (MultiKey<EventBean> key : events)
        {
            EventBean[] eventsPerStream = key.getArray();
            result[count++] = exprProcessor.process(eventsPerStream);
        }

        return result;
    }
}
