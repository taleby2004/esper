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

package com.espertech.esper.core.context.util;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.factory.StatementAgentInstanceFactoryResult;
import com.espertech.esper.core.context.mgr.AgentInstance;
import com.espertech.esper.core.context.factory.StatementAgentInstancePreload;
import com.espertech.esper.core.context.mgr.AgentInstanceFilterProxy;
import com.espertech.esper.core.context.mgr.ContextControllerStatementBase;
import com.espertech.esper.core.context.stmt.AIRegistryAggregation;
import com.espertech.esper.core.context.stmt.AIRegistryExpr;
import com.espertech.esper.core.context.subselect.SubSelectStrategyHolder;
import com.espertech.esper.core.service.*;
import com.espertech.esper.core.start.EPStatementStopMethodImpl;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.epl.script.AgentInstanceScriptContext;
import com.espertech.esper.epl.view.OutputProcessViewTerminable;
import com.espertech.esper.event.MappedEventBean;
import com.espertech.esper.filter.FilterHandle;
import com.espertech.esper.util.StopCallback;
import com.espertech.esper.view.Viewable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StatementAgentInstanceUtil {

    private static final Log log = LogFactory.getLog(EPStatementStopMethodImpl.class);

    public static void stopAgentInstances(List<AgentInstance> agentInstances, Map<String, Object> terminationProperties, EPServicesContext servicesContext) {
        if (agentInstances == null) {
            return;
        }
        for (AgentInstance instance : agentInstances) {
            if (terminationProperties != null) {
                instance.getAgentInstanceContext().getContextProperties().getProperties().putAll(terminationProperties);
            }
            StatementAgentInstanceUtil.stop(instance.getStopCallback(), instance.getAgentInstanceContext(), instance.getFinalView(), servicesContext);
        }
    }

    public static void stopSafe(Set<StopCallback> terminationCallbacks, List<StopCallback> stopCallbacks, StatementContext statementContext) {
        StopCallback[] terminationArr = terminationCallbacks.toArray(new StopCallback[terminationCallbacks.size()]);
        stopSafe(terminationArr, statementContext);

        StopCallback[] stopArr = stopCallbacks.toArray(new StopCallback[stopCallbacks.size()]);
        stopSafe(stopArr, statementContext);
    }

    public static void stopSafe(StopCallback[] stopMethods, StatementContext statementContext) {
        for (StopCallback stopCallback : stopMethods) {
            stopSafe(stopCallback, statementContext);
        }
    }

    public static void stopSafe(StopCallback stopMethod, StatementContext statementContext) {
        try {
            stopMethod.stop();
        }
        catch (RuntimeException e) {
            log.warn("Failed to perform statement stop for statement '" + statementContext.getStatementName() +
                    "' expression '" + statementContext.getExpression() + "' : " + e.getMessage(), e);
        }
    }

    public static void stop(StopCallback stopCallback, AgentInstanceContext agentInstanceContext, Viewable finalView, EPServicesContext servicesContext, boolean isStatementStop) {

        // obtain statement lock
        StatementAgentInstanceLock lock = agentInstanceContext.getEpStatementAgentInstanceHandle().getStatementAgentInstanceLock();
        lock.acquireWriteLock(null);
        try {
            if (finalView instanceof OutputProcessViewTerminable && !isStatementStop) {
                OutputProcessViewTerminable terminable = (OutputProcessViewTerminable) finalView;
                terminable.terminated();
            }

            stopSafe(stopCallback, agentInstanceContext.getStatementContext());

            if (servicesContext.getSchedulableAgentInstanceDirectory() != null) {
                servicesContext.getSchedulableAgentInstanceDirectory().remove(agentInstanceContext.getStatementContext().getStatementId(), agentInstanceContext.getAgentInstanceId());
            }

            // indicate method resolution
            agentInstanceContext.getStatementContext().getMethodResolutionService().destroyedAgentInstance(agentInstanceContext.getAgentInstanceId());

            // release resource
            agentInstanceContext.getStatementContext().getStatementAgentInstanceRegistry().deassign(agentInstanceContext.getAgentInstanceId());

            // cause any remaining schedules, that may concide with the caller's schedule, to be ignored
            agentInstanceContext.getEpStatementAgentInstanceHandle().setDestroyed(true);

            // cause any filters, that may concide with the caller's filters, to be ignored
            agentInstanceContext.getEpStatementAgentInstanceHandle().getStatementFilterVersion().setStmtFilterVersion(Long.MAX_VALUE);
        }
        finally {
            lock.releaseWriteLock(null);
        }
    }

    public static StatementAgentInstanceFactoryResult start(EPServicesContext servicesContext,
                                                     ContextControllerStatementBase statement,
                                                     boolean isSingleInstanceContext,
                                                     int agentInstanceId,
                                                     MappedEventBean agentInstanceProperties,
                                                     AgentInstanceFilterProxy agentInstanceFilterProxy)
    {
        StatementContext statementContext = statement.getStatementContext();

        // make a new lock for the agent instance or use the already-allocated default lock
        StatementAgentInstanceLock agentInstanceLock;
        if (isSingleInstanceContext) {
            agentInstanceLock = statementContext.getDefaultAgentInstanceLock();
        }
        else {
            agentInstanceLock = servicesContext.getStatementLockFactory().getStatementLock(statementContext.getStatementName(), statementContext.getExpression(), statementContext.getAnnotations(), statementContext.isStatelessSelect());
        }

        // share the filter version between agent instance handle (callbacks) and agent instance context
        StatementAgentInstanceFilterVersion filterVersion = new StatementAgentInstanceFilterVersion();

        // create handle that comtains lock for use in scheduling and filter callbacks
        EPStatementAgentInstanceHandle agentInstanceHandle = new EPStatementAgentInstanceHandle(statementContext.getEpStatementHandle(), agentInstanceLock, agentInstanceId, filterVersion);

        // create agent instance context
        AgentInstanceScriptContext agentInstanceScriptContext = null;
        if (statementContext.getDefaultAgentInstanceScriptContext() != null) {
            agentInstanceScriptContext = new AgentInstanceScriptContext();
        }
        AgentInstanceContext agentInstanceContext = new AgentInstanceContext(statementContext, agentInstanceHandle, agentInstanceId, agentInstanceFilterProxy, agentInstanceProperties, agentInstanceScriptContext);
        StatementAgentInstanceLock statementAgentInstanceLock = agentInstanceContext.getEpStatementAgentInstanceHandle().getStatementAgentInstanceLock();
        statementAgentInstanceLock.acquireWriteLock(null);

        try {
            // start
            StatementAgentInstanceFactoryResult startResult = statement.getFactory().newContext(agentInstanceContext);

            // hook up with listeners+subscribers
            startResult.getFinalView().addView(statement.getMergeView()); // hook output to merge view

            // assign agents for expression-node based strategies
            AIRegistryExpr aiExprSvc = statementContext.getStatementAgentInstanceRegistry().getAgentInstanceExprService();
            AIRegistryAggregation aiAggregationSvc = statementContext.getStatementAgentInstanceRegistry().getAgentInstanceAggregationService();

            // allocate aggregation service
            if (startResult.getOptionalAggegationService() != null) {
                aiAggregationSvc.assignService(agentInstanceId, startResult.getOptionalAggegationService());
            }

            // allocate subquery
            for (Map.Entry<ExprSubselectNode, SubSelectStrategyHolder> item : startResult.getSubselectStrategies().entrySet()) {
                ExprSubselectNode node = item.getKey();
                SubSelectStrategyHolder strategyHolder = item.getValue();

                aiExprSvc.getSubselectService(node).assignService(agentInstanceId, strategyHolder.getStategy());

                // allocate prior within subquery
                for (Map.Entry<ExprPriorNode, ExprPriorEvalStrategy> priorEntry : strategyHolder.getPriorStrategies().entrySet()) {
                    aiExprSvc.getPriorServices(priorEntry.getKey()).assignService(agentInstanceId, priorEntry.getValue());
                }

                // allocate previous within subquery
                for (Map.Entry<ExprPreviousNode, ExprPreviousEvalStrategy> prevEntry : strategyHolder.getPreviousNodeStrategies().entrySet()) {
                    aiExprSvc.getPreviousServices(prevEntry.getKey()).assignService(agentInstanceId, prevEntry.getValue());
                }
            }

            // allocate prior-expressions
            for (Map.Entry<ExprPriorNode, ExprPriorEvalStrategy> item : startResult.getPriorNodeStrategies().entrySet()) {
                aiExprSvc.getPriorServices(item.getKey()).assignService(agentInstanceId, item.getValue());
            }

            // allocate previous-expressions
            for (Map.Entry<ExprPreviousNode, ExprPreviousEvalStrategy> item : startResult.getPreviousNodeStrategies().entrySet()) {
                aiExprSvc.getPreviousServices(item.getKey()).assignService(agentInstanceId, item.getValue());
            }

            // execute preloads, if any
            for (StatementAgentInstancePreload preload : startResult.getPreloadList()) {
                preload.executePreload();
            }

            // instantiate
            return startResult;
        }
        finally {
            statementAgentInstanceLock.releaseWriteLock(null);
        }
    }

    public static void evaluateEventForStatement(EPServicesContext servicesContext, EventBean event, AgentInstanceContext agentInstanceContext) {
        // context was created - reevaluate for the given event
        ArrayDeque<FilterHandle> callbacks = new ArrayDeque<FilterHandle>();
        servicesContext.getFilterService().evaluate(event, callbacks, agentInstanceContext.getStatementContext().getStatementId());

        try
        {
            servicesContext.getVariableService().setLocalVersion();

            // sub-selects always go first
            for (FilterHandle handle : callbacks)
            {
                EPStatementHandleCallback callback = (EPStatementHandleCallback) handle;
                if (callback.getAgentInstanceHandle() != agentInstanceContext.getEpStatementAgentInstanceHandle()) {
                    continue;
                }
                callback.getFilterCallback().matchFound(event, null);
            }
            agentInstanceContext.getEpStatementAgentInstanceHandle().internalDispatch(agentInstanceContext);

            // No thread work queue processing: leave that for later, but dispatch (i.e. no processThreadWorkQueue);
            servicesContext.getInternalEventEngineRouteDest().dispatch();
        }
        catch (RuntimeException ex) {
            servicesContext.getExceptionHandlingService().handleException(ex, agentInstanceContext.getEpStatementAgentInstanceHandle());
        }
    }

    public static boolean evaluateFilterForStatement(EPServicesContext servicesContext, EventBean event, AgentInstanceContext agentInstanceContext, FilterHandle filterHandle) {
        // context was created - reevaluate for the given event
        ArrayDeque<FilterHandle> callbacks = new ArrayDeque<FilterHandle>();
        servicesContext.getFilterService().evaluate(event, callbacks, agentInstanceContext.getStatementContext().getStatementId());

        try
        {
            servicesContext.getVariableService().setLocalVersion();

            // sub-selects always go first
            for (FilterHandle handle : callbacks)
            {
                if (handle == filterHandle) {
                    return true;
                }
            }
            agentInstanceContext.getEpStatementAgentInstanceHandle().internalDispatch(agentInstanceContext);

        }
        catch (RuntimeException ex) {
            servicesContext.getExceptionHandlingService().handleException(ex, agentInstanceContext.getEpStatementAgentInstanceHandle());
        }

        return false;
    }
}
