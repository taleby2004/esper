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

public class ContextDescriptorCategory implements ContextDescriptor {

    private List<ContextDescriptorCategoryItem> items;
    private Filter filter;

    public ContextDescriptorCategory() {
        items = new ArrayList<ContextDescriptorCategoryItem>();
    }

    public ContextDescriptorCategory(List<ContextDescriptorCategoryItem> items, Filter filter) {
        this.items = items;
        this.filter = filter;
    }

    public List<ContextDescriptorCategoryItem> getItems() {
        return items;
    }

    public void setItems(List<ContextDescriptorCategoryItem> items) {
        this.items = items;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        String delimiter = "";
        for (ContextDescriptorCategoryItem item : items) {
            writer.append(delimiter);
            item.toEPL(writer, formatter);
            delimiter = ", ";
        }
        writer.append(" from ");
        filter.toEPL(writer, formatter);
    }
}
