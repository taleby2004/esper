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

package com.espertech.esper.regression.client;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.epl.agg.access.AggregationState;
import com.espertech.esper.epl.agg.access.AggregationAccessor;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class SupportAggMFAccessorEnumerableEvents implements AggregationAccessor {
    public Object getValue(AggregationState state) {
        return ((SupportAggMFStateEnumerableEvents) state).getEventsAsUnderlyingArray();
    }

    public Collection<EventBean> getEnumerableEvents(AggregationState state) {
        return ((SupportAggMFStateEnumerableEvents) state).getEvents();
    }

    public EventBean getEnumerableEvent(AggregationState state) {
        return null;
    }
}
