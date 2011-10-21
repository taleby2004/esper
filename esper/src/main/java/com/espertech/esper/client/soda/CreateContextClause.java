/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.io.StringWriter;

/**
 * Create a context.
 */
public class CreateContextClause implements Serializable
{
    private static final long serialVersionUID = 0L;

    private String contextName;
    private ContextDescriptor descriptor;

    public CreateContextClause() {
    }

    public CreateContextClause(String contextName, ContextDescriptor descriptor) {
        this.contextName = contextName;
        this.descriptor = descriptor;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    public ContextDescriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(ContextDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * Render as EPL.
     * @param writer to output to
     */
    public void toEPL(StringWriter writer, EPStatementFormatter formatter)
    {
        writer.append("create context ");
        writer.append(contextName);
        writer.append(" as ");
        descriptor.toEPL(writer, formatter);
    }
}
