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

import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.epl.expression.ExprNodeUtility;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.*;
import com.espertech.esper.schedule.ScheduleSpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContextManagementServiceImpl implements ContextManagementService {
    private static final Log log = LogFactory.getLog(ContextManagementServiceImpl.class);

    private final ContextStateService stateService;
    private final Map<String, ContextManagerEntry> contexts;
    private final Set<String> destroyedContexts = new HashSet<String>();

    public ContextManagementServiceImpl(ContextStateService stateService) {
        contexts = new HashMap<String, ContextManagerEntry>();
        this.stateService = stateService;
    }

    public void addContextSpec(EPServicesContext servicesContext, AgentInstanceContext agentInstanceContext, CreateContextDesc contextDesc) throws ExprValidationException {

        ContextManagerEntry mgr = contexts.get(contextDesc.getContextName());
        if (mgr != null) {
            if (destroyedContexts.contains(contextDesc.getContextName())) {
                throw new ExprValidationException("Context by name '" + contextDesc.getContextName() + "' is still referenced by statements and may not be changed");
            }
            throw new ExprValidationException("Context by name '" + contextDesc.getContextName() + "' already exists");
        }

        ContextManager contextManager;
        if (contextDesc.getContextDetail() instanceof ContextDetailPartitioned) {
            ContextDetailPartitioned segmented = (ContextDetailPartitioned) contextDesc.getContextDetail();
            contextManager = new ContextManagerPartitioned(contextDesc.getContextName(), servicesContext, segmented, agentInstanceContext, stateService);
        }
        else if (contextDesc.getContextDetail() instanceof ContextDetailTemporalFixed) {
            ContextDetailTemporalFixed temporal = (ContextDetailTemporalFixed) contextDesc.getContextDetail();
            ScheduleSpec crontabStart = ExprNodeUtility.toCrontabSchedule(temporal.getCrontabStart(), agentInstanceContext.getStatementContext());
            ScheduleSpec crontabEnd = ExprNodeUtility.toCrontabSchedule(temporal.getCrontabEnd(), agentInstanceContext.getStatementContext());
            contextManager = new ContextManagerTemporalSingle(contextDesc.getContextName(), servicesContext, agentInstanceContext.getStatementContext(), crontabStart, crontabEnd);
        }
        else if (contextDesc.getContextDetail() instanceof ContextDetailCategory) {
            ContextDetailCategory category = (ContextDetailCategory) contextDesc.getContextDetail();
            contextManager = new ContextManagerCategorized(contextDesc.getContextName(), servicesContext, category, stateService);
        }
        else if (contextDesc.getContextDetail() instanceof ContextDetailInitiatedTerminated) {
            ContextDetailInitiatedTerminated overlaps = (ContextDetailInitiatedTerminated) contextDesc.getContextDetail();
            contextManager = new ContextManagerTemporalOverlap(contextDesc.getContextName(), servicesContext, agentInstanceContext, overlaps);
        }
        else {
            throw new RuntimeException("Unrecognized context detail " + contextDesc.getContextDetail());
        }

        contexts.put(contextDesc.getContextName(), new ContextManagerEntry(contextManager));
    }

    public int getContextCount() {
        return contexts.size();
    }

    public ContextDescriptor getContextDescriptor(String contextName) {
        ContextManagerEntry entry = contexts.get(contextName);
        if (entry == null) {
            return null;
        }
        return entry.getContextManager().getContextDescriptor();
    }

    public void addStatement(String contextName, ContextManagedStatementBase statement) throws ExprValidationException {
        ContextManagerEntry entry = contexts.get(contextName);
        if (entry == null) {
            throw new ExprValidationException(getNotDecaredText(contextName));
        }
        entry.addStatement(statement.getStatementContext().getStatementId());
        entry.getContextManager().addStatement(statement);
    }

    public void destroyedStatement(String contextName, String statementName, String statementId) {
        ContextManagerEntry entry = contexts.get(contextName);
        if (entry == null) {
            log.warn("Destroy statement for statement '" + statementName + "' failed to locate corresponding context manager '" + contextName + "'");
            return;
        }
        entry.removeStatement(statementId);
        entry.getContextManager().destroyStatement(statementName, statementId);
        
        if (entry.getStatementCount() == 0 && destroyedContexts.contains(contextName)) {
            destroyContext(contextName, entry);
        }
    }

    public void stoppedStatement(String contextName, String statementName, String statementId) {
        ContextManagerEntry entry = contexts.get(contextName);
        if (entry == null) {
            log.warn("Stop statement for statement '" + statementName + "' failed to locate corresponding context manager '" + contextName + "'");
            return;
        }
        entry.getContextManager().stopStatement(statementName, statementId);
    }

    public void destroyedContext(String contextName) {
        ContextManagerEntry entry = contexts.get(contextName);
        if (entry == null) {
            log.warn("Destroy for context '" + contextName + "' failed to locate corresponding context manager '" + contextName + "'");
            return;
        }
        if (entry.getStatementCount() == 0) {
            destroyContext(contextName, entry);
        }
        else {
            // some remaining statements have references
            destroyedContexts.add(contextName);
        }
    }

    private void destroyContext(String contextName, ContextManagerEntry entry) {
        entry.getContextManager().safeDestroy();
        contexts.remove(contextName);
        destroyedContexts.remove(contextName);
        stateService.removeContext(contextName);
    }

    private String getNotDecaredText(String contextName) {
        return "Context by name '" + contextName + "' has not been declared";
    }

    public static class ContextManagerEntry {
        private final ContextManager contextManager;
        private final Set<String> referringStatements;

        public ContextManagerEntry(ContextManager contextManager) {
            this.contextManager = contextManager;
            this.referringStatements = new HashSet<String>();
        }

        public ContextManager getContextManager() {
            return contextManager;
        }

        public void addStatement(String statementId) {
            referringStatements.add(statementId);
        }

        public int getStatementCount() {
            return referringStatements.size();
        }

        public void removeStatement(String statementId) {
            referringStatements.remove(statementId);
        }
    }
}
