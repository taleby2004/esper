/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.List;

/**
 * Represents a create-variable syntax for creating a new variable.
 */
public class CreateDataFlowClause implements Serializable
{
    private static final long serialVersionUID = 0L;

    private String dataFlowName;
    private List<CreateSchemaClause> schemas;
    private List<DataFlowOperator> operators;

    public CreateDataFlowClause(String dataFlowName, List<CreateSchemaClause> schemas, List<DataFlowOperator> operators) {
        this.dataFlowName = dataFlowName;
        this.schemas = schemas;
        this.operators = operators;
    }

    public String getDataFlowName() {
        return dataFlowName;
    }

    public void setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
    }

    public List<CreateSchemaClause> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<CreateSchemaClause> schemas) {
        this.schemas = schemas;
    }

    public List<DataFlowOperator> getOperators() {
        return operators;
    }

    public void setOperators(List<DataFlowOperator> operators) {
        this.operators = operators;
    }

    /**
     * Render as EPL.
     * @param writer to output to
     * @param formatter
     */
    public void toEPL(StringWriter writer, EPStatementFormatter formatter)
    {
        writer.append("create dataflow ");
        writer.append(dataFlowName);
        if (schemas != null) {
            formatter.beginDataFlowSchema(writer);
            for (CreateSchemaClause clause : schemas) {
                clause.toEPL(writer);
                writer.append(",");
            }
        }
        if (operators != null) {
            formatter.beginDataFlowOperator(writer);
            for (DataFlowOperator clause : operators) {
                clause.toEPL(writer, formatter);
            }
        }
    }
}
