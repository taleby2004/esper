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

package com.espertech.esper.support.epl;

import com.espertech.esper.epl.agg.AggregationAccessor;
import com.espertech.esper.epl.agg.AggregationMethod;
import com.espertech.esper.epl.agg.AggregationMethodFactory;
import com.espertech.esper.epl.agg.AggregationSpec;
import com.espertech.esper.epl.core.MethodResolutionService;

public class SupportAggregatorFactory implements AggregationMethodFactory
{
    public AggregationMethod make(MethodResolutionService methodResolutionService, int[] agentInstanceIds, int groupId, int aggregationId) {
        return new SupportAggregator();
    }

    public Class getResultType() {
        return Integer.class;
    }

    public AggregationSpec getSpec(boolean isMatchRecognize) {
        return null;
    }

    public AggregationAccessor getAccessor() {
        return null;
    }
}
