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

package com.espertech.esper.client.epn;

import java.io.Serializable;

public class EventSourceDesc implements Serializable {
    private EventSourceState state;
    private Object producer;

    public EventSourceDesc(EventSourceState state, Object producer) {
        this.state = state;
        this.producer = producer;
    }

    public EventSourceState getState() {
        return state;
    }

    public void setState(EventSourceState state) {
        this.state = state;
    }

    public Object getProducer() {
        return producer;
    }

    public void setProducer(Object producer) {
        this.producer = producer;
    }
}
