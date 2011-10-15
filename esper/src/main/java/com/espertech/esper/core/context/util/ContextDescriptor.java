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

package com.espertech.esper.core.context.util;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.SafeIterator;
import com.espertech.esper.core.context.stmt.StatementAIResourceRegistryFactory;

import java.util.Iterator;

public class ContextDescriptor {

    private final String contextName;
    private final boolean singleInstanceContext;
    private final ContextPropertyRegistry contextPropertyRegistry;
    private final StatementAIResourceRegistryFactory aiResourceRegistryFactory;
    private final ContextIteratorHandler iteratorHandler;

    public ContextDescriptor(String contextName, boolean singleInstanceContext, ContextPropertyRegistry contextPropertyRegistry, StatementAIResourceRegistryFactory aiResourceRegistryFactory, ContextIteratorHandler iteratorHandler) {
        this.contextName = contextName;
        this.singleInstanceContext = singleInstanceContext;
        this.contextPropertyRegistry = contextPropertyRegistry;
        this.aiResourceRegistryFactory = aiResourceRegistryFactory;
        this.iteratorHandler = iteratorHandler;
    }

    public String getContextName() {
        return contextName;
    }

    public boolean isSingleInstanceContext() {
        return singleInstanceContext;
    }

    public ContextPropertyRegistry getContextPropertyRegistry() {
        return contextPropertyRegistry;
    }

    public StatementAIResourceRegistryFactory getAiResourceRegistryFactory() {
        return aiResourceRegistryFactory;
    }

    public Iterator<EventBean> iterator(String statementId) {
        return iteratorHandler.iterator(statementId);
    }

    public SafeIterator<EventBean> safeIterator(String statementId) {
        return iteratorHandler.safeIterator(statementId);
    }
}
