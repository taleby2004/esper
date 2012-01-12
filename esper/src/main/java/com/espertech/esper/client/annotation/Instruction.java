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

import java.lang.annotation.Annotation;

public enum Instruction {
    GROUPBY_NOREF;

    /**
     * Check if the hint is present in the annotations provided.
     * @param annotations the annotations to inspect
     * @return indicator
     */
    public boolean containsInstruction(Annotation[] annotations)
    {
        if (annotations == null)
        {
            return false;
        }

        for (Annotation annotation : annotations)
        {
            if (!(annotation instanceof Runtime)) {
                continue;
            }

            Runtime runtimeAnnotation = (Runtime) annotation;
            if (runtimeAnnotation.value() == null || runtimeAnnotation.value().length == 0) {
                continue;
            }

            for (Instruction i : runtimeAnnotation.value()) {
                if (i == this) {
                    return true;
                }
            }
        }
        return false;
    }
}
