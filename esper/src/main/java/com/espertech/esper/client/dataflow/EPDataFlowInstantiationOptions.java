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

public class EPDataFlowInstantiationOptions {

    public final static GraphStrategy DEFAULT_STRATEGY = new GraphStrategyFused();

    private GraphStrategy graphStrategy = DEFAULT_STRATEGY;
    private EPDataFlowOperatorProvider operatorProvider;
    private EPDataFlowOperatorParameterProvider parameterProvider;
    private EPDataFlowExceptionHandler exceptionHandler;
    private String dataFlowInstanceId;
    private Object dataFlowInstanceUserObject;
    private boolean operatorStatistics;
    private boolean cpuStatistics;

    public GraphStrategy getGraphStrategy() {
        return graphStrategy;
    }

    public EPDataFlowInstantiationOptions graphStrategy(GraphStrategy graphStrategy) {
        this.graphStrategy = graphStrategy;
        return this;
    }

    public EPDataFlowOperatorProvider getOperatorProvider() {
        return operatorProvider;
    }

    public EPDataFlowInstantiationOptions parameterProvider(EPDataFlowOperatorParameterProvider parameterProvider) {
        this.parameterProvider = parameterProvider;
        return this;
    }

    public EPDataFlowOperatorParameterProvider getParameterProvider() {
        return parameterProvider;
    }

    public EPDataFlowInstantiationOptions operatorProvider(EPDataFlowOperatorProvider operatorProvider) {
        this.operatorProvider = operatorProvider;
        return this;
    }

    public EPDataFlowExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    public EPDataFlowInstantiationOptions exceptionHandler(EPDataFlowExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    public String getDataFlowInstanceId() {
        return dataFlowInstanceId;
    }

    public EPDataFlowInstantiationOptions dataFlowInstanceId(String dataFlowInstanceId) {
        this.dataFlowInstanceId = dataFlowInstanceId;
        return this;
    }

    public Object getDataFlowInstanceUserObject() {
        return dataFlowInstanceUserObject;
    }

    public EPDataFlowInstantiationOptions dataFlowInstanceUserObject(Object dataFlowInstanceUserObject) {
        this.dataFlowInstanceUserObject = dataFlowInstanceUserObject;
        return this;
    }

    public boolean isOperatorStatistics() {
        return operatorStatistics;
    }

    public EPDataFlowInstantiationOptions operatorStatistics(boolean statistics) {
        this.operatorStatistics = statistics;
        return this;
    }

    public boolean isCpuStatistics() {
        return cpuStatistics;
    }

    public void setCpuStatistics(boolean cpuStatistics) {
        this.cpuStatistics = cpuStatistics;
    }

    public EPDataFlowInstantiationOptions cpuStatistics(boolean cpuStatistics) {
        this.cpuStatistics = cpuStatistics;
        return this;
    }

    public void setGraphStrategy(GraphStrategy graphStrategy) {
        this.graphStrategy = graphStrategy;
    }

    public void setOperatorProvider(EPDataFlowOperatorProvider operatorProvider) {
        this.operatorProvider = operatorProvider;
    }

    public void setParameterProvider(EPDataFlowOperatorParameterProvider parameterProvider) {
        this.parameterProvider = parameterProvider;
    }

    public void setExceptionHandler(EPDataFlowExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    public void setDataFlowInstanceId(String dataFlowInstanceId) {
        this.dataFlowInstanceId = dataFlowInstanceId;
    }

    public void setDataFlowInstanceUserObject(Object dataFlowInstanceUserObject) {
        this.dataFlowInstanceUserObject = dataFlowInstanceUserObject;
    }

    public void setOperatorStatistics(boolean operatorStatistics) {
        this.operatorStatistics = operatorStatistics;
    }

    public static interface GraphStrategy {}
    public static class GraphStrategyFused implements GraphStrategy {}
}
