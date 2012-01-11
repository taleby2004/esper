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

public class ContextDescriptorConditionPattern implements ContextDescriptorCondition {

    private PatternExpr pattern;

    public ContextDescriptorConditionPattern() {
    }

    public ContextDescriptorConditionPattern(PatternExpr pattern) {
        this.pattern = pattern;
    }

    public PatternExpr getPattern() {
        return pattern;
    }

    public void setPattern(PatternExpr pattern) {
        this.pattern = pattern;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.write("pattern [");
        if (pattern != null) {
            pattern.toEPL(writer, PatternExprPrecedenceEnum.MINIMUM, formatter);
        }
        writer.write("]");
    }
}
