/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.named;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.EventPropertyDescriptor;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.epl.expression.*;
import com.espertech.esper.epl.spec.OnTriggerSetAssignment;
import com.espertech.esper.event.EventBeanCopyMethod;
import com.espertech.esper.event.EventPropertyWriter;
import com.espertech.esper.event.EventTypeSPI;
import com.espertech.esper.util.TypeWidener;
import com.espertech.esper.util.TypeWidenerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NamedWindowUpdateHelper
{
    private static final Log log = LogFactory.getLog(NamedWindowUpdateHelper.class);

    private final EventBeanCopyMethod copyMethod;
    private final NamedWindowUpdateItem[] updateItems;

    public NamedWindowUpdateHelper(EventBeanCopyMethod copyMethod, NamedWindowUpdateItem[] updateItems) {
        this.copyMethod = copyMethod;
        this.updateItems = updateItems;
    }

    public static NamedWindowUpdateHelper make(String namedWindowName,
                                               EventTypeSPI eventTypeSPI,
                                        List<OnTriggerSetAssignment> assignments,
                                        String namedWindowAlias)
            throws ExprValidationException
    {
        List<NamedWindowUpdateItem> updateItems = new ArrayList<NamedWindowUpdateItem>();
        List<String> properties = new ArrayList<String>();

        for (int i = 0; i < assignments.size(); i++)
        {
            OnTriggerSetAssignment assignment = assignments.get(i);
            NamedWindowUpdateItem updateItem;

            // determine whether this is a "property=value" assignment, we use property setters in this case
            Pair<String, ExprNode> possibleAssignment = ExprNodeUtility.checkGetAssignmentToProp(assignment.getExpression());

            // handle assignment "property = value"
            if (possibleAssignment != null) {

                String propertyName = possibleAssignment.getFirst();
                EventPropertyDescriptor writableProperty = eventTypeSPI.getWritableProperty(propertyName);

                if (writableProperty == null) {
                    Pair<String, EventPropertyDescriptor> nameWriteablePair = checkIndexedOrMappedProp(possibleAssignment.getFirst(), namedWindowName, namedWindowAlias, eventTypeSPI);
                    propertyName = nameWriteablePair.getFirst();
                    writableProperty = nameWriteablePair.getSecond();
                }

                ExprEvaluator evaluator = possibleAssignment.getSecond().getExprEvaluator();
                EventPropertyWriter writers = eventTypeSPI.getWriter(propertyName);
                boolean notNullableField = writableProperty.getPropertyType().isPrimitive();

                properties.add(propertyName);
                TypeWidener widener = TypeWidenerFactory.getCheckPropertyAssignType(possibleAssignment.getSecond().toExpressionString(), possibleAssignment.getSecond().getExprEvaluator().getType(),
                        writableProperty.getPropertyType(), propertyName);
                updateItem = new NamedWindowUpdateItem(evaluator, propertyName, writers, notNullableField, widener);
            }
            // handle non-assignment, i.e. UDF or other expression
            else {
                ExprEvaluator evaluator = assignment.getExpression().getExprEvaluator();
                updateItem = new NamedWindowUpdateItem(evaluator, null, null, false, null);
            }
            updateItems.add(updateItem);
        }

        // obtain copy method
        List<String> propertiesUniqueList = new ArrayList<String>(new HashSet<String>(properties));
        String[] propertiesArray = propertiesUniqueList.toArray(new String[propertiesUniqueList.size()]);
        EventBeanCopyMethod copyMethod = eventTypeSPI.getCopyMethod(propertiesArray);
        if (copyMethod == null) {
            throw new ExprValidationException("Event type does not support event bean copy");
        }

        NamedWindowUpdateItem[] updateItemsArray = updateItems.toArray(new NamedWindowUpdateItem[updateItems.size()]);

        return new NamedWindowUpdateHelper(copyMethod, updateItemsArray);
    }

    public EventBean update(EventBean matchingEvent, EventBean[] eventsPerStream, ExprEvaluatorContext exprEvaluatorContext)
    {
        EventBean copy = copyMethod.copy(matchingEvent);
        eventsPerStream[0] = copy;
        eventsPerStream[2] = matchingEvent; // initial value

        for (NamedWindowUpdateItem updateItem : updateItems) {
            Object result = updateItem.getExpression().evaluate(eventsPerStream, true, exprEvaluatorContext);

            if (updateItem.getOptionalWriter() != null) {
                if (result == null && updateItem.isNotNullableField()) {
                    log.warn("Null value returned by expression for assignment to property '" + updateItem.getOptinalPropertyName() + " is ignored as the property type is not nullable for expression");
                    continue;
                }

                if (updateItem.getOptionalWidener() != null) {
                    result = updateItem.getOptionalWidener().widen(result);
                }
                updateItem.getOptionalWriter().write(result, copy);
            }
        }
        return copy;
    }

    private static Pair<String, EventPropertyDescriptor> checkIndexedOrMappedProp(String propertyName, String namedWindowName, String namedWindowAlias, EventTypeSPI eventTypeSPI) throws ExprValidationException {

        EventPropertyDescriptor writableProperty = null;

        int indexDot = propertyName.indexOf(".");
        if ((namedWindowAlias != null) && (indexDot != -1)) {
            String prefix = propertyName.substring(0, indexDot);
            String name = propertyName.substring(indexDot + 1);
            if (prefix.equals(namedWindowAlias)) {
                writableProperty = eventTypeSPI.getWritableProperty(name);
                propertyName = name;
            }
        }
        if (writableProperty == null && indexDot != -1) {
            String prefix = propertyName.substring(0, indexDot);
            String name = propertyName.substring(indexDot + 1);
            if (prefix.equals(namedWindowName)) {
                writableProperty = eventTypeSPI.getWritableProperty(name);
                propertyName = name;
            }
        }
        if (writableProperty == null) {
            throw new ExprValidationException("Property '" + propertyName + "' is not available for write access");
        }
        return new Pair<String, EventPropertyDescriptor>(propertyName, writableProperty);
    }
}