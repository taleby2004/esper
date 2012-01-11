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
 * Context dimension descriptor for a start-and-end temporal (single instance) or initiated-terminated (overlapping) context
 */
public class ContextDescriptorInitiatedTerminated implements ContextDescriptor {

    private static final long serialVersionUID = 8185386941253467559L;
    private ContextDescriptorCondition startCondition;
    private ContextDescriptorCondition endCondition;
    private boolean overlapping;

    /**
     * Ctor.
     */
    public ContextDescriptorInitiatedTerminated() {
    }

    public ContextDescriptorInitiatedTerminated(ContextDescriptorCondition startCondition, ContextDescriptorCondition endCondition, boolean overlapping) {
        this.startCondition = startCondition;
        this.endCondition = endCondition;
        this.overlapping = overlapping;
    }

    public ContextDescriptorCondition getStartCondition() {
        return startCondition;
    }

    public void setStartCondition(ContextDescriptorCondition startCondition) {
        this.startCondition = startCondition;
    }

    public ContextDescriptorCondition getEndCondition() {
        return endCondition;
    }

    public void setEndCondition(ContextDescriptorCondition endCondition) {
        this.endCondition = endCondition;
    }

    public boolean isOverlapping() {
        return overlapping;
    }

    public void setOverlapping(boolean overlapping) {
        this.overlapping = overlapping;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        write(writer, overlapping ? "initiated by " : "start ", startCondition, formatter);
        writer.append(" ");
        write(writer, overlapping ? "terminated " : "end ", endCondition, formatter);
    }

    private static void write(StringWriter writer, String label, ContextDescriptorCondition condition, EPStatementFormatter formatter) {
        writer.append(label);
        condition.toEPL(writer, formatter);
    }
}
