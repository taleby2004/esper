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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.EventPropertyGetter;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.EPStatementHandleCallback;
import com.espertech.esper.epl.spec.ContextDetailHashItem;
import com.espertech.esper.filter.FilterHandleCallback;
import com.espertech.esper.filter.FilterService;
import com.espertech.esper.filter.FilterValueSet;

import java.util.Collection;

public class ContextControllerHashedFilterCallback implements FilterHandleCallback {

    private final AgentInstanceContext agentInstanceContextCreateContext;
    private final EventPropertyGetter getter;
    private final ContextControllerHashedInstanceCallback callback;
    private final EPStatementHandleCallback filterHandle;

    public ContextControllerHashedFilterCallback(EPServicesContext servicesContext, AgentInstanceContext agentInstanceContextCreateContext, ContextDetailHashItem hashItem, ContextControllerHashedInstanceCallback callback) {
        this.agentInstanceContextCreateContext = agentInstanceContextCreateContext;
        this.callback = callback;
        this.getter = hashItem.getLookupable().getGetter();

        filterHandle = new EPStatementHandleCallback(agentInstanceContextCreateContext.getEpStatementAgentInstanceHandle(), this);

        FilterValueSet filterValueSet = hashItem.getFilterSpecCompiled().getValueSet(null, null, null);
        servicesContext.getFilterService().add(filterValueSet, filterHandle);
    }

    public void matchFound(EventBean event, Collection<FilterHandleCallback> allStmtMatches) {
        int value = (Integer) getter.get(event);
        callback.create(value, event);
    }

    public boolean isSubSelect() {
        return false;
    }

    public String getStatementId() {
        return agentInstanceContextCreateContext.getStatementContext().getStatementId();
    }

    public void destroy(FilterService filterService) {
        filterService.remove(filterHandle);
    }

    public EPStatementHandleCallback getFilterHandle() {
        return filterHandle;
    }
}
