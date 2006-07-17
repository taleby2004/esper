package net.esper.example.marketdatafeed;

import net.esper.client.EPStatement;
import net.esper.client.EPAdministrator;
import net.esper.client.UpdateListener;

public class TicksPerSecondStatement
{
    private EPStatement statement;

    public TicksPerSecondStatement(EPAdministrator admin)
    {
        String stmt = "insert into TicksPerSecond (feed, cnt) " +
                      "select feed, count(*) from MarketDataEvent.win:time(1) group by feed output every 1 seconds";

        //String stmt = "select feed, count(*) as cnt from MarketDataEvent.win:time(1) group by feed output every 1 seconds";

        statement = admin.createEQL(stmt);
    }

    public void addListener(UpdateListener listener)
    {
        statement.addListener(listener);
    }
}

