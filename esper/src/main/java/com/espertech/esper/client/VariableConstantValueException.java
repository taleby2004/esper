/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.client;

/**
 * Indicates that a variable cannot be set.
 */
public class VariableConstantValueException extends EPException
{
    /**
     * Ctor.
     * @param message supplies exception details
     */
    public VariableConstantValueException(final String message)
    {
        super(message);
    }
}
