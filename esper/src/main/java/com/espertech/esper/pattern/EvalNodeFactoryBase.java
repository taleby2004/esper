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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Superclass of all nodes in an evaluation tree representing an event pattern expression.
 * Follows the Composite pattern. Child nodes do not carry references to parent nodes, the tree
 * is unidirectional.
 */
public abstract class EvalNodeFactoryBase implements EvalFactoryNode, Serializable
{
    private static final Log log = LogFactory.getLog(EvalNodeFactoryBase.class);
    private static final long serialVersionUID = 0L;

    private final List<EvalFactoryNode> childNodes;
    private EvalNodeNumber nodeNumber;

    public abstract EvalNode makeEvalNode(PatternAgentInstanceContext agentInstanceContext);

    /**
     * Constructor creates a list of child nodes.
     */
    EvalNodeFactoryBase()
    {
        childNodes = new ArrayList<EvalFactoryNode>();
    }

    /**
     * Returns the evaluation node's relative node number in the evaluation node tree.
     * @return node number
     */
    public EvalNodeNumber getNodeNumber()
    {
        return nodeNumber;
    }

    /**
     * Sets the evaluation node's relative node number.
     * @param nodeNumber is the node number to set
     */
    public void setNodeNumber(EvalNodeNumber nodeNumber)
    {
        this.nodeNumber = nodeNumber;
    }

    /**
     * Adds a child node.
     * @param childNode is the child evaluation tree node to add
     */
    public void addChildNode(EvalFactoryNode childNode)
    {
        childNodes.add(childNode);
    }

    public void addChildNodes(List<EvalFactoryNode> childNodesToAdd) {
        childNodes.addAll(childNodesToAdd);
    }

    /**
     * Returns list of child nodes.
     * @return list of child nodes
     */
    public List<EvalFactoryNode> getChildNodes()
    {
        return childNodes;
    }
}
