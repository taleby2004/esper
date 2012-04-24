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
import com.espertech.esper.client.EventBean;
import com.espertech.esper.dataflow.interfaces.EPDataFlowEmitter;

public class EPDataFlowEventBeanCollectorContext {
    private final EPDataFlowEmitter emitter;
    private final boolean submitEventBean;
    private EventBean event;

    public EPDataFlowEventBeanCollectorContext(EPDataFlowEmitter emitter, boolean submitEventBean, EventBean event) {
        this.emitter = emitter;
        this.submitEventBean = submitEventBean;
        this.event = event;
    }

    public EventBean getEvent() {
        return event;
    }

    public void setEvent(EventBean event) {
        this.event = event;
    }

    public EPDataFlowEmitter getEmitter() {
        return emitter;
    }

    public boolean isSubmitEventBean() {
        return submitEventBean;
    }
}
