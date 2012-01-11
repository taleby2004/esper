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

package com.espertech.esper.pattern;

import com.espertech.esper.client.scopetest.EPAssertionUtil;
import junit.framework.TestCase;

public class TestEvalNodeNumber extends TestCase
{
    public void testFlow()
    {
        EvalNodeNumber parent = new EvalNodeNumber();
        
        EvalNodeNumber child1 = parent.newChildNumber();
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0}, child1.getNumber());

        EvalNodeNumber child1_1 = child1.newChildNumber();
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0, 0}, child1_1.getNumber());

        EvalNodeNumber child1_2 = child1_1.newSiblingNumber();
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0, 1}, child1_2.getNumber());

        EvalNodeNumber child1_2_1 = child1_2.newChildNumber();
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0, 1, 0}, child1_2_1.getNumber());

        EvalNodeNumber child1_2_2 = child1_2_1.newSiblingNumber();
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0, 1, 1}, child1_2_2.getNumber());
        EPAssertionUtil.assertEqualsExactOrder(new short[]{0, 1}, child1_2_2.getParentNumber().getNumber());
    }

    public void testHashCode()
    {
        
    }
}
