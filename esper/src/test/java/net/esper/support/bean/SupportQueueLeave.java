package net.esper.support.bean;

/**
 * Created by IntelliJ IDEA.
 * User: U484399
 * Date: Jan 18, 2008
 * Time: 12:46:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SupportQueueLeave {
    private int id;
    private String location;
    private long timeLeave;

    public SupportQueueLeave(int id, String location, long timeLeave) {
        this.id = id;
        this.location = location;
        this.timeLeave = timeLeave;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeLeave() {
        return timeLeave;
    }
}
package net.esper.support.bean;

public class SupportQueueLeave
{
    private int id;
    private String location;
    private long timeLeave;

    public SupportQueueLeave(int id, String location, long timeLeave)
    {
        this.id = id;
        this.location = location;
        this.timeLeave = timeLeave;
    }

    public int getId()
    {
        return id;
    }

    public String getLocation()
    {
        return location;
    }

    public long getTimeLeave()
    {
        return timeLeave;
    }
}
