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

package com.espertech.esper.client.util;

import com.espertech.esper.client.EventType;
import com.espertech.esper.event.util.OutputValueRenderer;

/**
 * Context for use with the {@link EventPropertyRenderer} interface for use with the JSON or XML event renderes to handle custom event property rendering.
 * <p>Do not retain a handle to the renderer context as this object changes for each event property.</p>
 */
public class EventPropertyRendererContext
{
    private final EventType eventType;
    private final boolean jsonFormatted;

    private String propertyName;
    private Object propertyValue;
    private Integer indexedPropertyIndex;
    private String mappedPropertyKey;
    private StringBuilder stringBuilder;
    private OutputValueRenderer defaultRenderer;

    public EventPropertyRendererContext(EventType eventType, boolean jsonFormatted) {
        this.eventType = eventType;
        this.jsonFormatted = jsonFormatted;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Object getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Object propertyValue) {
        this.propertyValue = propertyValue;
    }

    public OutputValueRenderer getDefaultRenderer() {
        return defaultRenderer;
    }

    public void setDefaultRenderer(OutputValueRenderer defaultRenderer) {
        this.defaultRenderer = defaultRenderer;
    }

    public void setStringBuilderAndReset(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
        this.mappedPropertyKey = null;
        this.indexedPropertyIndex = null;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Integer getIndexedPropertyIndex() {
        return indexedPropertyIndex;
    }

    public void setIndexedPropertyIndex(Integer indexedPropertyIndex) {
        this.indexedPropertyIndex = indexedPropertyIndex;
    }

    public String getMappedPropertyKey() {
        return mappedPropertyKey;
    }

    public void setMappedPropertyKey(String mappedPropertyKey) {
        this.mappedPropertyKey = mappedPropertyKey;
    }

    public boolean isJsonFormatted() {
        return jsonFormatted;
    }
    
    public EventPropertyRendererContext copy() {
        EventPropertyRendererContext copy = new EventPropertyRendererContext(this.getEventType(), this.isJsonFormatted());                
        copy.setMappedPropertyKey(this.getMappedPropertyKey());
        copy.setIndexedPropertyIndex(this.getIndexedPropertyIndex());
        copy.setDefaultRenderer(this.getDefaultRenderer());
        copy.setPropertyName(this.getPropertyName());
        copy.setPropertyValue(this.getPropertyValue());
        return copy;
    }
}
