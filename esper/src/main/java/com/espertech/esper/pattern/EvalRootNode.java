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
 * This class is always the root node in the evaluation tree representing an event expression.
 * It hold the handle to the EPStatement implementation for notifying when matches are found.
 */
public class EvalRootNode extends EvalNodeBase implements PatternStarter
{
    private final EvalRootFactoryNode factoryNode;
    private final EvalNode childNode;

    public EvalRootNode(PatternAgentInstanceContext context, EvalRootFactoryNode factoryNode, EvalNode childNode) {
        super(context);
        this.factoryNode = factoryNode;
        this.childNode = childNode;
    }

    public EvalNodeNumber getNodeNumber() {
        return factoryNode.getNodeNumber();
    }

    public EvalNode getChildNode() {
        return childNode;
    }

    public final PatternStopCallback start(PatternMatchCallback callback,
                                           PatternContext context)
    {
        MatchedEventMap beginState = new MatchedEventMapImpl();
        return startInternal(callback, context, beginState);
    }

    public final PatternStopCallback start(PatternMatchCallback callback,
                                           PatternContext context,
                                           MatchedEventMap beginState)
    {
        return startInternal(callback, context, beginState);
    }

    private final PatternStopCallback startInternal(PatternMatchCallback callback,
                                           PatternContext context,
                                           MatchedEventMap beginState)
    {
        if (beginState == null) {
            throw new IllegalArgumentException("No pattern begin-state has been provided");
        }
        EvalStateNode rootStateNode = newState(null, beginState, null);
        EvalRootState rootState = (EvalRootState) rootStateNode;
        rootState.setCallback(callback);
        rootStateNode.start();
        return rootState;
    }

    public EvalStateNode newState(Evaluator parentNode,
                                  MatchedEventMap beginState,
                                  EvalStateNodeNumber stateNodeId)
    {
        return new EvalRootStateNode(childNode, beginState, getContext().getPatternContext());
    }

    private static final Log log = LogFactory.getLog(EvalRootNode.class);
}
