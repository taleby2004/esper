/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.view;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPStatementHandleCallback;
import com.espertech.esper.core.service.ExtensionServicesContext;
import com.espertech.esper.epl.variable.VariableChangeCallback;
import com.espertech.esper.epl.variable.VariableReader;
import com.espertech.esper.schedule.ScheduleHandleCallback;
import com.espertech.esper.schedule.ScheduleSlot;
import com.espertech.esper.util.ExecutionPathDebugLog;
import com.espertech.esper.view.StatementStopCallback;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Output condition for output rate limiting that handles when-then expressions for controlling output.
 */
public class OutputConditionExpression extends OutputConditionBase implements OutputCondition, VariableChangeCallback
{
    private static final Log log = LogFactory.getLog(OutputConditionExpression.class);
    private final AgentInstanceContext agentInstanceContext;
    private final OutputConditionExpressionFactory parent;

    private final ScheduleSlot scheduleSlot;
    private boolean isCallbackScheduled;
    private boolean ignoreVariableCallbacks;
    private Map<String, Object> builtinProperties;
    private EventBean[] eventsPerStream;

    // ongoing builtin properties
    private int totalNewEventsCount;
    private int totalOldEventsCount;
    private Long lastOutputTimestamp;

    public OutputConditionExpression(OutputCallback outputCallback, final AgentInstanceContext agentInstanceContext, OutputConditionExpressionFactory parent) {
        super(outputCallback);
        this.agentInstanceContext = agentInstanceContext;
        this.parent = parent;

        scheduleSlot = agentInstanceContext.getStatementContext().getScheduleBucket().allocateSlot();
        this.eventsPerStream = new EventBean[1];

        if (parent.getBuiltinPropertiesEventType() != null)
        {
            builtinProperties = new HashMap<String, Object>();
            lastOutputTimestamp = agentInstanceContext.getStatementContext().getSchedulingService().getTime();
        }

        if (parent.getVariableNames() != null)
        {
            // if using variables, register a callback on the change of the variable
            for (String variableName : parent.getVariableNames())
            {
                final VariableReader reader = agentInstanceContext.getStatementContext().getVariableService().getReader(variableName);
                agentInstanceContext.getStatementContext().getVariableService().registerCallback(reader.getVariableNumber(), this);
                agentInstanceContext.getStatementContext().getStatementStopService().addSubscriber(new StatementStopCallback() {
                    public void statementStopped()
                    {
                        agentInstanceContext.getStatementContext().getVariableService().unregisterCallback(reader.getVariableNumber(), OutputConditionExpression.this);
                    }
                });
            }
        }
    }

    public void updateOutputCondition(int newEventsCount, int oldEventsCount)
    {
        this.totalNewEventsCount += newEventsCount;
        this.totalOldEventsCount += oldEventsCount;

        boolean isOutput = evaluate();
        if (isOutput)
        {
            outputCallback.continueOutputProcessing(true, true);
            resetBuiltinProperties();
        }
    }

    public void update(Object newValue, Object oldValue)
    {
        if (ignoreVariableCallbacks)
        {
            log.debug(".update Ignoring variable callback");
            return;
        }

        agentInstanceContext.getStatementContext().getVariableService().setLocalVersion();
        boolean isOutput = evaluate();
        if ((isOutput) && (!isCallbackScheduled))
        {
            scheduleCallback();
        }
    }

    private boolean evaluate()
    {
        if (builtinProperties != null)
        {
            builtinProperties.put("count_insert", totalNewEventsCount);
            builtinProperties.put("count_remove", totalOldEventsCount);
            builtinProperties.put("last_output_timestamp", lastOutputTimestamp);
            eventsPerStream[0] = agentInstanceContext.getStatementContext().getEventAdapterService().adapterForTypedMap(builtinProperties, parent.getBuiltinPropertiesEventType());
        }

        boolean result = false;
        Boolean output = (Boolean) parent.getWhenExpressionNodeEval().evaluate(eventsPerStream, true, agentInstanceContext);
        if ((output != null) && (output))
        {
            result = true;
        }

        return result;
    }

    private void scheduleCallback()
    {
    	isCallbackScheduled = true;
        long current = agentInstanceContext.getStatementContext().getSchedulingService().getTime();

        if ((ExecutionPathDebugLog.isDebugEnabled) && (log.isDebugEnabled()))
        {
            log.debug(".scheduleCallback Scheduled new callback for " +
                    " afterMsec=" + 0 +
                    " now=" + current);
        }

        ScheduleHandleCallback callback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext)
            {
                OutputConditionExpression.this.isCallbackScheduled = false;
                OutputConditionExpression.this.outputCallback.continueOutputProcessing(true, true);
                resetBuiltinProperties();
            }
        };
        EPStatementHandleCallback handle = new EPStatementHandleCallback(agentInstanceContext.getEpStatementAgentInstanceHandle(), callback);
        agentInstanceContext.getStatementContext().getSchedulingService().add(0, handle, scheduleSlot);

        // execute assignments
        if (parent.getVariableReadWritePackage() != null)
        {
            if (builtinProperties != null)
            {
                builtinProperties.put("count_insert", totalNewEventsCount);
                builtinProperties.put("count_remove", totalOldEventsCount);
                builtinProperties.put("last_output_timestamp", lastOutputTimestamp);
                eventsPerStream[0] = agentInstanceContext.getStatementContext().getEventAdapterService().adapterForTypedMap(builtinProperties, parent.getBuiltinPropertiesEventType());
            }

            ignoreVariableCallbacks = true;
            try {
                parent.getVariableReadWritePackage().writeVariables(agentInstanceContext.getStatementContext().getVariableService(), eventsPerStream, null, agentInstanceContext);
            }
            finally {
                ignoreVariableCallbacks = false;
            }
        }
    }

    private void resetBuiltinProperties()
    {
        if (builtinProperties  != null)
        {
            totalNewEventsCount = 0;
            totalOldEventsCount = 0;
            lastOutputTimestamp = agentInstanceContext.getStatementContext().getSchedulingService().getTime();
        }
    }
}
