/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.util;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.MultiKey;
import com.espertech.esper.collection.NullIterator;

import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Utility for handling collection or array tasks.
 */
public class CollectionUtil
{
    public final static Iterator<EventBean> NULL_EVENT_ITERATOR = new NullIterator<EventBean>();
    public final static SortedMap EMPTY_SORTED_MAP = new TreeMap();
    public final static Set<MultiKey<EventBean>> EMPTY_ROW_SET = new HashSet<MultiKey<EventBean>>();
    public final static EventBean[] EVENT_PER_STREAM_EMPTY = new EventBean[0];
    public final static Set<EventBean> SINGLE_NULL_ROW_EVENT_SET = new HashSet<EventBean>();
    static
    {
        SINGLE_NULL_ROW_EVENT_SET.add(null);
    }

    public final static StopCallback STOP_CALLBACK_NONE;
    static {
        STOP_CALLBACK_NONE = new StopCallback() {
            public void stop() {
                // no action
            }
        };
    }


    public static String toString(Collection<Integer> stack, String delimiterChars) {
        if (stack.isEmpty()) {
            return "";
        }
        if (stack.size() == 1) {
            return Integer.toString(stack.iterator().next());
        }
        StringWriter writer = new StringWriter();
        String delimiter = "";
        for (Integer item : stack) {
            writer.append(delimiter);
            writer.append(Integer.toString(item));
            delimiter = delimiterChars;
        }
        return writer.toString();
    }

    public static Object expandAddElement(Object array, Object[] elementsToAdd) {
        Class cl = array.getClass();
        if (!cl.isArray()) return null;
        int length = Array.getLength(array);
        int newLength = length + elementsToAdd.length;
        Class componentType = array.getClass().getComponentType();
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(array, 0, newArray, 0, length);
        for (int i = 0; i < elementsToAdd.length; i++) {
            Array.set(newArray, length + i, elementsToAdd[i]);
        }
        return newArray;
    }

    public static int[] addValue(int[] ints, int i) {
        int[] copy = new int[ints.length + 1];
        System.arraycopy(ints, 0, copy, 0, ints.length);
        copy[ints.length] = i;
        return copy;
    }

    public static int findItem(String[] items, String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns an array of integer values from the set of integer values
     * @param set to return array for
     * @return array
     */
    public static int[] intArray(Collection<Integer> set)
    {
        if (set == null)
        {
            return new int[0];
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer value : set) {
            result[index++] = value;
        }
        return result;
    }

    public static String[] copySortArray(String[] values) {
        if (values == null) {
            return null;
        }
        String[] copy = new String[values.length];
        System.arraycopy(values, 0, copy, 0, values.length);
        Arrays.sort(copy);
        return copy;
    }

    public static boolean sortCompare(String[] valuesOne, String[] valuesTwo) {
        if (valuesOne == null) {
            return valuesTwo == null;
        }
        if (valuesTwo == null) {
            return false;
        }
        String[] copyOne = copySortArray(valuesOne);
        String[] copyTwo = copySortArray(valuesTwo);
        return Arrays.equals(copyOne, copyTwo);
    }

    /**
     * Returns a list of the elements invoking toString on non-null elements.
     * @param collection to render
     * @param <T> type
     * @return comma-separate list of values (no escape)
     */
    public static <T> String toString(Collection<T> collection)
    {
        if (collection == null)
        {
            return "null";
        }
        if (collection.isEmpty())
        {
            return "";
        }
        StringBuilder buf = new StringBuilder();
        String delimiter = "";
        for (T t : collection)
        {
            if (t == null)
            {
                continue;
            }
            buf.append(delimiter);
            buf.append(t);
            delimiter = ", ";
        }
        return buf.toString();
    }

    public static boolean compare(String[] otherIndexProps, String[] thisIndexProps) {
        if (otherIndexProps != null && thisIndexProps != null) {
            return Arrays.equals(otherIndexProps, thisIndexProps);
        }
        return otherIndexProps == null && thisIndexProps == null;
    }

    public static boolean isAllNullArray(Object array) {
        if (array == null) {
            throw new NullPointerException();
        }
        if (!array.getClass().isArray()) {
            throw new IllegalArgumentException("Expected array but received " + array.getClass());
        }
        for (int i = 0; i < Array.getLength(array); i++) {
            if (Array.get(array, i) != null) {
                return false;
            }
        }
        return true;
    }

    public static String toStringArray(Object[] received) {
        StringBuilder buf = new StringBuilder();
        String delimiter = "";
        buf.append("[");
        for (Object t : received)
        {
            buf.append(delimiter);
            if (t == null) {
                buf.append("null");
            }
            else if (t instanceof Object[]) {
                buf.append(toStringArray((Object[]) t));
            }
            else {
                buf.append(t);
            }
            delimiter = ", ";
        }
        buf.append("]");
        return buf.toString();
    }

    public static Map<String, Object> populateNameValueMap(Object... values) {
        Map<String, Object> result = new LinkedHashMap<String, Object>();
        int count = values.length / 2;
        if (values.length != count * 2) {
            throw new IllegalArgumentException("Expected an event number of name-value pairs");
        }
        for (int i = 0; i < count; i++) {
            int index = i * 2;
            Object keyValue = values[index];
            if (!(keyValue instanceof String)) {
                throw new IllegalArgumentException("Expected string-type key value at index " + index + " but found " + keyValue);
            }
            String key = (String) keyValue;
            Object value = values[index + 1];
            if (result.containsKey(key)) {
                throw new IllegalArgumentException("Found two or more values for key '" + key + "'");
            }
            result.put(key, value);
        }
        return result;
    }

    public static Object addArrays(Object first, Object second) {
        if (first != null && !first.getClass().isArray()) {
            throw new IllegalArgumentException("Parameter is not an array: " + first);
        }
        if (second != null && !second.getClass().isArray()) {
            throw new IllegalArgumentException("Parameter is not an array: " + second);
        }
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        int firstLength = Array.getLength(first);
        int secondLength = Array.getLength(second);
        int total = firstLength + secondLength;
        Object dest = Array.newInstance(first.getClass().getComponentType(), total);
        System.arraycopy(first, 0, dest, 0, firstLength);
        System.arraycopy(second, 0, dest, firstLength, secondLength);
        return dest;
    }
}