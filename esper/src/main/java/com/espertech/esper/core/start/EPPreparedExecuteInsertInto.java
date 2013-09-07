/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.ExprEvaluatorContextStatement;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.core.*;
import com.espertech.esper.epl.expression.ExprNode;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.named.NamedWindowOnMergeHelper;
import com.espertech.esper.epl.spec.*;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.util.UuidGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Starts and provides the stop method for EPL statements.
 */
public class EPPreparedExecuteInsertInto extends EPPreparedExecuteSingleStream
{
    public EPPreparedExecuteInsertInto(StatementSpecCompiled statementSpec, EPServicesContext services, StatementContext statementContext) throws ExprValidationException {
        super(associatedFromClause(statementSpec), services, statementContext);

        if (statementSpec.getFilterRootNode() != null ||
            statementSpec.getStreamSpecs().length > 0 ||
            statementSpec.getHavingExprRootNode() != null ||
            statementSpec.getOutputLimitSpec() != null ||
            statementSpec.getForClauseSpec() != null ||
            statementSpec.getMatchRecognizeSpec() != null ||
            statementSpec.getOrderByList().length > 0 ||
            statementSpec.getRowLimitSpec() != null) {
            throw new ExprValidationException("Insert-into fire-and-forget query can only consist of an insert-into clause and a select-clause");
        }
    }

    public EPPreparedExecuteSingleStreamExec getExecutor(FilterSpecCompiled filter, String aliasName) throws ExprValidationException {

        List<SelectClauseElementCompiled> selectNoWildcard = NamedWindowOnMergeHelper.compileSelectNoWildcard(UuidGenerator.generate(), Arrays.asList(statementSpec.getSelectClauseSpec().getSelectExprList()));

        StreamTypeService streamTypeService = new StreamTypeServiceImpl(statementContext.getEngineURI(), false);
        ExprEvaluatorContextStatement exprEvaluatorContextStatement = new ExprEvaluatorContextStatement(statementContext);

        // assign names
        for (SelectClauseElementCompiled compiled : statementSpec.getSelectClauseSpec().getSelectExprList()) {
            if (compiled instanceof SelectClauseExprCompiledSpec) {
                SelectClauseExprCompiledSpec expr = (SelectClauseExprCompiledSpec) compiled;
                if (expr.getAssignedName() == null) {
                    if (expr.getProvidedName() == null) {
                        expr.setAssignedName(expr.getSelectExpression().toExpressionString());
                    }
                    else {
                        expr.setAssignedName(expr.getProvidedName());
                    }
                }
            }
        }

        SelectExprEventTypeRegistry selectExprEventTypeRegistry = new SelectExprEventTypeRegistry(statementContext.getStatementName(), statementContext.getStatementEventTypeRef());
        SelectExprProcessor insertHelper = SelectExprProcessorFactory.getProcessor(Collections.singleton(0),
                selectNoWildcard.toArray(new SelectClauseElementCompiled[selectNoWildcard.size()]), false, statementSpec.getInsertIntoDesc(), null, streamTypeService,
                statementContext.getEventAdapterService(), statementContext.getStatementResultService(), statementContext.getValueAddEventService(), selectExprEventTypeRegistry,
                statementContext.getMethodResolutionService(), exprEvaluatorContextStatement, statementContext.getVariableService(), statementContext.getTimeProvider(), statementContext.getEngineURI(), statementContext.getStatementId(), statementContext.getStatementName(), statementContext.getAnnotations(), statementContext.getContextDescriptor(), statementContext.getConfigSnapshot(), null);

        return new EPPreparedExecuteSingleStreamExecInsert(exprEvaluatorContextStatement, insertHelper);
    }

    private static StatementSpecCompiled associatedFromClause(StatementSpecCompiled statementSpec) {
        String namedWindowName = statementSpec.getInsertIntoDesc().getEventTypeName();
        NamedWindowConsumerStreamSpec namedWindowStream = new NamedWindowConsumerStreamSpec(namedWindowName, null, new ViewSpec[0], Collections.<ExprNode>emptyList(),
                new StreamSpecOptions(), null);
        statementSpec.setStreamSpecs(new StreamSpecCompiled[] {namedWindowStream});
        return statementSpec;
    }

}
