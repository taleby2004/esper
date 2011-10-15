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

package com.espertech.esper.client.soda;

import java.io.StringWriter;

public class ContextDescriptorCategoryItem implements ContextDescriptor {

    private Expression expression;
    private String label;

    public ContextDescriptorCategoryItem() {
    }

    public ContextDescriptorCategoryItem(Expression expression, String label) {
        this.expression = expression;
        this.label = label;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("group ");
        expression.toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
        writer.append(" as ");
        writer.append(label);
    }
}
