package net.esper.event;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import net.esper.support.bean.SupportBean;
import net.esper.support.bean.SupportOverrideBase;
import net.esper.support.bean.SupportOverrideOne;
import net.esper.support.bean.SupportOverrideOneA;
import net.esper.support.event.SupportEventBeanFactory;
import net.esper.support.event.SupportEventTypeFactory;

public class TestEventBeanFactory extends TestCase
{
    private SupportBean testBean;

    private Map<String, Class> testTypesMap;
    private Map<String, Object> testValuesMap;

    public void setUp()
    {
        testBean = new SupportBean();
        testBean.setDoublePrimitive(1.1d);

        testTypesMap = new HashMap<String, Class>();
        testTypesMap.put("key1", String.class);

        testValuesMap = new HashMap<String, Object>();
        testValuesMap.put("key1", "test");
    }

    public void testCreateObject()
    {
        EventBean eventBean = SupportEventBeanFactory.createObject(testBean);

        assertEquals(testBean, eventBean.getUnderlying());
        assertEquals(1.1d, eventBean.get("doublePrimitive"));
        assertTrue(eventBean.getEventType().isProperty("doublePrimitive"));
    }

    public void testCreateMap()
    {
        EventType eventType = SupportEventTypeFactory.createMapType(testTypesMap);
        EventBean eventBean = SupportEventBeanFactory.createMapFromValues(testValuesMap, eventType);

        assertEquals(testValuesMap, eventBean.getUnderlying());
        assertEquals("test", eventBean.get("key1"));
        assertTrue(eventBean.getEventType().isProperty("key1"));
    }

    public void testOverrideMethod()
    {
        SupportOverrideOneA override = new SupportOverrideOneA("OneA", "One", "Base");
        EventBean eventTwo = SupportEventBeanFactory.createObject(override);

        assertEquals("OneA", override.getVal());
        assertEquals("OneA", eventTwo.get("val"));

        SupportOverrideOne one = override;
        EventBean eventOne = SupportEventBeanFactory.createObject(one);

        assertEquals("OneA", one.getVal());
        assertEquals("OneA", eventOne.get("val"));

        SupportOverrideBase base = override;
        EventBean eventBase = SupportEventBeanFactory.createObject(base);

        assertEquals("OneA", base.getVal());
        assertEquals("OneA", eventBase.get("val"));
    }
}