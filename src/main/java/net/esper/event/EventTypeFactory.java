package net.esper.event;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A singleton factory class for obtaining {@link EventType} instances. The singleton caches {@link EventType} instances
 * for Java beans, and does not cache event types for Map-based events.
 *
 * It is recommended to cache references to Map type implementations and reuse them for memory efficiency.
 * <p>
 * Usage (JavaBean):
 * <pre>
 * Class employeeBeanClass = Class.forName("com.xyz.beans.Employee");
 * EventType empolyeeType = <b>EventTypeFactory.getInstance().createBeanType(employeeBeanClass)</b>;
 * </pre>
 * Usage (Map):
 * <pre>
 * HashMap employeeProperties = new HashMap();
 * employeeProperties.put("firstName", String.class);
 * employeeProperties.put("SSN", Integer.class);
 * EventType empolyeeType = <b>EventTypeFactory.getInstance().createMapType(employeeProperties)</b>;
 * </pre>
 */
public final class EventTypeFactory
{
    private static final EventTypeFactory myInstance = new EventTypeFactory();

    private final Map<Class, EventType> typesPerJavaBean;
    private final Map<EventType, Set<EventType>> superTypesPerType;

    /**
     * Returns singleton instance.
     * @return singleton instance
     */
    public static EventTypeFactory getInstance()
    {
        return myInstance;
    }

    private EventTypeFactory()
    {
        typesPerJavaBean = new ConcurrentHashMap<Class, EventType>();
        superTypesPerType = new ConcurrentHashMap<EventType, Set<EventType>>();
    }

    /**
     * Clear any cached types - for unit testing pruposes.
     */
    protected void clear()
    {
        typesPerJavaBean.clear();
    }

    /**
     * Creates a new EventType instance for an event type that contains a map of name value pairs.
     * The method accepts a Map that contains the property names as keys and Class objects as the values.
     * The Class instances represent the property types.
     * <p>
     * New instances are created by this method on every invocation. Clients to this method need to
     * cache the returned EventType instance to reuse EventType's for same-typed events.
     * @param propertyTypes is a map of String to Class objects
     * @return EventType implementation for map field names and value types
     */
    public final EventType createMapType(Map<String, Class> propertyTypes)
    {
        return new MapEventType(propertyTypes);
    }

    /**
     * Creates a new EventType object for a java bean of the specified class if this is the first time
     * the class has been seen. Else uses a cached EventType instance, i.e. client classes do not need to cache.
     * @param clazz is the class of the Java bean.
     * @return EventType implementation for bean class
     */
    public final EventType createBeanType(Class clazz)
    {
        if (clazz == null)
        {
            throw new IllegalArgumentException("Null value passed as class");
        }

        // Check if its already there
        EventType eventType = typesPerJavaBean.get(clazz);
        if (eventType != null)
        {
            return eventType;
        }

        eventType = new BeanEventType(clazz);
        typesPerJavaBean.put(clazz, eventType);

        // Get Java super types (superclasses and interfaces), deep get of all in the tree
        Set<Class> supers = new HashSet<Class>();
        getSuper(clazz, supers);
        removeJavaLibInterfaces(supers);    // Remove "java." super types

        // Cache the supertypes of this event type for later use
        Set<EventType> superTypes = new HashSet<EventType>();
        for (Class superClass : supers)
        {
            EventType superType = createBeanType(superClass);
            superTypes.add(superType);
        }
        superTypesPerType.put(eventType, superTypes);

        return eventType;
    }

    /**
     * Returns super types to event type, going up the hierarchy and including all super-interfaces
     * and classes.
     * @param eventType is the type to traverse up
     * @return set of event types represeting all superclasses and implemented interfaces, all the way up to Object
     */
    public final Set<EventType> getDeepSuperTypes(EventType eventType)
    {
        return superTypesPerType.get(eventType);
    }

    /**
     * Add the given class's implemented interfaces and superclasses to the result set of classes.
     * @param clazz to introspect
     * @param result to add classes to
     */
    protected static void getSuper(Class clazz, Set<Class> result)
    {
        getSuperInterfaces(clazz, result);
        getSuperClasses(clazz, result);
    }

    private static void getSuperInterfaces(Class clazz, Set<Class> result)
    {
        Class interfaces[] = clazz.getInterfaces();

        for (int i = 0; i < interfaces.length; i++)
        {
            result.add(interfaces[i]);
            getSuperInterfaces(interfaces[i], result);
        }
    }

    private static void getSuperClasses(Class clazz, Set<Class> result)
    {
        Class superClass = clazz.getSuperclass();
        if (superClass == null)
        {
            return;
        }

        result.add(superClass);
        getSuper(superClass, result);
    }

    private static void removeJavaLibInterfaces(Set<Class> classes)
    {
        for (Class clazz : classes.toArray(new Class[0]))
        {
            if (clazz.getName().startsWith("java"))
            {
                classes.remove(clazz);
            }
        }
    }

}
