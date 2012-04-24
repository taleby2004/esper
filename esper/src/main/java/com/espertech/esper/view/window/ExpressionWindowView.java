/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.view.window;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.OneEventCollection;
import com.espertech.esper.collection.ViewUpdatedCollection;
import com.espertech.esper.core.context.util.AgentInstanceViewFactoryChainContext;
import com.espertech.esper.epl.agg.AggregationServiceAggExpressionDesc;
import com.espertech.esper.epl.agg.AggregationServiceFactoryDesc;
import com.espertech.esper.epl.expression.ExprEvaluator;
import com.espertech.esper.event.map.MapEventBean;
import com.espertech.esper.view.View;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/**
 * This view is a moving window extending the into the past until the expression passed to it returns false.
 */
public final class ExpressionWindowView extends ExpressionViewBase {

    private final ExpressionWindowViewFactory dataWindowViewFactory;
    private final ArrayDeque<TimestampEventPair> window = new ArrayDeque<TimestampEventPair>();
    private final EventBean[] removedEvents = new EventBean[1];

    /**
     * Constructor creates a moving window extending the specified number of elements into the past.
     * @param dataWindowViewFactory for copying this view in a group-by
     * @param viewUpdatedCollection is a collection that the view must update when receiving events
     * @param variableNames variable names
     */
    public ExpressionWindowView(ExpressionWindowViewFactory dataWindowViewFactory,
                                ViewUpdatedCollection viewUpdatedCollection,
                                ExprEvaluator expiryExpression,
                                AggregationServiceFactoryDesc aggregationServiceFactoryDesc,
                                MapEventBean builtinEventProps,
                                Set<String> variableNames,
                                AgentInstanceViewFactoryChainContext agentInstanceContext)
    {
        super(viewUpdatedCollection, expiryExpression, aggregationServiceFactoryDesc, builtinEventProps, variableNames, agentInstanceContext);
        this.dataWindowViewFactory = dataWindowViewFactory;
    }

    public View cloneView()
    {
        return dataWindowViewFactory.makeView(agentInstanceContext);
    }

    /**
     * Returns true if the window is empty, or false if not empty.
     * @return true if empty
     */
    public boolean isEmpty()
    {
        return window.isEmpty();
    }

    public void scheduleCallback() {
        expire(null, null);
    }

    public final void update(EventBean[] newData, EventBean[] oldData)
    {
        // add data points to the window
        if (newData != null)
        {
            for (EventBean newEvent : newData) {
                window.add(new TimestampEventPair(agentInstanceContext.getTimeProvider().getTime(), newEvent));
            }

            if (aggregationService != null) {
                aggregationService.applyEnter(newData, null, agentInstanceContext);
            }
        }

        if (oldData != null) {
            Iterator<TimestampEventPair> it = window.iterator();
            for (;it.hasNext();) {
                TimestampEventPair pair = it.next();
                for (EventBean anOldData : oldData) {
                    if (pair.getTheEvent() == anOldData) {
                        it.remove();
                        break;
                    }
                }
            }
            if (aggregationService != null) {
                aggregationService.applyLeave(oldData, null, agentInstanceContext);
            }
        }

        // expire events
        expire(newData, oldData);
    }

    // Called based on schedule evaluation registered when a variable changes (new data is null).
    // Called when new data arrives.
    private void expire(EventBean[] newData, EventBean[] oldData) {

        OneEventCollection expired = null;
        if (oldData != null) {
            expired = new OneEventCollection();
            expired.add(oldData);
        }
        int expiredCount = 0;
        if (!window.isEmpty()) {
            TimestampEventPair newest = window.getLast();

            while (true) {
                TimestampEventPair first = window.getFirst();

                boolean pass = checkEvent(first, newest, expiredCount);
                if (!pass) {
                    if (expired == null) {
                         expired = new OneEventCollection();
                    }
                    EventBean removed = window.removeFirst().getTheEvent();
                    expired.add(removed);
                    if (aggregationService != null) {
                        removedEvents[0] = removed;
                        aggregationService.applyLeave(removedEvents, null, agentInstanceContext);
                    }
                    expiredCount++;
                }
                else {
                    break;
                }

                if (window.isEmpty()) {
                    if (aggregationService != null) {
                        aggregationService.clearResults(agentInstanceContext);
                    }
                    break;
                }
            }
        }

        // Check for any events that get pushed out of the window
        EventBean[] expiredArr = null;
        if (expired != null)
        {
            expiredArr = expired.toArray();
        }

        // update event buffer for access by expressions, if any
        if (viewUpdatedCollection != null)
        {
            viewUpdatedCollection.update(newData, expiredArr);
        }

        // If there are child views, call update method
        if (this.hasViews())
        {
            updateChildren(newData, expiredArr);
        }
    }

    private boolean checkEvent(TimestampEventPair pair, TimestampEventPair newest, int numExpired) {

        builtinEventProps.getProperties().put(ExpressionViewUtil.CURRENT_COUNT, window.size());
        builtinEventProps.getProperties().put(ExpressionViewUtil.OLDEST_TIMESTAMP, pair.getTimestamp());
        builtinEventProps.getProperties().put(ExpressionViewUtil.NEWEST_TIMESTAMP, newest.getTimestamp());
        builtinEventProps.getProperties().put(ExpressionViewUtil.VIEW_REFERENCE, this);
        builtinEventProps.getProperties().put(ExpressionViewUtil.EXPIRED_COUNT, numExpired);
        eventsPerStream[0] = pair.getTheEvent();

        for (AggregationServiceAggExpressionDesc aggregateNode : aggregateNodes) {
            aggregateNode.assignFuture(aggregationService);
        }

        Boolean result = (Boolean) expiryExpression.evaluate(eventsPerStream, true, agentInstanceContext);
        if (result == null) {
            return false;
        }
        return result;
    }

    public final Iterator<EventBean> iterator()
    {
        return new TimestampEventPairIterator(window.iterator());
    }

    // Handle variable updates by scheduling a re-evaluation with timers
    public void update(Object newValue, Object oldValue) {
        if (!agentInstanceContext.getStatementContext().getSchedulingService().isScheduled(scheduleHandle)) {
            agentInstanceContext.getStatementContext().getSchedulingService().add(0, scheduleHandle, scheduleSlot);
        }
    }

    private static class TimestampEventPair {
        private final long timestamp;
        private final EventBean theEvent;

        private TimestampEventPair(long timestamp, EventBean theEvent) {
            this.timestamp = timestamp;
            this.theEvent = theEvent;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public EventBean getTheEvent() {
            return theEvent;
        }
    }

    private static class TimestampEventPairIterator implements Iterator<EventBean> {
        private final Iterator<TimestampEventPair> events;

        private TimestampEventPairIterator(Iterator<TimestampEventPair> events) {
            this.events = events;
        }

        public boolean hasNext() {
            return events.hasNext();
        }

        public EventBean next() {
            return events.next().getTheEvent();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
