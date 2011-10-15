/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.view;

import com.espertech.esper.client.EventType;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.epl.spec.OnTriggerSetAssignment;
import com.espertech.esper.epl.variable.VariableReadWritePackage;
import com.espertech.esper.event.EventAdapterService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Output condition for output rate limiting that handles when-then expressions for controlling output.
 */
public class OutputConditionExpressionFactory implements OutputConditionFactory
{
    private final ExprEvaluator whenExpressionNodeEval;
    private final VariableReadWritePackage variableReadWritePackage;
    private final Set<String> variableNames;

    private EventType builtinPropertiesEventType;

    public OutputConditionExpressionFactory(ExprNode whenExpressionNode, List<OnTriggerSetAssignment> assignments, final StatementContext statementContext)
            throws ExprValidationException
    {
        this.whenExpressionNodeEval = whenExpressionNode.getExprEvaluator();

        // determine if using variables
        ExprNodeVariableVisitor variableVisitor = new ExprNodeVariableVisitor();
        whenExpressionNode.accept(variableVisitor);
        variableNames = variableVisitor.getVariableNames();

        // determine if using properties
        boolean containsBuiltinProperties = false;
        if (containsBuiltinProperties(whenExpressionNode))
        {
            containsBuiltinProperties = true;
        }
        else
        {
            if (assignments != null)
            {
                for (OnTriggerSetAssignment assignment : assignments)
                {
                    if (containsBuiltinProperties(assignment.getExpression()))
                    {
                        containsBuiltinProperties = true;
                    }
                }
            }
        }

        if (containsBuiltinProperties)
        {
            builtinPropertiesEventType = getBuiltInEventType(statementContext.getEventAdapterService());
        }

        if (assignments != null)
        {
            variableReadWritePackage = new VariableReadWritePackage(assignments, statementContext.getVariableService(), statementContext.getEventAdapterService());
        }
        else
        {
            variableReadWritePackage = null;
        }
    }

    public OutputCondition make(AgentInstanceContext agentInstanceContext, OutputCallback outputCallback) {
        return new OutputConditionExpression(outputCallback, agentInstanceContext, this);
    }

    public ExprEvaluator getWhenExpressionNodeEval() {
        return whenExpressionNodeEval;
    }

    public VariableReadWritePackage getVariableReadWritePackage() {
        return variableReadWritePackage;
    }

    public EventType getBuiltinPropertiesEventType() {
        return builtinPropertiesEventType;
    }

    public Set<String> getVariableNames() {
        return variableNames;
    }

    /**
     * Build the event type for built-in properties.
     * @param eventAdapterService event adapters
     * @return event type
     */
    public static EventType getBuiltInEventType(EventAdapterService eventAdapterService)
    {
        Map<String, Object> outputLimitProperties = new HashMap<String, Object>();
        outputLimitProperties.put("count_insert", Integer.class);
        outputLimitProperties.put("count_remove", Integer.class);
        outputLimitProperties.put("last_output_timestamp", Long.class);
        return eventAdapterService.createAnonymousMapType(OutputConditionExpressionFactory.class.getName(), outputLimitProperties);
    }

    private boolean containsBuiltinProperties(ExprNode expr)
    {
        ExprNodeIdentifierVisitor propertyVisitor = new ExprNodeIdentifierVisitor(false);
        expr.accept(propertyVisitor);
        return !propertyVisitor.getExprProperties().isEmpty();
    }
}
