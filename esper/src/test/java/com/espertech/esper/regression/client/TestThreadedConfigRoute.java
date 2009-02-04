package com.espertech.esper.regression.client;

import junit.framework.TestCase;
import com.espertech.esper.support.bean.SupportBeanConstants;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportStaticMethodLib;
import com.espertech.esper.client.*;
import com.espertech.esper.client.time.CurrentTimeEvent;
import com.espertech.esper.regression.client.SupportListenerTimerHRes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestThreadedConfigRoute extends TestCase implements SupportBeanConstants
{
    private static final Log log = LogFactory.getLog(TestThreadedConfigRoute.class);

    public void testOp() throws Exception
    {
        Configuration config = SupportConfigFactory.getConfiguration();
        config.getEngineDefaults().getThreading().setInternalTimerEnabled(true);
        config.getEngineDefaults().getExpression().setUdfCache(false);
        config.getEngineDefaults().getThreading().setMicroThreadingRoute(true);
        config.addEventType("SupportBean", SupportBean.class);
        config.addImport(SupportStaticMethodLib.class.getName());

        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);
        //epService.initialize(); TODO

        log.debug("Creating statements");
        int countStatements = 100;
        SupportListenerTimerHRes listener = new SupportListenerTimerHRes();
        for (int i = 0; i < countStatements; i++)
        {
            EPStatement stmt = epService.getEPAdministrator().createEPL("select SupportStaticMethodLib.sleep(10) from SupportBean");
            stmt.addListener(listener);
        }

        log.info("Sending trigger event");
        long start = System.nanoTime();
        epService.getEPRuntime().sendEvent(new SupportBean());
        long end = System.nanoTime();
        long delta = (end - start) / 1000000;
        assertTrue("Delta is " + delta, delta < 100);
        
        Thread.sleep(2000);
        assertEquals(100, listener.getNewEvents().size());
    }
}
