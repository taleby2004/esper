/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.antlr;

import com.espertech.esper.epl.expression.ExprNode;
import com.espertech.esper.epl.expression.ExprTimePeriod;
import com.espertech.esper.epl.expression.ExprTimePeriodImpl;
import com.espertech.esper.epl.generated.EsperEPL2Ast;
import com.espertech.esper.epl.spec.FilterSpecRaw;
import com.espertech.esper.epl.spec.PropertyEvalSpec;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;

/**
 * Utility class for AST node handling.
 */
public class ASTUtil
{
    private static Log log = LogFactory.getLog(ASTUtil.class);

    private final static String PROPERTY_ENABLED_AST_DUMP = "ENABLE_AST_DUMP";

    /**
     * Returns the first child node (shallow search) of the given parent that matches type, or null if no child node
     * matches type.
     * @param parent whose child nodes to ask for type
     * @param type the type looked for
     * @return child node if found, or null if not found
     */
    public static Tree findFirstNode(Tree parent, int type)
    {
        for (int i = 0; i < parent.getChildCount(); i++)
        {
            Tree child = parent.getChild(i);
            if (child.getType() == type)
            {
                return child;
            }
        }
        return null;
    }

    /**
     * Dump the AST node to system.out.
     * @param ast to dump
     */
    public static void dumpAST(Tree ast)
    {
        if (System.getProperty(PROPERTY_ENABLED_AST_DUMP) != null)
        {
            StringWriter writer = new StringWriter();
            PrintWriter printer = new PrintWriter(writer);

            renderNode(new char[0], ast, printer);
            dumpAST(printer, ast, 2);

            log.info(".dumpAST ANTLR Tree dump follows...\n" + writer.toString());
        }
    }

    private static void dumpAST(PrintWriter printer, Tree ast, int ident)
    {
        char[] identChars = new char[ident];
        Arrays.fill(identChars, ' ');

        if (ast == null)
        {
            renderNode(identChars, null, printer);
            return;
        }
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            Tree node = ast.getChild(i);
            if (node == null)
            {
                throw new NullPointerException("Null AST node");
            }
            renderNode(identChars, node, printer);
            dumpAST(printer, node, ident + 2);
        }
    }

    /**
     * Print the token stream to the logger.
     * @param tokens to print
     */
    public static void printTokens(CommonTokenStream tokens)
    {
        if (log.isDebugEnabled())
        {
            List tokenList = tokens.getTokens();

            StringWriter writer = new StringWriter();
            PrintWriter printer = new PrintWriter(writer);
            for (int i = 0; i < tokens.size(); i++)
            {
                Token t = (Token) tokenList.get(i);
                String text = t.getText();
                if (text.trim().length() == 0)
                {
                    printer.print("'" + text + "'");
                }
                else
                {
                    printer.print(text);
                }
                printer.print('[');
                printer.print(t.getType());
                printer.print(']');
                printer.print(" ");
            }
            printer.println();
            log.debug("Tokens: " + writer.toString());
        }
    }

    private static void renderNode(char[] ident, Tree node, PrintWriter printer)
    {
        printer.print(ident);
        if (node == null)
        {
            printer.print("NULL NODE");
        }
        else
        {
            printer.print(node.getText());
            printer.print(" [");
            printer.print(node.getType());
            printer.print("]");

            if (node.getText() == null)
            {
                printer.print(" (null value in text)");
            }
            else if (node.getText().contains("\\"))
            {
                int count = 0;
                for (int i = 0; i < node.getText().length(); i++)
                {
                    if (node.getText().charAt(i) == '\\')
                    {
                        count++;
                    }
                }
                printer.print(" (" + count + " backlashes)");
            }
        }
        printer.println();
    }

    /**
     * For the given child, return the expression for that child and remove from node-to-expression map
     * @param child to ask for expression
     * @param astExprNodeMap map to remove node from
     * @return expression
     */
    public static ExprNode getRemoveExpr(Tree child, Map<Tree, ExprNode> astExprNodeMap)
    {
        ExprNode thisEvalNode = astExprNodeMap.get(child);
        astExprNodeMap.remove(child);
        return thisEvalNode;
    }

    public static String getExpressionText(CommonTokenStream tokenStream, Tree node) {
        int startIndex = node.getTokenStartIndex();
        int stopIndex = node.getTokenStopIndex();
        return tokenStream.toString(startIndex, stopIndex);
    }

    public static List<ExprNode> getRemoveAllChildExpr(Tree parent, Map<Tree, ExprNode> astExprNodeMap) {
        ArrayList<ExprNode> expressions = new ArrayList<ExprNode>(parent.getChildCount());
        for (int i = 0; i < parent.getChildCount(); i++)
        {
            expressions.add(astExprNodeMap.remove(parent.getChild(i)));
        }
        return expressions;
    }

    public static FilterSpecRaw walkFilterSpec(Tree node, PropertyEvalSpec propertyEvalSpec, Map<Tree, ExprNode> astExprNodeMap) {
        int count = 0;
        Tree startNode = node.getChild(0);
        if (startNode.getType() == EsperEPL2Ast.IDENT)
        {
            startNode = node.getChild(++count);
        }

        // Determine event type
        String eventName = startNode.getText();
        count++;

        // get property expression if any
        if ((node.getChildCount() > count) && (node.getChild(count).getType() == EsperEPL2Ast.EVENT_FILTER_PROPERTY_EXPR))
        {
            ++count;
        }

        List<ExprNode> exprNodes = getExprNodes(node, count, astExprNodeMap);

        return new FilterSpecRaw(eventName, exprNodes, propertyEvalSpec);
    }

    public static List<ExprNode> getExprNodes(Tree parentNode, int startIndex, Map<Tree, ExprNode> astExprNodeMap)
    {
        List<ExprNode> exprNodes = new LinkedList<ExprNode>();

        for (int i = startIndex; i < parentNode.getChildCount(); i++)
        {
        	Tree currentNode = parentNode.getChild(i);
            ExprNode exprNode = astExprNodeMap.get(currentNode);
            if (exprNode == null)
            {
                throw new IllegalStateException("Expression node for AST node not found for type " + currentNode.getType() + " and text " + currentNode.getText());
            }
            exprNodes.add(exprNode);
            astExprNodeMap.remove(currentNode);
        }
        return exprNodes;
    }

    public static ExprTimePeriod getTimePeriodExpr(Tree node, Map<Tree, ExprNode> astExprNodeMap) {

        ExprNode nodes[] = new ExprNode[8];
        for (int i = 0; i < node.getChildCount(); i++)
        {
            Tree child = node.getChild(i);
            if (child.getType() == EsperEPL2Ast.MILLISECOND_PART)
            {
                nodes[7] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.SECOND_PART)
            {
                nodes[6] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.MINUTE_PART)
            {
                nodes[5] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.HOUR_PART)
            {
                nodes[4] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.DAY_PART)
            {
                nodes[3] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.WEEK_PART)
            {
                nodes[2] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.MONTH_PART)
            {
                nodes[1] = astExprNodeMap.remove(child.getChild(0));
            }
            if (child.getType() == EsperEPL2Ast.YEAR_PART)
            {
                nodes[0] = astExprNodeMap.remove(child.getChild(0));
            }
        }
        ExprTimePeriod timeNode = new ExprTimePeriodImpl(nodes[0] != null, nodes[1]!= null, nodes[2]!= null, nodes[3]!= null, nodes[4]!= null, nodes[5]!= null, nodes[6]!= null, nodes[7]!= null);
        if (nodes[0] != null) timeNode.addChildNode(nodes[0]);
        if (nodes[1] != null) timeNode.addChildNode(nodes[1]);
        if (nodes[2] != null) timeNode.addChildNode(nodes[2]);
        if (nodes[3] != null) timeNode.addChildNode(nodes[3]);
        if (nodes[4] != null) timeNode.addChildNode(nodes[4]);
        if (nodes[5] != null) timeNode.addChildNode(nodes[5]);
        if (nodes[6] != null) timeNode.addChildNode(nodes[6]);
        if (nodes[7] != null) timeNode.addChildNode(nodes[7]);
        return timeNode;
    }
}
