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

import java.util.Map;

/**
 * Data flow runtime for instantiating data flows.
 */
public interface EPDataFlowRuntime {

    public EPDataFlowDescriptor getDataFlow(String dataFlowName);

    public String[] getDataFlows();

    /**
     * Instantiate a data flow.
     * @param dataFlowName name of data flow to instantiate
     * @return data flow instance
     * @throws EPDataFlowInstantiationException when the instantiation failed
     */
    public EPDataFlowInstance instantiate(String dataFlowName) throws EPDataFlowInstantiationException;

    /**
     * Instantiate a data flow, with options.
     * @param dataFlowName name of data flow to instantiate
     * @param options populate options to control parameterization, instantiation etc.
     * @return data flow instance
     * @throws EPDataFlowInstantiationException when the instantiation failed
     */
    public EPDataFlowInstance instantiate(String dataFlowName, EPDataFlowInstantiationOptions options) throws EPDataFlowInstantiationException;

    public void saveConfiguration(String dataflowConfigName, String dataFlowName, EPDataFlowInstantiationOptions options) throws EPDataFlowAlreadyExistsException, EPDataFlowNotFoundException;
    public String[] getSavedConfigurations();
    public EPDataFlowSavedConfiguration getSavedConfiguration(String configurationName);
    public EPDataFlowInstance instantiateSavedConfiguration(String configurationName) throws EPDataFlowInstantiationException;
    public boolean removeSavedConfiguration(String configurationName);

    public void saveInstance(String instanceName, EPDataFlowInstance instance) throws EPDataFlowAlreadyExistsException;
    public String[] getSavedInstances();
    public EPDataFlowInstance getSavedInstance(String instanceName);
    public boolean removeSavedInstance(String instanceName);
}
