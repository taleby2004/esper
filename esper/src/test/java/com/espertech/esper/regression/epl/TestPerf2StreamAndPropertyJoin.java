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

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.support.bean.SupportMarketDataBean;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import junit.framework.TestCase;

public class TestPerf2StreamAndPropertyJoin extends TestCase
{
    private EPServiceProvider epService;
    private SupportUpdateListener updateListener;

    public void setUp()
    {
        epService = EPServiceProviderManager.getDefaultProvider(SupportConfigFactory.getConfiguration());
        epService.initialize();
        updateListener = new SupportUpdateListener();
    }

    protected void tearDown() throws Exception {
        updateListener = null;
    }

    public void testPerf2Properties()
    {
        String methodName = ".testPerformanceJoinNoResults";

        String joinStatement = "select * from " +
                SupportMarketDataBean.class.getName() + ".win:length(1000000)," +
                SupportBean.class.getName() + ".win:length(1000000)" +
            " where symbol=theString and volume=longBoxed";

        EPStatement joinView = epService.getEPAdministrator().createEPL(joinStatement);
        joinView.addListener(updateListener);

        // Send events for each stream
        log.info(methodName + " Preloading events");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
        {
            sendEvent(makeMarketEvent("IBM_" + i, 1));
            sendEvent(makeSupportEvent("CSCO_" + i, 2));
        }
        log.info(methodName + " Done preloading");

        long endTime = System.currentTimeMillis();
        log.info(methodName + " delta=" + (endTime - startTime));

        // Stay at 250, belwo 500ms
        assertTrue((endTime - startTime) < 500);
    }

    public void testPerf3Properties()
    {
        String methodName = ".testPerformanceJoinNoResults";

        String joinStatement = "select * from " +
                SupportMarketDataBean.class.getName() + "().win:length(1000000)," +
                SupportBean.class.getName() + ".win:length(1000000)" +
            " where symbol=theString and volume=longBoxed and doublePrimitive=price";

        EPStatement joinView = epService.getEPAdministrator().createEPL(joinStatement);
        joinView.addListener(updateListener);

        // Send events for each stream
        log.info(methodName + " Preloading events");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
        {
            sendEvent(makeMarketEvent("IBM_" + i, 1));
            sendEvent(makeSupportEvent("CSCO_" + i, 2));
        }
        log.info(methodName + " Done preloading");

        long endTime = System.currentTimeMillis();
        log.info(methodName + " delta=" + (endTime - startTime));

        // Stay at 250, belwo 500ms
        assertTrue((endTime - startTime) < 500);
    }

    private void sendEvent(Object theEvent)
    {
        epService.getEPRuntime().sendEvent(theEvent);
    }

    private Object makeSupportEvent(String id, long longBoxed)
    {
        SupportBean bean = new SupportBean();
        bean.setTheString(id);
        bean.setLongBoxed(longBoxed);
        return bean;
    }

    private Object makeMarketEvent(String id, long volume)
    {
        return new SupportMarketDataBean(id, 0, (long) volume, "");
    }

    private static final Log log = LogFactory.getLog(TestPerf2StreamAndPropertyJoin.class);
}
