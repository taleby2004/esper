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

import java.util.Collections;
import java.util.List;

public class ContextStateServiceImpl implements ContextStateService {

    public void addContext(String contextName, int agentInstanceId, Object additionalInfo) {
        // no action
    }

    public List<ContextState> getContexts(String contextName) {
        return Collections.emptyList();
    }

    public void removeContext(String contextName) {

    }
}
