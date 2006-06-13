package net.esper.eql.join.exec;

import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.event.EventBeanFactory;
import net.esper.event.EventBean;
import net.esper.support.bean.SupportBean;
import net.esper.eql.join.table.PropertyIndexedEventTable;
import net.esper.eql.join.exec.IndexedTableLookupStrategy;
import junit.framework.TestCase;

import java.util.Set;

public class TestIndexedTableLookupStrategy extends TestCase
{
    private EventType eventType;
    private IndexedTableLookupStrategy lookupStrategy;
    private PropertyIndexedEventTable propertyMapEventIndex;

    public void setUp()
    {
        eventType = EventTypeFactory.getInstance().createBeanType(SupportBean.class);

        propertyMapEventIndex = new PropertyIndexedEventTable(0, eventType, new String[] {"string", "intPrimitive"});
        lookupStrategy = new IndexedTableLookupStrategy(eventType, new String[] {"string", "intPrimitive"}, propertyMapEventIndex);

        propertyMapEventIndex.add(new EventBean[] {EventBeanFactory.createObject(new SupportBean("a", 1))});
    }

    public void testLookup()
    {
        Set<EventBean> events = lookupStrategy.lookup(EventBeanFactory.createObject(new SupportBean("a", 1)));

        assertEquals(1, events.size());
    }

    public void testInvalid()
    {
        try
        {
            new IndexedTableLookupStrategy(eventType, new String[] {"string", "xxx"}, propertyMapEventIndex);
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            // expected
        }
    }
}
