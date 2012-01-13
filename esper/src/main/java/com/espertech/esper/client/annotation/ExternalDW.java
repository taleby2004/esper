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

package com.espertech.esper.client.annotation;

/**
 * Annotation for defining an external data window name and open/close functon.
 */
public @interface ExternalDW
{
    /**
     * Name
     * @return name
     */
    String name();

    /**
     * Open function.
     * @return open function.
     */
    String functionOpen() default "";

    /**
     * Close function.
     * @return close function
     */
    String functionClose() default "";
}
