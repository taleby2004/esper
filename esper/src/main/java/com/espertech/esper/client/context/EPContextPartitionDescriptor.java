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

package com.espertech.esper.client.context;

/**
 * Descriptor encapsulates information about a context partition.
 */
public class EPContextPartitionDescriptor
{
    private final int agentInstanceId;
    private final ContextPartitionIdentifier identifier;
    private EPContextPartitionState state;

    /**
     * Ctor.
     * @param agentInstanceId context partition id
     * @param identifier identifier object specific to context declaration
     * @param state current state
     */
    public EPContextPartitionDescriptor(int agentInstanceId, ContextPartitionIdentifier identifier, EPContextPartitionState state) {
        this.agentInstanceId = agentInstanceId;
        this.identifier = identifier;
        this.state = state;
    }

    /**
     * Returns the context partition id.
     * @return id
     */
    public int getAgentInstanceId() {
        return agentInstanceId;
    }

    /**
     * Returns an identifier object that identifies the context partition.
     * @return identifier
     */
    public ContextPartitionIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Returns context partition state.
     * @return state
     */
    public EPContextPartitionState getState() {
        return state;
    }

    /**
     * Convenience method for updating context partition state, does not affect actual context partition state.
     * @param state of context partition
     */
    public void setState(EPContextPartitionState state) {
        this.state = state;
    }
}
