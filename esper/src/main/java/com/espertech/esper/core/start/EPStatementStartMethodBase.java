/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.context.util.EPStatementAgentInstanceHandle;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementAgentInstanceFilterVersion;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.StatementSpecCompiled;
import com.espertech.esper.util.AuditPath;
import com.espertech.esper.view.ViewProcessingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Starts and provides the stop method for EPL statements.
 */
public abstract class EPStatementStartMethodBase implements EPStatementStartMethod
{
    private static final Log log = LogFactory.getLog(EPStatementStartMethodBase.class);
    private static final Log queryPlanLog = LogFactory.getLog(AuditPath.QUERYPLAN_LOG);

    protected final StatementSpecCompiled statementSpec;
    protected final EPServicesContext services;
    protected final StatementContext statementContext;
    protected final boolean queryPlanLogging;

    protected EPStatementStartMethodBase(StatementSpecCompiled statementSpec, EPServicesContext services, StatementContext statementContext) {
        this.statementSpec = statementSpec;
        this.services = services;
        this.statementContext = statementContext;
        this.queryPlanLogging = services.getConfigSnapshot().getEngineDefaults().getLogging().isEnableQueryPlan();
    }

    public abstract EPStatementStartResult startInternal(boolean isNewStatement, boolean isRecoveringStatement, boolean isRecoveringResilient)
        throws ExprValidationException, ViewProcessingException;

    public EPStatementStartResult start(boolean isNewStatement, boolean isRecoveringStatement, boolean isRecoveringResilient) throws ExprValidationException, ViewProcessingException {
        statementContext.getVariableService().setLocalVersion();    // get current version of variables

        boolean queryPlanLogging = services.getConfigSnapshot().getEngineDefaults().getLogging().isEnableQueryPlan();
        if (queryPlanLogging && queryPlanLog.isInfoEnabled()) {
            queryPlanLog.info("Query plans for statement '" + statementContext.getStatementName() + "' expression '" + statementContext.getExpression() + "'");
        }
        
        // validate context - may not exist
        if (statementSpec.getOptionalContextName() != null && statementContext.getContextDescriptor() == null) {
            throw new ExprValidationException("Context by name '" + statementSpec.getOptionalContextName() + "' has not been declared");
        }

        return startInternal(isNewStatement, isRecoveringStatement, isRecoveringResilient);
    }

    protected EPStatementAgentInstanceHandle getDefaultAgentInstanceHandle() {
        return new EPStatementAgentInstanceHandle(statementContext.getEpStatementHandle(), statementContext.getDefaultAgentInstanceLock(), -1, new StatementAgentInstanceFilterVersion());
    }

    protected AgentInstanceContext getDefaultAgentInstanceContext() {
        EPStatementAgentInstanceHandle handle = getDefaultAgentInstanceHandle();
        return new AgentInstanceContext(statementContext, handle, -1, null, null, statementContext.getDefaultAgentInstanceScriptContext());
    }
}
