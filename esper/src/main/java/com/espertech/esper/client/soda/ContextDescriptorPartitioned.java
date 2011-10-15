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

public class ContextDescriptorPartitioned implements ContextDescriptor {

    private List<ContextDescriptorPartitionedItem> items;

    public ContextDescriptorPartitioned() {
        items = new ArrayList<ContextDescriptorPartitionedItem>();
    }

    public ContextDescriptorPartitioned(List<ContextDescriptorPartitionedItem> items) {
        this.items = items;
    }

    public List<ContextDescriptorPartitionedItem> getItems() {
        return items;
    }

    public void setItems(List<ContextDescriptorPartitionedItem> items) {
        this.items = items;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("partition by ");
        String delimiter = "";
        for (ContextDescriptorPartitionedItem item : items) {
            writer.append(delimiter);
            item.toEPL(writer, formatter);
            delimiter = ", ";
        }
    }
}
