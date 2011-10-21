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
import com.espertech.esper.client.EventType;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.epl.spec.ContextDetailInitiatedTerminated;
import com.espertech.esper.epl.spec.ContextDetailPartitioned;
import com.espertech.esper.event.EventAdapterService;
import com.espertech.esper.event.map.MapEventBean;

import java.util.*;

public class ContextPropertyEventType {
    public static final String PROP_CTX_NAME = "name";
    public static final String PROP_CTX_ID = "id";
    public static final String PROP_CTX_LABEL = "label";
    public static final String PROP_CTX_STARTTIME = "startTime";
    public static final String PROP_CTX_ENDTIME = "endTime";
    public static final String PROP_CTX_KEY_PREFIX = "key";

    private final static List<ContextProperty> LIST_TEMPORAL_FIXED_PROPS;
    private final static List<ContextProperty> LIST_CATEGORY_PROPS;
    private final static List<ContextProperty> LIST_PARTITION_PROPS;
    private final static List<ContextProperty> LIST_TEMPORAL_OVERLAP_PROPS;

    static {
        LIST_TEMPORAL_FIXED_PROPS = new ArrayList<ContextProperty>();
        LIST_TEMPORAL_FIXED_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_NAME, String.class));
        LIST_TEMPORAL_FIXED_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_STARTTIME, long.class));
        LIST_TEMPORAL_FIXED_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_ENDTIME, long.class));

        LIST_CATEGORY_PROPS = new ArrayList<ContextProperty>();
        LIST_CATEGORY_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_NAME, String.class));
        LIST_CATEGORY_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_ID, int.class));
        LIST_CATEGORY_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_LABEL, String.class));

        LIST_PARTITION_PROPS = new ArrayList<ContextProperty>();
        LIST_PARTITION_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_NAME, String.class));
        LIST_PARTITION_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_ID, int.class));

        LIST_TEMPORAL_OVERLAP_PROPS = new ArrayList<ContextProperty>();
        LIST_TEMPORAL_OVERLAP_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_NAME, String.class));
        LIST_TEMPORAL_OVERLAP_PROPS.add(new ContextProperty(ContextPropertyEventType.PROP_CTX_ID, int.class));
    }

    public static EventType getCategorizedType(String contextName, EventAdapterService eventAdapterService) {
        return createFixedType(contextName, LIST_CATEGORY_PROPS, eventAdapterService);
    }

    public static EventBean getCategorizedBean(EventAdapterService eventAdapterService, EventType eventType, String contextName, int agentInstanceId, String label) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(PROP_CTX_NAME, contextName);
        props.put(PROP_CTX_ID, agentInstanceId);
        props.put(PROP_CTX_LABEL, label);
        return eventAdapterService.adapterForTypedMap(props, eventType);
    }

    public static EventType getTemporalFixedType(String contextName, EventAdapterService eventAdapterService) {
        return createFixedType(contextName, LIST_TEMPORAL_FIXED_PROPS, eventAdapterService);
    }

    public static EventBean getTemporalFixedBean(EventAdapterService eventAdapterService, EventType eventType, String contextName, long startTime, long endTime) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(PROP_CTX_NAME, contextName);
        props.put(PROP_CTX_STARTTIME, startTime);
        props.put(PROP_CTX_ENDTIME, endTime);
        return eventAdapterService.adapterForTypedMap(props, eventType);
    }

    public static EventType getTemporalOverlapType(String contextName, ContextDetailInitiatedTerminated overlapSpec, EventAdapterService eventAdapterService) {
        Map<String, Object> additionalProperties = new HashMap();
        if (overlapSpec.getInitiatedFilter() != null) {
            additionalProperties.put(overlapSpec.getInitiatedFilterAsName(), overlapSpec.getInitiatedFilterCompiled().getFilterForEventType());
        }
        else {
            for (Map.Entry<String, Pair<EventType, String>> entry : overlapSpec.getInitiatedPatternCompiled().getTaggedEventTypes().entrySet()) {
                additionalProperties.put(entry.getKey(), entry.getValue().getFirst());
            }
        }
        return ContextPropertyEventType.makeEventType("context_" + contextName, ContextPropertyEventType.LIST_TEMPORAL_OVERLAP_PROPS, additionalProperties, eventAdapterService);
    }

    public static EventBean getTempOverlapBean(EventAdapterService eventAdapterService, EventType eventType, String contextName, int agentInstanceId, Map<String, Object> matchEvent, EventBean event, String filterAsName) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(PROP_CTX_NAME, contextName);
        props.put(PROP_CTX_ID, agentInstanceId);
        if (matchEvent != null) {
            props.putAll(matchEvent);
        }
        else {
            props.put(filterAsName, event);
        }
        return eventAdapterService.adapterForTypedMap(props, eventType);
    }

    public static EventType getPartitionType(String contextName, ContextDetailPartitioned segmentedSpec, Class[] propertyTypes, EventAdapterService eventAdapterService) {
        Map<String, Object> props = new LinkedHashMap<String, Object>();
        for (int i = 0; i < segmentedSpec.getItems().get(0).getPropertyNames().size(); i++) {
            String propertyName = ContextPropertyEventType.PROP_CTX_KEY_PREFIX + (i + 1);
            props.put(propertyName, propertyTypes[i]);
        }
        return makeEventType(contextName, ContextPropertyEventType.LIST_PARTITION_PROPS, props, eventAdapterService);
    }

    public static EventBean getPartitionBean(EventAdapterService eventAdapterService, EventType eventType, String contextName, int agentInstanceId, Object[] keys) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(PROP_CTX_NAME, contextName);
        props.put(PROP_CTX_ID, agentInstanceId);
        for (int i = 0; i < keys.length; i++) {
            String propertyName = ContextPropertyEventType.PROP_CTX_KEY_PREFIX + (i + 1);
            props.put(propertyName, keys[i]);
        }
        return eventAdapterService.adapterForTypedMap(props, eventType);
    }

    private static EventType createFixedType(String name, List<ContextProperty> props, EventAdapterService eventAdapterService) {
        return makeEventType(name, props, Collections.EMPTY_MAP, eventAdapterService);
    }

    private static EventType makeEventType(String name, List<ContextProperty> builtin, Map<String, Object> additionalProperties, EventAdapterService eventAdapterService) {
        Map<String, Object> properties = new LinkedHashMap<String, Object>(additionalProperties);
        for (ContextProperty prop : builtin) {
            properties.put(prop.getPropertyName(), prop.getPropertyType());
        }
        return eventAdapterService.createAnonymousMapType(name, properties);
    }

    public static class ContextProperty {

        private final String propertyName;
        private final Class propertyType;

        public ContextProperty(String propertyName, Class propertyType) {
            this.propertyName = propertyName;
            this.propertyType = propertyType;
        }

        public String getPropertyName() {
            return propertyName;
        }

        public Class getPropertyType() {
            return propertyType;
        }
    }
}
