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

/**
 * Hash-segmented context.
 */
public class ContextDescriptorHashSegmented implements ContextDescriptor {

    private List<ContextDescriptorHashSegmentedItem> items;
    private int granularity;
    private boolean preallocate;

    /**
     * Ctor.
     */
    public ContextDescriptorHashSegmented() {
        items = new ArrayList<ContextDescriptorHashSegmentedItem>();
    }

    public ContextDescriptorHashSegmented(List<ContextDescriptorHashSegmentedItem> items, int granularity, boolean preallocate) {
        this.items = items;
        this.granularity = granularity;
        this.preallocate = preallocate;
    }

    /**
     * Returns hash items.
     * @return hash items
     */
    public List<ContextDescriptorHashSegmentedItem> getItems() {
        return items;
    }

    public int getGranularity() {
        return granularity;
    }

    public void setGranularity(int granularity) {
        this.granularity = granularity;
    }

    public boolean isPreallocate() {
        return preallocate;
    }

    public void setPreallocate(boolean preallocate) {
        this.preallocate = preallocate;
    }

    /**
     * Sets categories
     * @param items categories to set
     */
    public void setItems(List<ContextDescriptorHashSegmentedItem> items) {
        this.items = items;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.append("coalesce ");
        String delimiter = "";
        for (ContextDescriptorHashSegmentedItem item : items) {
            writer.append(delimiter);
            item.toEPL(writer, formatter);
            delimiter = ", ";
        }
        writer.append(" granularity ");
        writer.append(Integer.toString(granularity));
        if (preallocate) {
            writer.append(" preallocate");
        }
    }
}
