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

package com.espertech.esper.event;

import com.espertech.esper.client.ConfigurationException;
import com.espertech.esper.client.EventPropertyDescriptor;
import com.espertech.esper.client.EventType;
import com.espertech.esper.client.FragmentEventType;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.ColumnDesc;
import com.espertech.esper.event.bean.BeanEventType;
import com.espertech.esper.util.JavaClassHelper;

import java.lang.reflect.Array;
import java.util.*;

public class EventTypeUtility {

    public static Map<String, Object> buildType(List<ColumnDesc> columns, EventAdapterService eventAdapterService, Set<String> copyFrom) throws ExprValidationException {
        Map<String, Object> typing = new HashMap<String, Object>();
        Set<String> columnNames = new HashSet<String>();
        for (ColumnDesc column : columns) {
            boolean added = columnNames.add(column.getName());
            if (!added) {
                throw new ExprValidationException("Duplicate column name '" + column.getName() + "'");
            }
            Class plain = JavaClassHelper.getClassForSimpleName(column.getType());
            if (plain != null) {
                if (column.isArray()) {
                    plain = Array.newInstance(plain, 0).getClass();
                }
                typing.put(column.getName(), plain);
            }
            else {
                if (column.isArray()) {
                    typing.put(column.getName(), column.getType() + "[]");
                }
                else {
                    typing.put(column.getName(), column.getType());
                }
            }
        }

        if (copyFrom != null && !copyFrom.isEmpty()) {
            for (String copyFromName : copyFrom) {
                EventType type = eventAdapterService.getExistsTypeByName(copyFromName);
                if (type == null) {
                    throw new ExprValidationException("Type by name '" + copyFromName + "' could not be located");
                }
                mergeType(typing, type);
            }
        }
        return typing;
    }

    private static void mergeType(Map<String, Object> typing, EventType typeToMerge)
        throws ExprValidationException {
        for (EventPropertyDescriptor prop : typeToMerge.getPropertyDescriptors()) {

            Object existing = typing.get(prop.getPropertyName());

            if (!prop.isFragment()) {
                Class assigned = prop.getPropertyType();
                if (existing != null && existing instanceof Class) {
                    if (JavaClassHelper.getBoxedType((Class) existing) != JavaClassHelper.getBoxedType(assigned)) {
                        throw new ExprValidationException("Type by name '" + typeToMerge.getName() + "' contributes property '" +
                          prop.getPropertyName() + "' defined as '" + JavaClassHelper.getClassNameFullyQualPretty(assigned) +
                                "' which overides the same property of type '" + JavaClassHelper.getClassNameFullyQualPretty((Class)existing)+ "'");
                    }
                }
                typing.put(prop.getPropertyName(), prop.getPropertyType());
            }
            else {
                if (existing != null) {
                    throw new ExprValidationException("Property by name '" + prop.getPropertyName() + "' is defined twice by adding type '" + typeToMerge.getName() + "'");
                }

                FragmentEventType fragment = typeToMerge.getFragmentType(prop.getPropertyName());
                if (fragment == null) {
                    continue;
                }
                if (fragment.isIndexed()) {
                    typing.put(prop.getPropertyName(), new EventType[] {fragment.getFragmentType()});
                }
                else {
                    typing.put(prop.getPropertyName(), fragment.getFragmentType());
                }
            }
        }
    }

    public static void validateTimestampProperties(EventType eventType, String startTimestampProperty, String endTimestampProperty)
            throws ConfigurationException {

        if (startTimestampProperty != null) {
            if (eventType.getGetter(startTimestampProperty) == null) {
                throw new ConfigurationException("Declared start timestamp property name '" + startTimestampProperty + "' was not found");
            }
            Class type = eventType.getPropertyType(startTimestampProperty);
            if (!JavaClassHelper.isDatetimeClass(type)) {
                throw new ConfigurationException("Declared start timestamp property '" + startTimestampProperty + "' is expected to return a Date, Calendar or long-typed value but returns '" + type.getName() + "'");
            }
        }

        if (endTimestampProperty != null) {
            if (startTimestampProperty == null) {
                throw new ConfigurationException("Declared end timestamp property requires that a start timestamp property is also declared");
            }
            if (eventType.getGetter(endTimestampProperty) == null) {
                throw new ConfigurationException("Declared end timestamp property name '" + endTimestampProperty + "' was not found");
            }
            Class type = eventType.getPropertyType(endTimestampProperty);
            if (!JavaClassHelper.isDatetimeClass(type)) {
                throw new ConfigurationException("Declared end timestamp property '" + endTimestampProperty + "' is expected to return a Date, Calendar or long-typed value but returns '" + type.getName() + "'");
            }
            Class startType = eventType.getPropertyType(startTimestampProperty);
            if (JavaClassHelper.getBoxedType(startType) != JavaClassHelper.getBoxedType(type)) {
                throw new ConfigurationException("Declared end timestamp property '" + endTimestampProperty + "' is expected to have the same property type as the start-timestamp property '" + startTimestampProperty + "'");
            }
        }
    }

    public static boolean isTypeOrSubTypeOf(EventType candidate, EventType superType) {

        if (candidate == superType) {
            return true;
        }

        if (candidate.getSuperTypes() != null) {
            for (Iterator<EventType> it = candidate.getDeepSuperTypes(); it.hasNext();) {
                if (it.next() == superType) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Determine among the Map-type properties which properties are Bean-type event type names,
     * rewrites these as Class-type instead so that they are configured as native property and do not require wrapping,
     * but may require unwrapping.
     * @param typing properties of map type
     * @param eventAdapterService event adapter service
     * @return compiled properties, same as original unless Bean-type event type names were specified.
     */
    public static Map<String, Object> compileMapTypeProperties(Map<String, Object> typing, EventAdapterService eventAdapterService) {
        Map<String, Object> compiled = new LinkedHashMap<String, Object>(typing);
        for (Map.Entry<String, Object> specifiedEntry : typing.entrySet()) {
            Object typeSpec = specifiedEntry.getValue();
            String nameSpec = specifiedEntry.getKey();
            if (!(typeSpec instanceof String)) {
                continue;
            }

            String typeNameSpec = (String) typeSpec;
            boolean isArray = EventTypeUtility.isPropertyArray(typeNameSpec);
            if (isArray) {
                typeNameSpec = EventTypeUtility.getPropertyRemoveArray(typeNameSpec);
            }

            EventType eventType = eventAdapterService.getExistsTypeByName(typeNameSpec);
            if (eventType == null || !(eventType instanceof BeanEventType)) {
                continue;
            }

            BeanEventType beanEventType = (BeanEventType) eventType;
            Class underlyingType = beanEventType.getUnderlyingType();
            if (isArray) {
                underlyingType = JavaClassHelper.getArrayType(underlyingType);
            }
            compiled.put(nameSpec, underlyingType);
        }
        return compiled;
    }

    /**
     * Returns true if the name indicates that the type is an array type.
     * @param name the property name
     * @return true if array type
     */
    public static boolean isPropertyArray(String name)
    {
        return name.trim().endsWith("[]");
    }

    /**
     * Returns the property name without the array type extension, if present.
     * @param name property name
     * @return property name with removed array extension name
     */
    public static String getPropertyRemoveArray(String name)
    {
        return name.replaceAll("\\[", "").replaceAll("\\]", "");
    }
}
