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
import com.espertech.esper.collection.SafeIteratorNull;
import com.espertech.esper.core.context.factory.StatementAgentInstanceFactoryResult;
import com.espertech.esper.core.context.stmt.AIRegistryAggregationMultiPerm;
import com.espertech.esper.core.context.stmt.AIRegistryExprMultiPerm;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistry;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;
import com.espertech.esper.core.context.util.*;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.EPStatementHandleCallback;
import com.espertech.esper.core.service.ExtensionServicesContext;
import com.espertech.esper.core.service.StatementAgentInstanceFilterVersion;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ContextDetailInitiatedTerminated;
import com.espertech.esper.filter.FilterHandleCallback;
import com.espertech.esper.filter.FilterValueSet;
import com.espertech.esper.pattern.*;
import com.espertech.esper.schedule.ScheduleHandleCallback;
import com.espertech.esper.schedule.ScheduleSlot;
import com.espertech.esper.util.CollectionUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

public class ContextManagerTemporalOverlap implements ContextManager, PatternMatchCallback, ContextIteratorHandler {
    private static final Log log = LogFactory.getLog(ContextManagerTemporalOverlap.class);

    private final String contextName;
    private final EPServicesContext servicesContext;
    private final AgentInstanceContext createContextContext;
    private final ContextDetailInitiatedTerminated overlapSpec;
    private final ContextStateService contextStateService;
    private final ContextStateServiceBinding contextStateServiceBinding;

    private final ContextDescriptor contextDescriptor;

    private final Map<String, Set<AgentInstance>> statementInstances = new HashMap<String, Set<AgentInstance>>();
    private final Map<String, ContextManagedStatementBase> statements = new LinkedHashMap<String, ContextManagedStatementBase>(); // retain order of statement creation
    private final TreeMap<Integer, ContextPlusSchedule> agentInstances = new TreeMap<Integer, ContextPlusSchedule>();

    private PatternStopCallback patternStopCallback;
    private EPStatementHandleCallback filterHandle;

    public ContextManagerTemporalOverlap(String contextName, EPServicesContext servicesContext, AgentInstanceContext createContextContext, ContextDetailInitiatedTerminated overlapSpec, ContextStateService contextStateService) {
        this.contextName = contextName;
        this.servicesContext = servicesContext;
        this.createContextContext = createContextContext;
        this.overlapSpec = overlapSpec;
        this.contextStateService = contextStateService;

        StatementAIResourceRegistryFactory resourceRegistryFactory = new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationMultiPerm(), new AIRegistryExprMultiPerm());
            }
        };
        EventType eventTypeContextProps = ContextPropertyEventType.getTemporalOverlapType(contextName, overlapSpec, servicesContext.getEventAdapterService());
        ContextPropertyRegistry contextProperties = new ContextPropertyRegistryImpl(eventTypeContextProps);
        contextDescriptor = new ContextDescriptor(contextName, false, contextProperties, resourceRegistryFactory, this);
        contextStateServiceBinding = contextStateService.getBinding(eventTypeContextProps);

        // restart
        List<ContextState> contextStates = contextStateService.getContexts(contextName, contextStateServiceBinding, servicesContext.getEventAdapterService());
        for (ContextState contextState : contextStates) {
            int instanceId = contextState.getAgentInstanceId();

            ContextPlusSchedule context = new ContextPlusSchedule((EventBean)contextState.getAdditionalInfo(), null, null);
            agentInstances.put(instanceId, context);
        }
    }

    public ContextDescriptor getContextDescriptor() {
        return contextDescriptor;
    }

    public synchronized Iterator<EventBean> iterator(String statementId) {
        Set<AgentInstance> list = statementInstances.get(statementId);
        if (list == null) {
            return CollectionUtil.NULL_EVENT_ITERATOR;
        }
        AgentInstance[] instances = list.toArray(new AgentInstance[list.size()]);
        return new AgentInstanceArrayIterator(instances);
    }

    public synchronized SafeIterator<EventBean> safeIterator(String statementId) {
        Set<AgentInstance> list = statementInstances.get(statementId);
        if (list == null) {
            return SafeIteratorNull.NULL_EVENT_ITER;
        }
        AgentInstance[] instances = list.toArray(new AgentInstance[list.size()]);
        return new AgentInstanceArraySafeIterator(instances);
    }

    public synchronized void addStatement(ContextManagedStatementBase statement) throws ExprValidationException {
        if (statements.isEmpty()) {
            activate();
        }
        statements.put(statement.getStatementContext().getStatementId(), statement);

        Set<AgentInstance> instanceList = new LinkedHashSet<AgentInstance>();
        statementInstances.put(statement.getStatementContext().getStatementId(), instanceList);

        // retro-actively create contexts for that statement
        for (Map.Entry<Integer, ContextPlusSchedule> entry : agentInstances.entrySet()) {
            Integer agentInstanceId = entry.getKey();
            ContextPlusSchedule scheduleAndContext = entry.getValue();

            AgentInstance result = startAgentInstance(statement, agentInstanceId, scheduleAndContext.getContextEvent());
            instanceList.add(result);

            // schedule a termination callback unless it is already scheduled
            if (scheduleAndContext.getContextScheduleCallbackHandle() == null) {
                ScheduleSlot scheduleSlot = createContextContext.getStatementContext().getScheduleBucket().allocateSlot();
                EPStatementHandleCallback callback = scheduleCallback(agentInstanceId, scheduleSlot);
                scheduleAndContext.setContextScheduleCallbackHandle(callback, scheduleSlot);
            }
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

    public synchronized void safeDestroy() {
        deactivate();
    }

    public synchronized void matchFound(Map<String, Object> matchEvent) {
        processMatchFound(matchEvent, null);
    }

    private void activate() {
        if (overlapSpec.getInitiatedPattern() != null) {
            if (patternStopCallback != null) {
                patternStopCallback.stop();
            }

            PatternContext patternContext = new PatternContext(createContextContext.getStatementContext(), 0);

            EvalRootFactoryNode rootFactoryNode = servicesContext.getPatternNodeFactory().makeRootNode();
            rootFactoryNode.addChildNode(overlapSpec.getInitiatedPatternCompiled().getEvalFactoryNode());

            PatternAgentInstanceContext patternAgentInstanceContext = createContextContext.getStatementContext().getPatternContextFactory().createPatternAgentContext(patternContext, createContextContext, false);
            EvalRootNode rootNode = EvalNodeUtil.makeRootNodeFromFactory(rootFactoryNode, patternAgentInstanceContext);

            patternStopCallback = rootNode.start(this, patternContext);
        }
        else {
            FilterHandleCallback filterCallback = new FilterHandleCallback() {
                public String getStatementId() {
                    return createContextContext.getStatementContext().getStatementId();
                }

                public void matchFound(EventBean event, Collection<FilterHandleCallback> allStmtMatches) {
                    filterMatchFound(event);
                }

                public boolean isSubSelect() {
                    return false;
                }
            };
            filterHandle = new EPStatementHandleCallback(createContextContext.getEpStatementAgentInstanceHandle(), filterCallback);
            FilterValueSet filterValueSet = overlapSpec.getInitiatedFilterCompiled().getValueSet(null, null, null);
            servicesContext.getFilterService().add(filterValueSet, filterHandle);
        }
    }

    private void filterMatchFound(EventBean event) {
        processMatchFound(null, event);
    }

    private void processMatchFound(Map<String, Object> patternData, EventBean filterEvent) {

        if (statements.isEmpty()) {
            return;
        }

        int agentInstanceId = nextId(agentInstances);

        // determine context properties
        EventBean context = ContextPropertyEventType.getTempOverlapBean(servicesContext.getEventAdapterService(), contextDescriptor.getContextPropertyRegistry().getContextEventType(), contextName, agentInstanceId, patternData, filterEvent, overlapSpec.getInitiatedFilterAsName());

        // save id - for statements to be added
        ContextPlusSchedule scheduleAndContext = new ContextPlusSchedule(context, null, null);
        agentInstances.put(agentInstanceId, scheduleAndContext);

        // save state if required
        contextStateService.addContext(contextName, agentInstanceId, context, contextStateServiceBinding);

        // schedule callback, save for removal
        ScheduleSlot scheduleSlot = createContextContext.getStatementContext().getScheduleBucket().allocateSlot();
        EPStatementHandleCallback scheduleHandle = scheduleCallback(agentInstanceId, scheduleSlot);
        scheduleAndContext.setContextScheduleCallbackHandle(scheduleHandle, scheduleSlot);

        // for all current statements, start an instance
        for (ContextManagedStatementBase statement : statements.values()) {

            // obtain existing instances
            Set<AgentInstance> instanceList = statementInstances.get(statement.getStatementContext().getStatementId());
            if (instanceList == null) {
                instanceList = new LinkedHashSet<AgentInstance>();
                statementInstances.put(statement.getStatementContext().getStatementId(), instanceList);
            }

            // start
            AgentInstance ai = startAgentInstance(statement, agentInstanceId, context);

            // evaluate this event specifically for this statement
            // evaluate that event for that new agent instance
            if (filterEvent != null) {
                StatementAgentInstanceUtil.evaluateEventForStatement(servicesContext, createContextContext, filterEvent, ai.getAgentInstanceContext());
            }

            instanceList.add(ai);
        }
    }

    private AgentInstance startAgentInstance(ContextManagedStatementBase statement, int agentInstanceId, EventBean contextBean) {
        StatementAgentInstanceFactoryResult result = StatementAgentInstanceUtil.start(servicesContext, statement, false, agentInstanceId, contextBean, AgentInstanceFilterProxyNull.AGENT_INSTANCE_FILTER_PROXY_NULL);
        return new AgentInstance(result.getStopCallback(), result.getAgentInstanceContext(), result.getFinalView());
    }

    private void deactivate() {
        if (patternStopCallback != null) {
            patternStopCallback.stop();
            patternStopCallback = null;
        }
        if (filterHandle != null) {
            servicesContext.getFilterService().remove(filterHandle);
            filterHandle = null;
        }

        for (Map.Entry<Integer, ContextPlusSchedule> entry : agentInstances.entrySet()) {
            if (entry.getValue().getContextScheduleCallbackHandle() != null) {
                servicesContext.getSchedulingService().remove(entry.getValue().getContextScheduleCallbackHandle(), entry.getValue().getScheduleSlot());
            }
        }
        agentInstances.clear();
    }

    private void removeStatement(String statementId) {
        Set<AgentInstance> instanceList = statementInstances.get(statementId);
        if (instanceList != null) {
            for (AgentInstance entry : instanceList) {
                StatementAgentInstanceUtil.stop(entry.getStopCallback(), entry.getAgentInstanceContext(), entry.getFinalView(), servicesContext);
            }
        }

        statementInstances.remove(statementId);
        statements.remove(statementId);
        if (statements.isEmpty()) {
            agentInstances.clear();
        }
    }

    private static int nextId(TreeMap<Integer, ContextPlusSchedule> instanceIds) {
        if (instanceIds.isEmpty()) {
            return 0;
        }
        if (instanceIds.lastKey() == (instanceIds.size() - 1)) {
            return instanceIds.lastKey() + 1;
        }
        for (int i = 0; i < instanceIds.size(); i++) {
            if (instanceIds.containsKey(i)) {
                continue;
            }
            return i;
        }
        return instanceIds.lastKey() + 1;
    }

    private EPStatementHandleCallback scheduleCallback(final int agentInstanceId, ScheduleSlot scheduleSlot) {

        ScheduleHandleCallback callback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext) {
                stopAgentInstanceCallback(agentInstanceId);
            }
        };

        // callback for expiry
        EPStatementAgentInstanceHandle agentHandle = new EPStatementAgentInstanceHandle(createContextContext.getStatementContext().getEpStatementHandle(), createContextContext.getStatementContext().getDefaultAgentInstanceLock(), null, new StatementAgentInstanceFilterVersion());
        EPStatementHandleCallback contextScheduleCallbackHandle = new EPStatementHandleCallback(agentHandle, callback);
        Double interval = (Double) overlapSpec.getTerminatedTimePeriod().evaluate(null, true, createContextContext);
        if (interval == null) {
            log.warn("Time period expression in context '" + contextName + "' returned a null value, not scheduling time period");
        }
        else {
            long msec = (long) (interval * 1000L);
            servicesContext.getSchedulingService().add(msec, contextScheduleCallbackHandle, scheduleSlot);
        }

        return contextScheduleCallbackHandle;
    }

    private void stopAgentInstanceCallback(int agentInstanceId) {
        for (Map.Entry<String, Set<AgentInstance>> entry : statementInstances.entrySet()) {
            Iterator<AgentInstance> agentInstanceIterator = entry.getValue().iterator();
            for (;agentInstanceIterator.hasNext();) {
                AgentInstance agentInstance = agentInstanceIterator.next();
                if (agentInstance.getAgentInstanceContext().getAgentInstanceIds()[0] != agentInstanceId) {
                    continue;
                }

                agentInstanceIterator.remove();

                StatementAgentInstanceUtil.stop(agentInstance.getStopCallback(), agentInstance.getAgentInstanceContext(), agentInstance.getFinalView(), servicesContext);
            }
        }

        agentInstances.remove(agentInstanceId);
        contextStateService.removeContextAgentInstance(contextName, agentInstanceId);
    }


    public static class ContextPlusSchedule {
        private final EventBean contextEvent;
        private EPStatementHandleCallback contextScheduleCallbackHandle;
        private ScheduleSlot scheduleSlot;

        public ContextPlusSchedule(EventBean contextEvent, EPStatementHandleCallback contextScheduleCallbackHandle, ScheduleSlot scheduleSlot) {
            this.contextEvent = contextEvent;
            this.contextScheduleCallbackHandle = contextScheduleCallbackHandle;
            this.scheduleSlot = scheduleSlot;
        }

        public EventBean getContextEvent() {
            return contextEvent;
        }

        public EPStatementHandleCallback getContextScheduleCallbackHandle() {
            return contextScheduleCallbackHandle;
        }

        public void setContextScheduleCallbackHandle(EPStatementHandleCallback contextScheduleCallbackHandle, ScheduleSlot scheduleSlot) {
            this.contextScheduleCallbackHandle = contextScheduleCallbackHandle;
            this.scheduleSlot = scheduleSlot;
        }

        public ScheduleSlot getScheduleSlot() {
            return scheduleSlot;
        }
    }
}
