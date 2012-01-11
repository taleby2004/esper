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

import java.util.Set;
import java.util.TreeSet;

/**
 * Simple set of integers that proposed a next id to add to the set based on whether the set is sequentially filled starting at zero (i.e. 0, 1, 2, ..., N).
 * If a hole in the sequence is detected (hole: size < last) the class performs a sequential scan to find the hole.
 */
public class IntegerSetNextId {
    private final TreeSet<Integer> ids;

    public IntegerSetNextId() {
        ids = new TreeSet<Integer>();
    }

    public void add(int id) {
        ids.add(id);
    }

    public int nextId() {
        if (ids.isEmpty()) {
            return 0;
        }
        if (ids.size() <= ids.last()) {
            return findHole();
        }
        return ids.last() + 1;
    }

    public void remove(int id) {
        ids.remove(id);
    }

    private int findHole() {
        for (int i = 0; i < ids.size(); i++) {
            if (!ids.contains(i)) {
                return i;
            }
        }
        return ids.last() + 1;
    }

    public void clear() {
        ids.clear();
    }

    public Set<Integer> getIds() {
        return ids;
    }
}
