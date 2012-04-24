/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.client.EventType;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.CreateDataFlowDesc;
import com.espertech.esper.epl.spec.StatementSpecCompiled;
import com.espertech.esper.view.ViewProcessingException;
import com.espertech.esper.view.ZeroDepthStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;

/**
 * Starts and provides the stop method for EPL statements.
 */
public class EPStatementStartMethodCreateGraph extends EPStatementStartMethodBase
{
    private static final Log log = LogFactory.getLog(EPStatementStartMethodCreateGraph.class);

    public EPStatementStartMethodCreateGraph(StatementSpecCompiled statementSpec, EPServicesContext services, StatementContext statementContext) {
        super(statementSpec, services, statementContext);
    }

    public EPStatementStartResult startInternal(boolean isNewStatement, boolean isRecoveringStatement, boolean isRecoveringResilient) throws ExprValidationException, ViewProcessingException {
        final CreateDataFlowDesc createGraphDesc = statementSpec.getCreateGraphDesc();
        final AgentInstanceContext agentInstanceContext = getDefaultAgentInstanceContext();

        // define output event type
        String typeName = "EventType_Graph_" + createGraphDesc.getGraphName();
        EventType resultType = services.getEventAdapterService().createAnonymousMapType(typeName, Collections.<String, Object>emptyMap());

        services.getGraphService().addStartGraph(createGraphDesc, statementContext, services, agentInstanceContext, isNewStatement);

        EPStatementStopMethod stopMethod = new EPStatementStopMethod() {
            public void stop() {
                services.getGraphService().stopGraph(createGraphDesc.getGraphName());
            }
        };

        EPStatementDestroyMethod destroyMethod = new EPStatementDestroyMethod() {
            public void destroy() {
                services.getGraphService().removeGraph(createGraphDesc.getGraphName());
            }
        };
        return new EPStatementStartResult(new ZeroDepthStream(resultType), stopMethod, destroyMethod);
    }
}