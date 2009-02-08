package com.espertech.esper.epl.thread;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.ArrayDequeJDK6Backport;
import com.espertech.esper.core.EPRuntimeImpl;
import com.espertech.esper.core.EPStatementHandle;
import com.espertech.esper.core.EPStatementHandleCallback;
import com.espertech.esper.filter.FilterHandleCallback;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Interface for route execution work units.
 */
public interface RouteUnitRunnable extends Runnable
{
}
