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

/**
 * Data flow runtime for instantiating data flows.
 */
public interface EPDataFlowRuntime {

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
}
