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

package com.espertech.esper.client.epn;

public class NetworkAdminException extends RuntimeException {

    private static final long serialVersionUID = -6926099879278297365L;

    public NetworkAdminException(String message) {
        super(message);
    }

    public NetworkAdminException(String message, Throwable cause) {
        super(message, cause);
    }
}
