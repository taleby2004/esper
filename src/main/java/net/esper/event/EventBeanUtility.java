package net.esper.event;

import net.esper.collection.Pair;
import net.esper.collection.MultiKeyUntyped;

import java.util.*;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Method to getSelectListEvents events in collections to other collections or other event types.
 */
public class EventBeanUtility
{
    /**
     * Flatten the vector of arrays to an array. Return null if an empty vector was passed, else
     * return an array containing all the events.
     * @param eventVector vector
     * @return array with all events
     */
    public static EventBean[] flatten(Vector<EventBean[]> eventVector)
    {
        if (eventVector.size() == 0)
        {
            return null;
        }

        if (eventVector.size() == 1)
        {
            return eventVector.get(0);
        }

        int totalElements = 0;
        for (int i = 0; i < eventVector.size(); i++)
        {
            totalElements += eventVector.get(i).length;
        }

        EventBean[] result = new EventBean[totalElements];
        int destPos = 0;
        for (int i = 0; i < eventVector.size(); i++)
        {
            EventBean[] src = eventVector.get(i);
            System.arraycopy(src, 0, result, destPos, src.length);
            destPos += eventVector.get(i).length;
        }

        return result;
    }

     /**
     * Append arrays.
     * @param source array
     * @param append array
     * @return appended array
     */
    protected static EventBean[] append(EventBean[] source, EventBean[] append)
    {
        EventBean[] result = new EventBean[source.length + append.length];
        System.arraycopy(source, 0, result, 0, source.length);
        System.arraycopy(append, 0, result, source.length, append.length);
        return result;
    }

    /**
     * Convert list of events to array, returning null for empty or null lists.
     * @param eventList
     * @return array of events
     */
    public static EventBean[] toArray(List<EventBean> eventList)
    {
        if ((eventList == null) || (eventList.isEmpty()))
        {
            return null;
        }
        return eventList.toArray(new EventBean[0]);
    }

    /**
     * Convert a list of pairs of event and set of events to an event array using the given names as composite
     * event properties.
     * @param joinData - pairs of event and set of events
     * @param outerEventName - property name for pair first event
     * @param innerEventName - property name for each event in set
     * @param eventType - map type to use for result events
     * @return event bean array
     */
    public static EventBean[] convert(LinkedList<Pair<EventBean, Set<EventBean>>> joinData,
                                      String outerEventName, String innerEventName,
                                      EventType eventType)
    {
        ArrayList<EventBean> result = new ArrayList<EventBean>();

        for (Pair<EventBean, Set<EventBean>> pair : joinData)
        {
            for (EventBean event : pair.getSecond())
            {
                Map<String, Object> tuple = new HashMap<String, Object>();
                tuple.put(outerEventName, pair.getFirst());
                tuple.put(innerEventName, event);

                result.add(EventBeanFactory.createMapFromValues(tuple, eventType));
            }
        }

        return result.toArray(new EventBean[0]);
    }

    /**
     * Convert a set of pairs of events to an array of events each event being a map of the underlying event objects.
     * @param set - set of event pairs
     * @param firstEventName - property name of first event in pair
     * @param secondEventName - property name of second event in pair
     * @param eventType - type of composite event
     * @return event array
     */
    public static EventBean[] convert(Set<Pair<EventBean, EventBean>> set,
                               String firstEventName,
                               String secondEventName,
                               EventType eventType)
    {
        if (set.isEmpty())
        {
            return null;
        }

        EventBean[] events = new EventBean[set.size()];

        int index = 0;
        for (Iterator<Pair<EventBean, EventBean>> iter = set.iterator(); iter.hasNext();)
        {
            Map<String, Object> tuple = new HashMap<String, Object>();

            Pair<EventBean, EventBean> pair = iter.next();
            tuple.put(firstEventName, pair.getFirst().getUnderlying());
            tuple.put(secondEventName, pair.getSecond().getUnderlying());

            events[index++] = EventBeanFactory.createMapFromValues(tuple, eventType);
        }

        return events;
    }

    /**
     * Returns object array containing property values of given properties, retrieved via EventPropertyGetter
     * instances.
     * @param event - event to get property values from
     * @param propertyGetters - getters to use for getting property values
     * @return object array with property values
     */
    public static Object[] getPropertyArray(EventBean event, EventPropertyGetter[] propertyGetters)
    {
        Object[] keyValues = new Object[propertyGetters.length];
        for (int i = 0; i < propertyGetters.length; i++)
        {
            keyValues[i] = propertyGetters[i].get(event);
        }
        return keyValues;
    }

    /**
     * Returns Multikey instance for given event and getters.
     * @param event - event to get property values from
     * @param propertyGetters - getters for access to properties
     * @return MultiKey with property values
     */
    public static MultiKeyUntyped getMultiKey(EventBean event, EventPropertyGetter[] propertyGetters)
    {
        Object[] keyValues = getPropertyArray(event, propertyGetters);
        return new MultiKeyUntyped(keyValues);
    }

    /**
     * Format the event and return a string representation.
     * @param event is the event to format.
     * @return string representation of event
     */
    public static String printEvent(EventBean event)
    {
        StringWriter writer = new StringWriter();
        PrintWriter buf = new PrintWriter(writer);
        printEvent(buf, event);
        return writer.toString();
    }

    private static void printEvent(PrintWriter writer, EventBean event)
    {
        String[] properties = event.getEventType().getPropertyNames();
        for (int i = 0; i < properties.length; i++)
        {
            writer.println( "#" + i + "  " + properties[i] + " = " + event.get(properties[i]));
        }
    }
}
