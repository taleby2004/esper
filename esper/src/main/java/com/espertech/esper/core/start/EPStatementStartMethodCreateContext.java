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
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.core.StreamTypeServiceImpl;
import com.espertech.esper.epl.expression.ExprValidationContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.*;
import com.espertech.esper.event.EventTypeMetadata;
import com.espertech.esper.event.map.MapEventType;
import com.espertech.esper.pattern.EvalFactoryNode;
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
        if (context.getContextDetail() instanceof ContextDetailPartitioned) {
            ContextDetailPartitioned segmented = (ContextDetailPartitioned) context.getContextDetail();
            for (ContextDetailPartitionItem partition : segmented.getItems()) {
                FilterStreamSpecRaw raw = new FilterStreamSpecRaw(partition.getFilterSpecRaw(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled result = (FilterStreamSpecCompiled) raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                partition.setFilterSpecCompiled(result.getFilterSpec());
            }
            services.getStatementEventTypeRefService().addReferences(statementContext.getStatementName(), eventTypesReferenced);
        }
        else if (context.getContextDetail() instanceof ContextDetailCategory) {

            // compile filter
            ContextDetailCategory category = (ContextDetailCategory) context.getContextDetail();
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
        else if (context.getContextDetail() instanceof ContextDetailInitiatedTerminated) {
            ContextDetailInitiatedTerminated overlap = (ContextDetailInitiatedTerminated) context.getContextDetail();

            if (overlap.getInitiatedPattern() != null) {
                PatternStreamSpecRaw raw = new PatternStreamSpecRaw(overlap.getInitiatedPattern(), Collections.<EvalFactoryNode, String>emptyMap(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                PatternStreamSpecCompiled compiled = raw.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                overlap.setInitiatedPatternCompiled(compiled);
            }
            else {
                FilterStreamSpecRaw rawExpr = new FilterStreamSpecRaw(overlap.getInitiatedFilter(), Collections.<ViewSpec>emptyList(), null, new StreamSpecOptions());
                FilterStreamSpecCompiled compiled = (FilterStreamSpecCompiled) rawExpr.compile(statementContext, eventTypesReferenced, false, Collections.<Integer>emptyList());
                overlap.setInitiatedFilterCompiled(compiled.getFilterSpec());
            }

            ExprValidationContext validationContext = new ExprValidationContext(new StreamTypeServiceImpl(services.getEngineURI(), false), statementContext.getMethodResolutionService(), null, statementContext.getSchedulingService(), statementContext.getVariableService(), getDefaultAgentInstanceContext(), statementContext.getEventAdapterService(), statementContext.getStatementName(), statementContext.getStatementId(), statementContext.getAnnotations(), statementContext.getContextDescriptor());
            overlap.getTerminatedTimePeriod().validate(validationContext);
        }

        // add context - does not activate that context
        services.getContextManagementService().addContextSpec(services, agentInstanceContext, context);

        // define output event type
        String typeName = "EventType_Context_" + context.getContextName();
        EventType resultType = new MapEventType(EventTypeMetadata.createAnonymous(typeName), typeName, -1, null, Collections.<String, Object>emptyMap(), null, null, null);

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
}
