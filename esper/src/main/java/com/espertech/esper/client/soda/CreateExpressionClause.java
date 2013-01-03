/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.io.StringWriter;

public class CreateExpressionClause implements Serializable
{
    private static final long serialVersionUID = 0L;

    private ExpressionDeclaration expressionDeclaration;
    private ScriptExpression scriptExpression;

    /**
     * Ctor.
     */
    public CreateExpressionClause() {
    }

    public CreateExpressionClause(ExpressionDeclaration expressionDeclaration) {
        this.expressionDeclaration = expressionDeclaration;
    }

    public CreateExpressionClause(ScriptExpression scriptExpression) {
        this.scriptExpression = scriptExpression;
    }

    public ExpressionDeclaration getExpressionDeclaration() {
        return expressionDeclaration;
    }

    public void setExpressionDeclaration(ExpressionDeclaration expressionDeclaration) {
        this.expressionDeclaration = expressionDeclaration;
    }

    public ScriptExpression getScriptExpression() {
        return scriptExpression;
    }

    public void setScriptExpression(ScriptExpression scriptExpression) {
        this.scriptExpression = scriptExpression;
    }

    public void toEPL(StringWriter writer)
    {
        writer.append("create ");
        if (expressionDeclaration != null) {
            expressionDeclaration.toEPL(writer);
        }
        else {
            scriptExpression.toEPL(writer);
        }
    }
}
