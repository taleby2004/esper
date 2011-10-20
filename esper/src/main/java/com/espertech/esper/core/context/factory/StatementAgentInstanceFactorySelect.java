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

package com.espertech.esper.core.context.factory;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.core.context.activator.ViewableActivationResult;
import com.espertech.esper.core.context.activator.ViewableActivator;
import com.espertech.esper.core.context.subselect.SubSelectStrategyCollection;
import com.espertech.esper.core.context.subselect.SubSelectStrategyHolder;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.context.util.AgentInstanceViewFactoryChainContext;
import com.espertech.esper.core.context.util.StatementAgentInstanceUtil;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.core.service.StreamJoinAnalysisResult;
import com.espertech.esper.core.start.EPStatementStartMethodHelperPrevious;
import com.espertech.esper.core.start.EPStatementStartMethodHelperPrior;
import com.espertech.esper.core.start.EPStatementStartMethodHelperSubselect;
import com.espertech.esper.core.start.EPStatementStartMethodHelperUtil;
import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.core.ResultSetProcessor;
import com.espertech.esper.epl.core.ResultSetProcessorFactoryDesc;
import com.espertech.esper.epl.core.StreamTypeService;
import com.espertech.esper.epl.core.ViewResourceDelegateVerified;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.epl.join.base.*;
import com.espertech.esper.epl.named.NamedWindowConsumerView;
import com.espertech.esper.epl.named.NamedWindowProcessor;
import com.espertech.esper.epl.named.NamedWindowProcessorInstance;
import com.espertech.esper.epl.named.NamedWindowTailViewInstance;
import com.espertech.esper.epl.spec.NamedWindowConsumerStreamSpec;
import com.espertech.esper.epl.spec.StatementSpecCompiled;
import com.espertech.esper.epl.spec.StreamSpecCompiled;
import com.espertech.esper.epl.view.FilterExprView;
import com.espertech.esper.epl.view.OutputProcessViewBase;
import com.espertech.esper.epl.view.OutputProcessViewFactory;
import com.espertech.esper.util.StopCallback;
import com.espertech.esper.view.ViewFactory;
import com.espertech.esper.view.ViewFactoryChain;
import com.espertech.esper.view.Viewable;
import com.espertech.esper.view.internal.BufferView;
import com.espertech.esper.view.internal.PriorEventViewFactory;
import com.espertech.esper.view.internal.SingleStreamDispatchView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StatementAgentInstanceFactorySelect implements StatementAgentInstanceFactory {

    private static final Log log = LogFactory.getLog(StatementAgentInstanceFactorySelect.class);

    private final int numStreams;
    private final ViewableActivator[] eventStreamParentViewableActivators;
    private final StatementContext statementContext;
    private final StatementSpecCompiled statementSpec;
    private final EPServicesContext services;
    private final StreamTypeService typeService;
    private final ViewFactoryChain[] unmaterializedViewChain;
    private final ResultSetProcessorFactoryDesc resultSetProcessorFactoryDesc;
    private final StreamJoinAnalysisResult joinAnalysisResult;
    private final boolean isRecoveringResilient;
    private final JoinSetComposerPrototype joinSetComposerPrototype;
    private final SubSelectStrategyCollection subSelectStrategyCollection;
    private final ViewResourceDelegateVerified viewResourceDelegate;
    private final OutputProcessViewFactory outputProcessViewFactory;

    public StatementAgentInstanceFactorySelect(int numStreams, ViewableActivator[] eventStreamParentViewableActivators, StatementContext statementContext, StatementSpecCompiled statementSpec, EPServicesContext services, StreamTypeService typeService, ViewFactoryChain[] unmaterializedViewChain, ResultSetProcessorFactoryDesc resultSetProcessorFactoryDesc, StreamJoinAnalysisResult joinAnalysisResult, boolean recoveringResilient, JoinSetComposerPrototype joinSetComposerPrototype, SubSelectStrategyCollection subSelectStrategyCollection, ViewResourceDelegateVerified viewResourceDelegate, OutputProcessViewFactory outputProcessViewFactory) {
        this.numStreams = numStreams;
        this.eventStreamParentViewableActivators = eventStreamParentViewableActivators;
        this.statementContext = statementContext;
        this.statementSpec = statementSpec;
        this.services = services;
        this.typeService = typeService;
        this.unmaterializedViewChain = unmaterializedViewChain;
        this.resultSetProcessorFactoryDesc = resultSetProcessorFactoryDesc;
        this.joinAnalysisResult = joinAnalysisResult;
        isRecoveringResilient = recoveringResilient;
        this.joinSetComposerPrototype = joinSetComposerPrototype;
        this.subSelectStrategyCollection = subSelectStrategyCollection;
        this.viewResourceDelegate = viewResourceDelegate;
        this.outputProcessViewFactory = outputProcessViewFactory;
    }

    public StatementAgentInstanceFactorySelectResult newContext(final AgentInstanceContext agentInstanceContext)
    {
        // register agent instance resources for use in HA
        if (services.getSchedulableAgentInstanceDirectory() != null) {
            services.getSchedulableAgentInstanceDirectory().add(agentInstanceContext.getEpStatementAgentInstanceHandle());
        }

        final List<StopCallback> stopCallbacks = new ArrayList<StopCallback>();
        StopCallback stopCallback = new StopCallback() {
            public void stop() {
                StatementAgentInstanceUtil.stopSafe(agentInstanceContext.getTerminationCallbacks(), stopCallbacks, statementContext);
            }
        };

        Viewable finalView;
        ViewableActivationResult[] viewableActivationResult = new ViewableActivationResult[eventStreamParentViewableActivators.length];
        Map<ExprSubselectNode, SubSelectStrategyHolder> subselectStrategies;
        AggregationService aggregationService;
        Viewable[] streamViews;
        Map<ExprPriorNode, ExprPriorEvalStrategy> priorNodeStrategies;
        Map<ExprPreviousNode, ExprPreviousEvalStrategy> previousNodeStrategies;

        try {
            // create root viewables
            Viewable[] eventStreamParentViewable = new Viewable[numStreams];
            for (int stream = 0; stream < eventStreamParentViewableActivators.length; stream++) {
                ViewableActivationResult activationResult = eventStreamParentViewableActivators[stream].activate(agentInstanceContext);
                viewableActivationResult[stream] = activationResult;
                stopCallbacks.add(activationResult.getStopCallback());

                eventStreamParentViewable[stream] = activationResult.getViewable();

                if (activationResult.getOptionalLock() != null) {
                    agentInstanceContext.getEpStatementAgentInstanceHandle().setStatementAgentInstanceLock(activationResult.getOptionalLock());
                    statementContext.setDefaultAgentInstanceLock(activationResult.getOptionalLock());
                }
            }

            // compile view factories adding "prior" as necessary
            List<ViewFactory>[] viewFactoryChains = new List[numStreams];
            for (int i = 0; i < numStreams; i++)
            {
                List<ViewFactory> viewFactoryChain = unmaterializedViewChain[i].getViewFactoryChain();

                // add "prior" view factory
                boolean hasPrior = viewResourceDelegate.getPerStream()[i].getPriorRequests() != null && !viewResourceDelegate.getPerStream()[i].getPriorRequests().isEmpty();
                if (hasPrior) {
                    PriorEventViewFactory priorEventViewFactory = EPStatementStartMethodHelperPrior.getPriorEventViewFactory(agentInstanceContext.getStatementContext(), i, viewFactoryChain.size() + 1, viewFactoryChain.isEmpty());
                    viewFactoryChain = new ArrayList<ViewFactory>(viewFactoryChain);
                    viewFactoryChain.add(priorEventViewFactory);
                }
                viewFactoryChains[i] = viewFactoryChain;
            }

            // create view factory chain context: holds stream-specific services
            AgentInstanceViewFactoryChainContext viewFactoryChainContexts[] = new AgentInstanceViewFactoryChainContext[numStreams];
            for (int i = 0; i < numStreams; i++)
            {
                viewFactoryChainContexts[i] = AgentInstanceViewFactoryChainContext.create(viewFactoryChains[i], agentInstanceContext, viewResourceDelegate.getPerStream()[i]);
            }

            // handle "prior" nodes and their strategies
            priorNodeStrategies = EPStatementStartMethodHelperPrior.compilePriorNodeStrategies(viewResourceDelegate, viewFactoryChainContexts);

            // handle "previous" nodes and their strategies
            previousNodeStrategies = EPStatementStartMethodHelperPrevious.compilePreviousNodeStrategies(viewResourceDelegate, viewFactoryChainContexts);

            // materialize views
            streamViews = new Viewable[numStreams];
            for (int i = 0; i < numStreams; i++) {
                boolean hasPreviousNode = viewResourceDelegate.getPerStream()[i].getPreviousRequests() != null && !viewResourceDelegate.getPerStream()[i].getPreviousRequests().isEmpty();
                streamViews[i] = services.getViewService().createViews(eventStreamParentViewable[i], viewFactoryChains[i], viewFactoryChainContexts[i], hasPreviousNode);
            }

            // start subselects
            subselectStrategies = EPStatementStartMethodHelperSubselect.startSubselects(services, subSelectStrategyCollection, agentInstanceContext, stopCallbacks);

            // obtain result set processor and aggregation services
            Pair<ResultSetProcessor, AggregationService> processorPair = EPStatementStartMethodHelperUtil.startResultSetAndAggregation(resultSetProcessorFactoryDesc, agentInstanceContext);
            ResultSetProcessor resultSetProcessor = processorPair.getFirst();
            aggregationService = processorPair.getSecond();

            // for just 1 event stream without joins, handle the one-table process separatly.
            JoinPreloadMethod joinPreloadMethod = null;
            if (streamViews.length == 1)
            {
                finalView = handleSimpleSelect(streamViews[0], resultSetProcessor, agentInstanceContext);
            }
            else
            {
                Pair<Viewable, JoinPreloadMethod> pair = handleJoin(typeService.getStreamNames(), streamViews, resultSetProcessor,
                        agentInstanceContext, stopCallbacks, joinAnalysisResult);
                finalView = pair.getFirst();
                joinPreloadMethod = pair.getSecond();
            }

            // Replay any named window data, for later consumers of named data windows
            boolean hasNamedWindow = false;
            for (int i = 0; i < statementSpec.getStreamSpecs().size(); i++)
            {
                StreamSpecCompiled streamSpec = statementSpec.getStreamSpecs().get(i);
                if (streamSpec instanceof NamedWindowConsumerStreamSpec)
                {
                    hasNamedWindow = true;
                    NamedWindowConsumerStreamSpec namedSpec = (NamedWindowConsumerStreamSpec) streamSpec;
                    NamedWindowProcessor processor = services.getNamedWindowService().getProcessor(namedSpec.getWindowName());
                    NamedWindowProcessorInstance processorInstance = processor.getProcessorInstance(agentInstanceContext);
                    if (processorInstance != null) {
                        NamedWindowTailViewInstance consumerView = processorInstance.getTailViewInstance();
                        NamedWindowConsumerView view = (NamedWindowConsumerView) viewableActivationResult[i].getViewable();

                        // preload view for stream unless the expiry policy is batch window
                        ArrayList<EventBean> eventsInWindow = new ArrayList<EventBean>();
                        if (!consumerView.getTailView().isParentBatchWindow())
                        {
                            for (EventBean aConsumerView : consumerView)
                            {
                                eventsInWindow.add(aConsumerView);
                            }
                        }
                        if (!eventsInWindow.isEmpty() && !isRecoveringResilient)
                        {
                            EventBean[] newEvents = eventsInWindow.toArray(new EventBean[eventsInWindow.size()]);
                            view.update(newEvents, null);
                            if (joinPreloadMethod != null && !joinPreloadMethod.isPreloading() && agentInstanceContext.getEpStatementAgentInstanceHandle().getOptionalDispatchable() != null) {
                                agentInstanceContext.getEpStatementAgentInstanceHandle().getOptionalDispatchable().execute(agentInstanceContext);
                            }
                        }
                    }
                    else {
                        log.info("Named window access is out-of-context, the named window '" + namedSpec.getWindowName() + "' has been declared for a different context then the current statement, the aggregation and join state will not be initialized for statement expression [" + statementContext.getExpression() + "]");
                    }

                    // in a join, preload indexes, if any
                    if (joinPreloadMethod != null)
                    {
                        joinPreloadMethod.preloadFromBuffer(i);
                    }
                    else
                    {
                        if (agentInstanceContext.getEpStatementAgentInstanceHandle().getOptionalDispatchable() != null) {
                            agentInstanceContext.getEpStatementAgentInstanceHandle().getOptionalDispatchable().execute(agentInstanceContext);
                        }
                    }
                }
            }
            // last, for aggregation we need to send the current join results to the result set processor
            if ((hasNamedWindow) && (joinPreloadMethod != null) && (!isRecoveringResilient) && resultSetProcessorFactoryDesc.getResultSetProcessorFactory().hasAggregation())
            {
                joinPreloadMethod.preloadAggregation(resultSetProcessor);
            }
        }
        catch (RuntimeException ex) {
            StatementAgentInstanceUtil.stopSafe(stopCallback, statementContext);
            throw ex;
        }

        return new StatementAgentInstanceFactorySelectResult(finalView, stopCallback, agentInstanceContext, aggregationService, subselectStrategies, priorNodeStrategies, previousNodeStrategies);
    }

    private Viewable handleSimpleSelect(Viewable view,
                                        ResultSetProcessor resultSetProcessor,
                                        AgentInstanceContext agentInstanceContext)
    {
        Viewable finalView = view;

        // Add filter view that evaluates the filter expression
        if (statementSpec.getFilterRootNode() != null)
        {
            FilterExprView filterView = new FilterExprView(statementSpec.getFilterRootNode().getExprEvaluator(), agentInstanceContext);
            finalView.addView(filterView);
            finalView = filterView;
        }

        // for ordered deliver without output limit/buffer
        if (!statementSpec.getOrderByList().isEmpty() && (statementSpec.getOutputLimitSpec() == null)) {
            SingleStreamDispatchView bf = new SingleStreamDispatchView();
            agentInstanceContext.getEpStatementAgentInstanceHandle().setOptionalDispatchable(bf);
            finalView.addView(bf);
            finalView = bf;
        }

        com.espertech.esper.view.View selectView = outputProcessViewFactory.makeView(resultSetProcessor, agentInstanceContext);

        finalView.addView(selectView);
        finalView = selectView;

        return finalView;
    }

    private Pair<Viewable, JoinPreloadMethod> handleJoin(String[] streamNames,
                                                         Viewable[] streamViews,
                                                         ResultSetProcessor resultSetProcessor,
                                                         AgentInstanceContext agentInstanceContext,
                                                         List<StopCallback> stopCallbacks,
                                                         StreamJoinAnalysisResult joinAnalysisResult)
    {
        final JoinSetComposerDesc joinSetComposerDesc = joinSetComposerPrototype.create(streamViews);

        stopCallbacks.add(new StopCallback(){
            public void stop()
            {
                joinSetComposerDesc.getJoinSetComposer().destroy();
            }
        });

        JoinSetFilter filter = new JoinSetFilter(joinSetComposerDesc.getPostJoinFilterEvaluator());
        OutputProcessViewBase indicatorView = outputProcessViewFactory.makeView(resultSetProcessor, agentInstanceContext);

        // Create strategy for join execution
        JoinExecutionStrategy execution = new JoinExecutionStrategyImpl(joinSetComposerDesc.getJoinSetComposer(), filter, indicatorView, agentInstanceContext);

        // The view needs a reference to the join execution to pull iterator values
        indicatorView.setJoinExecutionStrategy(execution);

        // Hook up dispatchable with buffer and execution strategy
        JoinExecStrategyDispatchable joinStatementDispatch = new JoinExecStrategyDispatchable(execution, statementSpec.getStreamSpecs().size());
        agentInstanceContext.getEpStatementAgentInstanceHandle().setOptionalDispatchable(joinStatementDispatch);

        JoinPreloadMethod preloadMethod;
        if (joinAnalysisResult.getUnidirectionalStreamNumber() >= 0)
        {
            preloadMethod = new JoinPreloadMethodNull();
        }
        else
        {
            preloadMethod = new JoinPreloadMethodImpl(streamNames.length, joinSetComposerDesc.getJoinSetComposer());
        }

        // Create buffer for each view. Point buffer to dispatchable for join.
        for (int i = 0; i < statementSpec.getStreamSpecs().size(); i++)
        {
            BufferView buffer = new BufferView(i);
            streamViews[i].addView(buffer);
            buffer.setObserver(joinStatementDispatch);
            preloadMethod.setBuffer(buffer, i);
        }

        return new Pair<Viewable, JoinPreloadMethod>(indicatorView, preloadMethod);
    }
}
