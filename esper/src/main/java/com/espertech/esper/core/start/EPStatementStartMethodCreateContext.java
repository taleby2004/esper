/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.client.EventType;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.core.StreamTypeServiceImpl;
import com.espertech.esper.epl.expression.ExprNodeUtility;
import com.espertech.esper.epl.expression.ExprValidationContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.*;
import com.espertech.esper.pattern.EvalFactoryNode;
import com.espertech.esper.schedule.ScheduleSpec;
import com.espertech.esper.view.ViewProcessingException;
import com.espertech.esper.view.ZeroDepthStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Starts and provides the stop method for EPL statements.
 */
public class EPStatementStartMethodCreateContext extends EPStatementStartMethodBase
{
    private static final Log log = LogFactory.getLog(EPStatementStartMethodCreateContext.class);

    public EPStatementStartMethodCreateContext(StatementSpecCompiled statementSpec, EPServicesContext services, StatementContext statementContext) {
        super(statementSpec, services, statementContext);
    }

    public EPStatementStartResult startInternal(boolean isNewStatement, boolean isRecoveringStatement, boolean isRecoveringResilient) throws ExprValidationException, ViewProcessingException {
        final CreateContextDesc context = statementSpec.getContextDesc();
        final AgentInstanceContext agentInstanceContext = getDefaultAgentInstanceContext();

        // compile filter specs, if any
        Set<String> eventTypesReferenced = new HashSet<String>();
        validateContextDetail(eventTypesReferenced, context.getContextDetail());
        services.getStatementEventTypeRefService().addReferences(statementContext.getStatementName(), eventTypesReferenced);

        // add context - does not activate that context
        services.getContextManagementService().addContextSpec(services, agentInstanceContext, context);

        // define output event type
        String typeName = "EventType_Context_" + context.getContextName();
        EventType resultType = services.getEventAdapterService().createAnonymousMapType(typeName, Collections.<String, Object>emptyMap());

        EPStatementStopMethod stopMethod = new EPStatementStopMethod() {
            public void stop() {
                // no action
            }
        };

        EPStatementDestroyMethod destroyMethod = new EPStatementDestroyMethod() {
            public void destroy() {
                services.getContextManagementService().destroyedContext(context.getContextName());
            }
        };
        return new EPStatementStartResult(new ZeroDepthStream(resultType), stopMethod, destroyMethod);
    }

    private void validateContextDetail(Set<String> eventTypesReferenced, ContextDetail contextDetail) throws ExprValidationException {
        if (contextDetail instanceof ContextDetailPartitioned) {
            ContextDetailPartitioned segmented = (ContextDetailPartitioned) contextDetail;
            for (ContextDetailPartitionItem partition : segmented.getItems()) {
                FilterStreamSpecRaw raw = new FilterStreamSpecRaw(partition.getFilterSpecRaw(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled result = (FilterStreamSpecCompiled) raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                partition.setFilterSpecCompiled(result.getFilterSpec());
            }
        }
        else if (contextDetail instanceof ContextDetailCategory) {

            // compile filter
            ContextDetailCategory category = (ContextDetailCategory) contextDetail;
            FilterStreamSpecRaw raw = new FilterStreamSpecRaw(category.getFilterSpecRaw(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
            FilterStreamSpecCompiled result = (FilterStreamSpecCompiled) raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
            category.setFilterSpecCompiled(result.getFilterSpec());
            services.getStatementEventTypeRefService().addReferences(statementContext.getStatementName(), eventTypesReferenced);

            // compile expressions
            for (ContextDetailCategoryItem item : category.getItems()) {
                FilterSpecRaw filterSpecRaw = new FilterSpecRaw(category.getFilterSpecRaw().getEventTypeName(), Collections.singletonList(item.getExpression()), null);
                FilterStreamSpecRaw rawExpr = new FilterStreamSpecRaw(filterSpecRaw, Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled compiled = (FilterStreamSpecCompiled) rawExpr.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                item.setCompiledFilter(compiled.getFilterSpec());
            }
        }
        else if (contextDetail instanceof ContextDetailHash) {
            ContextDetailHash hashed = (ContextDetailHash) contextDetail;
            for (ContextDetailHashItem hashItem : hashed.getItems()) {
                FilterStreamSpecRaw raw = new FilterStreamSpecRaw(hashItem.getFilterSpecRaw(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled result = (FilterStreamSpecCompiled) raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                hashItem.setFilterSpecCompiled(result.getFilterSpec());

                // validate parameters
                StreamTypeServiceImpl streamTypes = new StreamTypeServiceImpl(result.getFilterSpec().getFilterForEventType(), null, true, statementContext.getEngineURI());
                ExprValidationContext validationContext = new ExprValidationContext(streamTypes, statementContext.getMethodResolutionService(), null, statementContext.getSchedulingService(), statementContext.getVariableService(), getDefaultAgentInstanceContext(), statementContext.getEventAdapterService(), statementContext.getStatementName(), statementContext.getStatementId(), statementContext.getAnnotations(), statementContext.getContextDescriptor());
                ExprNodeUtility.validate(Collections.singletonList(hashItem.getFunction()), validationContext);
            }
        }
        else if (contextDetail instanceof ContextDetailInitiatedTerminated) {
            ContextDetailInitiatedTerminated fixed = (ContextDetailInitiatedTerminated) contextDetail;
            ContextDetailMatchPair startCondition = validateRewriteContextCondition(fixed.getStart(), eventTypesReferenced, new MatchEventSpec());
            ContextDetailMatchPair endCondition = validateRewriteContextCondition(fixed.getEnd(), eventTypesReferenced, startCondition.getMatches());
            fixed.setStart(startCondition.getCondition());
            fixed.setEnd(endCondition.getCondition());
        }
        else if (contextDetail instanceof ContextDetailInitiatedTerminated) {
            ContextDetailInitiatedTerminated overlap = (ContextDetailInitiatedTerminated) contextDetail;
            ContextDetailMatchPair startCondition = validateRewriteContextCondition(overlap.getStart(), eventTypesReferenced, new MatchEventSpec());
            ContextDetailMatchPair endCondition = validateRewriteContextCondition(overlap.getEnd(), eventTypesReferenced, startCondition.getMatches());
            overlap.setStart(startCondition.getCondition());
            overlap.setEnd(endCondition.getCondition());
        }
        else if (contextDetail instanceof ContextDetailNested) {
            ContextDetailNested nested = (ContextDetailNested) contextDetail;
            for (CreateContextDesc nestedContext : nested.getContexts()) {
                validateContextDetail(eventTypesReferenced, nestedContext.getContextDetail());
            }
        }
        else {
            throw new IllegalStateException("Unrecognized context detail " + contextDetail);
        }
    }

    private ContextDetailMatchPair validateRewriteContextCondition(ContextDetailCondition endpoint, Set<String> eventTypesReferenced, MatchEventSpec priorMatches) throws ExprValidationException {
        if (endpoint instanceof ContextDetailConditionCrontab) {
            ContextDetailConditionCrontab crontab = (ContextDetailConditionCrontab) endpoint;
            ScheduleSpec schedule = ExprNodeUtility.toCrontabSchedule(crontab.getCrontab(), statementContext);
            crontab.setSchedule(schedule);
            return new ContextDetailMatchPair(crontab, new MatchEventSpec());
        }

        if (endpoint instanceof ContextDetailConditionTimePeriod) {
            ContextDetailConditionTimePeriod timePeriod = (ContextDetailConditionTimePeriod) endpoint;
            ExprValidationContext validationContext = new ExprValidationContext(new StreamTypeServiceImpl(services.getEngineURI(), false), statementContext.getMethodResolutionService(), null, statementContext.getSchedulingService(), statementContext.getVariableService(), getDefaultAgentInstanceContext(), statementContext.getEventAdapterService(), statementContext.getStatementName(), statementContext.getStatementId(), statementContext.getAnnotations(), statementContext.getContextDescriptor());
            timePeriod.getTimePeriod().validate(validationContext);
            return new ContextDetailMatchPair(timePeriod, new MatchEventSpec());
        }

        if (endpoint instanceof ContextDetailConditionPattern) {
            ContextDetailConditionPattern pattern = (ContextDetailConditionPattern) endpoint;
            MatchEventSpec matches = validatePatternContextConditionPattern(pattern, eventTypesReferenced, priorMatches);
            return new ContextDetailMatchPair(pattern, matches);
        }

        if (endpoint instanceof ContextDetailConditionFilter) {
            ContextDetailConditionFilter filter = (ContextDetailConditionFilter) endpoint;

            // compile as filter if there are no prior match to consider
            if (priorMatches == null || (priorMatches.getArrayEventTypes().isEmpty() && priorMatches.getTaggedEventTypes().isEmpty())) {
                FilterStreamSpecRaw rawExpr = new FilterStreamSpecRaw(filter.getFilterSpecRaw(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled compiled = (FilterStreamSpecCompiled) rawExpr.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                filter.setFilterSpecCompiled(compiled.getFilterSpec());
                MatchEventSpec matchEventSpec = new MatchEventSpec();
                EventType filterForType = compiled.getFilterSpec().getFilterForEventType();
                if (filter.getOptionalFilterAsName() != null) {
                    matchEventSpec.getTaggedEventTypes().put(filter.getOptionalFilterAsName(), new Pair<EventType, String>(filterForType, rawExpr.getRawFilterSpec().getEventTypeName()));
                }
                return new ContextDetailMatchPair(filter, matchEventSpec);
            }

            // compile as pattern if there are prior matches to consider, since this is a type of followed-by relationship
            EvalFactoryNode factoryNode = services.getPatternNodeFactory().makeFilterNode(filter.getFilterSpecRaw(), filter.getOptionalFilterAsName(), 0);
            ContextDetailConditionPattern pattern = new ContextDetailConditionPattern(factoryNode, true);
            MatchEventSpec matches = validatePatternContextConditionPattern(pattern, eventTypesReferenced, priorMatches);
            return new ContextDetailMatchPair(pattern, matches);
        }
        else {
            throw new IllegalStateException("Unrecognized endpoint type " + endpoint);
        }
    }

    private MatchEventSpec validatePatternContextConditionPattern(ContextDetailConditionPattern pattern, Set<String> eventTypesReferenced, MatchEventSpec priorMatches)
        throws ExprValidationException {
        PatternStreamSpecRaw raw = new PatternStreamSpecRaw(pattern.getPatternRaw(), Collections.<EvalFactoryNode, String>emptyMap(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
        PatternStreamSpecCompiled compiled = raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList(), priorMatches);
        pattern.setPatternCompiled(compiled);
        return new MatchEventSpec(compiled.getTaggedEventTypes(), compiled.getArrayEventTypes());
    }

    private static class ContextDetailMatchPair {
        private final ContextDetailCondition condition;
        private final MatchEventSpec matches;

        private ContextDetailMatchPair(ContextDetailCondition condition, MatchEventSpec matches) {
            this.condition = condition;
            this.matches = matches;
        }

        public ContextDetailCondition getCondition() {
            return condition;
        }

        public MatchEventSpec getMatches() {
            return matches;
        }
    }
}