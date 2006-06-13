package net.esper.support.eql;

import net.esper.eql.expression.SelectExprProcessor;
import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean;

public class SupportSelectExprProcessor implements SelectExprProcessor
{
    public EventType getResultEventType()
    {
        return EventTypeFactory.getInstance().createBeanType(SupportBean.class);
    }

    public EventBean process(EventBean[] eventsPerStream)
    {
        return eventsPerStream[0];
    }
}
