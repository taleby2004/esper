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
import com.espertech.esper.util.StopCallback;
import com.espertech.esper.view.Viewable;
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

    private final ScheduleSlot scheduleSlot;
    private final ContextDescriptor contextDescriptor;

    private final Map<String, InstanceList> instances = new HashMap<String, InstanceList>();
    private final Map<String, ContextManagedStatementBase> statements = new LinkedHashMap<String, ContextManagedStatementBase>(); // retain order of statement creation

    private PatternStopCallback patternStopCallback;
    private EPStatementHandleCallback filterHandle;
    private EventType eventTypeContextProps;

    public ContextManagerTemporalOverlap(String contextName, EPServicesContext servicesContext, AgentInstanceContext createContextContext, ContextDetailInitiatedTerminated overlapSpec, ContextStateService contextStateService) {
        this.contextName = contextName;
        this.servicesContext = servicesContext;
        this.createContextContext = createContextContext;
        this.overlapSpec = overlapSpec;
        this.contextStateService = contextStateService;

        this.scheduleSlot = createContextContext.getStatementContext().getScheduleBucket().allocateSlot();

        StatementAIResourceRegistryFactory resourceRegistryFactory = new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationMultiPerm(), new AIRegistryExprMultiPerm());
            }
        };
        eventTypeContextProps = ContextPropertyEventType.getTemporalOverlapType(contextName, overlapSpec, servicesContext.getEventAdapterService());
        ContextPropertyRegistry contextProperties = new ContextPropertyRegistryImpl(eventTypeContextProps);
        contextDescriptor = new ContextDescriptor(contextName, false, contextProperties, resourceRegistryFactory, this);

        // restart
        int lastInstanceId = -1;
        List<ContextState> contextStates = contextStateService.getContexts(contextName);
        for (ContextState contextState : contextStates) {
            int instanceId = contextState.getAgentInstanceId();
            if (lastInstanceId < instanceId) {
                lastInstanceId = instanceId;
            }

            ContextManagerTemporalOverlapInstance initiationState = (ContextManagerTemporalOverlapInstance) contextState.getAdditionalInfo();
            for (Map.Entry<String, ContextManagedStatementBase> stmtEntry : statements.entrySet()) {
                startAgentInstance(stmtEntry.getValue(), instanceId, initiationState.getPatternData(), initiationState.getFilterEvent());
            }
        }
    }

    public ContextDescriptor getContextDescriptor() {
        return contextDescriptor;
    }

    public synchronized Iterator<EventBean> iterator(String statementId) {
        InstanceList list = instances.get(statementId);
        if (list == null) {
            return CollectionUtil.NULL_EVENT_ITERATOR;
        }
        AgentInstance[] instances = list.getInstances().toArray(new AgentInstance[list.getInstances().size()]);
        return new AgentInstanceArrayIterator(instances);
    }

    public synchronized SafeIterator<EventBean> safeIterator(String statementId) {
        InstanceList list = instances.get(statementId);
        if (list == null) {
            return SafeIteratorNull.NULL_EVENT_ITER;
        }
        AgentInstance[] instances = list.getInstances().toArray(new AgentInstance[list.getInstances().size()]);
        return new AgentInstanceArraySafeIterator(instances);
    }

    public synchronized void addStatement(ContextManagedStatementBase statement) throws ExprValidationException {
        if (statements.isEmpty()) {
            activate();
        }
        statements.put(statement.getStatementContext().getStatementId(), statement);
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

    private void stopAgentInstance(AgentInstanceContext agentInstanceContext) {
        InstanceList instanceList = instances.get(agentInstanceContext.getStatementContext().getStatementId());
        if (instanceList == null) {
            return;
        }

        for (AgentInstanceWithSchedule entry : instanceList.getInstances()) {
            if (entry.getAgentInstanceContext() != agentInstanceContext) {
                continue;
            }

            StatementAgentInstanceUtil.stop(entry.getStopCallback(), entry.getAgentInstanceContext(), entry.getFinalView());
            servicesContext.getSchedulingService().remove(entry.getContextScheduleCallbackHandle(), scheduleSlot);
            instanceList.remove(entry);
            break;
        }
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
        // for all current statements, start an instance
        for (ContextManagedStatementBase statement : statements.values()) {

            // obtain existing instances
            InstanceList instanceList = instances.get(statement.getStatementContext().getStatementId());
            if (instanceList == null) {
                instanceList = new InstanceList();
                instances.put(statement.getStatementContext().getStatementId(), instanceList);
            }

            int agentInstanceId = instanceList.nextId();

            // start
            AgentInstanceWithSchedule ai = startAgentInstance(statement, agentInstanceId, patternData, filterEvent);

            // evaluate this event specifically for this statement
            // evaluate that event for that new agent instance
            if (filterEvent != null) {
                StatementAgentInstanceUtil.evaluateEventForStatement(servicesContext, createContextContext, filterEvent, ai.getAgentInstanceContext());
            }

            instanceList.add(ai);
        }
    }

    private AgentInstanceWithSchedule startAgentInstance(ContextManagedStatementBase statement, int agentInstanceId, Map<String, Object> patternData, EventBean filterEvent) {
        // determine context properties
        EventBean context = ContextPropertyEventType.getTempOverlapBean(eventTypeContextProps, contextName, agentInstanceId, patternData, filterEvent, overlapSpec.getInitiatedFilterAsName());

        // instantiate context
        StatementAgentInstanceFactoryResult result = StatementAgentInstanceUtil.start(servicesContext, statement, false, agentInstanceId, context, AgentInstanceFilterProxyNull.AGENT_INSTANCE_FILTER_PROXY_NULL);
        final AgentInstanceContext agentInstanceContext= result.getAgentInstanceContext();

        ScheduleHandleCallback callback = new ScheduleHandleCallback() {
            public void scheduledTrigger(ExtensionServicesContext extensionServicesContext) {
                stopAgentInstance(agentInstanceContext);
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

        // save
        return new AgentInstanceWithSchedule(result.getStopCallback(), result.getAgentInstanceContext(), result.getFinalView(), contextScheduleCallbackHandle);
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
    }

    private void removeStatement(String statementId) {
        InstanceList instanceList = instances.get(statementId);
        if (instanceList != null) {
            for (AgentInstanceWithSchedule entry : instanceList.getInstances()) {
                StatementAgentInstanceUtil.stop(entry.getStopCallback(), entry.getAgentInstanceContext(), entry.getFinalView());
                servicesContext.getSchedulingService().remove(entry.getContextScheduleCallbackHandle(), scheduleSlot);
            }
        }

        instances.remove(statementId);
        statements.remove(statementId);
    }

    public static class InstanceList {
        private final Set<AgentInstanceWithSchedule> instances = new LinkedHashSet<AgentInstanceWithSchedule>();
        private final TreeSet<Integer> instanceIds = new TreeSet<Integer>();

        public void add(AgentInstanceWithSchedule instance) {
            instanceIds.add(instance.getAgentInstanceContext().getAgentInstanceIds()[0]);
            instances.add(instance);
        }

        public void remove(AgentInstanceWithSchedule instance) {
            instances.remove(instance);
            instanceIds.remove(instance.getAgentInstanceContext().getAgentInstanceIds()[0]);
        }

        public Set<AgentInstanceWithSchedule> getInstances() {
            return instances;
        }

        public int nextId() {
            if (instanceIds.isEmpty()) {
                return 0;
            }
            if (instanceIds.last() == (instanceIds.size() - 1)) {
                return instanceIds.last() + 1;
            }
            for (int i = 0; i < instanceIds.size(); i++) {
                if (instanceIds.contains(i)) {
                    continue;
                }
                return i;
            }
            return instanceIds.last() + 1;
        }
    }

    public static class AgentInstanceWithSchedule extends AgentInstance {
        private final EPStatementHandleCallback contextScheduleCallbackHandle;

        public AgentInstanceWithSchedule(StopCallback stopCallback, AgentInstanceContext agentInstanceContext, Viewable finalView, EPStatementHandleCallback contextScheduleCallbackHandle) {
            super(stopCallback, agentInstanceContext, finalView);
            this.contextScheduleCallbackHandle = contextScheduleCallbackHandle;
        }

        public EPStatementHandleCallback getContextScheduleCallbackHandle() {
            return contextScheduleCallbackHandle;
        }
    }
}
