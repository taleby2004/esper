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
import com.espertech.esper.client.context.ContextPartitionIdentifierInitiatedTerminated;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.client.context.ContextPartitionSelectorFiltered;
import com.espertech.esper.core.context.util.ContextControllerSelectorUtil;
import com.espertech.esper.epl.spec.ContextDetailCondition;
import com.espertech.esper.epl.spec.ContextDetailConditionCrontab;
import com.espertech.esper.pattern.MatchedEventMapImpl;
import com.espertech.esper.schedule.ScheduleComputeHelper;
import com.espertech.esper.schedule.ScheduleSpec;
import com.espertech.esper.type.NumberSetParameter;

import java.util.*;

public class ContextControllerInitTerm implements ContextController, ContextControllerConditionCallback {

    protected final int pathId;
    protected final ContextControllerLifecycleCallback activationCallback;
    protected final ContextControllerInitTermFactory factory;

    protected ContextControllerCondition startCondition;

    protected Map<ContextControllerCondition, ContextControllerInitTermInstance> endConditions = new LinkedHashMap<ContextControllerCondition, ContextControllerInitTermInstance>();

    protected int currentSubpathId;

    public ContextControllerInitTerm(int pathId, ContextControllerLifecycleCallback lifecycleCallback, ContextControllerInitTermFactory factory) {
        this.pathId = pathId;
        this.activationCallback = lifecycleCallback;
        this.factory = factory;
    }

    public void activate(EventBean optionalTriggeringEvent, Map<String, Object> optionalTriggeringPattern, ContextControllerState states) {

        startCondition = makeEndpoint(factory.getContextDetail().getStart());

        // if this is single-instance mode, check if we are currently running according to schedule
        boolean currentlyRunning = false;
        if (!factory.getContextDetail().isOverlapping()) {
            currentlyRunning = determineCurrentlyRunning();
        }
        
        if (currentlyRunning) {
            ContextControllerCondition endEndpoint = makeEndpoint(factory.getContextDetail().getEnd());
            endEndpoint.activate(optionalTriggeringEvent, null, 0);
            currentSubpathId++;
            long startTime = factory.getSchedulingService().getTime();
            long endTime = endEndpoint.getExpectedEndTime();
            Map<String, Object> builtinProps = getBuiltinProperties(factory, startTime, endTime, Collections.<String, Object>emptyMap());
            ContextControllerInstanceHandle instanceHandle = activationCallback.contextPartitionInstantiate(null, currentSubpathId, this, optionalTriggeringEvent, optionalTriggeringPattern, null, builtinProps, states);
            endConditions.put(endEndpoint, new ContextControllerInitTermInstance(instanceHandle, null, startTime, endTime));
        }
        else {
            startCondition.activate(optionalTriggeringEvent, null, 0);
        }
    }

    protected ContextControllerCondition makeEndpoint(ContextDetailCondition endpoint) {
        return ContextControllerConditionFactory.getEndpoint(factory.getFactoryContext().getContextName(), factory.getFactoryContext().getServicesContext(), factory.getFactoryContext().getAgentInstanceContextCreate(),
                endpoint, this);
    }

    public Collection<Integer> getSelectedContextPartitionPathIds(ContextPartitionSelector contextPartitionSelector) {
        if (contextPartitionSelector instanceof ContextPartitionSelectorFiltered) {
            ContextPartitionSelectorFiltered filter = (ContextPartitionSelectorFiltered) contextPartitionSelector;
            ContextPartitionIdentifierInitiatedTerminated identifier = new ContextPartitionIdentifierInitiatedTerminated();
            List<Integer> accepted = new ArrayList<Integer>();
            for (Map.Entry<ContextControllerCondition, ContextControllerInitTermInstance> entry : endConditions.entrySet()) {
                identifier.setEndTime(entry.getValue().getEndTime());
                identifier.setStartTime(entry.getValue().getStartTime());
                identifier.setProperties(entry.getValue().getStartProperties());
                identifier.setContextPartitionId(entry.getValue().getInstanceHandle().getContextPartitionOrPathId());
                if (filter.filter(identifier)) {
                    accepted.add(entry.getValue().getInstanceHandle().getContextPartitionOrPathId());
                }
            }
            return accepted;
        }
        throw ContextControllerSelectorUtil.getInvalidSelector(new Class[0], contextPartitionSelector);
    }

    public void rangeNotification(Map<String, Object> builtinProperties, ContextControllerCondition originCondition, EventBean optionalTriggeringEvent, Map<String, Object> optionalTriggeringPattern) {
        // handle start-condition notification
        if (originCondition == startCondition) {

            // For single-instance mode, deactivate
            if (!factory.getContextDetail().isOverlapping()) {
                if (startCondition.isRunning()) {
                    startCondition.deactivate();
                }
            }
            // For overlapping mode, make sure we activate again or stay activated
            else {
                if (!startCondition.isRunning()) {
                    startCondition.activate(null, null, 0);
                }
            }

            ContextControllerCondition endEndpoint = makeEndpoint(factory.getContextDetail().getEnd());
            endEndpoint.activate(null, new MatchedEventMapImpl(builtinProperties), 0);
            currentSubpathId++;
            long startTime = factory.getSchedulingService().getTime();
            Long endTime = endEndpoint.getExpectedEndTime();
            Map<String, Object> builtinProps = getBuiltinProperties(factory, startTime, endTime, builtinProperties);
            ContextControllerInstanceHandle instanceHandle = activationCallback.contextPartitionInstantiate(null, currentSubpathId, this, optionalTriggeringEvent, optionalTriggeringPattern, null, builtinProps, null);
            endConditions.put(endEndpoint, new ContextControllerInitTermInstance(instanceHandle, builtinProperties, startTime, endTime));
        }
        else {
            if (originCondition.isRunning()) {
                originCondition.deactivate();
            }

            // inidcate terminate
            ContextControllerInitTermInstance instance = endConditions.remove(originCondition);
            if (instance == null) {
                return;
            }
            activationCallback.contextPartitionTerminate(instance.getInstanceHandle(), builtinProperties);

            // re-activate start condition if not overlapping
            if (!factory.getContextDetail().isOverlapping()) {
                startCondition.activate(optionalTriggeringEvent, null, 0);
            }
        }
    }

    public void setContextPartitionRange(List<NumberSetParameter> partitionRanges) {
        throw new UnsupportedOperationException();
    }

    private boolean determineCurrentlyRunning() {

        // we are not currently running if either of the endpoints is not crontab-triggered
        if (!(factory.getContextDetail().getStart() instanceof ContextDetailConditionCrontab) ||
           (!(factory.getContextDetail().getEnd() instanceof ContextDetailConditionCrontab)))     {
            return false;
        }

        ScheduleSpec scheduleStart = ((ContextDetailConditionCrontab) factory.getContextDetail().getStart()).getSchedule();
        ScheduleSpec scheduleEnd = ((ContextDetailConditionCrontab) factory.getContextDetail().getEnd()).getSchedule();
        long nextScheduledStartTime = ScheduleComputeHelper.computeNextOccurance(scheduleStart, factory.getTimeProvider().getTime());
        long nextScheduledEndTime = ScheduleComputeHelper.computeNextOccurance(scheduleEnd, factory.getTimeProvider().getTime());
        return nextScheduledStartTime >= nextScheduledEndTime;
    }

    public ContextControllerFactory getFactory() {
        return factory;
    }

    public int getPathId() {
        return pathId;
    }

    public void deactivate() {
        if (startCondition != null) {
            if (startCondition.isRunning()) {
                startCondition.deactivate();
            }
        }

        for (Map.Entry<ContextControllerCondition, ContextControllerInitTermInstance> entry : endConditions.entrySet()) {
            if (entry.getKey().isRunning()) {
                entry.getKey().deactivate();
            }
        }
        endConditions.clear();
    }

    protected static Map<String, Object> getBuiltinProperties(ContextControllerInitTermFactory factory, long startTime, Long endTime, Map<String, Object> startEndpointData) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(ContextPropertyEventType.PROP_CTX_NAME, factory.getFactoryContext().getContextName());
        props.put(ContextPropertyEventType.PROP_CTX_STARTTIME, startTime);
        props.put(ContextPropertyEventType.PROP_CTX_ENDTIME, endTime);
        props.putAll(startEndpointData);
        return props;
    }
}
