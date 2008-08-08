/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.lookup;

import com.espertech.esper.event.EventBean;

import java.util.Set;
import java.util.HashSet;

/**
 * Implementation for a table lookup strategy that returns exactly one row
 * but leaves that row as an undefined value.
 */
public class TableLookupStrategyNullRow implements TableLookupStrategy
{
    private static Set<EventBean> singleNullRowEventSet = new HashSet<EventBean>();

    static
    {
        singleNullRowEventSet.add(null);
    }

    public Set<EventBean> lookup(EventBean[] events) {
        return singleNullRowEventSet;
    }
}
