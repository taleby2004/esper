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

import java.util.Map;
import java.util.TreeMap;

public interface ContextControllerLifecycleCallback {
    public ContextControllerInstanceHandle contextPartitionInstantiate(Integer optionalContextPartitionId, int pathId, ContextController originator, EventBean optionalTriggeringEvent, Object partitionKey, Map<String, Object> contextProperties, ContextControllerState states);
    public void contextPartitionTerminate(ContextControllerInstanceHandle contextNestedHandle, Map<String, Object> terminationProperties);
}
