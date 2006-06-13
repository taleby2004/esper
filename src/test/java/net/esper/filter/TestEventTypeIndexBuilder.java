package net.esper.filter;

import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean;
import net.esper.support.bean.SupportBeanSimple;
import net.esper.support.filter.SupportFilterCallback;
import net.esper.support.filter.SupportFilterSpecBuilder;

import junit.framework.TestCase;

public class TestEventTypeIndexBuilder extends TestCase
{
    private EventTypeIndex eventTypeIndex;
    private EventTypeIndexBuilder indexBuilder;

    private EventType typeOne;
    private EventType typeTwo;

    private FilterValueSet valueSetOne;
    private FilterValueSet valueSetTwo;

    private FilterCallback callbackOne;
    private FilterCallback callbackTwo;

    public void setUp()
    {
        eventTypeIndex = new EventTypeIndex();
        indexBuilder = new EventTypeIndexBuilder(eventTypeIndex);

        typeOne = EventTypeFactory.getInstance().createBeanType(SupportBean.class);
        typeTwo = EventTypeFactory.getInstance().createBeanType(SupportBeanSimple.class);

        valueSetOne = SupportFilterSpecBuilder.build(typeOne, new Object[0]).getValueSet(null);
        valueSetTwo = SupportFilterSpecBuilder.build(typeTwo, new Object[0]).getValueSet(null);

        callbackOne = new SupportFilterCallback();
        callbackTwo = new SupportFilterCallback();
    }

    public void testAddRemove()
    {
        assertNull(eventTypeIndex.get(typeOne));
        assertNull(eventTypeIndex.get(typeTwo));

        indexBuilder.add(valueSetOne, callbackOne);
        indexBuilder.add(valueSetTwo, callbackTwo);

        assertTrue(eventTypeIndex.get(typeOne) != null);
        assertTrue(eventTypeIndex.get(typeTwo) != null);

        try
        {
            indexBuilder.add(valueSetOne, callbackOne);
            assertTrue(false);
        }
        catch (IllegalStateException ex)
        {
            // Expected exception
        }

        indexBuilder.remove(callbackOne);
        indexBuilder.add(valueSetOne, callbackOne);
        indexBuilder.remove(callbackOne);

        // Try invalid remove
        try
        {
            indexBuilder.remove(callbackOne);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex)
        {
            // Expected Exception
        }
    }
}
