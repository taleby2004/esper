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
import java.util.List;

public class ContextDescriptorConditionFilter implements ContextDescriptorCondition {

    private Filter filter;
    private String optionalAsName;

    public ContextDescriptorConditionFilter() {
    }

    public ContextDescriptorConditionFilter(Filter filter, String optionalAsName) {
        this.filter = filter;
        this.optionalAsName = optionalAsName;
    }

    public Filter getFilter() {
        return filter;
    }

    public String getOptionalAsName() {
        return optionalAsName;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setOptionalAsName(String optionalAsName) {
        this.optionalAsName = optionalAsName;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        filter.toEPL(writer, formatter);
        if (optionalAsName != null) {
            writer.append(" as ");
            writer.append(optionalAsName);
        }
    }
}
