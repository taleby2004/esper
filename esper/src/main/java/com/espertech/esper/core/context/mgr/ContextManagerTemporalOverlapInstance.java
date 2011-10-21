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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

public class ContextManagerTemporalOverlapInstance {
    private static final Log log = LogFactory.getLog(ContextManagerTemporalOverlapInstance.class);

    private final Map<String, Object> patternData;
    private final EventBean filterEvent;

    public ContextManagerTemporalOverlapInstance(Map<String, Object> patternData, EventBean filterEvent) {
        this.patternData = patternData;
        this.filterEvent = filterEvent;
    }

    public Map<String, Object> getPatternData() {
        return patternData;
    }

    public EventBean getFilterEvent() {
        return filterEvent;
    }
}
