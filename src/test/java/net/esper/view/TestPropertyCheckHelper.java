package net.esper.view;

import junit.framework.*;
import net.esper.event.EventType;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportMarketDataBean;
import net.esper.support.bean.SupportBean;

public class TestPropertyCheckHelper extends TestCase
{
    public void testCheckNumeric()
    {
        EventType mySchema = EventTypeFactory.getInstance().createBeanType(SupportMarketDataBean.class);

        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "dummy") != null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "symbol") != null);

        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "volume") == null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "price") == null);

        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "dummy", "dummy2") != null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "symbol", "dummy2") != null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "symbol", "price") != null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "price", "dummy") != null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "dummy", "price") != null);

        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "price", "price") == null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "price", "volume") == null);
        assertTrue(PropertyCheckHelper.checkNumeric(mySchema, "volume", "price") == null);
    }

    public void testCheckLong()
    {
        EventType mySchema = EventTypeFactory.getInstance().createBeanType(SupportBean.class);

        assertEquals(null, PropertyCheckHelper.checkLong(mySchema, "longPrimitive"));
        assertEquals(null, PropertyCheckHelper.checkLong(mySchema, "longBoxed"));
        assertEquals(null, PropertyCheckHelper.checkLong(mySchema, "longBoxed"));
        assertTrue(PropertyCheckHelper.checkLong(mySchema, "dummy") != null);
        assertTrue(PropertyCheckHelper.checkLong(mySchema, "intPrimitive") != null);
        assertTrue(PropertyCheckHelper.checkLong(mySchema, "doubleBoxed") != null);
    }

    public void testFieldExist()
    {
        EventType mySchema = EventTypeFactory.getInstance().createBeanType(SupportBean.class);

        assertEquals(null, PropertyCheckHelper.exists(mySchema, "longPrimitive"));
        assertTrue(PropertyCheckHelper.exists(mySchema, "dummy") != null);
    }

    public void test2FieldExist()
    {
        EventType mySchema = EventTypeFactory.getInstance().createBeanType(SupportBean.class);

        assertEquals(null, PropertyCheckHelper.exists(mySchema, "longPrimitive", "longBoxed"));
        assertTrue(PropertyCheckHelper.exists(mySchema, "dummy", "longPrimitive") != null);
        assertTrue(PropertyCheckHelper.exists(mySchema, "longPrimitive", "dummy") != null);
        assertTrue(PropertyCheckHelper.exists(mySchema, "dummy", "dummy") != null);
    }
}