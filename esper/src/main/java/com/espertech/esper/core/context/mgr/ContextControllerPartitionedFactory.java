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

import com.espertech.esper.client.EventType;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.core.context.stmt.AIRegistryAggregationMultiPerm;
import com.espertech.esper.core.context.stmt.AIRegistryExprMultiPerm;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistry;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ContextDetail;
import com.espertech.esper.epl.spec.ContextDetailPartitionItem;
import com.espertech.esper.epl.spec.ContextDetailPartitioned;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzer;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzerResult;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterSpecLookupable;
import com.espertech.esper.filter.FilterValueSetParam;

import java.util.*;

public class ContextControllerPartitionedFactory extends ContextControllerFactoryBase implements ContextControllerFactory {

    private final ContextDetailPartitioned segmentedSpec;
    
    private Map<String, Object> contextBuiltinProps;

    public ContextControllerPartitionedFactory(ContextControllerFactoryContext factoryContext, ContextDetailPartitioned segmentedSpec)
    {
        super(factoryContext);
        this.segmentedSpec = segmentedSpec;
    }

    public void validateFactory() throws ExprValidationException {
        Class[] propertyTypes = ContextControllerPartitionedUtil.validateContextDesc(factoryContext.getContextName(), segmentedSpec);
        contextBuiltinProps = ContextPropertyEventType.getPartitionType(segmentedSpec, propertyTypes);
    }

    public ContextControllerStatementCtxCache validateStatement(ContextControllerStatementBase statement) throws ExprValidationException {
        StatementSpecCompiledAnalyzerResult streamAnalysis = StatementSpecCompiledAnalyzer.analyzeFilters(statement.getStatementSpec());
        ContextControllerPartitionedUtil.validateStatementForContext(factoryContext.getContextName(), statement, streamAnalysis, getItemEventTypes(segmentedSpec));
        return new ContextControllerStatementCtxCacheFilters(streamAnalysis.getFilters());
    }

    public void populateFilterAddendums(IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>> filterAddendum, ContextControllerStatementDesc statement, Object key, int contextId) {
        ContextControllerStatementCtxCacheFilters statementInfo = (ContextControllerStatementCtxCacheFilters) statement.getCaches()[factoryContext.getNestingLevel() - 1];
        ContextControllerPartitionedUtil.populateAddendumFilters(key, statementInfo.getFilterSpecs(), segmentedSpec, statement.getStatement().getStatementSpec(), filterAddendum);
    }

    public FilterSpecLookupable getFilterLookupable(EventType eventType) {
        return null;
    }

    public boolean isSingleInstanceContext() {
        return false;
    }

    public StatementAIResourceRegistryFactory getStatementAIResourceRegistryFactory() {
        return new StatementAIResourceRegistryFactory() {
            public StatementAIResourceRegistry make() {
                return new StatementAIResourceRegistry(new AIRegistryAggregationMultiPerm(), new AIRegistryExprMultiPerm());
            }
        };
    }

    public List<ContextDetailPartitionItem> getContextDetailPartitionItems() {
        return segmentedSpec.getItems();
    }

    public ContextDetail getContextDetail() {
        return segmentedSpec;
    }

    public ContextDetailPartitioned getSegmentedSpec() {
        return segmentedSpec;
    }

    public Map<String, Object> getContextBuiltinProps() {
        return contextBuiltinProps;
    }

    public ContextController createNoCallback(int pathId, ContextControllerLifecycleCallback callback) {
        return new ContextControllerPartitioned(pathId, callback, this);
    }

    private Collection<EventType> getItemEventTypes(ContextDetailPartitioned segmentedSpec) {
        List<EventType> itemEventTypes = new ArrayList<EventType>();
        for (ContextDetailPartitionItem item : segmentedSpec.getItems()) {
            itemEventTypes.add(item.getFilterSpecCompiled().getFilterForEventType());
        }
        return itemEventTypes;
    }

    public Collection<Integer> getSelectedContextPartitions(Map<Integer, ContextControllerTreeAgentInstanceList> agentInstances, ContextPartitionSelector contextPartitionSelector) {
        for (Map.Entry<Integer, ContextControllerTreeAgentInstanceList> entry : agentInstances.entrySet()) {
            
        }
        return null;
    }
}
