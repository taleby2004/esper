/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.view;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.UniformPair;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPStatementHandle;
import com.espertech.esper.core.service.InternalEventRouter;
import com.espertech.esper.core.service.UpdateDispatchView;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;
import com.espertech.esper.epl.spec.SelectClauseStreamSelectorEnum;
import com.espertech.esper.event.NaturalEventBean;

/**
 * An output strategy that handles routing (insert-into) and stream selection.
 */
public class OutputStrategyPostProcessFactory
{
    private final boolean isRoute;
    private final boolean isRouteRStream;
    private final SelectClauseStreamSelectorEnum selectStreamDirEnum;
    private final InternalEventRouter internalEventRouter;
    private final EPStatementHandle epStatementHandle;
    private final boolean addToFront;

    public OutputStrategyPostProcessFactory(boolean route, boolean routeRStream, SelectClauseStreamSelectorEnum selectStreamDirEnum, InternalEventRouter internalEventRouter, EPStatementHandle epStatementHandle, boolean addToFront) {
        isRoute = route;
        isRouteRStream = routeRStream;
        this.selectStreamDirEnum = selectStreamDirEnum;
        this.internalEventRouter = internalEventRouter;
        this.epStatementHandle = epStatementHandle;
        this.addToFront = addToFront;
    }

    public OutputStrategyPostProcess make(AgentInstanceContext agentInstanceContext) {
        return new OutputStrategyPostProcess(this, agentInstanceContext);
    }

    public boolean isRoute() {
        return isRoute;
    }

    public boolean isRouteRStream() {
        return isRouteRStream;
    }

    public SelectClauseStreamSelectorEnum getSelectStreamDirEnum() {
        return selectStreamDirEnum;
    }

    public InternalEventRouter getInternalEventRouter() {
        return internalEventRouter;
    }

    public EPStatementHandle getEpStatementHandle() {
        return epStatementHandle;
    }

    public boolean isAddToFront() {
        return addToFront;
    }
}
