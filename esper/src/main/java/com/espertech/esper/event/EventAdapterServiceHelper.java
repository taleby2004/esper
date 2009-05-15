/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.event;

import com.espertech.esper.client.EventType;
import com.espertech.esper.epl.core.MethodResolutionService;
import com.espertech.esper.event.bean.BeanEventType;
import com.espertech.esper.event.bean.EventBeanManufacturerBean;
import com.espertech.esper.event.bean.PropertyHelper;
import com.espertech.esper.event.map.MapEventType;
import net.sf.cglib.reflect.FastClass;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventAdapterServiceHelper
{
    public static Set<WriteablePropertyDescriptor> getWriteableProperties(EventType eventType)
    {
        if (!(eventType instanceof EventTypeSPI))
        {
            return null;
        }
        EventTypeSPI typeSPI = (EventTypeSPI) eventType;
        if (!typeSPI.getMetadata().isApplicationConfigured())
        {
            return null;
        }
        if (eventType instanceof BeanEventType)
        {
            BeanEventType beanEventType = (BeanEventType) eventType;
            FastClass fastClass = beanEventType.getFastClass();
            return PropertyHelper.getWritableProperties(fastClass.getJavaClass());
        }
        else if (eventType instanceof MapEventType)
        {
            Map<String, Object> mapdef = ((MapEventType) eventType).getTypes();
            Set<WriteablePropertyDescriptor> writables = new HashSet<WriteablePropertyDescriptor>();
            for (Map.Entry<String, Object> types : mapdef.entrySet())
            {
                if (types.getValue() instanceof Class)
                {
                    writables.add(new WriteablePropertyDescriptor(types.getKey(), (Class) types.getValue(), null));
                }
            }
            return writables;
        }
        else
        {
            return null;
        }
    }

    public static EventBeanManufacturer getManufacturer(EventAdapterService eventAdapterService, EventType eventType, WriteablePropertyDescriptor[] properties, MethodResolutionService methodResolutionService)
            throws EventBeanManufactureException
    {
        if (!(eventType instanceof EventTypeSPI))
        {
            return null;
        }
        EventTypeSPI typeSPI = (EventTypeSPI) eventType;
        if (!typeSPI.getMetadata().isApplicationConfigured())
        {
            return null;
        }
        if (eventType instanceof BeanEventType)
        {
            BeanEventType beanEventType = (BeanEventType) eventType;
            return new EventBeanManufacturerBean(beanEventType, eventAdapterService, properties, methodResolutionService);
        }
        else if (eventType instanceof MapEventType)
        {
            MapEventType mapEventType = (MapEventType) eventType;
            return new EventBeanManufacturerMap(mapEventType, eventAdapterService, properties);
        }
        return null;
    }
}
