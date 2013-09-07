/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.client.EPException;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.StatementAgentInstanceLock;
import com.espertech.esper.epl.core.ResultSetProcessor;
import com.espertech.esper.epl.core.ResultSetProcessorFactoryDesc;
import com.espertech.esper.epl.core.SelectExprProcessor;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;
import com.espertech.esper.epl.named.NamedWindowProcessorInstance;

public class EPPreparedExecuteSingleStreamExecInsert implements EPPreparedExecuteSingleStreamExec
{
    private final ExprEvaluatorContext exprEvaluatorContext;
    private final SelectExprProcessor insertHelper;

    public EPPreparedExecuteSingleStreamExecInsert(ExprEvaluatorContext exprEvaluatorContext, SelectExprProcessor insertHelper) {
        this.exprEvaluatorContext = exprEvaluatorContext;
        this.insertHelper = insertHelper;
    }

    public EventBean[] execute(NamedWindowProcessorInstance instance) {
        EventBean event = insertHelper.process(new EventBean[0], true, true, exprEvaluatorContext);
        EventBean[] inserted = new EventBean[] {event};
        AgentInstanceContext ctx = instance.getTailViewInstance().getAgentInstanceContext();
        StatementAgentInstanceLock ailock = ctx.getAgentInstanceLock();
        ailock.acquireWriteLock(null);
        try {
            instance.getRootViewInstance().update(inserted, null);
        }
        catch (EPException ex) {
            instance.getRootViewInstance().update(null, inserted);
        }
        finally {
            ailock.releaseWriteLock(null);
        }
        return inserted;
    }
}
