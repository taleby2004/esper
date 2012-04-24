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
import java.util.Set;

/**
 * Represents a type definition for use with the create-schema syntax for creating a new event type.
 */
public enum CreateSchemaClauseTypeDef implements Serializable
{
    VARIANT,
    MAP,
    OBJECTARRAY,
    NONE;

    public void write(StringWriter writer) {
        if (this == VARIANT) {
            writer.write(" variant");
        }
        else if (this == MAP) {
            writer.write(" map");
        }
        else if (this == OBJECTARRAY) {
            writer.write(" objectarray");
        }
    }
}
