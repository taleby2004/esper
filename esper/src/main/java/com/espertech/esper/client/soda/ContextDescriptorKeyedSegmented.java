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

package com.espertech.esper.client.soda;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class ContextDescriptorKeyedSegmented implements ContextDescriptor {

    private List<ContextDescriptorKeyedSegmentedItem> items;

    public ContextDescriptorKeyedSegmented() {
        items = new ArrayList<ContextDescriptorKeyedSegmentedItem>();
    }

    public ContextDescriptorKeyedSegmented(List<ContextDescriptorKeyedSegmentedItem> items) {
        this.items = items;
    }

    public List<ContextDescriptorKeyedSegmentedItem> getItems() {
        return items;
    }

    public void setItems(List<ContextDescriptorKeyedSegmentedItem> items) {
        this.items = items;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("partition by ");
        String delimiter = "";
        for (ContextDescriptorKeyedSegmentedItem item : items) {
            writer.append(delimiter);
            item.toEPL(writer, formatter);
            delimiter = ", ";
        }
    }
}
