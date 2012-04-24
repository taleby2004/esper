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

package com.espertech.esper.client.dataflow;

public interface EPDataFlowInstance {
    public String getDataFlowName();
    public EPDataFlowState getState();

    public void run() throws IllegalStateException, EPDataFlowExecutionException, EPDataFlowCancellationException;
    public void start() throws IllegalStateException;
    public EPDataFlowInstanceCaptive startCaptive();
    public void join() throws IllegalStateException, InterruptedException;
    public void cancel();

    public EPDataFlowInstanceStatistics getStatistics();
}
