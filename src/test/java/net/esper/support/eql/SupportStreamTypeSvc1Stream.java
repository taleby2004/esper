package net.esper.support.eql;

import net.esper.eql.expression.*;
import net.esper.collection.Pair;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.event.EventBean;
import net.esper.event.EventBeanFactory;
import net.esper.support.bean.SupportBean;
import net.esper.support.bean.SupportBeanComplexProps;

public class SupportStreamTypeSvc1Stream implements StreamTypeService
{
    private StreamTypeService impl;

    public SupportStreamTypeSvc1Stream()
    {
        impl = new StreamTypeServiceImpl(getEventTypes(), getStreamNames());
    }

    public PropertyResolutionDescriptor resolveByPropertyName(String propertyName) throws DuplicatePropertyException, PropertyNotFoundException
    {
        return impl.resolveByPropertyName(propertyName);
    }

    public PropertyResolutionDescriptor resolveByStreamAndPropName(String streamName, String propertyName) throws PropertyNotFoundException, StreamNotFoundException
    {
        return impl.resolveByStreamAndPropName(streamName, propertyName);
    }

    public String[] getStreamNames()
    {
        return new String[] {"s0"};
    }

    public EventType[] getEventTypes()
    {
        EventType[] eventTypes = new EventType[] {
            EventTypeFactory.getInstance().createBeanType(SupportBean.class)
        };
        return eventTypes;
    }

    public static EventBean[] getSampleEvents()
    {
        return new EventBean[] {EventBeanFactory.createObject(new SupportBean())
                            };
    }
}
