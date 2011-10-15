/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class represents a followed-by operator in the evaluation tree representing any event expressions.
 */
public class EvalFollowedByNode extends EvalNodeBase
{
    private final EvalFollowedByFactoryNode factoryNode;
    private final EvalNode[] childNodes;

    public EvalFollowedByNode(PatternAgentInstanceContext context, EvalFollowedByFactoryNode factoryNode, EvalNode[] childNodes) {
        super(context);
        this.factoryNode = factoryNode;
        this.childNodes = childNodes;
    }

    public EvalNodeNumber getNodeNumber() {
        return factoryNode.getNodeNumber();
    }

    public EvalNode[] getChildNodes() {
        return childNodes;
    }

    public EvalFollowedByFactoryNode getFactoryNode() {
        return factoryNode;
    }

    public EvalStateNode newState(Evaluator parentNode,
                                  MatchedEventMap beginState,
                                  EvalStateNodeNumber stateNodeId)
    {
        switch (factoryNode.opType) {
            case NOMAX_PLAIN:
                return new EvalFollowedByStateNode(parentNode, this, beginState);
            case MAX_PLAIN:
                return new EvalFollowedByWithMaxStateNode(parentNode, this, beginState);
            case NOMAX_POOL:
                return new EvalFollowedByStateNodeManaged(parentNode, this, beginState);
            case MAX_POOL:
                return new EvalFollowedByWithMaxStateNodeManaged(parentNode, this, beginState);
        }
        throw new IllegalStateException("Op-type not recognized for followed-by: " + factoryNode.opType);
    }

    private static final Log log = LogFactory.getLog(EvalFollowedByNode.class);
}
