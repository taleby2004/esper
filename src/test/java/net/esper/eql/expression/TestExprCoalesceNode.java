package net.esper.eql.expression;

import junit.framework.TestCase;
import net.esper.support.eql.SupportExprNode;

public class TestExprCoalesceNode extends TestCase
{
    private ExprCoalesceNode[] coalesceNodes;

    public void setUp()
    {
        coalesceNodes = new ExprCoalesceNode[5];

        coalesceNodes[0] = new ExprCoalesceNode();
        coalesceNodes[0].addChildNode(new SupportExprNode(null, Long.class));
        coalesceNodes[0].addChildNode(new SupportExprNode(null, int.class));
        coalesceNodes[0].addChildNode(new SupportExprNode(4, byte.class));

        coalesceNodes[1] = new ExprCoalesceNode();
        coalesceNodes[1].addChildNode(new SupportExprNode(null, String.class));
        coalesceNodes[1].addChildNode(new SupportExprNode("a", String.class));

        coalesceNodes[2] = new ExprCoalesceNode();
        coalesceNodes[2].addChildNode(new SupportExprNode(null, Boolean.class));
        coalesceNodes[2].addChildNode(new SupportExprNode(true, boolean.class));

        coalesceNodes[3] = new ExprCoalesceNode();
        coalesceNodes[3].addChildNode(new SupportExprNode(null, char.class));
        coalesceNodes[3].addChildNode(new SupportExprNode(null, Character.class));
        coalesceNodes[3].addChildNode(new SupportExprNode(null, char.class));
        coalesceNodes[3].addChildNode(new SupportExprNode('b', Character.class));

        coalesceNodes[4] = new ExprCoalesceNode();
        coalesceNodes[4].addChildNode(new SupportExprNode(5, float.class));
        coalesceNodes[4].addChildNode(new SupportExprNode(null, Double.class));
    }

    public void testGetType() throws Exception
    {
        for (int i = 0; i < coalesceNodes.length; i++)
        {
            coalesceNodes[i].validate(null, null);
        }

        assertEquals(Long.class, coalesceNodes[0].getType());
        assertEquals(String.class, coalesceNodes[1].getType());
        assertEquals(Boolean.class, coalesceNodes[2].getType());
        assertEquals(Character.class, coalesceNodes[3].getType());
        assertEquals(Double.class, coalesceNodes[4].getType());
    }

    public void testValidate() throws Exception
    {
        // Test too few nodes under this node
        try
        {
            coalesceNodes[0].validate(null, null);
            fail();
        }
        catch (IllegalStateException ex)
        {
            // Expected
        }
    }

    public void testEvaluateEquals() throws Exception
    {
        assertEquals(coalesceNodes[0], coalesceNodes[1]);
        assertFalse(coalesceNodes[0].equals(new ExprEqualsNode(true)));
    }

    public void testToExpressionString() throws Exception
    {
        //assertEquals("coalesce(null, null, ", coalesceNodes[0].toExpressionString());
    }
}
