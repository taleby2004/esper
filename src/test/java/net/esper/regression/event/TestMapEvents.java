package net.esper.regression.event;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import net.esper.client.*;
import net.esper.support.util.SupportUpdateListener;
import net.esper.support.bean.SupportMarketDataBean;
import net.esper.support.bean.SupportBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestMapEvents extends TestCase
{
    Map<String, String> properties;
    Map<String, Object> map;
    EPServiceProvider epService;

    protected void setUp()
    {
        properties = new HashMap<String, String>();
        properties.put("myInt", "int");
        properties.put("myString", "string");
        properties.put("beanA", SupportMarketDataBean.class.getName());
        properties.put("beanB", SupportBean.class.getName());

        map = new HashMap<String, Object>();
        map.put("myInt", 3);
        map.put("myString", "some string");

        Configuration configuration = new Configuration();
        configuration.addEventTypeAlias("myMapEvent", properties);

        epService = EPServiceProviderManager.getProvider("myProvider", configuration);
    }

    public void testNestedObjects()
    {
        String statementText = "select beanA.price as price, beanB.intPrimitive as intPrim from myMapEvent.win:length(5)";
        EPStatement statement = epService.getEPAdministrator().createEQL(statementText);
        SupportUpdateListener listener = new SupportUpdateListener();
        statement.addListener(listener);

        epService.getEPRuntime().sendEvent(makeMapEvent(20, 30));
        assertEquals(20, listener.getLastNewData()[0].get("price"));
        assertEquals(30, listener.getLastNewData()[0].get("intPrim"));

        statement.stop();
    }

    private Map makeMapEvent(double price, int intPrimitive)
    {
        SupportBean beanB = new SupportBean();
        beanB.setIntPrimitive(intPrimitive);

        Map map = new HashMap();
        map.put("beanA", new SupportMarketDataBean("", price, 0l, null));
        map.put("beanB", beanB);

        return map;
    }

    public void testQueryFields()
    {
        String statementText = "select myInt + 2 as intVal, 'x' || myString || 'x' as stringVal from myMapEvent.win:length(5)";
        EPStatement statement = epService.getEPAdministrator().createEQL(statementText);
        SupportUpdateListener listener = new SupportUpdateListener();
        statement.addListener(listener);

        // send Map<String, Object> event
        epService.getEPRuntime().sendEvent(map, "myMapEvent");
        assertEquals(5, listener.getLastNewData()[0].get("intVal"));
        assertEquals("xsome stringx", listener.getLastNewData()[0].get("stringVal"));

        // send Map base event
        Map mapNoType = new HashMap();
        mapNoType.put("myInt", 4);
        mapNoType.put("myString", "string2");
        epService.getEPRuntime().sendEvent(mapNoType, "myMapEvent");
        assertEquals(6, listener.getLastNewData()[0].get("intVal"));
        assertEquals("xstring2x", listener.getLastNewData()[0].get("stringVal"));

        statement.stop();
    }

    public void testPrimitivesTypes()
    {
        properties = new HashMap<String, String>();
        properties.put("myInt", int.class.getName());
        properties.put("byteArr", byte[].class.getName());
        properties.put("myInt2", "int");
        properties.put("double", "double");
        properties.put("boolean", "boolean");
        properties.put("long", "long");
        properties.put("astring", "string");

        Configuration configuration = new Configuration();
        configuration.addEventTypeAlias("MyPrimMapEvent", properties);

        epService = EPServiceProviderManager.getProvider("testPrimitivesTypes", configuration);
    }

    public void testInvalidConfig()
    {
        properties = new HashMap<String, String>();
        properties.put("astring", "XXXX");

        Configuration configuration = new Configuration();
        configuration.addEventTypeAlias("MyInvalidEvent", properties);

        try
        {
            epService = EPServiceProviderManager.getProvider("testInvalidConfig", configuration);
            fail();
        }
        catch (ConfigurationException ex)
        {
            log.debug(ex);
            // expected
        }
    }

    public void testInvalidStatement()
    {
        tryInvalid("select XXX from myMapEvent.win:length(5)");
        tryInvalid("select myString * 2 from myMapEvent.win:length(5)");
        tryInvalid("select String.trim(myInt) from myMapEvent.win:length(5)");
    }

    public void testSendMapNative()
    {
        String statementText = "select * from myMapEvent.win:length(5)";
        EPStatement statement = epService.getEPAdministrator().createEQL(statementText);
        SupportUpdateListener listener = new SupportUpdateListener();
        statement.addListener(listener);

        // send Map<String, Object> event
        epService.getEPRuntime().sendEvent(map, "myMapEvent");

        assertTrue(listener.getAndClearIsInvoked());
        assertEquals(1, listener.getLastNewData().length);
        assertEquals(map, listener.getLastNewData()[0].getUnderlying());
        assertEquals(3, listener.getLastNewData()[0].get("myInt"));
        assertEquals("some string", listener.getLastNewData()[0].get("myString"));

        // send Map base event
        Map mapNoType = new HashMap();
        mapNoType.put("myInt", 4);
        mapNoType.put("myString", "string2");
        epService.getEPRuntime().sendEvent(mapNoType, "myMapEvent");

        assertTrue(listener.getAndClearIsInvoked());
        assertEquals(1, listener.getLastNewData().length);
        assertEquals(mapNoType, listener.getLastNewData()[0].getUnderlying());
        assertEquals(4, listener.getLastNewData()[0].get("myInt"));
        assertEquals("string2", listener.getLastNewData()[0].get("myString"));

        // send Map<String, String> event, works too since not querying the fields
        Map<String, String> mapStrings = new HashMap<String, String>();
        mapStrings.put("myInt", "5");
        mapStrings.put("myString", "string3");
        epService.getEPRuntime().sendEvent(mapStrings, "myMapEvent");

        assertTrue(listener.getAndClearIsInvoked());
        assertEquals("5", listener.getLastNewData()[0].get("myInt"));
        assertEquals("string3", listener.getLastNewData()[0].get("myString"));
    }

    public void tryInvalid(String statementText)
    {
        try
        {
            epService.getEPAdministrator().createEQL(statementText);
            fail();
        }
        catch (EPException ex)
        {
            // expected
        }
    }

    private static Log log = LogFactory.getLog(TestMapEvents.class);
}
