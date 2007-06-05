package net.esper.collection;

import net.esper.event.EventBean;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayEventIterator implements Iterator<EventBean>
{
    private final EventBean[] events;
    private int position;

    public ArrayEventIterator(EventBean[] events)
    {
        this.events = events;
    }

    public boolean hasNext()
    {
        if ((events == null) || (position >= events.length))
        {
            return false;
        }
        return true;
    }

    public EventBean next()
    {
        if ((events == null) || (position >= events.length))
        {
            throw new NoSuchElementException();
        }
        return events[position++];
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
