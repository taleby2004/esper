/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core;

import com.espertech.esper.util.ManagedLock;
import com.espertech.esper.util.ManagedLockImpl;

/**
 * Provides statement-level locks.
 */
public class StatementLockFactoryImpl implements StatementLockFactory
{
    public ManagedLock getStatementLock(String statementName, String expressionText)
    {
        return new ManagedLockImpl(statementName);
    }
}
