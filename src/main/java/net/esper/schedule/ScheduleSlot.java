package net.esper.schedule;

/**
 * This class is a slot in a {@link ScheduleBucket} for sorting schedule service callbacks.
 */
public class ScheduleSlot implements Comparable<ScheduleSlot>
{
    private int bucketNum;
    private int slotNum;

    public ScheduleSlot(int bucketNum, int slotNum)
    {
        this.bucketNum = bucketNum;
        this.slotNum = slotNum;
    }

    public int compareTo(ScheduleSlot scheduleCallbackSlot)
    {
        if (this.bucketNum > scheduleCallbackSlot.bucketNum)
        {
            return 1;
        }
        if (this.bucketNum < scheduleCallbackSlot.bucketNum)
        {
            return -1;
        }
        if (this.slotNum > scheduleCallbackSlot.slotNum)
        {
            return 1;
        }
        if (this.slotNum < scheduleCallbackSlot.slotNum)
        {
            return -1;
        }

        return 0;
    }
}
