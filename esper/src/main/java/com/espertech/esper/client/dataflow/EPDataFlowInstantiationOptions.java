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

import com.espertech.esper.core.service.EPRuntimeEventSender;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Options for use when instantiating a data flow in {@link EPDataFlowRuntime}.
 */
public class EPDataFlowInstantiationOptions implements Serializable {

    private EPDataFlowOperatorProvider operatorProvider;
    private EPDataFlowOperatorParameterProvider parameterProvider;
    private EPDataFlowExceptionHandler exceptionHandler;
    private String dataFlowInstanceId;
    private Object dataFlowInstanceUserObject;
    private boolean operatorStatistics;
    private boolean cpuStatistics;
    private EPRuntimeEventSender surrogateEventSender;
    private Map<String, Object> parametersURIs;

    /**
     * Returns the operator provider.
     * @return operator provider
     */
    public EPDataFlowOperatorProvider getOperatorProvider() {
        return operatorProvider;
    }

    /**
     * Sets the the operator provider.
     * @param operatorProvider operator provider
     * @return this options object
     */
    public EPDataFlowInstantiationOptions operatorProvider(EPDataFlowOperatorProvider operatorProvider) {
        this.operatorProvider = operatorProvider;
        return this;
    }

    /**
     * Sets the the operator provider.
     * @param operatorProvider operator provider
     */
    public void setOperatorProvider(EPDataFlowOperatorProvider operatorProvider) {
        this.operatorProvider = operatorProvider;
    }

    /**
     * Sets the parameter provider.
     * @param parameterProvider parameter provider
     * @return this options object
     */
    public EPDataFlowInstantiationOptions parameterProvider(EPDataFlowOperatorParameterProvider parameterProvider) {
        this.parameterProvider = parameterProvider;
        return this;
    }

    /**
     * Returns the parameter provider.
     * @return parameter provider
     */
    public EPDataFlowOperatorParameterProvider getParameterProvider() {
        return parameterProvider;
    }

    /**
     * Sets the parameter provider.
     * @param parameterProvider parameter provider
     */
    public void setParameterProvider(EPDataFlowOperatorParameterProvider parameterProvider) {
        this.parameterProvider = parameterProvider;
    }

    /**
     * Returns the exception handler.
     * @return exception handler.
     */
    public EPDataFlowExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    /**
     * Sets the exception handler.
     * @param exceptionHandler exception handler.
     * @return this options object
     */
    public EPDataFlowInstantiationOptions exceptionHandler(EPDataFlowExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    /**
     * Sets the exception handler.
     * @param exceptionHandler exception handler.
     */
    public void setExceptionHandler(EPDataFlowExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    /**
     * Returns the instance id assigned.
     * @return instance if
     */
    public String getDataFlowInstanceId() {
        return dataFlowInstanceId;
    }

    /**
     * Sets the data flow instance id
     * @param dataFlowInstanceId instance id
     * @return this options object
     */
    public EPDataFlowInstantiationOptions dataFlowInstanceId(String dataFlowInstanceId) {
        this.dataFlowInstanceId = dataFlowInstanceId;
        return this;
    }

    /**
     * Sets the data flow instance id
     * @param dataFlowInstanceId instance id
     */
    public void setDataFlowInstanceId(String dataFlowInstanceId) {
        this.dataFlowInstanceId = dataFlowInstanceId;
    }

    /**
     * Returns the user object associated to the data flow instance.
     * @return user object
     */
    public Object getDataFlowInstanceUserObject() {
        return dataFlowInstanceUserObject;
    }

    /**
     * Sets the user object associated to the data flow instance.
     * @param dataFlowInstanceUserObject user object
     * @return this options object
     */
    public EPDataFlowInstantiationOptions dataFlowInstanceUserObject(Object dataFlowInstanceUserObject) {
        this.dataFlowInstanceUserObject = dataFlowInstanceUserObject;
        return this;
    }

    /**
     * Sets the user object associated to the data flow instance.
     * @param dataFlowInstanceUserObject this options object
     */
    public void setDataFlowInstanceUserObject(Object dataFlowInstanceUserObject) {
        this.dataFlowInstanceUserObject = dataFlowInstanceUserObject;
    }

    /**
     * Returns indicator whether to collect operator statistics.
     * @return operator stats indicator
     */
    public boolean isOperatorStatistics() {
        return operatorStatistics;
    }

    /**
     * Sets indicator whether to collect operator statistics.
     * @param statistics operator stats indicator
     * @return this options object
     */
    public EPDataFlowInstantiationOptions operatorStatistics(boolean statistics) {
        this.operatorStatistics = statistics;
        return this;
    }

    /**
     * Sets indicator whether to collect operator statistics.
     * @param operatorStatistics operator stats indicator
     */
    public void setOperatorStatistics(boolean operatorStatistics) {
        this.operatorStatistics = operatorStatistics;
    }

    /**
     * Returns indicator whether to collect CPU statistics.
     * @return CPU stats
     */
    public boolean isCpuStatistics() {
        return cpuStatistics;
    }

    /**
     * Sets indicator whether to collect CPU statistics.
     * @param cpuStatistics CPU stats
     */
    public void setCpuStatistics(boolean cpuStatistics) {
        this.cpuStatistics = cpuStatistics;
    }

    /**
     * Sets indicator whether to collect CPU statistics.
     * @param cpuStatistics CPU stats
     * @return this options object
     */
    public EPDataFlowInstantiationOptions cpuStatistics(boolean cpuStatistics) {
        this.cpuStatistics = cpuStatistics;
        return this;
    }

    public EPRuntimeEventSender getSurrogateEventSender() {
        return surrogateEventSender;
    }

    public void setSurrogateEventSender(EPRuntimeEventSender surrogateEventSender) {
        this.surrogateEventSender = surrogateEventSender;
    }

    public void addParameterURI(String name, Object value) {
        if (parametersURIs == null) {
            parametersURIs = new HashMap<String, Object>();
        }
        parametersURIs.put(name, value);
    }

    public Map<String, Object> getParametersURIs() {
        return parametersURIs;
    }

    public void setParametersURIs(Map<String, Object> parametersURIs) {
        this.parametersURIs = parametersURIs;
    }
}
