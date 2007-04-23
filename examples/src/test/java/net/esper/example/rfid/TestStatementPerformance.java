package net.esper.example.rfid;

import junit.framework.TestCase;
import net.esper.client.Configuration;
import net.esper.client.EPServiceProvider;
import net.esper.client.EPServiceProviderManager;
import net.esper.client.EPStatement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestStatementPerformance extends TestCase
{
    private static final Log log = LogFactory.getLog(TestStatementPerformance.class);
    private EPServiceProvider epService;
    private Random random = new Random();

    public void setUp()
    {
        Configuration config = new Configuration();
        config.addEventTypeAlias("LocationReport", LocationReport.class);

        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
    }

    public void testPerformance() throws Exception
    {
        // Number of seconds the total test runs
        int numSeconds = 60;

        // Number of asset groups
        int numAssetGroups = 1000;

        // Number of threads
        int numThreads = 2;

        // Ratio of events indicating that all assets moved to a new zone
        int ratioZoneMove= 3;

        // Ratio of events indicating that the asset group split between zones, i.e. only some assets in a group move to a new zone
        int ratioZoneSplit = 1000000;
        
        tryPerf(numSeconds, numAssetGroups, numThreads, ratioZoneMove, ratioZoneSplit);
    }

    private void tryPerf(int numSeconds, int numAssetGroups, int numThreads, int ratioZoneMove, int ratioZoneSplit)
            throws Exception
    {
        // Create Asset Ids and assign to a zone
        log.info(".tryPerf Creating asset ids");
        String[][] assetIds = new String[numAssetGroups][3];
        int[][] zoneIds = new int[numAssetGroups][3];
        for (int i = 0; i < numAssetGroups; i++)
        {
            // Generate unique asset id over all groups
            String assetPrefix = String.format("%010d", i); // 10 digit zero padded, i.e. 00000001.n;
            assetIds[i][0] = assetPrefix + "0";
            assetIds[i][1] = assetPrefix + "1";
            assetIds[i][2] = assetPrefix + "2";

            int currentZone = Math.abs(random.nextInt()) % AssetEventGenCallable.NUM_ZONES;
            zoneIds[i][0] = currentZone;
            zoneIds[i][1] = currentZone;
            zoneIds[i][2] = currentZone;
        }

        // Create statements
        log.info(".tryPerf Creating " + numAssetGroups + " statements for " + numAssetGroups + " asset groups");
        AssetZoneSplitListener listeners[] = new AssetZoneSplitListener[numAssetGroups];
        for (int i = 0; i < numAssetGroups; i++)
        {
            String streamName = "CountZone_" + i;
            String assetIdList = "'" + assetIds[i][0] + "','" + assetIds[i][1] + "','" + assetIds[i][2] + "'";

            String textOne = "insert into " + streamName +
                    " select " + i + " as groupId, zone, count(*) as cnt " +
                    "from LocationReport(assetId in (" + assetIdList + ")).std:unique('assetId') " +
                    "group by zone";
            EPStatement stmtOne = epService.getEPAdministrator().createEQL(textOne);
            // stmtOne.addListener(new AssetGroupCountListener());  for debugging

            String textTwo = "select * from pattern [" +
                    "  every a=" + streamName + "(cnt in [1:2]) ->" +
                    "  (timer:interval(10 sec) and not " + streamName + "(cnt in (0, 3)))]";
            EPStatement stmtTwo = epService.getEPAdministrator().createEQL(textTwo);
            listeners[i] = new AssetZoneSplitListener();
            stmtTwo.addListener(listeners[i]);
        }

        // First, send an event for each asset with it's current zone
        log.info(".tryPerf Sending one event for each asset");
        for (int i = 0; i < assetIds.length; i++)
        {
            for (int j = 0; j < assetIds[i].length; j++)
            {
                LocationReport report = new LocationReport(assetIds[i][j], zoneIds[i][j]);
                epService.getEPRuntime().sendEvent(report);
            }
        }

        // Reset listeners
        for (int i = 0; i < listeners.length; i++)
        {
            //listeners[i].reset();
        }

        // Create threadpool
        log.info(".tryPerf Starting " + numThreads + " threads");
        ExecutorService threadPool = Executors.newFixedThreadPool(numThreads);
        Future future[] = new Future[numThreads];
        AssetEventGenCallable callables[] = new AssetEventGenCallable[numThreads];
        Integer[][] assetGroupsForThread = getGroupsPerThread(numAssetGroups, numThreads);

        for (int i = 0; i < numThreads; i++)
        {
            callables[i] = new AssetEventGenCallable(epService, assetIds, zoneIds, assetGroupsForThread[i], ratioZoneMove, ratioZoneSplit);
            future[i] = threadPool.submit(callables[i]);
        }

        // Create threadpool
        log.info(".tryPerf Running for " + numSeconds + " seconds");
        long startTime = System.currentTimeMillis();
        long currTime;
        double deltaSeconds;
        int lastTotalEvents = 0;
        do
        {
            // sleep
            Thread.sleep(1000);
            currTime = System.currentTimeMillis();
            deltaSeconds = (currTime - startTime) / 1000.0;

            // report statistics
            int totalEvents = 0;
            int totalZoneMoves = 0;
            int totalZoneSplits = 0;
            int totalZoneSame = 0;
            for (int i = 0; i < callables.length; i++)
            {
                totalEvents += callables[i].getNumEventsSend();
                totalZoneMoves += callables[i].getNumZoneMoves();
                totalZoneSplits += callables[i].getNumZoneSplits();
                totalZoneSame += callables[i].getNumSameZone();
            }
            double throughputOverall = totalEvents / deltaSeconds;
            double totalLastBatch = totalEvents - lastTotalEvents;
            log.info("totalEvents=" + totalEvents +
                    " delta=" + deltaSeconds +
                    " throughputOverall=" + throughputOverall +
                    " lastBatch=" + totalLastBatch +
                    " zoneMoves=" + totalZoneMoves +
                    " zoneSame=" + totalZoneSame +
                    " zoneSplits=" + totalZoneSplits
                    );
            lastTotalEvents = totalEvents;

            // If we are within 15 seconds of shutdown, stop generating zone splits
            if ( ((numSeconds - deltaSeconds) < 15) && (callables[0].isGenerateZoneSplit()))
            {
                log.info(".tryPerf Setting stop split flag on threads");
                for (int i = 0; i < callables.length; i++)
                {
                    callables[i].setGenerateZoneSplit(false);
                }
            }
        }
        while (deltaSeconds < numSeconds);

        log.info(".tryPerf Shutting down threads");
        for (int i = 0; i < callables.length; i++)
        {
            callables[i].setShutdown(true);
        }
        threadPool.shutdown();
        threadPool.awaitTermination(10, TimeUnit.SECONDS);

        for (int i = 0; i < numThreads; i++)
        {
            assertTrue((Boolean) future[i].get());
        }

        // Get groups split
        Set<Integer> splitGroups = new HashSet<Integer>();
        for (int i = 0; i < callables.length; i++)
        {
            splitGroups.addAll(callables[i].getSplitZoneGroups());
        }
        log.info(".tryPerf Generated splits were " + splitGroups + " groups");

        // Compare to listeners
        for (Integer groupId : splitGroups)
        {
            assertTrue(listeners[groupId].getCallbacks().size() > 0);
        }
    }

    // Subdivide say 1000 groups into 3 threads, i.e. 0 - 333, 334 to 666, 667 - 999 (roughly)
    private Integer[][] getGroupsPerThread(int numGroups, int numThreads)
    {
        Integer[][] result = new Integer[numThreads][];
        int bucketSize = numGroups / numThreads;
        for (int i = 0; i < numThreads; i++)
        {
            int start = i * bucketSize;
            int end = start + bucketSize;
            List<Integer> groups = new ArrayList<Integer>();

            for (int j = start; j < end; j++)
            {
                groups.add(j);
            }

            result[i] = groups.toArray(new Integer[0]);
            log.info(".tryPerf Thread " + i + " getting groups " + result[i][0] + " to " + result[i][result[i].length - 1]);
        }
        return result;
    }
}
