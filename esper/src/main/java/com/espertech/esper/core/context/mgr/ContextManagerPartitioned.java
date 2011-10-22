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
import com.espertech.esper.client.EventPropertyGetter;
import com.espertech.esper.client.EventType;
import com.espertech.esper.client.SafeIterator;
import com.espertech.esper.collection.MultiKeyUntyped;
import com.espertech.esper.collection.SafeIteratorNull;
import com.espertech.esper.core.context.factory.StatementAgentInstanceFactoryResult;
import com.espertech.esper.core.context.stmt.AIRegistryAggregationMultiPerm;
import com.espertech.esper.core.context.stmt.AIRegistryExprMultiPerm;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistry;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.core.context.util.ContextIteratorHandler;
import com.espertech.esper.core.context.util.StatementAgentInstanceUtil;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ContextDetailPartitionItem;
import com.espertech.esper.epl.spec.ContextDetailPartitioned;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzer;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzerResult;
import com.espertech.esper.event.EventTypeUtility;
import com.espertech.esper.filter.FilterOperator;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterValueSetParam;
import com.espertech.esper.filter.FilterValueSetParamImpl;
import com.espertech.esper.util.CollectionUtil;
import com.espertech.esper.util.JavaClassHelper;

import java.util.*;

public class ContextManagerPartitioned implements ContextManager, ContextManagerPartitionedInstanceCreateCallback, ContextIteratorHandler {

    private final String contextName;
    private final EPServicesContext servicesContext;
    private final ContextDetailPartitioned segmentedSpec;
    private final AgentInstanceContext agentInstanceContextCreateContext;
    private final ContextStateService stateService;
    private final ContextStateServiceBinding stateServiceBinding;

    private final ContextDescriptor contextDescriptor;
    private final Map<Object, Integer> partitionKeys = new LinkedHashMap<Object, Integer>();
    private final Map<String, ContextManagerPartitionedStatementDesc> statements = new LinkedHashMap<String, ContextManagerPartitionedStatementDesc>(); // retain order of statement creation
    private final List<ContextManagerPartitionedFilterCallback> filterCallbacks = new ArrayList<ContextManagerPartitionedFilterCallback>();

    private int numInstances;

    public ContextManagerPartitioned(String contextName, EPServicesContext servicesContext, ContextDetailPartitioned segmentedSpec, AgentInstanceContext agentInstanceContextCreateContext, ContextStateService stateService)
        throws ExprValidationException {
        this.contextName = contextName;
        this.servicesContext = servicesContext;
        this.segmentedSpec = segmentedSpec;
        this.agentInstanceContextCreateContext = agentInstanceContextCreateContext;
        this.stateService = stateService;

        // validate
        Class[] propertyTypes = validateContextDesc(segmentedSpec);

        StatementAIResourceRegistryFactory resourceRegistryFactory = new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationMultiPerm(), new AIRegistryExprMultiPerm());
            }
        };

        EventType contextPropsType = ContextPropertyEventType.getPartitionType(contextName, segmentedSpec, propertyTypes, servicesContext.getEventAdapterService());
        ContextPropertyRegistryImpl registry = new ContextPropertyRegistryImpl(segmentedSpec.getItems(), contextPropsType);
        contextDescriptor = new ContextDescriptor(contextName, false, registry, resourceRegistryFactory, this);
        stateServiceBinding = stateService.getBinding(propertyTypes);

        // restart
        int lastInstanceId = -1;
        List<ContextState> contextStates = stateService.getContexts(contextName, stateServiceBinding, servicesContext.getEventAdapterService());
        for (ContextState state : contextStates) {
            int instanceId = state.getAgentInstanceId();
            if (lastInstanceId < instanceId) {
                lastInstanceId = instanceId;
            }
            partitionKeys.put(state.getAdditionalInfo(), instanceId);
        }
        numInstances = lastInstanceId;
    }

    public ContextDescriptor getContextDescriptor() {
        return contextDescriptor;
    }

    public synchronized void safeDestroy() {
        deactivate();
    }

    public synchronized void addStatement(ContextManagedStatementBase statement) throws ExprValidationException {

        // validation
        StatementSpecCompiledAnalyzerResult streamAnalysis = StatementSpecCompiledAnalyzer.analyzeFilters(statement.getStatementSpec());
        validateStatementForContext(statement, streamAnalysis);

        if (statements.isEmpty()) {
            activate();
        }

        ContextManagerPartitionedStatementDesc desc = new ContextManagerPartitionedStatementDesc(statement, streamAnalysis.getFilters());
        statements.put(statement.getStatementContext().getStatementId(), desc);

        // retro-actively create contexts for that statement
        for (Map.Entry<Object, Integer> entry : partitionKeys.entrySet()) {
            Object key = entry.getKey();
            Integer agentInstanceId = entry.getValue();

            StatementAgentInstanceFactoryResult result = startContextStatement(contextDescriptor.getContextPropertyRegistry().getContextEventType(), contextName, servicesContext, key, desc, agentInstanceId, segmentedSpec);

            AgentInstance instance = new AgentInstance(result.getStopCallback(), result.getAgentInstanceContext(), result.getFinalView());
            desc.getInstances().add(instance);
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

    public void create(Object keyValue, EventBean event) {
        Integer agentInstanceId = partitionKeys.get(keyValue);
        if (agentInstanceId != null) {
            return;
        }
        handleNewKey(keyValue, event);
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

    private synchronized void handleNewKey(Object keyValue, EventBean event) {

        // determine agent instance id
        int agentInstanceId = ++numInstances;

        // for all statements
        List<AgentInstance> newInstances = new ArrayList<AgentInstance>();
        for (Map.Entry<String, ContextManagerPartitionedStatementDesc> entry : statements.entrySet()) {
            ContextManagerPartitionedStatementDesc statementDesc = entry.getValue();

            StatementAgentInstanceFactoryResult startResult = startContextStatement(contextDescriptor.getContextPropertyRegistry().getContextEventType(), contextName, servicesContext, keyValue, statementDesc, agentInstanceId, segmentedSpec);

            AgentInstance instance = new AgentInstance(startResult.getStopCallback(), startResult.getAgentInstanceContext(), startResult.getFinalView());
            statementDesc.getInstances().add(instance);
            newInstances.add(instance);
        }

        // save new context state
        stateService.addContext(contextName, agentInstanceId, keyValue, stateServiceBinding);

        // for all new contexts: evaluate this event for this statement
        for (AgentInstance context : newInstances) {
            StatementAgentInstanceUtil.evaluateEventForStatement(servicesContext, agentInstanceContextCreateContext, event, context.getAgentInstanceContext());
        }

        partitionKeys.put(keyValue, agentInstanceId);
    }

    private static StatementAgentInstanceFactoryResult startContextStatement(EventType contextPropsType, String contextName, EPServicesContext servicesContext, Object keyValue, ContextManagerPartitionedStatementDesc statementDesc, int agentInstanceId, ContextDetailPartitioned segmentedSpec) {

        // determine filter addendum
        AgentInstanceFilterProxyImpl filterProxy = getAddendumFilters(keyValue, statementDesc.getFiltersSpecs(), segmentedSpec, statementDesc);

        // Build a array of properties
        List<String> propertyNames = segmentedSpec.getItems().get(0).getPropertyNames();
        Object[] agentInstanceProperties;
        if (propertyNames.size() == 1) {
            agentInstanceProperties = new Object[] {keyValue};
        }
        else {
            agentInstanceProperties = ((MultiKeyUntyped) keyValue).getKeys();
        }

        // Build built-in properties for access
        EventBean builtin = ContextPropertyEventType.getPartitionBean(servicesContext.getEventAdapterService(), contextPropsType, contextName, agentInstanceId, agentInstanceProperties);

        // instantiate context
        return StatementAgentInstanceUtil.start(servicesContext, statementDesc.getStatement(), false, agentInstanceId, builtin, filterProxy);
    }

    // Compare filters in statement with filters in segmented context, addendum filter compilation
    private static AgentInstanceFilterProxyImpl getAddendumFilters(Object keyValue, List<FilterSpecCompiled> filtersSpecs, ContextDetailPartitioned segmentedSpec, ContextManagerPartitionedStatementDesc statementDesc) {

        IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>> addendums = new IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>>();

        // determine whether create-named-window
        boolean isCreateWindow = statementDesc.getStatement().getStatementSpec().getCreateWindowDesc() != null;
        if (!isCreateWindow) {
            for (FilterSpecCompiled filtersSpec : filtersSpecs) {

                ContextDetailPartitionItem foundPartition = null;
                for (ContextDetailPartitionItem partitionItem : segmentedSpec.getItems()) {
                    boolean typeOrSubtype = EventTypeUtility.isTypeOrSubTypeOf(filtersSpec.getFilterForEventType(), partitionItem.getFilterSpecCompiled().getFilterForEventType());
                    if (typeOrSubtype) {
                        foundPartition = partitionItem;
                    }
                }

                if (foundPartition == null) {
                    continue;
                }

                List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>(foundPartition.getPropertyNames().size());
                if (foundPartition.getPropertyNames().size() == 1) {
                    FilterValueSetParam filter = new FilterValueSetParamImpl(foundPartition.getPropertyNames().get(0), FilterOperator.EQUAL, keyValue);
                    addendumFilters.add(filter);
                }
                else {
                    Object[] keys = ((MultiKeyUntyped) keyValue).getKeys();
                    for (int i = 0; i < foundPartition.getPropertyNames().size(); i++) {
                        String partitionPropertyName = foundPartition.getPropertyNames().get(i);
                        FilterValueSetParam filter = new FilterValueSetParamImpl(partitionPropertyName, FilterOperator.EQUAL, keys[i]);
                        addendumFilters.add(filter);
                    }
                }

                // add those predefined filter parameters, if any
                addendumFilters.addAll(foundPartition.getParametersCompiled());

                addendums.put(filtersSpec, addendumFilters);
            }
        }
        // handle segmented context for create-window
        else {
            String declaredAsName = statementDesc.getStatement().getStatementSpec().getCreateWindowDesc().getAsEventTypeName();
            if (declaredAsName != null) {
                for (FilterSpecCompiled filtersSpec : filtersSpecs) {

                    ContextDetailPartitionItem foundPartition = null;
                    for (ContextDetailPartitionItem partitionItem : segmentedSpec.getItems()) {
                        if (partitionItem.getFilterSpecCompiled().getFilterForEventType().getName().equals(declaredAsName)) {
                            foundPartition = partitionItem;
                            break;
                        }
                    }

                    if (foundPartition == null) {
                        continue;
                    }

                    List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>(foundPartition.getPropertyNames().size());
                    for (String partitionPropertyName : foundPartition.getPropertyNames()) {
                        FilterValueSetParam filter = new FilterValueSetParamImpl(partitionPropertyName, FilterOperator.EQUAL, keyValue);
                        addendumFilters.add(filter);
                    }

                    addendums.put(filtersSpec, addendumFilters);
                }
            }
        }

        return new AgentInstanceFilterProxyImpl(addendums);
    }

    private void activate() {
        for (ContextDetailPartitionItem item : segmentedSpec.getItems()) {
            ContextManagerPartitionedFilterCallback callback = new ContextManagerPartitionedFilterCallback(servicesContext, agentInstanceContextCreateContext, item, this);
            filterCallbacks.add(callback);
        }
    }

    private void deactivate() {
        for (ContextManagerPartitionedFilterCallback callback : filterCallbacks) {
            callback.destroy(servicesContext.getFilterService());
        }

        statements.clear();
        partitionKeys.clear();
        filterCallbacks.clear();
    }

    private Class[] validateContextDesc(ContextDetailPartitioned segmentedSpec) throws ExprValidationException {

        if (segmentedSpec.getItems().isEmpty()) {
            throw new ExprValidationException("Empty list of partition items");
        }

        // verify properties exist
        for (ContextDetailPartitionItem item : segmentedSpec.getItems()) {
            EventType type = item.getFilterSpecCompiled().getFilterForEventType();
            for (String property : item.getPropertyNames()) {
                EventPropertyGetter getter = type.getGetter(property);
                if (getter == null) {
                    throw new ExprValidationException("Property name '" + property + "' not found on type " + type.getName());
                }
            }
        }

        // verify property number and types compatible
        ContextDetailPartitionItem firstItem = segmentedSpec.getItems().get(0);
        if (segmentedSpec.getItems().size() > 1) {
        // verify the same filter event type is only listed once

            for (int i = 0; i < segmentedSpec.getItems().size(); i++) {
                EventType compareTo = segmentedSpec.getItems().get(i).getFilterSpecCompiled().getFilterForEventType();

                for (int j = 0; j < segmentedSpec.getItems().size(); j++) {
                    if (i == j) {
                        continue;
                    }

                    EventType compareFrom = segmentedSpec.getItems().get(j).getFilterSpecCompiled().getFilterForEventType();
                    if (compareFrom == compareTo) {
                        throw new ExprValidationException("The event type '" + compareFrom.getName() + "' is listed twice");
                    }
                    if (EventTypeUtility.isTypeOrSubTypeOf(compareFrom, compareTo) || EventTypeUtility.isTypeOrSubTypeOf(compareTo, compareFrom)) {
                        throw new ExprValidationException("The event type '" + compareFrom.getName() + "' is listed twice: Event type '" +
                                compareFrom.getName() + "' is a subtype or supertype of event type '" + compareTo.getName() + "'");
                    }

                }
            }

            // build property type information
            String[] names = new String[firstItem.getPropertyNames().size()];
            Class[] types = new Class[firstItem.getPropertyNames().size()];
            Class[] typesBoxed = new Class[firstItem.getPropertyNames().size()];
            for (int i = 0; i < firstItem.getPropertyNames().size(); i++) {
                String property = firstItem.getPropertyNames().get(i);
                names[i] = property;
                types[i] = firstItem.getFilterSpecCompiled().getFilterForEventType().getPropertyType(property);
                typesBoxed[i] = JavaClassHelper.getBoxedType(types[i]);
            }

            // compare property types and numbers
            for (int item = 1; item < segmentedSpec.getItems().size(); item++) {
                ContextDetailPartitionItem nextItem = segmentedSpec.getItems().get(item);

                // compare number of properties
                if (nextItem.getPropertyNames().size() != types.length) {
                    throw new ExprValidationException("Expected the same number of property names for each event type, found " +
                            types.length + " properties for event type '" + firstItem.getFilterSpecCompiled().getFilterForEventType().getName() +
                            "' and " + nextItem.getPropertyNames().size() + " properties for event type '" + nextItem.getFilterSpecCompiled().getFilterForEventType().getName() + "'");
                }

                // compare property types
                for (int i = 0; i < nextItem.getPropertyNames().size(); i++) {
                    String property = nextItem.getPropertyNames().get(i);
                    Class type = JavaClassHelper.getBoxedType(nextItem.getFilterSpecCompiled().getFilterForEventType().getPropertyType(property));
                    Class typeBoxed = JavaClassHelper.getBoxedType(type);
                    boolean left = JavaClassHelper.isSubclassOrImplementsInterface(typeBoxed, typesBoxed[i]);
                    boolean right = JavaClassHelper.isSubclassOrImplementsInterface(typesBoxed[i], typeBoxed);
                    if (typeBoxed != typesBoxed[i] && !left && !right) {
                        throw new ExprValidationException("Found mismatch of property types, property '" + names[i] +
                                "' of type '" + JavaClassHelper.getClassNameFullyQualPretty(types[i]) +
                                "' compared to property '" + property +
                                "' of type '" + JavaClassHelper.getClassNameFullyQualPretty(typeBoxed) + "'");
                    }
                }
            }
        }

        Class[] propertyTypes = new Class[firstItem.getPropertyNames().size()];
        for (int i = 0; i < firstItem.getPropertyNames().size(); i++) {
            String property = firstItem.getPropertyNames().get(i);
            propertyTypes[i] = firstItem.getFilterSpecCompiled().getFilterForEventType().getPropertyType(property);
        }
        return propertyTypes;
    }

    private void validateStatementForContext(ContextManagedStatementBase statement, StatementSpecCompiledAnalyzerResult streamAnalysis)
        throws ExprValidationException
    {
        List<FilterSpecCompiled> filters = streamAnalysis.getFilters();

        boolean isCreateWindow = statement.getStatementSpec().getCreateWindowDesc() != null;
        String message = "Segmented context requires that any of the events types that are listed in the segmented context also appear in any of the filter expressions of the statement";

        // if no create-window: at least one of the filters must match one of the filters specified by the context
        if (!isCreateWindow) {
            for (FilterSpecCompiled filter : filters) {
                for (ContextDetailPartitionItem item : segmentedSpec.getItems()) {
                    EventType stmtFilterType = filter.getFilterForEventType();
                    EventType contextType = item.getFilterSpecCompiled().getFilterForEventType();
                    if (stmtFilterType == contextType) {
                        return;
                    }
                    if (EventTypeUtility.isTypeOrSubTypeOf(stmtFilterType, contextType)) {
                        return;
                    }
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
            for (ContextDetailPartitionItem item : segmentedSpec.getItems()) {
                if (item.getFilterSpecCompiled().getFilterForEventType().getName().equals(declaredAsName)) {
                    return;
                }
            }

            throw new ExprValidationException(message);
        }
    }

    private void removeStatement(String statementId) {
        ContextManagerPartitionedStatementDesc statementDesc = statements.get(statementId);
        if (statementDesc == null) {
            return;
        }

        for (AgentInstance instance : statementDesc.getInstances()) {
            StatementAgentInstanceUtil.stop(instance.getStopCallback(), instance.getAgentInstanceContext(), instance.getFinalView(), servicesContext);
        }
        statements.remove(statementId);
    }
}
