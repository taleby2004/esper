/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.service;

import com.espertech.esper.client.EPException;
import com.espertech.esper.client.EPOnDemandPreparedQueryParameterized;
import com.espertech.esper.client.EPPreparedStatement;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.epl.spec.SubstitutionParameterExpression;

import java.io.Serializable;
import java.util.Map;

/**
 * Prepared statement implementation that stores the statement object model and
 * a list of substitution parameters, to be mapped into an internal representation upon
 * creation.
 */
public class EPPreparedStatementImpl implements EPPreparedStatement, EPOnDemandPreparedQueryParameterized, Serializable
{
    private static final long serialVersionUID = 821297634350548600L;
    private final EPStatementObjectModel model;
    private final Map<Integer, SubstitutionParameterExpression> subParams;
    private final String optionalEPL;

    /**
     * Ctor.
     * @param model is the statement object model
     * @param subParams is the substitution parameter list
     * @param optionalEPL the EPL provided if any
     */
    public EPPreparedStatementImpl(EPStatementObjectModel model, Map<Integer, SubstitutionParameterExpression> subParams, String optionalEPL) {
        this.model = model;
        this.subParams = subParams;
        this.optionalEPL = optionalEPL;
    }

    public void setObject(int parameterIndex, Object value) throws EPException
    {
        if (parameterIndex < 1)
        {
            throw new IllegalArgumentException("Substitution parameter index starts at 1");
        }
        if (subParams.size() == 0)
        {
            throw new IllegalArgumentException("Statement does not have substitution parameters indicated by the '?' character");
        }
        if (parameterIndex > subParams.size())
        {
            throw new IllegalArgumentException("Invalid substitution parameter index of " + parameterIndex + " supplied, the maximum for this statement is " + subParams.size());
        }
        SubstitutionParameterExpression subs = subParams.get(parameterIndex);
        subs.setConstant(value);
    }

    /**
     * Returns the statement object model for the prepared statement
     * @return object model
     */
    public EPStatementObjectModel getModel()
    {
        return model;
    }

    public String getOptionalEPL() {
        return optionalEPL;
    }
}
