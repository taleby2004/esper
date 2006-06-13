package net.esper.view;

import junit.framework.TestCase;
import net.esper.event.EventBean;
import net.esper.event.EventBeanFactory;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean_A;
import net.esper.support.view.SupportSchemaNeutralView;

public class TestZeroDepthStream extends TestCase
{
    private ZeroDepthStream stream;
    private SupportSchemaNeutralView testChildView;
    private EventType eventType;

    private EventBean eventBean;

    public void setUp()
    {
        eventType = EventTypeFactory.getInstance().createBeanType(SupportBean_A.class);

        stream = new ZeroDepthStream(eventType);

        testChildView = new SupportSchemaNeutralView();
        stream.addView(testChildView);
        testChildView.setParent(stream);

        eventBean = EventBeanFactory.createObject(new SupportBean_A("a1"));
    }

    public void testInsert()
    {
        testChildView.clearLastNewData();
        stream.insert(eventBean);

        assertTrue(testChildView.getLastNewData() != null);
        assertEquals(1, testChildView.getLastNewData().length);
        assertEquals(eventBean, testChildView.getLastNewData()[0]);

        // Remove view
        testChildView.clearLastNewData();
        stream.removeView(testChildView);
        stream.insert(eventBean);
        assertTrue(testChildView.getLastNewData() == null);
    }
}
