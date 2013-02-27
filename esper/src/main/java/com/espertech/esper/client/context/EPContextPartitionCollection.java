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

import java.util.Map;

/**
 * A collection of context partitions each uniquely identified by a context partition id (agent instance id).
 */
public class EPContextPartitionCollection
{
    private final Map<Integer, EPContextPartitionDescriptor> descriptors;

    /**
     * Ctor.
     * @param descriptors per agent instance id
     */
    public EPContextPartitionCollection(Map<Integer, EPContextPartitionDescriptor> descriptors) {
        this.descriptors = descriptors;
    }

    /**
     * Returns the descriptors per agent instance id
     * @return descriptors
     */
    public Map<Integer, EPContextPartitionDescriptor> getDescriptors() {
        return descriptors;
    }
}
