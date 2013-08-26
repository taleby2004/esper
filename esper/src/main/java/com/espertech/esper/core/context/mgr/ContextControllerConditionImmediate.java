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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.pattern.MatchedEventMap;
import com.espertech.esper.schedule.ScheduleSlot;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Context condition used for Non-Overlapping contexts only, when @Now is specified.
 * Not used for end-conditions (only for start range conditions).
 * This is enforced by the grammar and spec mapper.
 */
public class ContextControllerConditionImmediate implements ContextControllerCondition {

    public void activate(EventBean optionalTriggerEvent, MatchedEventMap priorMatches, long timeOffset, boolean isRecoveringResilient) {
    }

    public void deactivate() {
    }

    public boolean isRunning() {
        return false;
    }

    public Long getExpectedEndTime() {
        return null;
    }

    public boolean isImmediate() {
        return true;
    }
}
