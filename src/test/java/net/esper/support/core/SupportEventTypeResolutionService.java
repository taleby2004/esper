package net.esper.support.core;

import net.esper.core.EventTypeResolutionService;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean_N;

public class SupportEventTypeResolutionService implements EventTypeResolutionService
{
    public EventType resolveEventType(String eventName)
    {
        if (eventName.equals("SupportBean_N"))
        {
            return EventTypeFactory.getInstance().createBeanType(SupportBean_N.class);
        }

        Class clazz;
        try
        {
            clazz = Class.forName(eventName);
        }
        catch (ClassNotFoundException e)
        {
            throw new IllegalArgumentException("Class named " + eventName + " could not be found");
        }

        return EventTypeFactory.getInstance().createBeanType(clazz);
    }
}
