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

package com.espertech.esper.client.hook;

public class VirtualDataWindowEventStopIndex extends VirtualDataWindowEvent {

    private final String namedWindowName;
    private final String indexName;

    public VirtualDataWindowEventStopIndex(String namedWindowName, String indexName) {
        this.namedWindowName = namedWindowName;
        this.indexName = indexName;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getNamedWindowName() {
        return namedWindowName;
    }
}
