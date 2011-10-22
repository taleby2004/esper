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

/**
 * Context dimension descriptor for initiated and terminated context partitions.
 */
public class ContextDescriptorInitiatedTerminated implements ContextDescriptor {

    private Filter initiatedFilter;
    private String initiatedFilterAsName;
    private PatternExpr initiatedPattern;

    private Expression terminatedTimePeriod;

    /**
     * Ctor.
     */
    public ContextDescriptorInitiatedTerminated() {
    }

    /**
     * Ctor.
     * @param initiatedPattern pattern to initiate
     * @param terminatedTimePeriod expires time period
     */
    public ContextDescriptorInitiatedTerminated(PatternExpr initiatedPattern, TimePeriodExpression terminatedTimePeriod) {
        this.initiatedPattern = initiatedPattern;
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    /**
     * Ctor.
     * @param initiatedFilter filter that initiates
     * @param initiatedFilterAsName name for events
     * @param terminatedTimePeriod expires time period
     */
    public ContextDescriptorInitiatedTerminated(Filter initiatedFilter, String initiatedFilterAsName, TimePeriodExpression terminatedTimePeriod) {
        this.initiatedFilter = initiatedFilter;
        this.initiatedFilterAsName = initiatedFilterAsName;
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    /**
     * Returns initiating filter, of null if using patterns.
     * @return filter
     */
    public Filter getInitiatedFilter() {
        return initiatedFilter;
    }

    /**
     * Sets initiating filter, of null if using patterns.
     * @param initiatedFilter filter
     */
    public void setInitiatedFilter(Filter initiatedFilter) {
        this.initiatedFilter = initiatedFilter;
    }

    /**
     * Returns event-as-name for initiating filter
     * @return name
     */
    public String getInitiatedFilterAsName() {
        return initiatedFilterAsName;
    }

    /**
     * Sets event-as-name for initiating filter
     * @param initiatedFilterAsName name
     */
    public void setInitiatedFilterAsName(String initiatedFilterAsName) {
        this.initiatedFilterAsName = initiatedFilterAsName;
    }

    /**
     * Returns the initiating pattern, or null if using filter instead
     * @return pattern
     */
    public PatternExpr getInitiatedPattern() {
        return initiatedPattern;
    }

    /**
     * Sets the initiating pattern, or null if using filter instead
     * @param initiatedPattern pattern
     */
    public void setInitiatedPattern(PatternExpr initiatedPattern) {
        this.initiatedPattern = initiatedPattern;
    }

    /**
     * Returns the expires-time-period.
     * @return expires expression
     */
    public Expression getTerminatedTimePeriod() {
        return terminatedTimePeriod;
    }

    /**
     * Sets the expires-time-period.
     * @param terminatedTimePeriod expires expression
     */
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
