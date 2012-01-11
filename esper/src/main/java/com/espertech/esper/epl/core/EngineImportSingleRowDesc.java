/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.core;

import com.espertech.esper.client.ConfigurationPlugInSingleRowFunction;

import java.io.Serializable;

/**
 * Provides information about a single-row function.
 */
public class EngineImportSingleRowDesc implements Serializable
{
    private final String className;
    private final String methodName;
    private final ConfigurationPlugInSingleRowFunction.ValueCache valueCache;
    private final ConfigurationPlugInSingleRowFunction.FilterOptimizable filterOptimizable;

    public EngineImportSingleRowDesc(String className, String methodName, ConfigurationPlugInSingleRowFunction.ValueCache valueCache, ConfigurationPlugInSingleRowFunction.FilterOptimizable filterOptimizable) {
        this.className = className;
        this.methodName = methodName;
        this.valueCache = valueCache;
        this.filterOptimizable = filterOptimizable;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public ConfigurationPlugInSingleRowFunction.ValueCache getValueCache() {
        return valueCache;
    }

    public ConfigurationPlugInSingleRowFunction.FilterOptimizable getFilterOptimizable() {
        return filterOptimizable;
    }
}
