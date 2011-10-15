/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.pattern;

import com.espertech.esper.epl.spec.PatternGuardSpec;
import com.espertech.esper.pattern.guard.GuardFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class represents a guard in the evaluation tree representing an event expressions.
 */
public class EvalGuardNode extends EvalNodeBase
{
    private final EvalGuardFactoryNode factoryNode;
    private final EvalNode childNode;

    public EvalGuardNode(PatternAgentInstanceContext context, EvalGuardFactoryNode factoryNode, EvalNode childNode) {
        super(context);
        this.factoryNode = factoryNode;
        this.childNode = childNode;
    }

    public EvalNodeNumber getNodeNumber() {
        return factoryNode.getNodeNumber();
    }

    public EvalGuardFactoryNode getFactoryNode() {
        return factoryNode;
    }

    public EvalNode getChildNode() {
        return childNode;
    }

    public EvalStateNode newState(Evaluator parentNode,
                                  MatchedEventMap beginState,
                                  EvalStateNodeNumber stateNodeId)
    {
        return new EvalGuardStateNode(parentNode, this, beginState, stateNodeId);
    }

    private static final Log log = LogFactory.getLog(EvalGuardNode.class);
}
