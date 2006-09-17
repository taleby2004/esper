package net.esper.eql.expression;

import net.esper.util.JavaClassHelper;
import net.esper.event.EventBean;
import net.esper.collection.Pair;
import net.esper.eql.core.AutoImportService;
import net.esper.eql.core.StreamTypeService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Represents the case-when-then-else control flow function is an expression tree.
 */
public class ExprCaseNode extends ExprNode
{
    private boolean isCase2;
    private List<Pair<ExprNode,ExprNode>> whenThenNodeList;

    public ExprCaseNode(boolean isCase2, List<Pair<ExprNode,ExprNode>> exprNodeList)
    {
        this.isCase2 = isCase2;
        whenThenNodeList = exprNodeList;
    }

    public boolean equalsNode(ExprNode node_)
    {
        if (!(node_ instanceof ExprCaseNode))
        {
            return false;
        }

        ExprCaseNode otherExprCaseNode = (ExprCaseNode) node_;
        return this.isCase2 == otherExprCaseNode.isCase2;
    }

   public void validate(StreamTypeService streamTypeService_, AutoImportService autoImportService) throws ExprValidationException
    {
        if ((whenThenNodeList == null) || (whenThenNodeList.size() == 0))
        {
            throw new ExprValidationException("The Case node requires at least one child expression");
        }

        // Sub-nodes must be at least one when expression
        // A when node as its condition part not null
        boolean noWhenExpr = true;
        int oneElse = 0;
        for (Pair<ExprNode, ExprNode> p : whenThenNodeList)
        {
            if (p.getFirst() != null) {
                // TODO: remove comment
                //p.getFirst().validate(streamTypeService_);
                noWhenExpr = false;
                if (p.getSecond() == null) {
                    throw new ExprValidationException("The Case expression is not syntaxically correct. The when statement is uncomplete");
                }
            } else {
                // No more than one else expression per case statement.
                if (p.getSecond() == null) {
                    throw new ExprValidationException("The Case expression is not syntaxically correct");
                }
                if (++oneElse > 1) {
                    throw new ExprValidationException("The Case expression contains more than one else statement");
                }
            }
            //p.getSecond().validate(streamTypeService_);
        }

        if (noWhenExpr)
        {
            throw new ExprValidationException("The Case node requires at least one when expression");
        }
    }

    public Class getType()
    {
        return getType(null);
    }

    // The type of the case Node is determined by the first when node for which the condition
    // node is either true or equal to the value expression of the case node when present.
    // The type of the case ndoe is then the type of the action part of the when node.
    // When no when node is found to satisfy the condition of the case node, the type is
    // the one of the else expression or null when no else expression is found.

    public Class getType(EventBean[] eventsPerStream_)
    {
        ExprNode elseNode = null;

        for (Pair<ExprNode, ExprNode> p : whenThenNodeList)
        {
            ExprNode actionNode = p.getSecond();
            if (p.getFirst() != null)
            {
                ExprNode conditionNode = p.getFirst();
                if (!isCase2)
                {
                    // This is a "when condition then action" statement
                    // The first when node for which the condition true,
                    // the evaluation is its action expression.
                    try {

                        if ((conditionNode.getType()) == Boolean.class)
                        {
                            if (eventsPerStream_ != null)
                            {
                                if ((Boolean) conditionNode.evaluate(eventsPerStream_))
                                {
                                    return actionNode.getType();
                                }
                            }
                            else
                            {
                                return Boolean.class;
                            }
                        }

                    } catch (ExprValidationException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                }
                else
                {
                    // This is a "case value when condition then action" statement
                    // This time the first when node for which its condition matches in value
                    // the expression of the case node, is the node that is evaluated.
                    // The evaluation of the action part of this node is the evaluation of the case node.
                    ExprNode caseValExpr = getChildNodes().getFirst();
                    if (compareEQLNodes(caseValExpr, conditionNode, eventsPerStream_))
                    {
                        try {
                            return actionNode.getType();
                        } catch (ExprValidationException e) {
                            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                        }
                    }
                }
            }
            // if condition part is null, it is a else node
            else
            {
                elseNode =  actionNode;
            }
        }
        if (elseNode != null)
        {
            try {
                return elseNode.getType();
            } catch (ExprValidationException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return null;
    }

    public Object evaluate(EventBean[] eventsPerStream_)
    {
        ExprNode elseNode = null;

        for (Pair<ExprNode, ExprNode> p : whenThenNodeList)
        {
            ExprNode actionNode = p.getSecond();
            if (p.getFirst() != null)
            {
                ExprNode conditionNode = p.getFirst();
                if (!isCase2)
                {
                    // This is a "when condition then action" statement
                    // The first when node for which the condition true,
                    // the evaluation is its action expression.
                    try {

                        if ((conditionNode.getType()) == Boolean.class)
                        {
                            if ((Boolean) conditionNode.evaluate(eventsPerStream_))
                            {
                                return actionNode.evaluate(eventsPerStream_);
                            }
                        }

                    } catch (ExprValidationException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                }
                else
                {
                    // This is a "case value when condition then action" statement
                    // This time the first when node for which its condition matches in value
                    // the expression of the case node, is the node that is evaluated.
                    // The evaluation of the action part of this node is the evaluation of the case node.
                    ExprNode caseValExpr = getChildNodes().getFirst();
                    if (compareEQLNodes(caseValExpr, conditionNode, eventsPerStream_))
                    {
                        return actionNode.evaluate(eventsPerStream_);
                    }
                }
            }
            // if condition part is null, it is a else node
            else
            {
                elseNode =  actionNode;
            }
        }
        if (elseNode != null)
        {
            return elseNode.evaluate(eventsPerStream_);
        }
        return null;
    }

    private boolean compareEQLNodes(Object nodeOne_, Object nodeTwo_, EventBean[] eventsPerStream_)
    {
        if ((nodeOne_ instanceof ExprNode) && (nodeTwo_ instanceof ExprNode))
        {
            if (eventsPerStream_ == null)
            {
              try
              {
                  if ((((ExprNode)nodeOne_).getType()) != (((ExprNode)nodeTwo_).getType()))
                  {
                    return false;
                  }
              }
              catch (ExprValidationException e) {
                  e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
              }
            }
            else
            {
                Object result = ((ExprNode)nodeOne_).evaluate(eventsPerStream_);
                Object otherResult = ((ExprNode)nodeTwo_).evaluate(eventsPerStream_);
                if (valueComparaison(result, otherResult))
                {
                    return true;
                }
                return (result.equals(otherResult));
            }
        }
        return false;
    }

    private static boolean valueComparaison(Object objectOne, Object objectTwo)
    {
        if ((objectOne == null) || (objectTwo == null))
        {
            return false;
        }

        Class typeOne = objectOne.getClass();
        Class typeTwo = objectTwo.getClass();

        if (objectOne instanceof java.lang.Enum)
        {
            if (! (objectTwo instanceof java.lang.Enum) )
            {
                return false;
            }
            if (typeOne == typeTwo)
            {
                return ((java.lang.Enum) objectOne).equals((java.lang.Enum) objectTwo);
            }
            else
            {
                return false;
            }
        }

        if ((typeOne == String.class) && (typeTwo == String.class))
        {
            return ((((String)objectOne).intern()) == (((String)objectTwo).intern()));
        }

        Class boxedOne = JavaClassHelper.getBoxedType(typeOne);
        Class boxedTwo = JavaClassHelper.getBoxedType(typeTwo);

        if (  ((typeOne == boolean.class) || ((typeOne == Boolean.class))) &&
              ((typeTwo == boolean.class) || ((typeTwo == Boolean.class))) )
        {
            return (objectOne == objectTwo);
        }

        if (!JavaClassHelper.isNumeric(boxedOne) || !JavaClassHelper.isNumeric(boxedTwo))
        {
            return false;
        }
        if ((boxedOne == Double.class) || (boxedTwo == Double.class))
        {
            return ((((Number) objectOne).doubleValue()) == (((Number) objectTwo).doubleValue()));
        }
        if ((boxedOne == Float.class) || (boxedTwo == Float.class))
        {
            return ((((Number) objectOne).floatValue()) == (((Number) objectTwo).floatValue()));
        }
        if ((boxedOne == Long.class) || (boxedTwo == Long.class))
        {
            return ((((Number) objectOne).longValue()) == (((Number) objectTwo).longValue()));
        }
        return ((((Number) objectOne).intValue()) == (((Number) objectTwo).intValue()));
    }

    public String toExpressionString()
    {
         StringBuffer buffer = new StringBuffer();
         buffer.append("case");
         if (isCase2)
         {
            buffer.append(" ");
            buffer.append(this.getChildNodes().getFirst().toExpressionString());
         }
         for (Pair<ExprNode,ExprNode> p : whenThenNodeList)
         {
             if (p.getFirst() == null)
             {
                buffer.append(" else ");
             }
             else
             {
                buffer.append(" when ");
                buffer.append(p.getFirst().toExpressionString());
                buffer.append(" then ");
             }
             buffer.append(p.getSecond().toExpressionString());
         }
         buffer.append(" end");
         return buffer.toString();
    }

    private static final Log log = LogFactory.getLog(ExprCaseNode.class);
}

