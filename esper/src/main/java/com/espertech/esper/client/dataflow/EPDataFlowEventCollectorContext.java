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

package com.espertech.esper.client.dataflow;

public class EPDataFlowEventCollectorContext {
    private final EventBusCollector eventBusCollector;
    private Object event;

    public EPDataFlowEventCollectorContext(EventBusCollector eventBusCollector, Object event) {
        this.eventBusCollector = eventBusCollector;
        this.event = event;
    }

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public EventBusCollector getEventBusCollector() {
        return eventBusCollector;
    }
}
