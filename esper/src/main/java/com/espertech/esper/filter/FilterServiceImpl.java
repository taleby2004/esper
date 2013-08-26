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
import com.espertech.esper.client.EventType;
import com.espertech.esper.metrics.jmx.JmxGetter;
import com.espertech.esper.metrics.jmx.JmxOperation;
import com.espertech.esper.util.AuditPath;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/**
 * Implementation of the filter service interface.
 * Does not allow the same filter callback to be added more then once.
 */
public final class FilterServiceImpl implements FilterServiceSPI
{
    private static final Log log = LogFactory.getLog(FilterServiceImpl.class);
    private final EventTypeIndexBuilder indexBuilder;
    private final EventTypeIndex eventTypeIndex;
    private final AtomicLong numEventsEvaluated = new AtomicLong();
    private volatile long filtersVersion = 1;
    private final CopyOnWriteArraySet<FilterServiceListener> filterServiceListeners;

    /**
     * Constructor.
     */
    protected FilterServiceImpl()
    {
        eventTypeIndex = new EventTypeIndex();
        indexBuilder = new EventTypeIndexBuilder(eventTypeIndex);
        filterServiceListeners = new CopyOnWriteArraySet<FilterServiceListener>();
    }

    public long getFiltersVersion() {
        return filtersVersion;
    }

    public void destroy()
    {
        log.debug("Destroying filter service");
        eventTypeIndex.destroy();
        indexBuilder.destroy();
    }

    public final void add(FilterValueSet filterValueSet, FilterHandle filterCallback)
    {
        indexBuilder.add(filterValueSet, filterCallback);
        filtersVersion++;
    }

    public final void remove(FilterHandle filterCallback)
    {
        indexBuilder.remove(filterCallback);
        filtersVersion++;
    }

    public final long evaluate(EventBean theEvent, Collection<FilterHandle> matches)
    {
        long version = filtersVersion;
        numEventsEvaluated.incrementAndGet();

        // Finds all matching filters and return their callbacks.
        retryableMatchEvent(theEvent, matches);

        if ((AuditPath.isAuditEnabled) && (!filterServiceListeners.isEmpty())) {
            for (FilterServiceListener listener : filterServiceListeners) {
                listener.filtering(theEvent, matches, null);
            }
        }

        return version;
    }

    public final long evaluate(EventBean theEvent, Collection<FilterHandle> matches, String statementId)
    {
        long version = filtersVersion;
        numEventsEvaluated.incrementAndGet();

        ArrayDeque<FilterHandle> allMatches = new ArrayDeque<FilterHandle>();

        // Finds all matching filters
        retryableMatchEvent(theEvent, allMatches);

        // Add statement matches to collection passed
        for (FilterHandle match : allMatches) {
            if (match.getStatementId().equals(statementId)) {
                matches.add(match);
            }
        }

        if ((AuditPath.isAuditEnabled) && (!filterServiceListeners.isEmpty())) {
            for (FilterServiceListener listener : filterServiceListeners) {
                listener.filtering(theEvent, matches, statementId);
            }
        }

        return version;
    }

    @JmxGetter(name="NumEventsEvaluated", description = "Number of events evaluated (main)")
    public final long getNumEventsEvaluated()
    {
        return numEventsEvaluated.get();
    }

    @JmxOperation(description = "Reset number of events evaluated")
    public void resetStats() {
        numEventsEvaluated.set(0);
    }

    public void addFilterServiceListener(FilterServiceListener filterServiceListener) {
        filterServiceListeners.add(filterServiceListener);
    }

    public void removeFilterServiceListener(FilterServiceListener filterServiceListener) {
        filterServiceListeners.remove(filterServiceListener);
    }

    public FilterSet take(Set<String> statementIds)
    {
        filtersVersion++;
        return indexBuilder.take(statementIds);
    }

    public void apply(FilterSet filterSet)
    {
        filtersVersion++;
        indexBuilder.apply(filterSet);
    }

    @JmxGetter(name="NumFiltersApprox", description = "Number of filters managed (approximately)")
    public int getFilterCountApprox() {
        return eventTypeIndex.getFilterCountApprox();
    }

    @JmxGetter(name="NumEventTypes", description = "Number of event types considered")
    public int getCountTypes() {
        return eventTypeIndex.size();
    }

    public void removeType(EventType type) {
        eventTypeIndex.removeType(type);
    }

    private void retryableMatchEvent(EventBean theEvent, Collection<FilterHandle> matches) {
        // Install lock backoff exception handler that retries the evaluation.
        try {
            eventTypeIndex.matchEvent(theEvent, matches);
        }
        catch (FilterLockBackoffException ex) {
            // retry on lock back-off
            // lock-backoff may occur when stateful evaluations take place such as boolean expressions that are subqueries
            // statements that contain subqueries in pattern filter expression can themselves modify filters, leading to a theoretically possible deadlock
            long delayNs = 10;
            while(true) {
                try {
                    // yield
                    try {
                        Thread.sleep(0);
                    }
                    catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    // delay
                    LockSupport.parkNanos(delayNs);
                    if (delayNs < 1000000000) {
                        delayNs = delayNs * 2;
                    }

                    // evaluate
                    matches.clear();
                    eventTypeIndex.matchEvent(theEvent, matches);
                    break;
                }
                catch (FilterLockBackoffException ex2) {
                    // retried
                }
            }
        }
    }
}
