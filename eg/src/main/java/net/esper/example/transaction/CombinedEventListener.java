package net.esper.example.transaction;

import net.esper.client.*;
import net.esper.event.EventBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CombinedEventListener implements UpdateListener
{
    public void update(EventBean[] newEvents, EventBean[] oldEvents)
    {
        if (newEvents == null)
        {
            // we don't care about events leaving the window (old events)
            return;
        }

        TxnEventA eventA = (TxnEventA) newEvents[0].get("A");
        TxnEventB eventB = (TxnEventB) newEvents[0].get("B");
        TxnEventC eventC = (TxnEventC) newEvents[0].get("C");

        log.debug("Combined event detected " +
                " TxnEventA " + eventA.toString() +
                " TxnEventB " + eventB.toString() +
                " TxnEventC " + eventC.toString()
                );
    }

    private static final Log log = LogFactory.getLog(CombinedEventListener.class);
}
