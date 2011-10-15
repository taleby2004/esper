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

package com.espertech.esper.view.stream;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.annotation.Audit;
import com.espertech.esper.client.annotation.AuditEnum;
import com.espertech.esper.epl.expression.ExprEvaluator;
import com.espertech.esper.event.EventBeanUtility;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.filter.FilterSpecParam;
import com.espertech.esper.util.AuditPath;
import com.espertech.esper.util.JavaClassHelper;
import com.espertech.esper.view.EventStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EventStreamProxy implements java.lang.reflect.InvocationHandler {

    private static final Log auditLog = LogFactory.getLog(AuditPath.AUDIT_LOG);

    private final String statementName;
    private final String eventTypeAndFilter;
    private final EventStream eventStream;

    public static EventStream getAuditProxy(String statementName, Annotation[] annotations, FilterSpecCompiled filterSpec, EventStream designated) {
        Audit audit = AuditEnum.STREAM.getAudit(annotations);
        if (audit == null) {
            return designated;
        }

        StringWriter filterAndParams = new StringWriter();
        filterAndParams.write(filterSpec.getFilterForEventType().getName());
        if (filterSpec.getParameters() != null && !filterSpec.getParameters().isEmpty()) {
            filterAndParams.write('(');
            String delimiter = "";
            for (FilterSpecParam param : filterSpec.getParameters()) {
                filterAndParams.write(delimiter);
                filterAndParams.write(param.getPropertyName());
                filterAndParams.write(param.getFilterOperator().getTextualOp());
                filterAndParams.write("...");
                delimiter = ",";
            }
            filterAndParams.write(')');
        }

        return (EventStream) EventStreamProxy.newInstance(statementName, filterAndParams.toString(), designated);
    }

    public static Object newInstance(String statementName, String eventTypeAndFilter, EventStream eventStream) {
        return java.lang.reflect.Proxy.newProxyInstance(
                eventStream.getClass().getClassLoader(),
                JavaClassHelper.getSuperInterfaces(eventStream.getClass()),
                new EventStreamProxy(statementName, eventTypeAndFilter, eventStream));
    }

    public EventStreamProxy(String statementName, String eventTypeAndFilter, EventStream eventStream) {
        this.statementName = statementName;
        this.eventTypeAndFilter = eventTypeAndFilter;
        this.eventStream = eventStream;
    }

    public Object invoke(Object proxy, Method m, Object[] args)
            throws Throwable {

        if (m.getName().equals("insert")) {
            if (auditLog.isInfoEnabled()) {
                Object arg = args[0];
                String events = "(undefined)";
                if (arg instanceof EventBean[]) {
                    events = EventBeanUtility.summarize((EventBean[]) arg);
                }
                else if (arg instanceof EventBean) {
                    events = EventBeanUtility.summarize((EventBean) arg);
                }
                auditLog.info("Statement " + statementName + " stream " + eventTypeAndFilter + " inserted " + events);
            }
        }

        return m.invoke(eventStream, args);
    }
}

