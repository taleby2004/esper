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

public class EPDataFlowInstanceOperatorStat {
    private final String operatorName;
    private final String operatorPrettyPrint;
    private final int operatorNumber;
    private final long submittedOverallCount;
    private final long[] submittedPerPortCount;
    private final long timeOverall;
    private final long[] timePerPort;

    public EPDataFlowInstanceOperatorStat(String operatorName, String operatorPrettyPrint, int operatorNumber, long submittedOverallCount, long[] submittedPerPortCount, long timeOverall, long[] timePerPort) {
        this.operatorName = operatorName;
        this.operatorPrettyPrint = operatorPrettyPrint;
        this.operatorNumber = operatorNumber;
        this.submittedOverallCount = submittedOverallCount;
        this.submittedPerPortCount = submittedPerPortCount;
        this.timeOverall = timeOverall;
        this.timePerPort = timePerPort;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public long getSubmittedOverallCount() {
        return submittedOverallCount;
    }

    public long[] getSubmittedPerPortCount() {
        return submittedPerPortCount;
    }

    public String getOperatorPrettyPrint() {
        return operatorPrettyPrint;
    }

    public int getOperatorNumber() {
        return operatorNumber;
    }

    public long getTimeOverall() {
        return timeOverall;
    }

    public long[] getTimePerPort() {
        return timePerPort;
    }
}
