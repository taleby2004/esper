package net.esper.regression.view;

import junit.framework.TestCase;
import junit.framework.Assert;
import net.esper.client.*;
import net.esper.support.bean.SupportMarketDataBean;
import net.esper.event.EventBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestMultithreadedTimeWin extends TestCase {

    private Thread[] threads;
    private ResultUpdateListener[] listeners;

    public void testMultithreaded() throws Exception
    {
        int numSymbols = 1;
        int numThreads = 4;
        int numEventsPerThread = 500000;
        double timeWindowSize = 0.2;

        // Set up threads, statements and listeners
        setUp(numSymbols, numThreads, numEventsPerThread, timeWindowSize);

        // Start threads
        long startTime = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.run();
        }

        // Wait for completion
        for (Thread thread : threads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();

        // Check listener results
        long totalReceived = 0;
        for (ResultUpdateListener listener : listeners) {
            totalReceived += listener.getNumReceived();
            assertFalse(listener.isCaughtRuntimeException());
        }
        double numTimeWindowAdvancements = (endTime - startTime) / 1000 / timeWindowSize;

        log.info("Completed, expected=" + numEventsPerThread * numThreads +
            " numTimeWindowAdvancements=" + numTimeWindowAdvancements +
            " totalReceived=" + totalReceived);
        assertTrue(totalReceived < numEventsPerThread * numThreads + numTimeWindowAdvancements + 1);
        assertTrue(totalReceived >= numEventsPerThread * numThreads);
    }

    private void setUp(int numSymbols, int numThreads, int numEvents, double timeWindowSize)
    {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();
        epService.initialize();

        // Create a statement for N number of symbols, each it's own listener
        String symbols[] = new String[numSymbols];
        listeners = new ResultUpdateListener[symbols.length];
        for (int i = 0; i < symbols.length; i++)
        {
            symbols[i] = "S" + i;
            String viewExpr = "select symbol, sum(volume) as sumVol " +
                              "from " + SupportMarketDataBean.class.getName() +
                              "(symbol='" + symbols[i] + "').win:time(" + timeWindowSize + ")";
            EPStatement testStmt = epService.getEPAdministrator().createEQL(viewExpr);
            listeners[i] = new ResultUpdateListener();
            testStmt.addListener(listeners[i]);
        }

        // Create threads to send events
        threads = new Thread[numThreads];
        TimeWinRunnable[] runnables = new TimeWinRunnable[threads.length];
        for (int i = 0; i < threads.length; i++)
        {
            runnables[i] = new TimeWinRunnable(i, epService.getEPRuntime(), symbols, numEvents);
            threads[i] = new Thread(runnables[i]);
        }
    }

    public static class TimeWinRunnable implements Runnable
    {
        private final int threadNum;
        private final EPRuntime epRuntime;
        private final String[] symbols;
        private final int numberOfEvents;

        public TimeWinRunnable(int threadNum, EPRuntime epRuntime, String[] symbols, int numberOfEvents) {
            this.threadNum = threadNum;
            this.epRuntime = epRuntime;
            this.symbols = symbols;
            this.numberOfEvents = numberOfEvents;
        }

        public void run() {

            for (int i = 0; i < numberOfEvents; i++)
            {
                int symbolNum = (threadNum + numberOfEvents) % symbols.length;
                String symbol = symbols[symbolNum];
                long volume = 1;

                Object event = new SupportMarketDataBean(symbol, -1, volume, null);
                epRuntime.sendEvent(event);
            }
        }
    }

    public static class ResultUpdateListener implements UpdateListener
    {
        private boolean isCaughtRuntimeException;
        private int numReceived = 0;
        private String lastSymbol = null;

        public void update(EventBean[] newEvents, EventBean[] oldEvents) {

            if ((newEvents == null) || (newEvents.length == 0))
            {
                return;
            }

            try {
                numReceived += newEvents.length;

                String symbol = (String) newEvents[0].get("symbol");
                if (lastSymbol != null)
                {
                    Assert.assertEquals(lastSymbol, symbol);
                }
                else
                {
                    lastSymbol = symbol;
                }
            }
            catch (RuntimeException ex)
            {
                log.error("Unexpected exception querying results", ex);
                isCaughtRuntimeException = true;
                throw ex;
            }
        }

        public int getNumReceived() {
            return numReceived;
        }

        public boolean isCaughtRuntimeException() {
            return isCaughtRuntimeException;
        }
    }

    private static final Log log = LogFactory.getLog(TestMultithreadedTimeWin.class);
}
