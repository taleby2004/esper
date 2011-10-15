/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.pattern.pool;

import com.espertech.esper.client.hook.ConditionPatternEngineSubexpressionMax;
import com.espertech.esper.pattern.EvalFollowedByNode;
import com.espertech.esper.pattern.PatternContext;
import com.espertech.esper.util.ExecutionPathDebugLog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class PatternSubexpressionPoolSvc {
    private static final Log log = LogFactory.getLog(PatternSubexpressionPoolSvc.class);

    private volatile long maxPoolCountConfigured;
    private final boolean preventStart;
    private final AtomicLong poolCount;
    private final Set<PatternContext> patternContexts;

    public PatternSubexpressionPoolSvc(long maxPoolCountConfigured, boolean preventStart) {
        this.maxPoolCountConfigured = maxPoolCountConfigured;
        this.preventStart = preventStart;
        this.poolCount = new AtomicLong();
        this.patternContexts = Collections.synchronizedSet(new HashSet<PatternContext>());
    }

    public void setPatternMaxSubexpressions(Long maxSubexpressions) {
        if (maxSubexpressions == null) {
            maxPoolCountConfigured = -1;
        }
        else {
            maxPoolCountConfigured = maxSubexpressions;
        }
    }

    public void addPatternContext(PatternContext context) {
        patternContexts.add(context);
    }

    public void removeStatement(String name) {
        Set<PatternContext> removed = new HashSet<PatternContext>();
        for (PatternContext context : patternContexts) {
            if (context.getStatementName().equals(name)) {
                removed.add(context);
            }
        }
        patternContexts.removeAll(removed);
    }

    public boolean tryIncreaseCount(EvalFollowedByNode evalFollowedByNode) {

        // test pool max
        long newMax = poolCount.incrementAndGet();
        if (newMax > maxPoolCountConfigured && maxPoolCountConfigured >= 0) {
            Map<String, Long> counts = getCounts();
            evalFollowedByNode.getContext().getExceptionHandlingService().handleCondition(new ConditionPatternEngineSubexpressionMax(maxPoolCountConfigured, counts), evalFollowedByNode.getContext().getEpStatementHandle());
            if ((ExecutionPathDebugLog.isDebugEnabled) && (log.isDebugEnabled() && (ExecutionPathDebugLog.isTimerDebugEnabled)))
            {
                log.debug(".tryIncreaseCount For statement '" + evalFollowedByNode.getContext().getStatementName() + "' pool count overflow at " + newMax + " statement count was " + evalFollowedByNode.getContext().getPatternSubexpressionPoolHandler().getCount() + " preventStart=" + preventStart);
            }

            if (preventStart) {
                poolCount.decrementAndGet();
                return false;
            }
            else {
                return true;
            }
        }
        if ((ExecutionPathDebugLog.isDebugEnabled) && log.isDebugEnabled())
        {
            log.debug(".tryIncreaseCount For statement '" + evalFollowedByNode.getContext().getStatementName() + "' pool count increases to " + newMax + " statement count was " + evalFollowedByNode.getContext().getPatternSubexpressionPoolHandler().getCount());
        }
        return true;
    }

    // Relevant for recovery of state
    public void forceIncreaseCount(EvalFollowedByNode evalFollowedByNode) {

        long newMax = poolCount.incrementAndGet();
        if ((ExecutionPathDebugLog.isDebugEnabled) && log.isDebugEnabled())
        {
            log.debug(".forceIncreaseCount For statement '" + evalFollowedByNode.getContext().getStatementName() + "' pool count increases to " + newMax + " statement count was " + evalFollowedByNode.getContext().getPatternSubexpressionPoolHandler().getCount());
        }
    }

    public void decreaseCount(EvalFollowedByNode evalFollowedByNode) {
        long newMax = poolCount.decrementAndGet();
        if ((ExecutionPathDebugLog.isDebugEnabled) && log.isDebugEnabled())
        {
            log.debug(".decreaseCount For statement '" + evalFollowedByNode.getContext().getStatementName() + "' pool count decreases to " + newMax + " statement count was " + evalFollowedByNode.getContext().getPatternSubexpressionPoolHandler().getCount());
        }
    }

    private Map<String,Long> getCounts() {
        Map<String,Long> counts = new HashMap<String,Long>();
        for (PatternContext context : patternContexts) {
            Long count = counts.get(context.getStatementName());
            if (count == null) {
                count = 0L;
            }
            count += context.getPatternSubexpressionPoolHandler().getCount();
            counts.put(context.getStatementName(), count);
        }
        return counts;
    }
}
