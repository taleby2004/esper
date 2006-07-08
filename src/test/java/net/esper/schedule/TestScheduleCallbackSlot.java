package net.esper.schedule;

import junit.framework.TestCase;

public class TestScheduleCallbackSlot extends TestCase
{
    public void testCompare()
    {
        ScheduleCallbackSlot slots[] = new ScheduleCallbackSlot[10];
        slots[0] = new ScheduleCallbackSlot(1, 1);
        slots[1] = new ScheduleCallbackSlot(1, 2);
        slots[2] = new ScheduleCallbackSlot(2, 1);
        slots[3] = new ScheduleCallbackSlot(2, 2);

        assertEquals(-1, slots[0].compareTo(slots[1]));
        assertEquals(1, slots[1].compareTo(slots[0]));
        assertEquals(0, slots[0].compareTo(slots[0]));

        assertEquals(-1, slots[0].compareTo(slots[2]));
        assertEquals(-1, slots[1].compareTo(slots[2]));
        assertEquals(1, slots[2].compareTo(slots[0]));
        assertEquals(1, slots[2].compareTo(slots[1]));
    }
}
