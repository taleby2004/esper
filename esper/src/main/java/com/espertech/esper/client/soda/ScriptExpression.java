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
import java.util.List;

/**
 * Script-expression is external scripting language expression such as JavaScript, Groovy or MVEL, for example.
 */
public class ScriptExpression implements Serializable
{
    private String name;
    private List<String> parameterNames;
    private String expressionText;
    private String optionalReturnType;
    private String optionalDialect;

    /**
     * Ctor.
     */
    public ScriptExpression() {
    }

    public ScriptExpression(String name, List<String> parameterNames, String expressionText, String optionalReturnType, String optionalDialect) {
        this.name = name;
        this.parameterNames = parameterNames;
        this.expressionText = expressionText;
        this.optionalReturnType = optionalReturnType;
        this.optionalDialect = optionalDialect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptionalReturnType() {
        return optionalReturnType;
    }

    public void setOptionalReturnType(String optionalReturnType) {
        this.optionalReturnType = optionalReturnType;
    }

    public String getOptionalDialect() {
        return optionalDialect;
    }

    public void setOptionalDialect(String optionalDialect) {
        this.optionalDialect = optionalDialect;
    }

    public String getExpressionText() {
        return expressionText;
    }

    public void setExpressionText(String expressionText) {
        this.expressionText = expressionText;
    }

    /**
     * Returns the lambda expression parameters.
     * @return lambda expression parameters
     */
    public List<String> getParameterNames() {
        return parameterNames;
    }

    /**
     * Sets the lambda expression parameters.
     * @param parameterNames lambda expression parameters
     */
    public void setParameterNames(List<String> parameterNames) {
        this.parameterNames = parameterNames;
    }

    public ExpressionPrecedenceEnum getPrecedence() {
        return ExpressionPrecedenceEnum.MINIMUM;
    }

    /**
     * Print.
     * @param writer to print to
     * @param scripts scripts
     * @param formatter for newline-whitespace formatting
     */
    public static void toEPL(StringWriter writer, List<ScriptExpression> scripts, EPStatementFormatter formatter) {
        if ((scripts == null) || (scripts.isEmpty())) {
            return;
        }

        for (ScriptExpression part : scripts) {
            if (part.getName() == null) {
                continue;
            }
            formatter.beginExpressionDecl(writer);
            part.toEPL(writer);
        }
    }

    /**
     * Print part.
     * @param writer to write to
     */
    public void toEPL(StringWriter writer) {
        writer.append("expression ");
        if (optionalReturnType != null) {
            writer.append(optionalReturnType);
            writer.append(" ");
        }
        if (optionalDialect != null && optionalDialect.trim().length() != 0) {
            writer.append(optionalDialect);
            writer.append(":");
        }
        writer.append(name);
        String delimiter = "";
        writer.append("(");
        for (String name : parameterNames) {
            writer.append(delimiter);
            writer.append(name);
            delimiter = ", ";
        }
        writer.append(") ");

        writer.append("[");
        writer.append(expressionText);
        writer.append("]");
    }
}
