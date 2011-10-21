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
import java.util.List;

public class ContextDescriptorInitiatedTerminated implements ContextDescriptor {

    private Filter initiatedFilter;
    private String initiatedFilterAsName;
    private PatternExpr initiatedPattern;

    private Expression terminatedTimePeriod;

    public ContextDescriptorInitiatedTerminated() {
    }

    public ContextDescriptorInitiatedTerminated(PatternExpr initiatedPattern, TimePeriodExpression terminatedTimePeriod) {
        this.initiatedPattern = initiatedPattern;
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    public ContextDescriptorInitiatedTerminated(Filter initiatedFilter, String initiatedFilterAsName, TimePeriodExpression terminatedTimePeriod) {
        this.initiatedFilter = initiatedFilter;
        this.initiatedFilterAsName = initiatedFilterAsName;
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    public Filter getInitiatedFilter() {
        return initiatedFilter;
    }

    public void setInitiatedFilter(Filter initiatedFilter) {
        this.initiatedFilter = initiatedFilter;
    }

    public String getInitiatedFilterAsName() {
        return initiatedFilterAsName;
    }

    public void setInitiatedFilterAsName(String initiatedFilterAsName) {
        this.initiatedFilterAsName = initiatedFilterAsName;
    }

    public PatternExpr getInitiatedPattern() {
        return initiatedPattern;
    }

    public void setInitiatedPattern(PatternExpr initiatedPattern) {
        this.initiatedPattern = initiatedPattern;
    }

    public Expression getTerminatedTimePeriod() {
        return terminatedTimePeriod;
    }

    public void setTerminatedTimePeriod(Expression terminatedTimePeriod) {
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("initiated by ");
        if (initiatedFilter != null) {
            initiatedFilter.toEPL(writer, formatter);
            writer.append(" as ");
            writer.append(initiatedFilterAsName);
        }
        else {
            writer.append("pattern [");
            initiatedPattern.toEPL(writer, PatternExprPrecedenceEnum.MINIMUM, formatter);
            writer.append("]");
        }
        writer.append(" terminated after ");
        terminatedTimePeriod.toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
    }

    private static void write(StringWriter writer, String label, List<Expression> expressions) {
        writer.append(label);
        writer.append(" (");
        String delimiter = "";
        for (Expression e : expressions) {
            writer.append(delimiter);
            e.toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
            delimiter = ", ";
        }
        writer.append(")");
    }
}
