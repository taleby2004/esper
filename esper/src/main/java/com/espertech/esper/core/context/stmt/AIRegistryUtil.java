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

package com.espertech.esper.core.context.stmt;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.ArrayWrap;
import com.espertech.esper.collection.MultiKeyUntyped;
import com.espertech.esper.epl.agg.AggregationService;
import com.espertech.esper.epl.expression.ExprEvaluatorContext;

import java.util.Collection;

public class AIRegistryUtil {
    public static void checkExpand(int serviceId, ArrayWrap services) {
        if (serviceId > services.getArray().length - 1) {
            int delta = serviceId - services.getArray().length + 1;
            services.expand(delta);
        }
    }
}
