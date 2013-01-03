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

import java.io.Serializable;

public class EPDataFlowSavedConfiguration implements Serializable {
    private final String savedConfigurationName;
    private final String dataflowName;
    private final EPDataFlowInstantiationOptions options;

    public EPDataFlowSavedConfiguration(String savedConfigurationName, String dataflowName, EPDataFlowInstantiationOptions options) {
        this.savedConfigurationName = savedConfigurationName;
        this.dataflowName = dataflowName;
        this.options = options;
    }

    public String getSavedConfigurationName() {
        return savedConfigurationName;
    }

    public String getDataflowName() {
        return dataflowName;
    }

    public EPDataFlowInstantiationOptions getOptions() {
        return options;
    }
}
