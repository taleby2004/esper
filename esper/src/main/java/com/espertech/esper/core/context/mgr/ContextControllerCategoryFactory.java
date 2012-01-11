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
import com.espertech.esper.core.context.stmt.AIRegistryAggregationMultiPerm;
import com.espertech.esper.core.context.stmt.AIRegistryExprMultiPerm;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistry;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ContextDetail;
import com.espertech.esper.epl.spec.ContextDetailCategory;
import com.espertech.esper.epl.spec.ContextDetailCategoryItem;
import com.espertech.esper.epl.spec.ContextDetailPartitionItem;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzer;
import com.espertech.esper.epl.spec.util.StatementSpecCompiledAnalyzerResult;
import com.espertech.esper.event.EventTypeUtility;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterSpecLookupable;
import com.espertech.esper.filter.FilterValueSetParam;

import java.util.*;

public class ContextControllerCategoryFactory extends ContextControllerFactoryBase implements ContextControllerFactory {

    private final ContextDetailCategory categorySpec;

    private Map<String, Object> contextBuiltinProps;

    public ContextControllerCategoryFactory(ContextControllerFactoryContext factoryContext, ContextDetailCategory categorySpec)
    {
        super(factoryContext);
        this.categorySpec = categorySpec;
    }

    public void validateFactory() throws ExprValidationException {
        if (categorySpec.getItems().isEmpty()) {
            throw new ExprValidationException("Empty list of partition items");
        }
        contextBuiltinProps = ContextPropertyEventType.getCategorizedType();
    }

    public ContextControllerStatementCtxCache validateStatement(ContextControllerStatementBase statement) throws ExprValidationException {
        StatementSpecCompiledAnalyzerResult streamAnalysis = StatementSpecCompiledAnalyzer.analyzeFilters(statement.getStatementSpec());
        validateStatementForContext(statement, streamAnalysis);
        return new ContextControllerStatementCtxCacheFilters(streamAnalysis.getFilters());
    }

    public void populateFilterAddendums(IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>> filterAddendum, ContextControllerStatementDesc statement, Object categoryLabel, int contextId) {
        ContextControllerStatementCtxCacheFilters statementInfo = (ContextControllerStatementCtxCacheFilters) statement.getCaches()[factoryContext.getNestingLevel() - 1];
        ContextDetailCategoryItem category = findCategoryForName((String) categoryLabel);
        getAddendumFilters(filterAddendum, category, categorySpec, statementInfo, statement);
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
        return Collections.emptyList();
    }

    public ContextDetail getContextDetail() {
        return categorySpec;
    }

    public ContextDetailCategory getCategorySpec() {
        return categorySpec;
    }

    public Map<String, Object> getContextBuiltinProps() {
        return contextBuiltinProps;
    }

    public ContextController createNoCallback(int pathId, ContextControllerLifecycleCallback callback) {
        return new ContextControllerCategory(pathId, callback, this);
    }

    private void validateStatementForContext(ContextControllerStatementBase statement, StatementSpecCompiledAnalyzerResult streamAnalysis)
        throws ExprValidationException
    {
        List<FilterSpecCompiled> filters = streamAnalysis.getFilters();

        boolean isCreateWindow = statement.getStatementSpec().getCreateWindowDesc() != null;
        String message = "Category context '" + factoryContext.getContextName() + "' requires that any of the events types that are listed in the category context also appear in any of the filter expressions of the statement";

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

    // Compare filters in statement with filters in segmented context, addendum filter compilation
    private static void getAddendumFilters(IdentityHashMap<FilterSpecCompiled, List<FilterValueSetParam>> addendums,
                                           ContextDetailCategoryItem category,
                                           ContextDetailCategory categorySpec,
                                           ContextControllerStatementCtxCacheFilters statementDesc,
                                           ContextControllerStatementDesc statement) {

        // determine whether create-named-window
        boolean isCreateWindow = statement.getStatement().getStatementSpec().getCreateWindowDesc() != null;
        if (!isCreateWindow) {
            for (FilterSpecCompiled filtersSpec : statementDesc.getFilterSpecs()) {

                boolean typeOrSubtype = EventTypeUtility.isTypeOrSubTypeOf(filtersSpec.getFilterForEventType(), categorySpec.getFilterSpecCompiled().getFilterForEventType());
                if (!typeOrSubtype) {
                    continue;   // does not apply
                }

                List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>();
                addendumFilters.addAll(category.getCompiledFilterParam());
                addendumFilters.addAll(categorySpec.getFilterParamsCompiled());

                List<FilterValueSetParam> existing = addendums.get(filtersSpec);
                if (existing == null) {
                    addendums.put(filtersSpec, addendumFilters);
                }
                else {
                    existing.addAll(addendumFilters);
                }
            }
        }
        // handle segmented context for create-window
        else {
            String declaredAsName = statement.getStatement().getStatementSpec().getCreateWindowDesc().getAsEventTypeName();
            if (declaredAsName != null) {
                for (FilterSpecCompiled filtersSpec : statementDesc.getFilterSpecs()) {

                    List<FilterValueSetParam> addendumFilters = new ArrayList<FilterValueSetParam>();
                    addendumFilters.addAll(category.getCompiledFilterParam());
                    addendumFilters.addAll(categorySpec.getFilterParamsCompiled());

                    List<FilterValueSetParam> existing = addendums.get(filtersSpec);
                    if (existing == null) {
                        addendums.put(filtersSpec, addendumFilters);
                    }
                    else {
                        existing.addAll(addendumFilters);
                    }
                }
            }
        }
    }

    private ContextDetailCategoryItem findCategoryForName(String categoryLabel) {
        for (ContextDetailCategoryItem item : categorySpec.getItems()) {
            if (item.getName().equals(categoryLabel)) {
                return item;
            }
        }
        throw new IllegalStateException("Failed to find category '" + categoryLabel + "'");
    }
}
