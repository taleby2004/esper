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

import com.espertech.esper.client.context.EPContextPartitionDescriptor;

import java.util.Map;
import java.util.TreeMap;

public class ContextStatePathDescriptor {
    private final TreeMap<ContextStatePathKey, ContextStatePathValue> paths;
    private final Map<Integer, EPContextPartitionDescriptor> contextPartitionInformation;

    public ContextStatePathDescriptor(TreeMap<ContextStatePathKey, ContextStatePathValue> paths, Map<Integer, EPContextPartitionDescriptor> contextPartitionInformation) {
        this.paths = paths;
        this.contextPartitionInformation = contextPartitionInformation;
    }

    public TreeMap<ContextStatePathKey, ContextStatePathValue> getPaths() {
        return paths;
    }

    public Map<Integer, EPContextPartitionDescriptor> getContextPartitionInformation() {
        return contextPartitionInformation;
    }
}

