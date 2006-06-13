package net.esper.eql.join.plan;

import java.util.Arrays;

import junit.framework.TestCase;
import net.esper.eql.join.exec.IndexedTableLookupStrategy;
import net.esper.eql.join.exec.TableLookupStrategy;
import net.esper.eql.join.table.EventTable;
import net.esper.eql.join.table.PropertyIndexedEventTable;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean;

public class TestIndexedTableLookupPlan extends TestCase
{
    private PropertyIndexedEventTable propertyMapEventIndex;
    private EventType[] types;

    public void setUp()
    {
        types = new EventType[] { EventTypeFactory.getInstance().createBeanType(SupportBean.class) };

        propertyMapEventIndex = new PropertyIndexedEventTable(1, types[0], new String[] {"intBoxed"});
    }

    public void testLookup()
    {
        IndexedTableLookupPlan spec = new IndexedTableLookupPlan(0, 1, 0, new String[] {"intBoxed"});

        EventTable[][] indexes = new EventTable[2][];
        indexes[1] = new EventTable[] {propertyMapEventIndex};

        TableLookupStrategy lookupStrategy = spec.makeStrategy(indexes, types);

        IndexedTableLookupStrategy strategy = (IndexedTableLookupStrategy) lookupStrategy;
        assertEquals(types[0], strategy.getEventType());
        assertEquals(propertyMapEventIndex, strategy.getIndex());
        assertTrue(Arrays.equals(new String[] {"intBoxed"}, strategy.getProperties()));
    }
}
