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

/**
 * Context detail for a library-func and filter pair for the hash segmented context.
 */
public class ContextDescriptorHashSegmentedItem implements ContextDescriptor {

    private Expression hashFunction;    // expecting SingleRowMethodExpression
    private Filter filter;

    /**
     * Ctor.
     */
    public ContextDescriptorHashSegmentedItem() {
    }

    public ContextDescriptorHashSegmentedItem(Expression hashFunction, Filter filter) {
        this.hashFunction = hashFunction;
        this.filter = filter;
    }

    /**
     * Returns the filter.
     * @return filter
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the filter.
     * @param filter filter
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Expression getHashFunction() {
        return hashFunction;
    }

    public void setHashFunction(Expression hashFunction) {
        this.hashFunction = hashFunction;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        if (hashFunction != null) {
            hashFunction.toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
        }
        writer.append(" from ");
        filter.toEPL(writer, formatter);
    }
}
