package net.esper.regression.eql;

import net.esper.client.EPServiceProvider;
import net.esper.client.EPServiceProviderManager;
import net.esper.client.EPStatement;
import net.esper.client.time.TimerControlEvent;
import net.esper.support.util.SupportUpdateListener;
import net.esper.support.bean.SupportBean;
import junit.framework.TestCase;

public class TestInsertInto extends TestCase
{
    private EPServiceProvider epService;
    private SupportUpdateListener updateListenerFeed;
    private SupportUpdateListener updateListenerResult;

    public void setUp()
    {
        epService = EPServiceProviderManager.getDefaultProvider();
        epService.initialize();
        updateListenerFeed = new SupportUpdateListener();
        updateListenerResult = new SupportUpdateListener();

        // Use external clocking for the test
        epService.getEPRuntime().sendEvent(new TimerControlEvent(TimerControlEvent.ClockType.CLOCK_EXTERNAL));
    }

    // TODO: join
    // TODO: individual columns versus wildcard
    public void testVariantOne()
    {
        String stmtText = "insert into Event_1 (delta, product) " +
                      "select intPrimitive - intBoxed as deltaTag, intPrimitive * intBoxed as productTag " +
                      "from " + SupportBean.class.getName() + ".win:length(100)";

        runAsserts(stmtText);
    }

    public void testVariantTwo()
    {
        String stmtText = "insert into Event_1 " +
                      "select intPrimitive - intBoxed as delta, intPrimitive * intBoxed as product " +
                      "from " + SupportBean.class.getName() + ".win:length(100)";

        runAsserts(stmtText);
    }

    private void runAsserts(String stmtText)
    {
        EPStatement stmt = epService.getEPAdministrator().createEQL(stmtText);
        stmt.addListener(updateListenerFeed);

        stmtText = "select min(delta), max(delta), min(product), max(product)" +
                   "from Event_1.win:time(60)";

        stmt = epService.getEPAdministrator().createEQL(stmtText);
        stmt.addListener(updateListenerResult);

        sendEvent(20, 10);
        assertReceivedFeed(10, 200);
        assertReceivedMinMax(10, 10, 200, 200);
    }

    private void assertReceivedMinMax(int minDelta, int maxDelta, int minProduct, int intMaxProduct)
    {

    }

    private void assertReceivedFeed(int delta, int product)
    {
        assertEquals(1, updateListenerFeed.getNewDataList().size());
        assertEquals(1, updateListenerFeed.getLastNewData().length);
        assertEquals(delta, updateListenerFeed.getLastNewData()[0].get("delta"));
        assertEquals(product, updateListenerFeed.getLastNewData()[0].get("delta"));
        updateListenerFeed.reset();
    }

    private void sendEvent(int intPrimitive, int intBoxed)
    {
        SupportBean bean = new SupportBean();
        bean.setIntPrimitive(intPrimitive);
        bean.setIntBoxed(intBoxed);
        epService.getEPRuntime().sendEvent(bean);
    }
}
