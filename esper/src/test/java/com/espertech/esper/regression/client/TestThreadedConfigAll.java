package com.espertech.esper.regression.client;

import junit.framework.TestCase;
import com.espertech.esper.support.bean.SupportBeanConstants;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportStaticMethodLib;
import com.espertech.esper.client.*;
import com.espertech.esper.client.time.CurrentTimeEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;

public class TestThreadedConfigAll extends TestCase implements SupportBeanConstants
{
    private static final Log log = LogFactory.getLog(TestThreadedConfigAll.class);

    public void testOp() throws Exception
    {
        Configuration config = SupportConfigFactory.getConfiguration();
        config.getEngineDefaults().getThreading().setInternalTimerEnabled(true);
        config.getEngineDefaults().getExpression().setUdfCache(false);
        config.getEngineDefaults().getThreading().setThreadPoolTimerExec(true);
        config.getEngineDefaults().getThreading().setThreadPoolTimerExecNumThreads(2);
        config.getEngineDefaults().getThreading().setThreadPoolInbound(true);
        config.getEngineDefaults().getThreading().setThreadPoolInboundNumThreads(2);
        config.getEngineDefaults().getThreading().setThreadPoolOutbound(true);
        config.getEngineDefaults().getThreading().setThreadPoolOutboundNumThreads(2);
        config.getEngineDefaults().getThreading().setThreadPoolRouteExec(true);
        config.getEngineDefaults().getThreading().setThreadPoolRouteExecNumThreads(2);
        config.addEventType("SupportBean", SupportBean.class);
        config.addImport(SupportStaticMethodLib.class.getName());

        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
        sendTimer(0, epService);

        String[] statements = new String[] {
            "insert into MyStreamTime select string, intPrimitive from SupportBean.win:time(10)",
            "insert into MyStreamUnique select string, intPrimitive from SupportBean.std:unique(intPrimitive)",
            "select * from pattern[every a=MyStreamUnique -> (timer:interval(1 sec) and not MyStreamUnique(intPrimitive=a.intPrimitive))]"};

        log.debug("Creating statements");
        for (int i = 0; i < statements.length; i++)
        {
            EPStatement stmt = epService.getEPAdministrator().createEPL(statements[i]);
        }

        long startTime = System.currentTimeMillis();
        int count = 0;
        while((System.currentTimeMillis() - startTime) < 100000)
        {
            epService.getEPRuntime().sendEvent(new SupportBean("E" + count, count % 1000));
            count++;

            if (count % 1000 == 0)
            {
                log.info("Processed " + count + " events");
            }

            //Thread.sleep(1);
        }
    }

    private void sendTimer(long timeInMSec, EPServiceProvider epService)
    {
        CurrentTimeEvent event = new CurrentTimeEvent(timeInMSec);
        EPRuntime runtime = epService.getEPRuntime();
        runtime.sendEvent(event);
    }
}
