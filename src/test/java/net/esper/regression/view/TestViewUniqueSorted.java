package net.esper.regression.view;

import junit.framework.TestCase;
import net.esper.client.EPServiceProvider;
import net.esper.client.EPServiceProviderManager;
import net.esper.client.EPStatement;
import net.esper.support.util.SupportUpdateListener;
import net.esper.support.util.ArrayAssertionUtil;
import net.esper.support.bean.SupportMarketDataBean;
import net.esper.event.EventBean;
import net.esper.event.EventBeanFactory;

/**
 * This test uses unique and sort views to obtain from a set of market data events the 3 currently most expensive stocks
 * and their symbols.
 * The unique view plays the role of filtering only the most recent events and making prior events for a symbol 'old'
 * data to the sort view, which removes these prior events for a symbol from the sorted window.
 */
public class TestViewUniqueSorted extends TestCase
{
    private static String SYMBOL_CSCO = "CSCO.O";
    private static String SYMBOL_IBM = "IBM.N";
    private static String SYMBOL_MSFT = "MSFT.O";
    private static String SYMBOL_C = "C.N";

    private EPServiceProvider epService;
    private SupportUpdateListener testListener;
    private EPStatement top3Prices;

    public void setUp()
    {
        testListener = new SupportUpdateListener();
        epService = EPServiceProviderManager.getDefaultProvider();
        epService.initialize();

        // Get the top 3 volumes for each symbol
        top3Prices = epService.getEPAdministrator().createEQL(
                "select * from " + SupportMarketDataBean.class.getName() +
                ".std:unique('symbol').ext:sort('price', true, 3)");
        top3Prices.addListener(testListener);
    }
    
    public void testWindowStats()
    {
        testListener.reset();

        EventBean beans[] = new EventBean[10];

        beans[0] = makeEvent(SYMBOL_CSCO, 50);
        epService.getEPRuntime().sendEvent(beans[0].getUnderlying());

        ArrayAssertionUtil.assertEqualsExactOrder(top3Prices.iterator(), new Object[] {beans[0]});
        assertTrue(testListener.isInvoked());
        ArrayAssertionUtil.assertEqualsExactOrder(testListener.getLastOldData(), null);
        ArrayAssertionUtil.assertEqualsExactOrder(testListener.getLastNewData(), new Object[] {beans[0]});
        testListener.reset();

        beans[1] = makeEvent(SYMBOL_CSCO, 20);
        beans[2] = makeEvent(SYMBOL_IBM, 50);
        beans[3] = makeEvent(SYMBOL_MSFT, 40);
        beans[4] = makeEvent(SYMBOL_C, 100);
        beans[5] = makeEvent(SYMBOL_IBM, 10);

        epService.getEPRuntime().sendEvent(beans[1].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[2].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[3].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[4].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[5].getUnderlying());

        ArrayAssertionUtil.assertEqualsExactOrder(top3Prices.iterator(), new Object[] { beans[4], beans[3], beans[5] });

        beans[6] = makeEvent(SYMBOL_CSCO, 110);
        beans[7] = makeEvent(SYMBOL_C, 30);
        beans[8] = makeEvent(SYMBOL_CSCO, 30);

        epService.getEPRuntime().sendEvent(beans[6].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[7].getUnderlying());
        epService.getEPRuntime().sendEvent(beans[8].getUnderlying());

        ArrayAssertionUtil.assertEqualsExactOrder(top3Prices.iterator(), new Object[] { beans[3], beans[8], beans[7] });
    }

    private EventBean makeEvent(String symbol, double price)
    {
        SupportMarketDataBean event = new SupportMarketDataBean(symbol, price, 0L, "");
        return EventBeanFactory.createObject(event);
    }
}
