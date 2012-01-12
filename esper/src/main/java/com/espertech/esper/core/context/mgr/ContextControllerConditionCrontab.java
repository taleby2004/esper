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
import com.espertech.esper.core.context.util.EPStatementAgentInstanceHandle;
import com.espertech.esper.core.service.EPStatementHandleCallback;
import com.espertech.esper.core.service.ExtensionServicesContext;
import com.espertech.esper.core.service.StatementAgentInstanceFilterVersion;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.spec.ContextDetailConditionCrontab;
import com.espertech.esper.pattern.MatchedEventMap;
import com.espertech.esper.schedule.ScheduleComputeHelper;
import com.espertech.esper.schedule.ScheduleHandleCallback;
import com.espertech.esper.schedule.ScheduleSlot;

import java.util.Collections;

public class ContextControllerConditionCrontab implements ContextControllerCondition {

    private final StatementContext statementContext;
    private final ScheduleSlot scheduleSlot;
    private final ContextDetailConditionCrontab spec;
    private final ContextControllerConditionCallback callback;

    private EPStatementHandleCallback scheduleHandle;

    public ContextControllerConditionCrontab(StatementContext statementContext, ScheduleSlot scheduleSlot, ContextDetailConditionCrontab spec, ContextControllerConditionCallback callback) {
        this.statementContext = statementContext;
        this.scheduleSlot = scheduleSlot;
        this.spec = spec;
        this.callback = callback;
    }

    public void activate(EventBean optionalTriggerEvent, MatchedEventMap priorMatches, long timeOffset) {
        startContextCallback();
    }

    public void deactivate() {
        endContextCallback();
    }

    public boolean isRunning() {
        return scheduleHandle != null;
    }

    private void startContextCallback() {
        ScheduleHandleCallback scheduleCallback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext)
            {
                scheduleHandle = null;  // terminates automatically unless scheduled again
                callback.rangeNotification(ContextControllerConditionCrontab.this, null, Collections.<String, Object>emptyMap());
            }
        };
        EPStatementAgentInstanceHandle agentHandle = new EPStatementAgentInstanceHandle(statementContext.getEpStatementHandle(), statementContext.getDefaultAgentInstanceLock(), -1, new StatementAgentInstanceFilterVersion());
        scheduleHandle = new EPStatementHandleCallback(agentHandle, scheduleCallback);
        statementContext.getSchedulingService().add(spec.getSchedule(), scheduleHandle, scheduleSlot);
    }

    private void endContextCallback() {
        if (scheduleHandle!= null) {
            statementContext.getSchedulingService().remove(scheduleHandle, scheduleSlot);
        }
        scheduleHandle = null;
    }

    public Long getExpectedEndTime() {
        return ScheduleComputeHelper.computeNextOccurance(spec.getSchedule(), statementContext.getTimeProvider().getTime());
    }
}
