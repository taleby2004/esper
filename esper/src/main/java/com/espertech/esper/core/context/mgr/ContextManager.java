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

import com.espertech.esper.client.EventType;
import com.espertech.esper.client.context.ContextPartitionSelector;
import com.espertech.esper.core.context.util.ContextDescriptor;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.filter.FilterSpecLookupable;
import com.espertech.esper.type.NumberSetParameter;

import java.util.Collection;
import java.util.List;

public interface ContextManager {
    public ContextDescriptor getContextDescriptor();

    public void addStatement(ContextControllerStatementBase statement) throws ExprValidationException;
    public void stopStatement(String statementName, String statementId);
    public void destroyStatement(String statementName, String statementId);

    public void safeDestroy();

    public void setContextPartitionRange(List<NumberSetParameter> partitionRanges);
    public FilterSpecLookupable getFilterLookupable(EventType eventType);

    public Collection<Integer> getAgentInstanceIds(ContextPartitionSelector contextPartitionSelector);
}
