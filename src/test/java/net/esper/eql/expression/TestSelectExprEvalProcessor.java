package net.esper.eql.expression;

import java.util.Arrays;

import junit.framework.TestCase;
import net.esper.event.EventBean;
import net.esper.event.EventType;
import net.esper.support.bean.SupportBean;
import net.esper.support.eql.SupportSelectExprFactory;
import net.esper.support.event.SupportEventBeanFactory;
import net.esper.support.event.SupportEventAdapterService;

public class TestSelectExprEvalProcessor extends TestCase
{
    private SelectExprEvalProcessor method;

    public void setUp() throws Exception
    {
        method = new SelectExprEvalProcessor(SupportSelectExprFactory.makeNoAggregateSelectList(),
                SupportEventAdapterService.getService());
    }

    public void testGetTargetType()
    {
        EventType type = method.getResultEventType();
        assertTrue(Arrays.equals(type.getPropertyNames(), new String[] {"s0.doubleBoxed", "result"}));
        assertEquals(Double.class, type.getPropertyType("s0.doubleBoxed"));
        assertEquals(Integer.class, type.getPropertyType("result"));
    }

    public void testProcess()
    {
        EventBean result = method.process(new EventBean[] {makeEvent(8.8, 3, 4)});
        assertEquals(8.8d, result.get("s0.doubleBoxed"));
        assertEquals(12, result.get("result"));
    }

    private EventBean makeEvent(double doubleBoxed, int intPrimitive, int intBoxed)
    {
        SupportBean bean = new SupportBean();
        bean.setDoubleBoxed(doubleBoxed);
        bean.setIntPrimitive(intPrimitive);
        bean.setIntBoxed(intBoxed);
        return SupportEventBeanFactory.createObject(bean);
    }
}
