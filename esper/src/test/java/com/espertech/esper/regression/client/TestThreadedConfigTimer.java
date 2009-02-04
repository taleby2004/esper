package com.espertech.esper.regression.client;

import com.espertech.esper.client.*;
import com.espertech.esper.client.time.CurrentTimeEvent;
import com.espertech.esper.support.bean.SupportBeanConstants;
import com.espertech.esper.support.client.SupportConfigFactory;
import com.espertech.esper.support.epl.SupportStaticMethodLib;
import com.espertech.esper.support.util.OccuranceAnalyzer;
import com.espertech.esper.support.util.OccuranceResult;
import com.espertech.esper.collection.Pair;
import com.espertech.esper.regression.client.SupportListenerTimerHRes;
import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.List;

public class TestThreadedConfigTimer extends TestCase implements SupportBeanConstants
{
    private static final Log log = LogFactory.getLog(TestThreadedConfigTimer.class);

    // TODO
    //   Configuration timer microthreading : on/off, num threads, executor service factory
    //   Documentation timer microthreading
    //   Timer microthreading regression test: send timer event, blocks or does not block (2 options)
    //   Shutdown of threads for timer microthreading, exception handling, queue depth

    // Inbound threading
    //   - Across the engine
    //   - Handles wrapping, filter matching, all other tasks unless configured otherwise
    //   - EventSender and sendEvent(...) put thing into BlockingQueue
    // Outbound threading
    //   - Across the engine
    //   - Handles delivery of results
    //   - DispatchService puts thing into BlockingQueue
    // Route threading (for matched and insert-into stuff)
    //   - Across the engine
    //   - Handles processing of matched events
    //   - EPRuntimeImpl puts matches into BlockingQueue

    // ==> Make threading a static flag in the engine, set at config time
    // Have threadpools separate in config, i.e.:
    //
    // <threadpools>
    //  <threadpool name="Outbound" numThreads="5" priority="1" factory-class="ABC"/>
    // </threadpools>

    public void testOp() throws Exception
    {
        Configuration config = SupportConfigFactory.getConfiguration();
        config.getEngineDefaults().getThreading().setInternalTimerEnabled(true);
        config.getEngineDefaults().getExpression().setUdfCache(false);
        config.addEventType("MyMap", new HashMap<String, Object>());
        config.addImport(SupportStaticMethodLib.class.getName());

        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);
        // epService.initialize(); TODO - destroy pool
        //sendTimer(0, epService);

        log.debug("Creating statements");
        int countStatements = 1000;
        //SupportUpdateListener[] listeners = new SupportUpdateListener[countStatements];
        SupportListenerTimerHRes listener = new SupportListenerTimerHRes();
        for (int i = 0; i < countStatements; i++)
        {
            //listeners[i] = new SupportUpdateListener();
            EPStatement stmt = epService.getEPAdministrator().createEPL("select SupportStaticMethodLib.sleep(10) from pattern[every MyMap -> timer:interval(1)]");
            //stmt.addListener(listeners[i]);
            stmt.addListener(listener);
        }
        
        log.info("Sending trigger event");
        epService.getEPRuntime().sendEvent(new HashMap<String, Object>(), "MyMap");
        //sendTimer(1000, epService);

        // wait for delivery
        while(true)
        {
            int countDelivered = listener.getNewEvents().size();
            if (countDelivered == countStatements)
            {
                break;
            }

            log.info("Delivered " + countDelivered + ", waiting for more");
            Thread.sleep(200);
        }

        // analyze result
        List<Pair<Long, EventBean[]>> events = listener.getNewEvents();
        OccuranceResult result = OccuranceAnalyzer.analyze(events, new long[] {100 * 1000 * 1000L, 10*1000 * 1000L});
        log.info(result);
    }

    private void sendTimer(long timeInMSec, EPServiceProvider epService)
    {
        CurrentTimeEvent event = new CurrentTimeEvent(timeInMSec);
        EPRuntime runtime = epService.getEPRuntime();
        runtime.sendEvent(event);
    }
}
