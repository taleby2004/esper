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

import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterValueSetParam;

import java.util.ArrayDeque;
import java.util.List;

public class ContextDetailCategory implements ContextDetail {

    private final List<ContextDetailCategoryItem> items;
    private final FilterSpecRaw filterSpecRaw;

    private FilterSpecCompiled filterSpecCompiled;
    private ArrayDeque<FilterValueSetParam> filterParamsCompiled;

    public ContextDetailCategory(List<ContextDetailCategoryItem> items, FilterSpecRaw filterSpecRaw) {
        this.items = items;
        this.filterSpecRaw = filterSpecRaw;
    }

    public FilterSpecRaw getFilterSpecRaw() {
        return filterSpecRaw;
    }

    public List<ContextDetailCategoryItem> getItems() {
        return items;
    }

    public void setFilterSpecCompiled(FilterSpecCompiled filterSpec) {
        this.filterSpecCompiled = filterSpec;
        this.filterParamsCompiled = filterSpecCompiled.getValueSet(null, null, null).getParameters();
    }

    public FilterSpecCompiled getFilterSpecCompiled() {
        return filterSpecCompiled;
    }

    public ArrayDeque<FilterValueSetParam> getFilterParamsCompiled() {
        return filterParamsCompiled;
    }
}
