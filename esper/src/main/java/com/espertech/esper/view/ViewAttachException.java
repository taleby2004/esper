/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.view;

/**
 * Thrown to indicate a validation error in staggered views.
 */
public class ViewAttachException extends Exception
{
    /**
     * Ctor.
     * @param message - validation error message
     */
    public ViewAttachException(String message)
    {
        super(message);
    }
}
