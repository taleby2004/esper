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

package com.espertech.esper.epl.spec;

import com.espertech.esper.epl.expression.ExprNode;

import java.util.List;

public class ContextDetailPartitioned implements ContextDetail {

    private static final long serialVersionUID = -7754347180148095977L;
    private final List<ContextDetailPartitionItem> items;

    public ContextDetailPartitioned(List<ContextDetailPartitionItem> items) {
        this.items = items;
    }

    public List<ContextDetailPartitionItem> getItems() {
        return items;
    }
}
