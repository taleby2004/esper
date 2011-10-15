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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.epl.expression.ExprValidationException;

public interface ContextManager {
    public ContextDescriptor getContextDescriptor();

    public void addStatement(ContextManagedStatementBase statement) throws ExprValidationException;
    public void stopStatement(String statementName, String statementId);
    public void destroyStatement(String statementName, String statementId);

    public void safeDestroy();
}
