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
 * Context dimension descriptor for a start-and-end temporal single-fire or repeating context
 */
public class ContextDescriptorTemporalCrontabSingle implements ContextDescriptor {

    private List<Expression> crontabStartExpressions;
    private List<Expression> crontabEndExpressions;

    /**
     * Ctor.
     */
    public ContextDescriptorTemporalCrontabSingle() {
    }

    /**
     * Ctor.
     * @param crontabStartExpressions start-crontab
     * @param crontabEndExpressions end-crontab
     */
    public ContextDescriptorTemporalCrontabSingle(List<Expression> crontabStartExpressions, List<Expression> crontabEndExpressions) {
        this.crontabStartExpressions = crontabStartExpressions;
        this.crontabEndExpressions = crontabEndExpressions;
    }

    /**
     * Returns the start crontab expressions.
     * @return start
     */
    public List<Expression> getCrontabStartExpressions() {
        return crontabStartExpressions;
    }

    /**
     * Sets the start crontab expressions.
     * @param crontabStartExpressions start
     */
    public void setCrontabStartExpressions(List<Expression> crontabStartExpressions) {
        this.crontabStartExpressions = crontabStartExpressions;
    }

    /**
     * Returns the end crontab expressions.
     * @return end
     */
    public List<Expression> getCrontabEndExpressions() {
        return crontabEndExpressions;
    }

    /**
     * Sets the end crontab expressions.
     * @param crontabEndExpressions end
     */
    public void setCrontabEndExpressions(List<Expression> crontabEndExpressions) {
        this.crontabEndExpressions = crontabEndExpressions;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        write(writer, "start", crontabStartExpressions);
        writer.append(" ");
        write(writer, "end", crontabEndExpressions);
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
