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

public class ContextDescriptorConditionTimePeriod implements ContextDescriptorCondition {

    private Expression timePeriod;

    public ContextDescriptorConditionTimePeriod() {
    }

    public ContextDescriptorConditionTimePeriod(Expression timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Expression getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Expression timePeriod) {
        this.timePeriod = timePeriod;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("after ");
        timePeriod.toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
    }
}
