/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.named;

import com.espertech.esper.epl.expression.ExprEvaluator;
import com.espertech.esper.event.EventPropertyWriter;
import com.espertech.esper.util.TypeWidener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NamedWindowUpdateItem
{
    private final ExprEvaluator expression;
    private final String optinalPropertyName;
    private final EventPropertyWriter optionalWriter;
    private final boolean notNullableField;
    private final TypeWidener optionalWidener;

    public NamedWindowUpdateItem(ExprEvaluator expression, String optinalPropertyName, EventPropertyWriter optionalWriter, boolean notNullableField, TypeWidener optionalWidener) {
        this.expression = expression;
        this.optinalPropertyName = optinalPropertyName;
        this.optionalWriter = optionalWriter;
        this.notNullableField = notNullableField;
        this.optionalWidener = optionalWidener;
    }

    public ExprEvaluator getExpression() {
        return expression;
    }

    public String getOptinalPropertyName() {
        return optinalPropertyName;
    }

    public EventPropertyWriter getOptionalWriter() {
        return optionalWriter;
    }

    public boolean isNotNullableField() {
        return notNullableField;
    }

    public TypeWidener getOptionalWidener() {
        return optionalWidener;
    }
}