/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.core;

/**
 * Exception to indicate that a property name used in a filter doesn't resolve.
 */
public class PropertyNotFoundException extends StreamTypesException
{
    /**
     * Ctor.
     * @param msg - message
     */
    public PropertyNotFoundException(String msg)
    {
        super(msg);
    }
}
