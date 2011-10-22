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
import com.espertech.esper.client.EventType;
import com.espertech.esper.client.SafeIterator;
import com.espertech.esper.collection.SafeIteratorImpl;
import com.espertech.esper.collection.SafeIteratorNull;
import com.espertech.esper.core.context.factory.StatementAgentInstanceFactoryResult;
import com.espertech.esper.core.context.stmt.AIRegistryAggregationSingle;
import com.espertech.esper.core.context.stmt.AIRegistryExprSingle;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistry;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;
import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.core.context.util.ContextIteratorHandler;
import com.espertech.esper.core.context.util.EPStatementAgentInstanceHandle;
import com.espertech.esper.core.context.util.StatementAgentInstanceUtil;
import com.espertech.esper.core.service.*;
import com.espertech.esper.schedule.ScheduleComputeHelper;
import com.espertech.esper.schedule.ScheduleHandleCallback;
import com.espertech.esper.schedule.ScheduleSlot;
import com.espertech.esper.schedule.ScheduleSpec;
import com.espertech.esper.util.CollectionUtil;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContextManagerTemporalSingle implements ContextManager, ContextIteratorHandler {

    private final String contextName;
    private final EPServicesContext servicesContext;
    private final StatementContext createContextStmtContext;
    private final ScheduleSpec scheduleStart;
    private final ScheduleSpec scheduleEnd;

    private final ScheduleSlot scheduleSlot;
    private final ContextDescriptor contextDescriptor;

    private final Map<String, ContextManagedStatementBase> statements = new LinkedHashMap<String, ContextManagedStatementBase>();
    private final Map<String, AgentInstance> instances = new LinkedHashMap<String, AgentInstance>();

    private EPStatementHandleCallback contextScheduleCallbackHandle;
    private boolean statementsRunning;
    private long startTime;
    private long endTime;

    public ContextManagerTemporalSingle(String contextName, EPServicesContext servicesContext, StatementContext createContextStmtContext, ScheduleSpec scheduleStart, ScheduleSpec scheduleEnd) {
        this.contextName = contextName;
        this.servicesContext = servicesContext;
        this.createContextStmtContext = createContextStmtContext;
        this.scheduleStart = scheduleStart;
        this.scheduleEnd = scheduleEnd;

        this.scheduleSlot = createContextStmtContext.getScheduleBucket().allocateSlot();

        StatementAIResourceRegistryFactory resourceRegistryFactory = new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationSingle(), new AIRegistryExprSingle());
            }
        };

        EventType contextEventType = ContextPropertyEventType.getTemporalFixedType(contextName, servicesContext.getEventAdapterService());
        ContextPropertyRegistryImpl contextPropertyRegistry = new ContextPropertyRegistryImpl(contextEventType);
        this.contextDescriptor = new ContextDescriptor(contextName, true, contextPropertyRegistry, resourceRegistryFactory, this);
    }

    public void safeDestroy() {
        endContextCallbacks();
        statements.clear();
        instances.clear();
    }

    public ContextDescriptor getContextDescriptor() {
        return contextDescriptor;
    }

    public synchronized Iterator<EventBean> iterator(String statementId) {
        AgentInstance agentInstance = instances.get(statementId);
        if (agentInstance == null) {
            return CollectionUtil.NULL_EVENT_ITERATOR;
        }
        return agentInstance.getFinalView().iterator();
    }

    public synchronized SafeIterator<EventBean> safeIterator(String statementId) {
        AgentInstance agentInstance = instances.get(statementId);
        if (agentInstance == null) {
            return SafeIteratorNull.NULL_EVENT_ITER;
        }

        // Set variable version and acquire the lock first
        StatementAgentInstanceLock theLock = agentInstance.getAgentInstanceContext().getEpStatementAgentInstanceHandle().getStatementAgentInstanceLock();
        theLock.acquireReadLock();
        try
        {
            return new SafeIteratorImpl<EventBean>(theLock, agentInstance.getFinalView().iterator());
        }
        catch (RuntimeException ex)
        {
            theLock.releaseReadLock();
            throw ex;
        }
    }

    public synchronized void addStatement(ContextManagedStatementBase statement) {
        // the first statement starts the context callbacks for start+end time
        if (statements.isEmpty()) {
            startContextCallbacks();
        }

        statements.put(statement.getStatementContext().getStatementId(), statement);

        if (isStatementsRunning()) {
            startStatement(statement);
        }
    }

    public synchronized void stopStatement(String statementName, String statementId) {
        removeStatement(statementId);
    }

    public synchronized void destroyStatement(String statementName, String statementId) {
        removeStatement(statementId);
        if (statements.isEmpty()) {
            safeDestroy();
        }
    }

    private void removeStatement(String statementId) {
        AgentInstance instance = instances.get(statementId);
        if (instance != null) {
            StatementAgentInstanceUtil.stop(instance.getStopCallback(), instance.getAgentInstanceContext(), instance.getFinalView(), servicesContext);
        }
        instances.remove(statementId);
        statements.remove(statementId);
    }

    protected void startStatement(ContextManagedStatementBase statement) {

        EventBean contextProperties = ContextPropertyEventType.getTemporalFixedBean(servicesContext.getEventAdapterService(), contextDescriptor.getContextPropertyRegistry().getContextEventType(), contextName, startTime, endTime);
        StatementAgentInstanceFactoryResult startResult = StatementAgentInstanceUtil.start(servicesContext, statement, true, 0, contextProperties, AgentInstanceFilterProxyNull.AGENT_INSTANCE_FILTER_PROXY_NULL);
        instances.put(statement.getStatementContext().getStatementId(), new AgentInstance(startResult.getStopCallback(), startResult.getAgentInstanceContext(), startResult.getFinalView()));
    }

    protected void activateStatements() {
        for (Map.Entry<String, ContextManagedStatementBase> stmtEntry : statements.entrySet()) {
            startStatement(stmtEntry.getValue());
        }
    }

    protected void deactivateStatements() {
        for (Map.Entry<String, AgentInstance> stmtEntry : instances.entrySet()) {
            AgentInstance instance = stmtEntry.getValue();
            StatementAgentInstanceUtil.stop(instance.getStopCallback(), instance.getAgentInstanceContext(), instance.getFinalView(), servicesContext);
        }
        instances.clear();
    }

    public boolean isStatementsRunning() {
        return statementsRunning;
    }

    private void startContextCallbacks() {
        long nextScheduledStartTime = ScheduleComputeHelper.computeNextOccurance(scheduleStart, createContextStmtContext.getTimeProvider().getTime());
        long nextScheduledEndTime = ScheduleComputeHelper.computeNextOccurance(scheduleEnd, createContextStmtContext.getTimeProvider().getTime());
        if (nextScheduledStartTime < nextScheduledEndTime) {
            scheduleStart();    // We look for the start and assume we are currently ended
            statementsRunning = false;
            startTime = nextScheduledStartTime;
            endTime = nextScheduledEndTime;
        }
        else {
            scheduleEnd();  // We look for the end and assume we are currently started
            statementsRunning = true;
            startTime = createContextStmtContext.getTimeProvider().getTime();
            endTime = nextScheduledEndTime;
        }
    }

    private void endContextCallbacks() {
        if (contextScheduleCallbackHandle != null) {
            servicesContext.getSchedulingService().remove(contextScheduleCallbackHandle, scheduleSlot);
        }
        contextScheduleCallbackHandle = null;
    }

    private EPStatementHandleCallback getCallbackHandle(ScheduleHandleCallback callback) {
        EPStatementAgentInstanceHandle agentHandle = new EPStatementAgentInstanceHandle(createContextStmtContext.getEpStatementHandle(), createContextStmtContext.getDefaultAgentInstanceLock(), null, new StatementAgentInstanceFilterVersion());
        contextScheduleCallbackHandle = new EPStatementHandleCallback(agentHandle, callback);
        return contextScheduleCallbackHandle;
    }

    private void scheduleStart() {
        ScheduleHandleCallback callback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext)
            {
                activateStatements();
                scheduleEnd();
                statementsRunning = true;
            }
        };
        EPStatementHandleCallback handle = getCallbackHandle(callback);
        createContextStmtContext.getSchedulingService().add(scheduleStart, handle, scheduleSlot);
    }

    private void scheduleEnd() {
        // add handle for stopping statement-contexts
        ScheduleHandleCallback callback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext)
            {
                deactivateStatements();
                scheduleStart();
                statementsRunning = false;
            }
        };
        contextScheduleCallbackHandle = getCallbackHandle(callback);
        createContextStmtContext.getSchedulingService().add(scheduleEnd, contextScheduleCallbackHandle, scheduleSlot);
    }
}
