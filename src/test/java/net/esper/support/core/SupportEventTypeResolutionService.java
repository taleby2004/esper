package net.esper.support.core;

import net.esper.core.EventTypeResolutionService;
import net.esper.core.EventTypeResolutionException;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.event.EventBean;
import net.esper.support.bean.SupportBean_N;

import java.util.Map;

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

    public EventType add(String eventTypeAlias, Map<String, Class> propertyTypes) throws EventTypeResolutionException
    {
        throw new UnsupportedOperationException("Not handled by mock impl");
    }

    public EventType add(String eventTypeAlias, String fullyQualClassName) throws EventTypeResolutionException
    {
        throw new UnsupportedOperationException("Not handled by mock impl");
    }

    public EventBean wrap(Object event)
    {
        throw new UnsupportedOperationException("Not handled by mock impl");
    }

    public EventBean wrap(Object event, String eventTypeAlias) throws EventTypeResolutionException
    {
        throw new UnsupportedOperationException("Not handled by mock impl");
    }
}
