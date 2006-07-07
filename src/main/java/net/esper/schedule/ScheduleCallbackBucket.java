package net.esper.schedule;

/**
 * This class acts as a buckets for sorting schedule service callbacks that are scheduled to occur at the same
 * time. Each buckets constists of {@link ScheduleCallbackSlot} slots that callbacks are
 * assigned to.
 * <p>
 * At the time of timer evaluation, callbacks that become triggerable are ordered using the bucket
 * as the first-level order, and slot as the second-level order.
 * <p>
 * Each statement at statement creation time allocates a buckets, and each timer within the
 * statement allocates a slot. Thus statements that depend on other statements (such as for insert-into),
 * and timers within their statement (such as time window or output rate limit timers) behave
 * deterministically.
 */
public class ScheduleCallbackBucket
{
    private final int bucketNum;
    private int lastSlot;

    public ScheduleCallbackBucket(int bucketNum)
    {
        this.bucketNum = bucketNum;
        lastSlot = 0;
    }

    public void restart()
    {
        lastSlot = 0;
    }

    public ScheduleCallbackSlot allocateSlot()
    {
        return new ScheduleCallbackSlot(bucketNum, lastSlot++);        
    }
}
