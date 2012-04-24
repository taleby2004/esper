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

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.dataflow.interfaces.EPDataFlowEmitter;

public class EPDataFlowIRStreamCollectorContext {
    private final EPDataFlowEmitter emitter;
    private final boolean submitEventBean;
    private EventBean[] newEvents;
    private EventBean[] oldEvents;
    private EPStatement statement;
    private EPServiceProvider epServiceProvider;

    public EPDataFlowIRStreamCollectorContext(EPDataFlowEmitter emitter, boolean submitEventBean, EventBean[] newEvents, EventBean[] oldEvents, EPStatement statement, EPServiceProvider epServiceProvider) {
        this.emitter = emitter;
        this.submitEventBean = submitEventBean;
        this.newEvents = newEvents;
        this.oldEvents = oldEvents;
        this.statement = statement;
        this.epServiceProvider = epServiceProvider;
    }

    public EPDataFlowEmitter getEmitter() {
        return emitter;
    }

    public EventBean[] getNewEvents() {
        return newEvents;
    }

    public EventBean[] getOldEvents() {
        return oldEvents;
    }

    public EPStatement getStatement() {
        return statement;
    }

    public EPServiceProvider getEpServiceProvider() {
        return epServiceProvider;
    }

    public void setNewEvents(EventBean[] newEvents) {
        this.newEvents = newEvents;
    }

    public void setOldEvents(EventBean[] oldEvents) {
        this.oldEvents = oldEvents;
    }

    public void setStatement(EPStatement statement) {
        this.statement = statement;
    }

    public void setEpServiceProvider(EPServiceProvider epServiceProvider) {
        this.epServiceProvider = epServiceProvider;
    }

    public boolean isSubmitEventBean() {
        return submitEventBean;
    }
}
