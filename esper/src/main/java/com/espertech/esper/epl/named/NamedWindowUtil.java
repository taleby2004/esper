/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.named;

import com.espertech.esper.core.context.util.EPStatementAgentInstanceHandle;
import com.espertech.esper.core.context.util.EPStatementAgentInstanceHandleComparator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NamedWindowUtil
{
    protected static Map<EPStatementAgentInstanceHandle, List<NamedWindowConsumerView>> createConsumerMap(boolean isPrioritized)
    {
        if (!isPrioritized)
        {
            return new LinkedHashMap<EPStatementAgentInstanceHandle, List<NamedWindowConsumerView>>();
        }
        else
        {
<<<<<<< .working
            return new TreeMap<EPStatementAgentInstanceHandle, List<NamedWindowConsumerView>>(EPStatementAgentInstanceHandleComparator.INSTANCE);
=======
            return new TreeMap<EPStatementAgentInstanceHandle, List<NamedWindowConsumerView>>(new Comparator<EPStatementAgentInstanceHandle>()
            {
                public int compare(EPStatementAgentInstanceHandle o1, EPStatementAgentInstanceHandle o2)
                {
                    if (o1.getPriority() == o2.getPriority()) {
                        if (o1 == o2 || o1.equals(o2)) {
                            return 0;
                        }
                        if (!o1.getStatementId().equals(o2.getStatementId())) {
                            return o1.getStatementId().compareTo(o2.getStatementId());
                        }
                        return o1.getAgentInstanceIds()[0] > o2.getAgentInstanceIds()[0] ? -1 : 1;
                    }
                    else {
                        return o1.getPriority() > o2.getPriority() ? -1 : 1;
                    }
                }
            });
>>>>>>> .merge-right.r2821
        }
    }
}
