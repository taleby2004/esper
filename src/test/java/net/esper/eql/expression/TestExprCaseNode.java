package net.esper.eql.expression;

import junit.framework.TestCase;

import java.util.List;
import java.util.LinkedList;

import net.esper.collection.Pair;
import net.esper.type.ArithTypeEnum;
import net.esper.support.eql.SupportExprNode;
import net.esper.support.eql.SupportStreamTypeSvc3Stream;
import net.esper.support.eql.SupportExprNodeFactory;
import net.esper.support.bean.SupportBean;
import net.esper.support.event.SupportEventBeanFactory;
import net.esper.eql.core.StreamTypeService;
import net.esper.event.EventBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestExprCaseNode extends TestCase
{
    private StreamTypeService _streamTypeService;

    public void setUp()
    {
        _streamTypeService = new SupportStreamTypeSvc3Stream();
    }

    public void testGetType()  throws Exception
    {
        // Template expression is:
        // case when (so.floatPrimitive>s1.shortBoxed) then count(5) when (so.LongPrimitive>s1.intPrimitive) then (25 + 130.5) else (3*3) end
        ExprCaseNode _caseNode = SupportExprNodeFactory.makeCaseNode();
        assertEquals(Boolean.class, _caseNode.getType());

        // case when (2.5>2) then count(5) when (1>3) then (25 + 130.5) else (3*3) end
        // First when node is true, case node type is the first when node type.
        _caseNode = SupportExprNodeFactory.makeCaseNode();
    }

    public void testValidate() throws Exception
    {
        // No subnodes: Exception is thrown.
        ExprCaseNode _caseNode;
        try
        {
            _caseNode = new ExprCaseNode(false, null);
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        try
        {
            _caseNode = new ExprCaseNode(true, null);
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        try
        {
            _caseNode = new ExprCaseNode(false, new LinkedList<Pair<ExprNode,ExprNode>>());
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        // One sub-node but the when expression is incomplete:
        // missing: the action part.
        ExprMathNode arithNode = new ExprMathNode(ArithTypeEnum.DIVIDE);
        arithNode.addChildNode(new SupportExprNode(new Integer(4)));
        arithNode.addChildNode(new SupportExprNode(new Integer(2)));
        //arithNode.validateDescendents(null, null);
        try
        {
            List<Pair<ExprNode,ExprNode>> listExprNodes = new LinkedList<Pair<ExprNode,ExprNode>>();
            Pair<ExprNode,ExprNode> p = new Pair<ExprNode,ExprNode>(arithNode, null);
            listExprNodes.add(p);
            _caseNode = new ExprCaseNode(false, listExprNodes);
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        // Else node is not enough, it has to be paired with at least one when node.
        try
        {
            List<Pair<ExprNode,ExprNode>> listExprNodes = new LinkedList<Pair<ExprNode,ExprNode>>();
            Pair<ExprNode,ExprNode> p = new Pair<ExprNode,ExprNode>(null, arithNode);
            listExprNodes.add(p);
            _caseNode = new ExprCaseNode(false, listExprNodes);
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        // One when node but more than one "else nodes"
        // This should throw an exception.
        try
        {
            List<Pair<ExprNode,ExprNode>> listExprNodes = new LinkedList<Pair<ExprNode,ExprNode>>();
            Pair<ExprNode,ExprNode> p = new Pair<ExprNode,ExprNode>(arithNode, arithNode);
            listExprNodes.add(p);
            p = new Pair<ExprNode,ExprNode>(null, arithNode);
            listExprNodes.add(p);
            p = new Pair<ExprNode,ExprNode>(null, arithNode);
            listExprNodes.add(p);
            _caseNode = new ExprCaseNode(false, listExprNodes);
            _caseNode.validate(null, null);
            fail();
        }
        catch (ExprValidationException ex)
        {
            // Expected
        }
        // expression: case when (2.5>1) then count(5) when (3>2) then (25 + 130.5) end
        // The validation should be successful for every node traversed.
        _caseNode = SupportExprNodeFactory.makeCaseNode();
        _caseNode.validate(_streamTypeService, null);

        // Second case
        _caseNode = SupportExprNodeFactory.makeCase2Node();
        _caseNode.validate(_streamTypeService, null);
    }

    public void testEvaluate() throws Exception
    {
        // The value of the case node is contextual.
        // The result of the case node is the result of the expression
        // for the first when node condition true
        // Template expression is:
        // case when (so.floatPrimitive>s1.shortBoxed) then count(5) when (so.LongPrimitive>s1.intPrimitive) then (25 + 130.5) else (3*3) end

        // first when is true, case node type is the first when node type
        // case when (2.5>2) then count(5) when (1>3) then (25 + 130.5) else (3*3) end
        // First when node is true, case node type is the first when node type.
        ExprCaseNode _caseNode = SupportExprNodeFactory.makeCaseNode();
        EventBean[] _events = new EventBean[]{makeEvent(0, null, 2.5F, null, 1L), makeEvent(3, null, 0, new Short((short) 2), 0)};

        // Second when is true, case node type is the type of the second when node
        // case when (2>10) then count(5) when (3>1) then (25 + 130.5) else (3*3) end
        _caseNode = SupportExprNodeFactory.makeCaseNode();
        _events = new EventBean[] {makeEvent(0,null,2F,null,3L), makeEvent(1,null,0,new Short((short)10),0)};

        // Third test: case when (2>10) then count(5) when (1>3) then (25 + 130.5) else (3*3) end
        _caseNode = SupportExprNodeFactory.makeCaseNode();
        _events = new EventBean[] {makeEvent(0,null,2F,null,1L), makeEvent(3,null,0,new Short((short)10),0)};


        // Second set of tests

        // case intPrimitive when longBoxed then count(5) when (5*2) then (intPrimitive*4) else (3*3) end
        _caseNode = SupportExprNodeFactory.makeCase2Node();

        // case intPrimitive when intBoxed then count(5) when (5*2) then (intPrimitive*4) else (3*3) end
        // intPrimitive = intBoxed
        _events = new EventBean[] {makeEvent(10), makeEvent(new Integer(10))};
        _caseNode = SupportExprNodeFactory.makeCase2Node();

        // Changing the event flow
        _events = new EventBean[] {makeEvent(10), makeEvent(new Integer(20))};
        _caseNode = SupportExprNodeFactory.makeCase2Node();
        // case intPrimitive when intBoxed then count(5) when (5*2) then (intPrimitive*4) else (3*3) end
        // intPrimitive != intBoxed and intPrimitive = (5*2)

        // case intPrimitive when intBoxed then count(5) when (5*2) then (intPrimitive*4) else (3*3) end
        // This time intPrimitive=20, intBoxed=40
        // Else node type becomes the case node type
        _events = new EventBean[] {makeEvent(20), makeEvent(new Integer(40))};
        _caseNode = SupportExprNodeFactory.makeCase2Node();
    }

    public void testEquals()  throws Exception
    {
        ExprCaseNode caseNode = SupportExprNodeFactory.makeCaseNode();
        ExprCaseNode otherCaseNode = SupportExprNodeFactory.makeCaseNode();
        ExprCaseNode caseNodeSyntax2 = SupportExprNodeFactory.makeCase2Node();
        ExprCaseNode otherCaseNodeSyntax2 = SupportExprNodeFactory.makeCase2Node();

        assertTrue(caseNode.equalsNode(otherCaseNode));
        assertTrue(otherCaseNode.equalsNode(caseNode));
        assertFalse(caseNode.equalsNode(caseNodeSyntax2));
        assertFalse(caseNodeSyntax2.equalsNode(caseNode));
        assertTrue(caseNodeSyntax2.equalsNode(otherCaseNodeSyntax2));
    }

    public void testToExpressionString() throws Exception
    {
        // Build: case when 2.5>2 then count(5) when 3>2 then (25+130.5) else (3*3) end
        ExprCaseNode _caseNode = SupportExprNodeFactory.makeCaseNode();
        assertEquals("case when s0.floatPrimitive>s1.shortBoxed then count(5) when s0.longPrimitive>s1.intPrimitive then (25+130.5) else (3*3) end", _caseNode.toExpressionString());
        // Build: case intPrimitive when intBoxed then count(5) when (5*2) then (intPrimitive*4) else (10*20) end
        _caseNode = SupportExprNodeFactory.makeCase2Node();
        assertEquals("case s0.intPrimitive when s1.intBoxed then count(5) when (5*2) then (s0.intPrimitive*4.0) else (10.0*20.0) end", _caseNode.toExpressionString());
    }

    private EventBean makeEvent(int i, Integer iB, float f, Short s, long l)
    {
        SupportBean event = new SupportBean();
        event.setIntPrimitive(i);
        event.setIntBoxed(iB);
        event.setFloatPrimitive(f);
        event.setShortBoxed(s);
        event.setLongPrimitive(l);
        return SupportEventBeanFactory.createObject(event);
    }

    private EventBean makeEvent(int intPrimitive)
    {
        SupportBean event = new SupportBean();
        event.setIntPrimitive(intPrimitive);
        return SupportEventBeanFactory.createObject(event);
    }

    private EventBean makeEvent(Integer intBoxed_)
    {
        SupportBean event = new SupportBean();
        event.setIntBoxed(intBoxed_);
        return SupportEventBeanFactory.createObject(event);
    }

     private static final Log log = LogFactory.getLog(TestExprCaseNode.class);
}
