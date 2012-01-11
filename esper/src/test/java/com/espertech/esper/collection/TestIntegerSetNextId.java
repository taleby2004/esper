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

package com.espertech.esper.collection;

import junit.framework.TestCase;

public class TestIntegerSetNextId extends TestCase {
    public void testFlow() {
        IntegerSetNextId set = new IntegerSetNextId();
        assertEquals(0, set.nextId());

        set.add(0);
        assertEquals(1, set.nextId());

        set.add(1);
        assertEquals(2, set.nextId());

        set.add(2);
        assertEquals(3, set.nextId());

        set.remove(1);
        assertEquals(1, set.nextId());

        set.add(1);
        assertEquals(3, set.nextId());

        set.add(4);
        assertEquals(3, set.nextId());

        set.add(3);
        assertEquals(5, set.nextId());

        set.add(5);
        assertEquals(6, set.nextId());

        for (int i = 0; i < 4; i++) {
            set.remove(i);
        }
        assertEquals(0, set.nextId());
        
        set.add(0);
        assertEquals(1, set.nextId());
    }
}
