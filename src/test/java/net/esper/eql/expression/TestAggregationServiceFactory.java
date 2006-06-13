package net.esper.eql.expression;

import net.esper.support.eql.SupportExprNodeFactory;

import java.util.List;
import java.util.LinkedList;

import junit.framework.TestCase;

public class TestAggregationServiceFactory extends TestCase
{
    private List<ExprAggregateNode> aggregateNodes;

    public void setUp()
    {
        aggregateNodes = new LinkedList<ExprAggregateNode>();
    }

    public void testGetService() throws Exception
    {
        // Test with aggregates but no group by
        aggregateNodes.add(SupportExprNodeFactory.makeSumAggregateNode());
        AggregationService service = AggregationServiceFactory.getService(aggregateNodes, false, null);
        assertTrue(service instanceof AggregationServiceGroupAllImpl);

        // Test with aggregates and group by
        service = AggregationServiceFactory.getService(aggregateNodes, true, null);
        assertTrue(service instanceof AggregationServiceGroupByImpl);
    }

    public void testInvalidGetService() throws Exception
    {
        // Test no aggregates and no group-by, should fail
        try
        {
            AggregationServiceFactory.getService(aggregateNodes,false, null);
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            // expected
        }
    }
}
