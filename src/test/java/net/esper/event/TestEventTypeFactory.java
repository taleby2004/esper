package net.esper.event;

import junit.framework.TestCase;
import net.esper.support.bean.*;
import net.esper.support.util.ArrayAssertionUtil;

import java.util.*;
import java.io.Serializable;
import java.beans.PropertyDescriptor;
import java.beans.Introspector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.beanutils.PropertyUtils;

public class TestEventTypeFactory extends TestCase
{
    private Map<String, Class> testTypesMap;

    public void setUp()
    {
        testTypesMap = new HashMap<String, Class>();
        testTypesMap.put("key1", String.class);
    }

    public void testCreateMapType()
    {
        EventType eventType = EventTypeFactory.getInstance().createMapType(testTypesMap);

        assertEquals(Map.class, eventType.getUnderlyingType());
        assertEquals(1, eventType.getPropertyNames().length);
        assertEquals("key1", eventType.getPropertyNames()[0]);
    }

    public void testCreateBeanType()
    {
        EventTypeFactory.getInstance().clear();
        EventType eventType = EventTypeFactory.getInstance().createBeanType(SupportBeanSimple.class);

        assertEquals(SupportBeanSimple.class, eventType.getUnderlyingType());
        assertEquals(2, eventType.getPropertyNames().length);

        // Second call to create the event type, should be the same instance as the first
        EventType eventTypeTwo = EventTypeFactory.getInstance().createBeanType(SupportBeanSimple.class);
        assertTrue(eventTypeTwo == eventType);
    }

    public void testGetSuper()
    {
        LinkedHashSet<Class> classes = new LinkedHashSet<Class>();
        EventTypeFactory.getSuper(ISupportAImplSuperGImplPlus.class, classes);
        log(classes);

        assertEquals(7, classes.size());
        ArrayAssertionUtil.assertEqualsAnyOrder(
                classes.toArray(),
                new Class[] {
                    ISupportAImplSuperG.class, ISupportBaseAB.class,
                    ISupportA.class, ISupportB.class, ISupportC.class,
                    Serializable.class, Object.class,
                }
        );

        classes.clear();
        EventTypeFactory.getSuper(Object.class, classes);
        assertEquals(0, classes.size());
    }

    public void testGetDeepSuperTypes()
    {
        EventType type = EventTypeFactory.getInstance().createBeanType(ISupportAImplSuperGImplPlus.class);
        Set<EventType> deepSuper = EventTypeFactory.getInstance().getDeepSuperTypes(type);

        assertEquals(5, deepSuper.size());
        ArrayAssertionUtil.assertEqualsAnyOrder(
                deepSuper.toArray(),
                new EventType[] {
                    EventTypeFactory.getInstance().createBeanType(ISupportAImplSuperG.class),
                    EventTypeFactory.getInstance().createBeanType(ISupportBaseAB.class),
                    EventTypeFactory.getInstance().createBeanType(ISupportA.class),
                    EventTypeFactory.getInstance().createBeanType(ISupportB.class),
                    EventTypeFactory.getInstance().createBeanType(ISupportC.class)
                });
    }

    public void testInterfaceProperty()
    {
        // Assert implementations have full set of properties
        ISupportDImpl event = new ISupportDImpl("D", "BaseD", "BaseDBase");
        EventBean bean = EventBeanFactory.createObject(event);
        assertEquals("D", bean.get("d"));
        assertEquals("BaseD", bean.get("baseD"));
        assertEquals("BaseDBase", bean.get("baseDBase"));
        assertEquals(3, bean.getEventType().getPropertyNames().length);
        ArrayAssertionUtil.assertEqualsAnyOrder(bean.getEventType().getPropertyNames(),
                new String[] {"d", "baseD", "baseDBase"});

        // Assert intermediate interfaces have full set of fields
        EventType interfaceType = EventTypeFactory.getInstance().createBeanType(ISupportD.class);
        ArrayAssertionUtil.assertEqualsAnyOrder(interfaceType.getPropertyNames(),
                new String[] {"d", "baseD", "baseDBase"});
    }

    public void testMappedIndexedNestedProperty() throws Exception
    {
        SupportBeanComplexProps bean = SupportBeanComplexProps.makeDefaultBean();
    	EventType eventType = EventTypeFactory.getInstance().createBeanType(SupportBeanComplexProps.class);

        assertEquals(Map.class, eventType.getPropertyType("mapProperty"));
        assertEquals(String.class, eventType.getPropertyType("mapped('x')"));
        assertEquals(int.class, eventType.getPropertyType("indexed[1]"));
        assertEquals(SupportBeanComplexProps.SupportBeanSpecialGetterNested.class, eventType.getPropertyType("nested"));
        assertEquals(int[].class, eventType.getPropertyType("arrayProperty"));
    }

    private void log(Set<Class> classes)
    {
        int count = 0;
        for (Class clazz : classes)
        {
            log.debug("class " + count + " " + clazz.toString());
            count++;
        }
    }

    private static final Log log = LogFactory.getLog(TestEventTypeFactory.class);
}
