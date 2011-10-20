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

public class ContextDescriptorTemporalCrontabSingle implements ContextDescriptor {

    private List<Expression> crontabStartExpressions;
    private List<Expression> crontabEndExpressions;

    public ContextDescriptorTemporalCrontabSingle() {
    }

    public ContextDescriptorTemporalCrontabSingle(List<Expression> crontabStartExpressions, List<Expression> crontabEndExpressions) {
        this.crontabStartExpressions = crontabStartExpressions;
        this.crontabEndExpressions = crontabEndExpressions;
    }

    public List<Expression> getCrontabStartExpressions() {
        return crontabStartExpressions;
    }

    public void setCrontabStartExpressions(List<Expression> crontabStartExpressions) {
        this.crontabStartExpressions = crontabStartExpressions;
    }

    public List<Expression> getCrontabEndExpressions() {
        return crontabEndExpressions;
    }

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
