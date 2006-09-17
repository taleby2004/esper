package net.esper.eql.expression;

import net.esper.type.MinMaxTypeEnum;
import net.esper.eql.core.StreamTypeService;
import net.esper.eql.core.AutoImportService;
import net.esper.util.JavaClassHelper;
import net.esper.event.EventBean;

/**
 * Represents the COALESCE(a,b,...) function is an expression tree.
 */
public class ExprCoalesceNode extends ExprNode
{
    private Class resultType;

    public void validate(StreamTypeService streamTypeService, AutoImportService autoImportService) throws ExprValidationException
    {
        if (this.getChildNodes().size() < 2)
        {
            throw new ExprValidationException("Coalesce node must have at least 2 child nodes");
        }

        Class[] childTypes = new Class[getChildNodes().size()];
        int count = 0;
        for (ExprNode child : this.getChildNodes())
        {
            Class childType = child.getType();
            childTypes[count] = childType;
            count++;
        }

        resultType = JavaClassHelper.getCommonCoercionType(childTypes);
    }

    public Class getType() throws ExprValidationException
    {
        return resultType;
    }

    public Object evaluate(EventBean[] eventsPerStream)
    {
        Number valueChildOne = (Number) this.getChildNodes().get(0).evaluate(eventsPerStream);
        Number valueChildTwo = (Number) this.getChildNodes().get(1).evaluate(eventsPerStream);

        if ((valueChildOne == null) || (valueChildTwo == null))
        {
            return null;
        }
        return null;
    }

    public String toExpressionString()
    {
        StringBuffer buffer = new StringBuffer();
        for (int i = 2; i < this.getChildNodes().size(); i++)
        {
            buffer.append(",");
            buffer.append(this.getChildNodes().get(i).toExpressionString());
        }
        buffer.append(")");
        return buffer.toString();
    }

    public boolean equalsNode(ExprNode node)
    {
        if (!(node instanceof ExprCoalesceNode))
        {
            return false;
        }

        ExprCoalesceNode other = (ExprCoalesceNode) node;

        return true;
    }
}
