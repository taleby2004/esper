package net.esper.example.benchmark.server;

import java.io.Serializable;

/**
 * The actual event.
 * The time property (ms) is the send time from the client sender, and can be used for end to end latency providing client(s)
 * and server OS clocks are in sync.
 * The inTime property is the unmarshal (local) time (ns).
 */
public class MarketData implements Serializable {

    private String ticker;
    private double price;
    private long time;//ms

    private int volume;
    private final long inTime;

    public MarketData() {
        inTime = System.nanoTime();
        time = System.currentTimeMillis();//default for simulation
    }

    public static MarketData parseCSV(String market) {
        MarketData md = new MarketData();
        String[] elems = market.split("\\|");
        md.setTicker(elems[0]);
        md.setPrice(Double.parseDouble(elems[1]));
        md.setTime(Long.parseLong(elems[2]));
        md.setVolume(Integer.parseInt(elems[3]));
        return md;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public long getInTime() {
        return inTime;
    }

    public String toString() {
        return (new StringBuilder(String.valueOf(ticker))).append(" : ").append(time).append(" :").append(price).append(" :").append(volume).toString();
    }


    protected Object clone() throws CloneNotSupportedException {
        MarketData clone = new MarketData();
        clone.setTicker(ticker);
        clone.setPrice(price);
        clone.setVolume(volume);
        return clone;
    }
}
