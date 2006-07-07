package net.esper.schedule;

/**
 * This class is a slot in a {@link ScheduleCallbackBucket} for sorting schedule service callbacks.
 */
public class ScheduleCallbackSlot implements Comparable<ScheduleCallbackSlot>
{
    private int bucketNum;
    private int slotNum;

    public ScheduleCallbackSlot(int bucketNum, int slotNum)
    {
        this.bucketNum = bucketNum;
        this.slotNum = slotNum;
    }

    public int compareTo(ScheduleCallbackSlot scheduleCallbackSlot)
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
