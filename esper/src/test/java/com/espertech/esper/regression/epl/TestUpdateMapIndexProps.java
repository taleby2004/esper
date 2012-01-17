/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.regression.epl;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TestUpdateMapIndexProps extends TestCase
{
    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        Configuration config = SupportConfigFactory.getConfiguration();
        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
        listener = new SupportUpdateListener();
    }

    protected void tearDown() throws Exception {
        listener = null;
    }

    public void testSetMapProps() throws Exception {

        // test update-istream with bean
        epService.getEPAdministrator().getConfiguration().addEventType(MyMapPropEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(SupportBean.class);

        epService.getEPAdministrator().createEPL("insert into MyStream select * from MyMapPropEvent");
        EPStatement stmtUpdOne = epService.getEPAdministrator().createEPL("update istream MyStream set props('abc') = 1, array[2] = 10");
        stmtUpdOne.addListener(listener);
        
        epService.getEPRuntime().sendEvent(new MyMapPropEvent());
        EPAssertionUtil.assertProps(listener.assertPairGetIRAndReset(), "props('abc'),array[2]".split(","), new Object[]{1, 10}, new Object[]{null, null});
        
        // test update-istream with map
        epService.getEPAdministrator().createEPL("create schema MyMapType(simple String, myarray java.lang.Object[], mymap java.util.Map)");
        EPStatement stmtUpdTwo = epService.getEPAdministrator().createEPL("update istream MyMapType set simple='A', mymap('abc') = 1, myarray[2] = 10");
        stmtUpdTwo.addListener(listener);

        epService.getEPRuntime().sendEvent(makeMapEvent(new HashMap<String, Object>(), new Object[10]), "MyMapType");
        EPAssertionUtil.assertProps(listener.assertPairGetIRAndReset(), "simple,mymap('abc'),myarray[2]".split(","), new Object[]{"A", 1, 10}, new Object[]{null, null, null});

        // test named-window update
        epService.getEPAdministrator().createEPL("create schema MyNWMapType(simple String, myarray java.lang.Object[], mymap java.util.Map)");
        EPStatement stmtWin = epService.getEPAdministrator().createEPL("create window MyWindow.win:keepall() as MyNWMapType");
        epService.getEPAdministrator().createEPL("insert into MyWindow select * from MyNWMapType");

        epService.getEPRuntime().sendEvent(makeMapEvent(new HashMap<String, Object>(), new Object[10]), "MyNWMapType");
        epService.getEPAdministrator().createEPL("on SupportBean update MyWindow set simple='A', mymap('abc') = intPrimitive, myarray[2] = intPrimitive");
        epService.getEPRuntime().sendEvent(new SupportBean("E1", 10));
        EPAssertionUtil.assertPropsPerRow(stmtWin.iterator(), "simple,mymap('abc'),myarray[2]".split(","), new Object[][]{{"A", 10, 10}});

        // test null and array too small
        epService.getEPRuntime().sendEvent(makeMapEvent(null, new Object[2]), "MyNWMapType");
        epService.getEPRuntime().sendEvent(new SupportBean("E2", 20));
        EPAssertionUtil.assertPropsPerRowAnyOrder(stmtWin.iterator(), "simple,mymap('abc'),myarray[2]".split(","), new Object[][]{{"A", 20, 20}, {"A", null, null}});
    }

    private Map<String, Object> makeMapEvent(Map<String, Object> mymap, Object[] myarray) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mymap", mymap);
        map.put("myarray", myarray);
        return map;
    }
    
    public static class MyMapPropEvent implements Serializable {
        private Map props = new HashMap();
        private Object[] array = new Object[10];

        public void setProps(String name, Object value) {
            props.put(name, value);
        }

        public void setArray(int index, Object value) {
            array[index] = value;
        }

        public Map getProps() {
            return props;
        }

        public void setProps(Map props) {
            this.props = props;
        }

        public Object[] getArray() {
            return array;
        }

        public void setArray(Object[] array) {
            this.array = array;
        }
    }
}
