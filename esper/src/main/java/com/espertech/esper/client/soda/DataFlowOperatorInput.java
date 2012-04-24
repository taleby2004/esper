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

package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.util.List;

public class DataFlowOperatorInput implements Serializable {

    private List<String> inputStreamNames;
    private String optionalAsName;

    public DataFlowOperatorInput() {
    }

    public DataFlowOperatorInput(List<String> inputStreamNames, String optionalAsName) {
        this.inputStreamNames = inputStreamNames;
        this.optionalAsName = optionalAsName;
    }

    public List<String> getInputStreamNames() {
        return inputStreamNames;
    }

    public void setInputStreamNames(List<String> inputStreamNames) {
        this.inputStreamNames = inputStreamNames;
    }

    public String getOptionalAsName() {
        return optionalAsName;
    }

    public void setOptionalAsName(String optionalAsName) {
        this.optionalAsName = optionalAsName;
    }
}
