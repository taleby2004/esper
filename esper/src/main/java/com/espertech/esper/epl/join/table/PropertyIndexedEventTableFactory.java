/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.join.table;

import com.espertech.esper.client.EventPropertyGetter;
import com.espertech.esper.client.EventType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;

/**
 * Index factory that organizes events by the event property values into hash buckets. Based on a HashMap
 * with {@link com.espertech.esper.collection.MultiKeyUntyped} keys that store the property values.
 *
 * Takes a list of property names as parameter. Doesn't care which event type the events have as long as the properties
 * exist. If the same event is added twice, the class throws an exception on add.
 */
public class PropertyIndexedEventTableFactory implements EventTableFactory
{
    protected final int streamNum;
    protected final String[] propertyNames;

    /**
     * Getters for properties.
     */
    protected final EventPropertyGetter[] propertyGetters;

    /**
     * Ctor.
     * @param streamNum - the stream number that is indexed
     * @param eventType - types of events indexed
     * @param propertyNames - property names to use for indexing
     */
    public PropertyIndexedEventTableFactory(int streamNum, EventType eventType, String[] propertyNames)
    {
        this.streamNum = streamNum;
        this.propertyNames = propertyNames;

        // Init getters
        propertyGetters = new EventPropertyGetter[propertyNames.length];
        for (int i = 0; i < propertyNames.length; i++)
        {
            propertyGetters[i] = eventType.getGetter(propertyNames[i]);
        }
    }

    public EventTable makeEventTable() {
        return new PropertyIndexedEventTable(streamNum, propertyGetters);
    }

    public String toQueryPlan()
    {
        return this.getClass().getSimpleName() +
                " streamNum=" + streamNum +
                " propertyNames=" + Arrays.toString(propertyNames);
    }

    private static Log log = LogFactory.getLog(PropertyIndexedEventTableFactory.class);
}
