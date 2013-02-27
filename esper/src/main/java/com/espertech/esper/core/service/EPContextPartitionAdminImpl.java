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

package com.espertech.esper.core.service;

import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.client.context.ContextPartitionSelectorById;
import com.espertech.esper.client.context.EPContextPartitionCollection;
import com.espertech.esper.client.context.EPContextPartitionDescriptor;
import com.espertech.esper.core.context.mgr.*;
import com.espertech.esper.core.context.util.ContextPartitionImportCallback;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EPContextPartitionAdminImpl implements EPContextPartitionAdminSPI
{
    private final EPServicesContext services;

    public EPContextPartitionAdminImpl(EPServicesContext services) {
        this.services = services;
    }

    public String[] getContextStatementNames(String contextName) {
        ContextManager contextManager = services.getContextManagementService().getContextManager(contextName);
        if (contextManager == null) {
            return null;
        }

        String[] statements = new String[contextManager.getStatements().size()];
        int count = 0;
        for (Map.Entry<String, ContextControllerStatementDesc> entry : contextManager.getStatements().entrySet()) {
            statements[count++] = entry.getValue().getStatement().getStatementContext().getStatementName();
        }
        return statements;
    }

    public int getContextNestingLevel(String contextName) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        return contextManager.getNumNestingLevels();
    }

    public EPContextPartitionCollection destroyContextPartitions(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractDestroyPaths(selector);
        return new EPContextPartitionCollection(descriptor.getContextPartitionInformation());
    }

    public EPContextPartitionDescriptor destroyContextPartition(String contextName, final int agentInstanceId) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractDestroyPaths(new CPSelectorById(agentInstanceId));
        return descriptor.getContextPartitionInformation().get(agentInstanceId);
    }

    public EPContextPartitionExtract extractDestroyPaths(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractDestroyPaths(selector);
        return descriptorToExtract(contextManager.getNumNestingLevels(), descriptor);
    }

    public EPContextPartitionCollection stopContextPartitions(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractStopPaths(selector);
        return new EPContextPartitionCollection(descriptor.getContextPartitionInformation());
    }

    public EPContextPartitionCollection startContextPartitions(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        return new EPContextPartitionCollection(contextManager.startPaths(selector));
    }

    public EPContextPartitionCollection getContextPartitions(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        return new EPContextPartitionCollection(contextManager.extractPaths(selector).getContextPartitionInformation());
    }

    public EPContextPartitionDescriptor stopContextPartition(String contextName, final int agentInstanceId) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractStopPaths(new CPSelectorById(agentInstanceId));
        return descriptor.getContextPartitionInformation().get(agentInstanceId);
    }

    public EPContextPartitionDescriptor startContextPartition(String contextName, final int agentInstanceId) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        Map<Integer, EPContextPartitionDescriptor> descriptorMap = contextManager.startPaths(new CPSelectorById(agentInstanceId));
        return descriptorMap.get(agentInstanceId);
    }

    public EPContextPartitionDescriptor getDescriptor(String contextName, final int agentInstanceId) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractPaths(new CPSelectorById(agentInstanceId));
        return descriptor.getContextPartitionInformation().get(agentInstanceId);
    }

    public EPContextPartitionExtract extractStopPaths(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor descriptor = contextManager.extractStopPaths(selector);
        return descriptorToExtract(contextManager.getNumNestingLevels(), descriptor);
    }

    public EPContextPartitionExtract extractPaths(String contextName, ContextPartitionSelector selector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        ContextStatePathDescriptor contextPaths = contextManager.extractPaths(selector);
        return descriptorToExtract(contextManager.getNumNestingLevels(), contextPaths);
    }

    public EPContextPartitionImportResult importStartPaths(String contextName, EPContextPartitionImportable importable, AgentInstanceSelector agentInstanceSelector) {
        ContextManager contextManager = checkedGetContextManager(contextName);
        CPImportCallback importCallback = new CPImportCallback();
        ContextControllerState state = new ContextControllerState(importable.getPaths(), true, importCallback);
        contextManager.importStartPaths(state, agentInstanceSelector);
        return new EPContextPartitionImportResult(importCallback.existingToImported, importCallback.allocatedToImported);
    }

    private ContextManager checkedGetContextManager(String contextName) {
        ContextManager contextManager = services.getContextManagementService().getContextManager(contextName);
        if (contextManager == null) {
            throw new IllegalArgumentException("Context by name '" + contextName + "' could not be found");
        }
        return contextManager;
    }

    private EPContextPartitionExtract descriptorToExtract(int numNestingLevels, ContextStatePathDescriptor contextPaths) {
        EPContextPartitionImportable importable = new EPContextPartitionImportable(contextPaths.getPaths());
        return new EPContextPartitionExtract(new EPContextPartitionCollection(contextPaths.getContextPartitionInformation()), importable, numNestingLevels);
    }

    public static class CPImportCallback implements ContextPartitionImportCallback {
        private final Map<Integer, Integer> existingToImported = new HashMap<Integer, Integer>();
        private final Map<Integer, Integer> allocatedToImported = new HashMap<Integer, Integer>();

        public void existing(int agentInstanceId, int exportedAgentInstanceId) {
            existingToImported.put(agentInstanceId, exportedAgentInstanceId);
        }

        public void allocated(int agentInstanceId, int exportedAgentInstanceId) {
            allocatedToImported.put(agentInstanceId, exportedAgentInstanceId);
        }
    }

    public static class CPSelectorById implements ContextPartitionSelectorById {
        private final int agentInstanceId;

        public CPSelectorById(int agentInstanceId) {
            this.agentInstanceId = agentInstanceId;
        }

        public Set<Integer> getContextPartitionIds() {
            return Collections.singleton(agentInstanceId);
        }
    }
}
