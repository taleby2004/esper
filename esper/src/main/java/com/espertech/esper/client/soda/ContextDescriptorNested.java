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
import java.util.ArrayList;
import java.util.List;

/**
 * Nested context.
 */
public class ContextDescriptorNested implements ContextDescriptor {

    private List<CreateContextClause> contexts;

    /**
     * Ctor.
     */
    public ContextDescriptorNested() {
        contexts = new ArrayList<CreateContextClause>();
    }

    public ContextDescriptorNested(List<CreateContextClause> contexts) {
        this.contexts = contexts;
    }

    public List<CreateContextClause> getContexts() {
        return contexts;
    }

    public void setContexts(List<CreateContextClause> contexts) {
        this.contexts = contexts;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        String delimiter = "";
        for (CreateContextClause context : contexts) {
            writer.append(delimiter);
            writer.append("context ");
            writer.append(context.getContextName());
            writer.append(" as ");
            context.getDescriptor().toEPL(writer, formatter);
            delimiter = ", ";
        }
    }
}
