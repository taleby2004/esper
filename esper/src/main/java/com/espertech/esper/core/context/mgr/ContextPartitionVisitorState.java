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

import com.espertech.esper.client.context.ContextPartitionIdentifier;
import com.espertech.esper.client.context.EPContextPartitionDescriptor;
import com.espertech.esper.client.context.EPContextPartitionState;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContextPartitionVisitorState implements ContextPartitionVisitor {

    private final TreeMap<ContextStatePathKey, ContextStatePathValue> states = new TreeMap<ContextStatePathKey, ContextStatePathValue>();
    private final Map<Integer, EPContextPartitionDescriptor> contextPartitionInfo = new HashMap<Integer, EPContextPartitionDescriptor>();

    public ContextPartitionVisitorState() {
    }

    public void visit(int nestingLevel, int pathId, ContextStatePathValueBinding binding, Object payload, ContextController contextController, ContextControllerInstanceHandle instanceHandle) {
        ContextStatePathKey key = new ContextStatePathKey(nestingLevel, pathId, instanceHandle.getSubPathId());
        int agentInstanceId = instanceHandle.getContextPartitionOrPathId();
        states.put(key, new ContextStatePathValue(agentInstanceId, binding.toByteArray(payload), instanceHandle.getInstances().getState()));

        EPContextPartitionState state = instanceHandle.getInstances().getState();
        ContextPartitionIdentifier identifier = contextController.getFactory().keyPayloadToIdentifier(payload);
        EPContextPartitionDescriptor descriptor = new EPContextPartitionDescriptor(agentInstanceId, identifier, state);
        contextPartitionInfo.put(agentInstanceId, descriptor);
    }

    public TreeMap<ContextStatePathKey, ContextStatePathValue> getStates() {
        return states;
    }

    public Map<Integer, EPContextPartitionDescriptor> getContextPartitionInfo() {
        return contextPartitionInfo;
    }
}
