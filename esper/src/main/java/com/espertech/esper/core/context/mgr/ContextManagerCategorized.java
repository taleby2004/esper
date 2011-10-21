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
import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.core.context.util.ContextIteratorHandler;
import com.espertech.esper.core.context.util.StatementAgentInstanceUtil;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ContextDetailCategory;
import com.espertech.esper.epl.spec.ContextDetailCategoryItem;
import com.espertech.esper.epl.spec.ContextDetailPartitionItem;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzer;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzerResult;
import com.espertech.esper.event.EventTypeUtility;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterValueSetParam;
import com.espertech.esper.util.CollectionUtil;

import java.util.*;

public class ContextManagerCategorized implements ContextManager, ContextIteratorHandler {

    private final static ContextPropertyRegistryImpl CONTEXT_PROPERTY_REGISTRY = new ContextPropertyRegistryImpl(Collections.<ContextDetailPartitionItem>emptyList(), ContextPropertyEventType.TYPE_CATEGORY_PROPS);

    private final String contextName;
    private final EPServicesContext servicesContext;
    private final ContextDetailCategory categorySpec;

    private final ContextDescriptor contextDescriptor;
    private final Map<ContextDetailCategoryItem, Integer> instances = new LinkedHashMap<ContextDetailCategoryItem, Integer>();
    private final Map<String, ContextManagerPartitionedStatementDesc> statements = new LinkedHashMap<String, ContextManagerPartitionedStatementDesc>(); // retain order of statement creation

    public ContextManagerCategorized(String contextName, EPServicesContext servicesContext, ContextDetailCategory categorySpec)
        throws ExprValidationException {
        this.contextName = contextName;
        this.servicesContext = servicesContext;
        this.categorySpec = categorySpec;

        validateContextDesc(categorySpec);

        StatementAIResourceRegistryFactory resourceRegistryFactory = new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationMultiPerm(), new AIRegistryExprMultiPerm());
            }
        };
        contextDescriptor = new ContextDescriptor(contextName, false, CONTEXT_PROPERTY_REGISTRY, resourceRegistryFactory, this);

        // create empty categories
        int agentInstanceId = 0;
        for (ContextDetailCategoryItem item : categorySpec.getItems()) {
            instances.put(item, agentInstanceId);
            agentInstanceId++;
        }
    }

    public ContextDescriptor getContextDescriptor() {
        return contextDescriptor;
    }

    public synchronized void safeDestroy() {
    }

    public synchronized void addStatement(ContextManagedStatementBase statement) throws ExprValidationException {

        // validation
        StatementSpecCompiledAnalyzerResult streamAnalysis = StatementSpecCompiledAnalyzer.analyzeFilters(statement.getStatementSpec());
        validateStatementForContext(statement, streamAnalysis);

        ContextManagerPartitionedStatementDesc desc = new ContextManagerPartitionedStatementDesc(statement, streamAnalysis.getFilters());
        statements.put(statement.getStatementContext().getStatementId(), desc);

        // retro-actively create contexts for that statement
        for (Map.Entry<ContextDetailCategoryItem, Integer> entry : instances.entrySet()) {
            ContextDetailCategoryItem category = entry.getKey();
            Integer agentInstanceId = entry.getValue();

            StatementAgentInstanceFactoryResult result = startContextStatement(contextName, servicesContext, category, desc, agentInstanceId, categorySpec);
            AgentInstance agentInstance = new AgentInstance(result.getStopCallback(), result.getAgentInstanceContext(), result.getFinalView());
            desc.getInstances().add(agentInstance);
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

    public synchronized Iterator<EventBean> iterator(String statementId) {
        ContextManagerPartitionedStatementDesc stmtDesc = statements.get(statementId);
        if (stmtDesc == null) {
            return CollectionUtil.NULL_EVENT_ITERATOR;
        }
        AgentInstance[] instances = stmtDesc.getInstances().toArray(new AgentInstance[stmtDesc.getInstances().size()]);
        return new AgentInstanceArrayIterator(instances);
    }

    public synchronized SafeIterator<EventBean> safeIterator(String statementId) {
        ContextManagerPartitionedStatementDesc stmtDesc = statements.get(statementId);
        if (stmtDesc == null) {
            return SafeIteratorNull.NULL_EVENT_ITER;
        }
        AgentInstance[] instances = stmtDesc.getInstances().toArray(new AgentInstance[stmtDesc.getInstances().size()]);
        return new AgentInstanceArraySafeIterator(instances);
    }

    private void removeStatement(String statementId) {
        ContextManagerPartitionedStatementDesc statementDesc = statements.get(statementId);
        if (statementDesc == null) {
            return;
        }

        for (AgentInstance instance : statementDesc.getInstances()) {
            StatementAgentInstanceUtil.stop(instance.getStopCallback(), instance.getAgentInstanceContext(), instance.getFinalView());
        }
        statements.remove(statementId);
    }

    private void validateStatementForContext(ContextManagedStatementBase statement, StatementSpecCompiledAnalyzerResult streamAnalysis)
        throws ExprValidationException
    {
        List<FilterSpecCompiled> filters = streamAnalysis.getFilters();

        boolean isCreateWindow = statement.getStatementSpec().getCreateWindowDesc() != null;
        String message = "Category context requires that any of the events types that are listed in the category context also appear in any of the filter expressions of the statement";

        // if no create-window: at least one of the filters must match one of the filters specified by the context
        if (!isCreateWindow) {
            for (FilterSpecCompiled filter : filters) {
                EventType stmtFilterType = filter.getFilterForEventType();
                EventType contextType = categorySpec.getFilterSpecCompiled().getFilterForEventType();
                if (stmtFilterType == contextType) {
                    return;
                }
                if (EventTypeUtility.isTypeOrSubTypeOf(stmtFilterType, contextType)) {
                    return;
                }
            }

            if (!filters.isEmpty()) {
                throw new ExprValidationException(message);
            }
            return;
        }

        // validate create-window
        String declaredAsName = statement.getStatementSpec().getCreateWindowDesc().getAsEventTypeName();
        if (declaredAsName != null) {
            if (categorySpec.getFilterSpecCompiled().getFilterForEventType().getName().equals(declaredAsName)) {
                return;
            }
            throw new ExprValidationException(message);
        }
    }

    private static StatementAgentInstanceFactoryResult startContextStatement(String contextName, EPServicesContext servicesContext, ContextDetailCategoryItem category, ContextManagerPartitionedStatementDesc statementDesc, int agentInstanceId, ContextDetailCategory categorySpec) {

        // determine filter addendum
        AgentInstanceFilterProxyImpl filterProxy = getAddendumFilters(category, categorySpec, statementDesc);

        EventBean context = ContextPropertyEventType.getCategorizedBean(contextName, agentInstanceId, category.getName());

        // instantiate context
        return StatementAgentInstanceUtil.start(servicesContext, statementDesc.getStatement(), false, agentInstanceId, context, filterProxy);
    }

    // Compare filters in statement with filters in segmented context, addendum filter compilation
    private static AgentInstanceFilterProxyImpl getAddendumFilters(ContextDetailCategoryItem category,
                                                                   ContextDetailCategory categorySpec,
                                                                   ContextManagerPartitionedStatementDesc statementDesc) {

        IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>> addendums = new IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>>();

        // determine whether create-named-window
        boolean isCreateWindow = statementDesc.getStatement().getStatementSpec().getCreateWindowDesc() != null;
        if (!isCreateWindow) {
            for (FilterSpecCompiled filtersSpec : statementDesc.getFiltersSpecs()) {

                boolean typeOrSubtype = EventTypeUtility.isTypeOrSubTypeOf(filtersSpec.getFilterForEventType(), categorySpec.getFilterSpecCompiled().getFilterForEventType());
                if (!typeOrSubtype) {
                    continue;   // does not apply
                }

                List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>();
                addendumFilters.addAll(category.getCompiledFilterParam());
                addendumFilters.addAll(categorySpec.getFilterParamsCompiled());
                addendums.put(filtersSpec, addendumFilters);
            }
        }
        // handle segmented context for create-window
        else {
            String declaredAsName = statementDesc.getStatement().getStatementSpec().getCreateWindowDesc().getAsEventTypeName();
            if (declaredAsName != null) {
                for (FilterSpecCompiled filtersSpec : statementDesc.getFiltersSpecs()) {

                    List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>();
                    addendumFilters.addAll(category.getCompiledFilterParam());
                    addendumFilters.addAll(categorySpec.getFilterParamsCompiled());
                    addendums.put(filtersSpec, addendumFilters);
                }
            }
        }

        return new AgentInstanceFilterProxyImpl(addendums);
    }

    private void validateContextDesc(ContextDetailCategory categorySpec) throws ExprValidationException {

        if (categorySpec.getItems().isEmpty()) {
            throw new ExprValidationException("Empty list of partition items");
        }
    }
}
