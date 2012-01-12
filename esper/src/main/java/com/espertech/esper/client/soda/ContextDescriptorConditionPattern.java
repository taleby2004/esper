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

/**
 * Context condition that start/initiated or ends/terminates context partitions based on a pattern.
 */
public class ContextDescriptorConditionPattern implements ContextDescriptorCondition {

    private PatternExpr pattern;

    /**
     * Ctor.
     */
    public ContextDescriptorConditionPattern() {
    }

    /**
     * Ctor.
     * @param pattern pattern expression
     */
    public ContextDescriptorConditionPattern(PatternExpr pattern) {
        this.pattern = pattern;
    }

    /**
     * Returns the pattern expression.
     * @return pattern
     */
    public PatternExpr getPattern() {
        return pattern;
    }

    /**
     * Sets the pattern expression.
     * @param pattern to set
     */
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
