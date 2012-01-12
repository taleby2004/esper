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
import com.espertech.esper.client.context.ContextPartitionIdentifierPartitioned;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.client.context.ContextPartitionSelectorFiltered;
import com.espertech.esper.client.context.ContextPartitionSelectorSegmented;
import com.espertech.esper.collection.MultiKeyUntyped;
import com.espertech.esper.core.context.util.ContextControllerSelectorUtil;
import com.espertech.esper.core.context.util.StatementAgentInstanceUtil;
import com.espertech.esper.epl.spec.ContextDetailPartitionItem;
import com.espertech.esper.type.NumberSetParameter;

import java.util.*;

public class ContextControllerPartitioned implements ContextController, ContextControllerPartitionedInstanceCreateCallback {

    protected final int pathId;
    protected final ContextControllerLifecycleCallback activationCallback;
    protected final ContextControllerPartitionedFactory factory;

    protected final List<ContextControllerPartitionedFilterCallback> filterCallbacks = new ArrayList<ContextControllerPartitionedFilterCallback>();
    protected final HashMap<Object, ContextControllerInstanceHandle> partitionKeys = new HashMap<Object, ContextControllerInstanceHandle>();

    protected int currentSubpathId;

    public ContextControllerPartitioned(int pathId, ContextControllerLifecycleCallback activationCallback, ContextControllerPartitionedFactory factory) {
        this.pathId = pathId;
        this.activationCallback = activationCallback;
        this.factory = factory;
    }

    public Collection<Integer> getSelectedContextPartitionPathIds(ContextPartitionSelector contextPartitionSelector) {
        boolean isMultiKey = factory.getContextDetailPartitionItems().get(0).getPropertyNames().size() > 1;
        if (contextPartitionSelector instanceof ContextPartitionSelectorFiltered) {
            List<Integer> ids = new ArrayList<Integer>();
            ContextPartitionSelectorFiltered filtered = (ContextPartitionSelectorFiltered) contextPartitionSelector;

            ContextPartitionIdentifierPartitioned identifier = new ContextPartitionIdentifierPartitioned();
            for (Map.Entry<Object, ContextControllerInstanceHandle> entry : partitionKeys.entrySet()) {
                identifier.setContextPartitionId(entry.getValue().getContextPartitionOrPathId());
                if (isMultiKey) {
                    identifier.setKeys(((MultiKeyUntyped)entry.getKey()).getKeys());
                }
                else {
                    identifier.setKeys(new Object[] {entry.getKey()});
                }

                if (filtered.filter(identifier)) {
                    ids.add(entry.getValue().getContextPartitionOrPathId());
                }
            }
            return ids;
        }
        else if (contextPartitionSelector instanceof ContextPartitionSelectorSegmented) {
            ContextPartitionSelectorSegmented partitioned = (ContextPartitionSelectorSegmented) contextPartitionSelector;
            if (partitioned.getPartitionKeys() == null || partitioned.getPartitionKeys().isEmpty()) {
                return Collections.emptyList();
            }
            Set<Integer> ids = new HashSet<Integer>();
            for (Object[] keyObjects : partitioned.getPartitionKeys()) {

                Object key;
                if (isMultiKey) {
                    key = new MultiKeyUntyped(keyObjects);
                }
                else {
                    key = keyObjects[0];
                }
                ContextControllerInstanceHandle instanceHandle = partitionKeys.get(key);
                if (instanceHandle != null && instanceHandle.getContextPartitionOrPathId() != null) {
                    ids.add(instanceHandle.getContextPartitionOrPathId());
                }
            }
            return ids;
        }
        throw ContextControllerSelectorUtil.getInvalidSelector(new Class[]{ContextPartitionSelectorSegmented.class}, contextPartitionSelector);
    }

    public void activate(EventBean optionalTriggeringEvent, Map<String, Object> optionalTriggeringPattern, ContextControllerState states) {
        ContextControllerFactoryContext factoryContext = factory.getFactoryContext();

        for (ContextDetailPartitionItem item : factory.getSegmentedSpec().getItems()) {
            ContextControllerPartitionedFilterCallback callback = new ContextControllerPartitionedFilterCallback(factoryContext.getServicesContext(), factoryContext.getAgentInstanceContextCreate(), item, this);
            filterCallbacks.add(callback);

            if (optionalTriggeringEvent != null) {
                boolean match = StatementAgentInstanceUtil.evaluateFilterForStatement(factoryContext.getServicesContext(), optionalTriggeringEvent, factoryContext.getAgentInstanceContextCreate(), callback.getFilterHandle());

                if (match) {
                    callback.matchFound(optionalTriggeringEvent, null);
                }
            }
        }
    }

    public ContextControllerFactory getFactory() {
        return factory;
    }

    public int getPathId() {
        return pathId;
    }

    public void setContextPartitionRange(List<NumberSetParameter> partitionRanges) {
        throw new UnsupportedOperationException();
    }

    public synchronized void deactivate() {
        ContextControllerFactoryContext factoryContext = factory.getFactoryContext();
        for (ContextControllerPartitionedFilterCallback callback : filterCallbacks) {
            callback.destroy(factoryContext.getServicesContext().getFilterService());
        }
        partitionKeys.clear();
        filterCallbacks.clear();
    }

    public synchronized void create(Object key, EventBean event) {
        boolean exists = partitionKeys.containsKey(key);
        if (exists) {
            return;
        }

        currentSubpathId++;

        ContextControllerFactoryContext factoryContext = factory.getFactoryContext();
        Map<String, Object> props = ContextPropertyEventType.getPartitionBean(factoryContext.getContextName(), 0, key, factory.getSegmentedSpec().getItems().get(0).getPropertyNames());
        ContextControllerInstanceHandle handle = activationCallback.contextPartitionInstantiate(null, currentSubpathId, this, event, null, key, props, null);

        partitionKeys.put(key, handle);

        postCreation(handle, key);
    }

    protected void postCreation(ContextControllerInstanceHandle handle, Object key) {
    }
}
