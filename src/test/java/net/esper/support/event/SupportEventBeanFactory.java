package net.esper.support.event;

import net.esper.event.EventBean;
import net.esper.event.EventBeanFactory;
import net.esper.support.bean.*;

public class SupportEventBeanFactory
{
    public static EventBean[] makeEvents(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean bean = new SupportBean();
            bean.setString(ids[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeEvents(boolean[] boolPrimitiveValues)
    {
        EventBean[] events = new EventBean[boolPrimitiveValues.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean bean = new SupportBean();
            bean.setBoolPrimitive(boolPrimitiveValues[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeMarketDataEvents(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportMarketDataBean bean = new SupportMarketDataBean(ids[i], 0, 0L, null);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeEvents_A(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean_A bean = new SupportBean_A(ids[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeEvents_B(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean_B bean = new SupportBean_B(ids[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeEvents_C(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean_C bean = new SupportBean_C(ids[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }

    public static EventBean[] makeEvents_D(String[] ids)
    {
        EventBean[] events = new EventBean[ids.length];
        for (int i = 0; i < events.length; i++)
        {
            SupportBean_D bean = new SupportBean_D(ids[i]);
            events[i] = EventBeanFactory.createObject(bean);
        }
        return events;
    }
}
