package net.esper.event.property;

import net.esper.event.EventPropertyGetter;
import net.esper.event.EventBean;
import net.esper.event.PropertyAccessException;
import net.esper.event.EventBeanFactory;

import java.util.List;
import java.util.Iterator;

/**
 * Getter for one or more levels deep nested properties.
 */
public class EventNestedPropertyGetter implements EventPropertyGetter
{
    private EventPropertyGetter[] getterChain;

    /**
     * Ctor.
     * @param getterChain is the chain of getters to retrieve each nested property
     */
    public EventNestedPropertyGetter(List<EventPropertyGetter> getterChain)
    {
        this.getterChain = getterChain.toArray(new EventPropertyGetter[0]);
    }

    public Object get(EventBean eventBean) throws PropertyAccessException
    {
        Object value = null;

        for (int i = 0; i < getterChain.length; i++)
        {
            value = getterChain[i].get(eventBean);

            if (value == null)
            {
                return null;
            }

            if (i < (getterChain.length - 1))
            {
                eventBean = EventBeanFactory.createObject(value);
            }
        }
        return value;
    }
}
