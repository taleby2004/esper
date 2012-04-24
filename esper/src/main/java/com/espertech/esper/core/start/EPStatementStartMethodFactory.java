/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.spec.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Starts and provides the stop method for EPL statements.
 */
public class EPStatementStartMethodFactory
{
    private static final Log log = LogFactory.getLog(EPStatementStartMethodFactory.class);

    /**
     * Ctor.
     * @param statementSpec is a container for the definition of all statement constructs that
     * may have been used in the statement, i.e. if defines the select clauses, insert into, outer joins etc.
     * @param services is the service instances for dependency injection
     * @param statementContext is statement-level information and statement services
     */
    public static EPStatementStartMethod makeStartMethod(StatementSpecCompiled statementSpec,
                                                         EPServicesContext services,
                                                         StatementContext statementContext)
    {
        if (statementSpec.getUpdateSpec() != null)
        {
            return new EPStatementStartMethodUpdate(statementSpec, services, statementContext);
        }
        if (statementSpec.getOnTriggerDesc() != null)
        {
            return new EPStatementStartMethodOnTrigger(statementSpec, services, statementContext);
        }
        else if (statementSpec.getCreateWindowDesc() != null)
        {
            return new EPStatementStartMethodCreateWindow(statementSpec, services, statementContext);
        }
        else if (statementSpec.getCreateIndexDesc() != null)
        {
            return new EPStatementStartMethodCreateIndex(statementSpec, services, statementContext);
        }
        else if (statementSpec.getCreateGraphDesc() != null)
        {
            return new EPStatementStartMethodCreateGraph(statementSpec, services, statementContext);
        }
        else if (statementSpec.getCreateSchemaDesc() != null)
        {
            return new EPStatementStartMethodCreateSchema(statementSpec, services, statementContext);
        }
        else if (statementSpec.getCreateVariableDesc() != null)
        {
            return new EPStatementStartMethodCreateVariable(statementSpec, services, statementContext);
        }
        else if (statementSpec.getContextDesc() != null)
        {
            return new EPStatementStartMethodCreateContext(statementSpec, services, statementContext);
        }
        else
        {
            return new EPStatementStartMethodSelect(statementSpec, services, statementContext);
        }
    }
}
