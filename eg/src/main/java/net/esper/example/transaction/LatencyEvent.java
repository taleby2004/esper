package net.esper.example.transaction;

public class LatencyEvent
{
    private String customerId;
    private String supplierId;
    private long latencyAC;
    private long latencyBC;
    private long latencyAB;

    public LatencyEvent(String customerId, String supplierId, long latencyAC, long latencyBC, long latencyAB)
    {
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.latencyAC = latencyAC;
        this.latencyBC = latencyBC;
        this.latencyAB = latencyAB;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public String getSupplierId()
    {
        return supplierId;
    }

    public long getLatencyAC()
    {
        return latencyAC;
    }

    public long getLatencyBC()
    {
        return latencyBC;
    }

    public long getLatencyAB()
    {
        return latencyAB;
    }
}
