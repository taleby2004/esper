package net.esper.example.marketdatafeed;

import net.esper.client.EPStatement;
import net.esper.client.EPAdministrator;
import net.esper.client.UpdateListener;

public class TicksFalloffStatement
{
    private EPStatement statement;

    public TicksFalloffStatement(EPAdministrator admin)
    {
        String stmt = "select feed, avg(cnt) from TicksPerSecond.win:time(20) " +
                      "where cnt < avg(cnt) * 0.75 " +
                      "group by feed";

        statement = admin.createEQL(stmt);
    }

    public void addListener(UpdateListener listener)
    {
        statement.addListener(listener);
    }
}
