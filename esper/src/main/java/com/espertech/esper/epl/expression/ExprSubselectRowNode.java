/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.expression;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.EventType;
import com.espertech.esper.epl.spec.StatementSpecRaw;
import com.espertech.esper.event.EventAdapterService;
import com.espertech.esper.event.EventBeanUtility;
import com.espertech.esper.util.JavaClassHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * Represents a subselect in an expression tree.
 */
public class ExprSubselectRowNode extends ExprSubselectNode
{
    private static final Log log = LogFactory.getLog(ExprSubselectRowNode.class);
    private static final long serialVersionUID = -7865711714805807559L;

    public static final SubqueryEvalStrategy UNFILTERED_UNSELECTED = new SubqueryEvalStrategyUnfilteredUnselected();
    public static final SubqueryEvalStrategy UNFILTERED_SELECTED = new SubqueryEvalStrategyUnfilteredSelected();
    public static final SubqueryEvalStrategy FILTERED_UNSELECTED = new SubqueryEvalStrategyFilteredUnselected();
    public static final SubqueryEvalStrategy FILTERED_SELECTED = new SubqueryEvalStrategyFilteredSelected();

    private transient SubselectMultirowType subselectMultirowType;
    private transient SubqueryEvalStrategy evalStrategy;

    /**
     * Ctor.
     * @param statementSpec is the lookup statement spec from the parser, unvalidated
     */
    public ExprSubselectRowNode(StatementSpecRaw statementSpec) {
        super(statementSpec);
    }

    public Class getType() {
        if (selectClause == null) {   // wildcards allowed
            return rawEventType.getUnderlyingType();
        }
        if (selectClause.length == 1) {
            return JavaClassHelper.getBoxedType(selectClause[0].getExprEvaluator().getType());
        }
        return null;
    }

    public void validateSubquery(ExprValidationContext validationContext) throws ExprValidationException
    {
        // Strategy for subselect depends on presence of filter + presence of select clause expressions
        if (filterExpr == null) {
            if (selectClause == null) {
                evalStrategy = UNFILTERED_UNSELECTED;
            }
            else {
                evalStrategy = UNFILTERED_SELECTED;
            }
        }
        else {
            if (selectClause == null) {
                evalStrategy = FILTERED_UNSELECTED;
            }
            else {
                evalStrategy = FILTERED_SELECTED;
            }
        }
    }

    public Object evaluate(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext)
    {
        if (matchingEvents == null || matchingEvents.size() == 0) {
            return null;
        }
        return evalStrategy.evaluate(eventsPerStream, isNewData, matchingEvents, exprEvaluatorContext, this);
    }

    public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context) {
        if (matchingEvents == null) {
            return null;
        }
        if (matchingEvents.size() == 0) {
            return Collections.emptyList();
        }
        return evalStrategy.evaluateGetCollEvents(eventsPerStream, isNewData, matchingEvents, context, this);
    }

    public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context) {
        if (matchingEvents == null) {
            return null;
        }
        if (matchingEvents.size() == 0) {
            return Collections.emptyList();
        }
        return evalStrategy.evaluateGetCollScalar(eventsPerStream, isNewData, matchingEvents, context, this);
    }

    public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext) {
        if (matchingEvents == null || matchingEvents.size() == 0) {
            return null;
        }
        return evalStrategy.evaluateGetEventBean(eventsPerStream, isNewData, matchingEvents, exprEvaluatorContext, this);
    }

    public Object[] evaluateTypableSingle(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext) {

        if (matchingEvents == null || matchingEvents.size() == 0) {
            return null;
        }
        return evalStrategy.typableEvaluate(eventsPerStream, isNewData, matchingEvents, exprEvaluatorContext, this);
    }

    public Object[][] evaluateTypableMulti(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext) {
        if (matchingEvents == null) {
            return null;
        }
        if (matchingEvents.size() == 0) {
            return new Object[0][];
        }
        return evalStrategy.typableEvaluateMultirow(eventsPerStream, isNewData, matchingEvents, exprEvaluatorContext, this);
    }

    public LinkedHashMap<String, Object> typableGetRowProperties() throws ExprValidationException {
        if ((selectClause == null) || (selectClause.length < 2)) {
            return null;
        }
        return getRowType();
    }

    public EventType getEventTypeSingle(EventAdapterService eventAdapterService, String statementId) throws ExprValidationException {
        if (!this.isAggregatedSubquery() || selectClause == null) {
            return null;
        }
        Map<String, Object> rowType = getRowType();
        EventType resultEventType = eventAdapterService.createAnonymousMapType(statementId + "_subquery_" + this.getSubselectNumber(), rowType);
        subselectMultirowType = new SubselectMultirowType(resultEventType, eventAdapterService);
        return resultEventType;
    }

    public EventType getEventTypeCollection(EventAdapterService eventAdapterService) throws ExprValidationException {
        if (selectClause == null) {   // wildcards allowed
            return rawEventType;
        }

        // only if selecting wildcard do we allow lambda functions
        return null;
    }

    public Class getComponentTypeCollection() throws ExprValidationException {
        if (selectClause == null) {   // wildcards allowed
            return null;
        }
        if (selectClauseEvaluator.length > 1) {
            return null;
        }
        return selectClauseEvaluator[0].getType();
    }

    public boolean isAllowMultiColumnSelect() {
        return true;
    }

    private LinkedHashMap<String, Object> getRowType() throws ExprValidationException {
        Set<String> uniqueNames = new HashSet<String>();
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();

        for (int i = 0; i < selectClause.length; i++) {
            String assignedName = this.selectAsNames[i];
            if (assignedName == null) {
                assignedName = selectClause[i].toExpressionString();
            }
            if (uniqueNames.add(assignedName)) {
                type.put(assignedName, selectClause[i].getExprEvaluator().getType());
            }
            else {
                throw new ExprValidationException("Column " + i + " in subquery does not have a unique column name assigned");
            }
        }
        return type;
    }

    public Object getMultirowMessage() {
        return "Subselect of statement '" + statementName + "' returned more then one row in subselect " + subselectNumber + " '" + toExpressionString() + "', returning null result";
    }

    protected Map<String, Object> evaluateRow(EventBean[] eventsPerStream, boolean isNewData, ExprEvaluatorContext context) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (int i = 0; i < selectClauseEvaluator.length; i++) {
            Object resultEntry = selectClauseEvaluator[i].evaluate(eventsPerStream, isNewData, context);
            map.put(selectAsNames[i], resultEntry);
        }
        return map;
    }

    private static class SubselectMultirowType {
        private final EventType eventType;
        private final EventAdapterService eventAdapterService;

        private SubselectMultirowType(EventType eventType, EventAdapterService eventAdapterService) {
            this.eventType = eventType;
            this.eventAdapterService = eventAdapterService;
        }

        public EventType getEventType() {
            return eventType;
        }

        public EventAdapterService getEventAdapterService() {
            return eventAdapterService;
        }
    }

    private static interface SubqueryEvalStrategy {
        public Object evaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode exprSubselectRowNode);
        public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent);
        public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent);
        public Object[] typableEvaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent);
        public Object[][] typableEvaluateMultirow(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent);
        public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode exprSubselectRowNode);
    }

    private static class SubqueryEvalStrategyUnfilteredUnselected implements SubqueryEvalStrategy {

        // No filter and no select-clause: return underlying event
        public Object evaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext,
                               ExprSubselectRowNode parent) {
            if (matchingEvents.size() > 1) {
                log.warn(parent.getMultirowMessage());
                return null;
            }
            return EventBeanUtility.getNonemptyFirstEventUnderlying(matchingEvents);
        }

        // No filter and no select-clause: return matching events
        public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return matchingEvents;
        }

        // No filter and no select-clause: no value can be determined
        public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return null;
        }

        // No filter and no select-clause: no value can be determined
        public Object[] typableEvaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            return null;
        }

        public Object[][] typableEvaluateMultirow(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            return null;
        }

        public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode exprSubselectRowNode) {
            return null;    // this actually only applies to when there is a select-clause
        }
    }

    private static class SubqueryEvalStrategyUnfilteredSelected implements SubqueryEvalStrategy {

        // No filter and with select clause
        public Object evaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext,
                               ExprSubselectRowNode parent) {
            if (matchingEvents.size() > 1) {
                log.warn(parent.getMultirowMessage());
                return null;
            }

            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            events[0] = EventBeanUtility.getNonemptyFirstEvent(matchingEvents);

            Object result;
            if (parent.selectClauseEvaluator.length == 1) {
                result = parent.selectClauseEvaluator[0].evaluate(events, true, exprEvaluatorContext);
            }
            else {
                // we are returning a Map here, not object-array, preferring the self-describing structure
                result = parent.evaluateRow(events, true, exprEvaluatorContext);
            }
            return result;
        }

        // No filter and with select clause
        public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return null;    // as there is no event type returned when there is a select-clause
        }

        // No filter and with select clause
        public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            List<Object> result = new ArrayList<Object>();
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            for (EventBean subselectEvent : matchingEvents) {
                events[0] = subselectEvent;
                result.add(parent.selectClauseEvaluator[0].evaluate(events, isNewData, context));
            }
            return result;
        }

        // No filter and with select clause
        public Object[] typableEvaluate(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            // take the first match only
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            events[0] = EventBeanUtility.getNonemptyFirstEvent(matchingEvents);
            Object[] results = new Object[parent.selectClauseEvaluator.length];
            for (int i = 0; i < results.length; i++) {
                results[i] = parent.selectClauseEvaluator[i].evaluate(events, isNewData, exprEvaluatorContext);
            }
            return results;
        }

        // No filter and with select clause
        public Object[][] typableEvaluateMultirow(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            Object[][] rows = new Object[matchingEvents.size()][];
            int index = -1;
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            for (EventBean matchingEvent : matchingEvents) {
                index++;
                events[0] = matchingEvent;
                Object[] results = new Object[parent.selectClauseEvaluator.length];
                for (int i = 0; i < results.length; i++) {
                    results[i] = parent.selectClauseEvaluator[i].evaluate(events, isNewData, exprEvaluatorContext);
                }
                rows[index] = results;
            }
            return rows;
        }

        // No filter and with select clause
        public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            events[0] = EventBeanUtility.getNonemptyFirstEvent(matchingEvents);
            Map<String, Object> row = parent.evaluateRow(events, true, context);
            return parent.subselectMultirowType.getEventAdapterService().adapterForTypedMap(row, parent.subselectMultirowType.getEventType());
        }
    }

    private static class SubqueryEvalStrategyFilteredUnselected implements SubqueryEvalStrategy {

        // Filter and no-select
        public Object evaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            EventBean[] eventsZeroBased = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            EventBean subSelectResult = ExprSubselectRowNodeUtility.evaluateFilterExpectSingleMatch(eventsZeroBased, newData, matchingEvents, exprEvaluatorContext, parent);
            if (subSelectResult == null) {
                return null;
            }
            return subSelectResult.getUnderlying();
        }

        // Filter and no-select
        public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);

            ArrayDeque<EventBean> filtered = new ArrayDeque<EventBean>();
            for (EventBean subselectEvent : matchingEvents) {
                events[0] = subselectEvent;
                Boolean pass = (Boolean) parent.filterExpr.evaluate(events, true, context);
                if ((pass != null) && (pass)) {
                    filtered.add(subselectEvent);
                }
            }
            return filtered;
        }

        // Filter and no-select
        public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return null;
        }

        // Filter and no-select
        public Object[] typableEvaluate(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            return null;
        }

        // Filer and no-select
        public Object[][] typableEvaluateMultirow(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            return null;
        }

        // Filter and no-select
        public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return null;
        }
    }

    private static class SubqueryEvalStrategyFilteredSelected implements SubqueryEvalStrategy {

        // Filter and Select
        public Object evaluate(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            EventBean[] eventsZeroBased = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            EventBean subSelectResult = ExprSubselectRowNodeUtility.evaluateFilterExpectSingleMatch(eventsZeroBased, newData, matchingEvents, exprEvaluatorContext, parent);
            if (subSelectResult == null) {
                return null;
            }

            eventsZeroBased[0] = subSelectResult;
            Object result;
            if (parent.selectClauseEvaluator.length == 1) {
                result = parent.selectClauseEvaluator[0].evaluate(eventsZeroBased, true, exprEvaluatorContext);
            }
            else {
                // we are returning a Map here, not object-array, preferring the self-describing structure
                result = parent.evaluateRow(eventsZeroBased, true, exprEvaluatorContext);
            }

            return result;
        }

        // Filter and Select
        public Collection<EventBean> evaluateGetCollEvents(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            return null;
        }

        // Filter and Select
        public Collection evaluateGetCollScalar(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            List<Object> result = new ArrayList<Object>();
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            for (EventBean subselectEvent : matchingEvents) {
                events[0] = subselectEvent;
                Boolean pass = (Boolean) parent.filterExpr.evaluate(events, true, context);
                if ((pass != null) && (pass)) {
                    result.add(parent.selectClauseEvaluator[0].evaluate(events, isNewData, context));
                }
            }
            return result;
        }

        // Filter and Select
        public Object[] typableEvaluate(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            EventBean subSelectResult = ExprSubselectRowNodeUtility.evaluateFilterExpectSingleMatch(events, isNewData, matchingEvents, exprEvaluatorContext, parent);
            if (subSelectResult == null) {
                return null;
            }

            events[0] = subSelectResult;
            Object[] results = new Object[parent.selectClauseEvaluator.length];
            for (int i = 0; i < results.length; i++) {
                results[i] = parent.selectClauseEvaluator[i].evaluate(events, isNewData, exprEvaluatorContext);
            }
            return results;
        }

        public Object[][] typableEvaluateMultirow(EventBean[] eventsPerStream, boolean newData, Collection<EventBean> matchingEvents, ExprEvaluatorContext exprEvaluatorContext, ExprSubselectRowNode parent) {
            Object[][] rows = new Object[matchingEvents.size()][];
            int index = -1;
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            for (EventBean matchingEvent : matchingEvents) {
                events[0] = matchingEvent;

                Boolean pass = (Boolean) parent.filterExpr.evaluate(events, newData, exprEvaluatorContext);
                if ((pass != null) && (pass)) {
                    index++;
                    Object[] results = new Object[parent.selectClauseEvaluator.length];
                    for (int i = 0; i < results.length; i++) {
                        results[i] = parent.selectClauseEvaluator[i].evaluate(events, newData, exprEvaluatorContext);
                    }
                    rows[index] = results;
                }
            }
            if (index == rows.length - 1) {
                return rows;
            }
            if (index == -1) {
                return new Object[0][];
            }
            Object[][] rowArray = new Object[index + 1][];
            System.arraycopy(rows, 0, rowArray, 0, rowArray.length);
            return rowArray;
        }

        // Filter and Select
        public EventBean evaluateGetEventBean(EventBean[] eventsPerStream, boolean isNewData, Collection<EventBean> matchingEvents, ExprEvaluatorContext context, ExprSubselectRowNode parent) {
            EventBean[] events = EventBeanUtility.allocatePerStreamShift(eventsPerStream);
            EventBean subSelectResult = ExprSubselectRowNodeUtility.evaluateFilterExpectSingleMatch(events, isNewData, matchingEvents, context, parent);
            if (subSelectResult == null) {
                return null;
            }
            Map<String, Object> row = parent.evaluateRow(events, true, context);
            return parent.subselectMultirowType.getEventAdapterService().adapterForTypedMap(row, parent.subselectMultirowType.getEventType());
        }
    }

}
