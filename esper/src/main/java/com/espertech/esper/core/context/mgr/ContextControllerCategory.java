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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.context.ContextPartitionIdentifierCategory;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.client.context.ContextPartitionSelectorCategory;
import com.espertech.esper.client.context.ContextPartitionSelectorFiltered;
import com.espertech.esper.core.context.util.ContextControllerSelectorUtil;
import com.espertech.esper.epl.spec.ContextDetailCategoryItem;
import com.espertech.esper.type.NumberSetParameter;

import java.util.*;

public class ContextControllerCategory implements ContextController {

    private final int pathId;
    private final ContextControllerLifecycleCallback activationCallback;
    private final ContextControllerCategoryFactory factory;

    private final Map<Integer, ContextControllerInstanceHandle> handleCategories = new LinkedHashMap<Integer, ContextControllerInstanceHandle>();

    private int currentSubpathId;

    public ContextControllerCategory(int pathId, ContextControllerLifecycleCallback activationCallback, ContextControllerCategoryFactory factory) {
        this.pathId = pathId;
        this.activationCallback = activationCallback;
        this.factory = factory;
    }

    public Collection<Integer> getSelectedContextPartitionPathIds(ContextPartitionSelector contextPartitionSelector) {
        if (contextPartitionSelector instanceof ContextPartitionSelectorFiltered) {
            ContextPartitionSelectorFiltered filter = (ContextPartitionSelectorFiltered) contextPartitionSelector;
            ContextPartitionIdentifierCategory identifier = new ContextPartitionIdentifierCategory();
            List<Integer> accepted = new ArrayList<Integer>();
            for (Map.Entry<Integer, ContextControllerInstanceHandle> entry : handleCategories.entrySet()) {
                identifier.setContextPartitionId(entry.getValue().getContextPartitionOrPathId());
                identifier.setLabel(factory.getCategorySpec().getItems().get(entry.getKey()).getName());
                if (filter.filter(identifier)) {
                    accepted.add(entry.getValue().getContextPartitionOrPathId());
                }
            }
            return accepted;
        }
        if (contextPartitionSelector instanceof ContextPartitionSelectorCategory) {
            ContextPartitionSelectorCategory category = (ContextPartitionSelectorCategory) contextPartitionSelector;
            if (category.getLabels() == null || category.getLabels().isEmpty()) {
                return Collections.emptyList();
            }
            List<Integer> items = new ArrayList<Integer>();
            int count = 0;
            for (ContextDetailCategoryItem item : factory.getCategorySpec().getItems()) {
                if (category.getLabels().contains(item.getName())) {
                    ContextControllerInstanceHandle handle = handleCategories.get(count);
                    if (handle != null) {
                        items.add(handle.getContextPartitionOrPathId());
                    }
                }
                count++;
            }
            return items;
        }
        throw ContextControllerSelectorUtil.getInvalidSelector(new Class[] {ContextPartitionSelectorCategory.class}, contextPartitionSelector);
    }

    public void activate(EventBean optionalTriggeringEvent, Map<String, Object> optionalTriggeringPattern, ContextControllerState states) {
        int count = 0;
        for (ContextDetailCategoryItem category : factory.getCategorySpec().getItems()) {
            Map<String, Object> context = ContextPropertyEventType.getCategorizedBean(factory.getFactoryContext().getContextName(), 0, category.getName());
            currentSubpathId++;
            ContextControllerInstanceHandle handle = activationCallback.contextPartitionInstantiate(null, currentSubpathId, this, null, null, category.getName(), context, states);
            handleCategories.put(count, handle);
            count++;
        }
    }

    public ContextControllerFactory getFactory() {
        return factory;
    }

    public int getPathId() {
        return pathId;
    }

    public void deactivate() {
        handleCategories.clear();
    }

    public void setContextPartitionRange(List<NumberSetParameter> partitionRanges) {
        throw new UnsupportedOperationException();
    }
}
