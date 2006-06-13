package net.esper.example.transaction;

import net.esper.client.UpdateListener;
import net.esper.client.EPRuntime;
import net.esper.event.EventBean;

public class LatencyFeederListener implements UpdateListener
{
    private EPRuntime runtime;

    public LatencyFeederListener(EPRuntime runtime)
    {
        this.runtime = runtime;
    }

    public void update(EventBean[] newEvents, EventBean[] oldEvents)
    {
        if (newEvents == null)
        {
            // we don't care about events leaving the window
            return;
        }

        TxnEventA eventA = (TxnEventA) newEvents[0].get("A");
        TxnEventB eventB = (TxnEventB) newEvents[0].get("B");
        TxnEventC eventC = (TxnEventC) newEvents[0].get("C");

        long latencyAC = eventC.getTimestamp() - eventA.getTimestamp();
        long latencyAB = eventB.getTimestamp() - eventA.getTimestamp();
        long latencyBC = eventC.getTimestamp() - eventB.getTimestamp();
        LatencyEvent latencyEvent = new LatencyEvent(eventA.getCustomerId(), eventC.getSupplierId(),
                latencyAC, latencyBC, latencyAB);

        runtime.route(latencyEvent);
    }
}