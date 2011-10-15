/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.context.subselect;

import com.espertech.esper.epl.expression.ExprSubselectNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds stream information for subqueries.
 */
public class SubSelectStrategyCollection
{
    private Map<ExprSubselectNode, SubSelectStrategyFactoryDesc> subqueries;

    /**
     * Ctor.
     */
    public SubSelectStrategyCollection()
    {
        subqueries = new HashMap<ExprSubselectNode, SubSelectStrategyFactoryDesc>();
    }

    /**
     * Add lookup.
     * @param subselectNode is the subselect expression node
     */
    public void add(ExprSubselectNode subselectNode, SubSelectStrategyFactoryDesc prototypeHolder)
    {
        subqueries.put(subselectNode, prototypeHolder);
    }

    public Map<ExprSubselectNode, SubSelectStrategyFactoryDesc> getSubqueries() {
        return subqueries;
    }
}
