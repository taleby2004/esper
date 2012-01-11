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

package com.espertech.esper.client.context;

import com.espertech.esper.client.EPException;

public class InvalidContextPartitionSelector extends EPException {
    public InvalidContextPartitionSelector(String message) {
        super(message);
    }

    public InvalidContextPartitionSelector(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidContextPartitionSelector(Throwable cause) {
        super(cause);
    }
}
