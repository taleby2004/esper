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

import com.espertech.esper.epl.spec.FilterSpecRaw;
import com.espertech.esper.filter.FilterSpecCompiled;

import java.io.StringWriter;
import java.util.List;

public class ContextDescriptorKeyedSegmentedItem implements ContextDescriptor {

    private List<String> propertyNames;
    private Filter filter;

    public ContextDescriptorKeyedSegmentedItem() {
    }

    public ContextDescriptorKeyedSegmentedItem(List<String> propertyNames, Filter filter) {
        this.propertyNames = propertyNames;
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        String delimiter = "";
        for (String prop : propertyNames) {
            writer.append(delimiter);
            writer.append(prop);
            delimiter = "and ";
        }
        writer.append(" from ");
        filter.toEPL(writer, formatter);
    }
}
