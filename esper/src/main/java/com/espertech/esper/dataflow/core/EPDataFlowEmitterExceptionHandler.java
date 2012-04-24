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

package com.espertech.esper.dataflow.core;

import com.espertech.esper.client.dataflow.EPDataFlowExceptionContext;
import com.espertech.esper.client.dataflow.EPDataFlowExceptionHandler;
import net.sf.cglib.reflect.FastMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationTargetException;

public class EPDataFlowEmitterExceptionHandler {

    private static final Log log = LogFactory.getLog(EPDataFlowEmitterExceptionHandler.class);

    private final String dataFlowName;
    private final String operatorName;
    private final int operatorNumber;
    private final String operatorPrettyPrint;
    private final EPDataFlowExceptionHandler optionalExceptionHandler;

    public EPDataFlowEmitterExceptionHandler(String dataFlowName, String operatorName, int operatorNumber, String operatorPrettyPrint, EPDataFlowExceptionHandler optionalExceptionHandler) {
        this.dataFlowName = dataFlowName;
        this.operatorName = operatorName;
        this.operatorNumber = operatorNumber;
        this.operatorPrettyPrint = operatorPrettyPrint;
        this.optionalExceptionHandler = optionalExceptionHandler;
    }

    public void handleException(Object targetObject, FastMethod fastMethod, InvocationTargetException ex, Object[] parameters) {
        log.error("Exception encountered: " + ex.getTargetException().getMessage(), ex.getTargetException());
        
        if (optionalExceptionHandler != null) {
            optionalExceptionHandler.handle(new EPDataFlowExceptionContext(dataFlowName, operatorName, operatorNumber, operatorPrettyPrint, ex.getTargetException()));
        }
    }
}
