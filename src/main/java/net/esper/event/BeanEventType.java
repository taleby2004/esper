package net.esper.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

import net.sf.cglib.reflect.FastClass;
import net.esper.event.property.PropertyHelper;
import net.esper.event.property.PropertyParser;
import net.esper.event.property.Property;
import net.esper.event.property.SimpleProperty;

/**
 * Implementation of the EventType interface for handling JavaBean-type classes.
 */
public final class BeanEventType implements EventType
{
    private final Class clazz;

    private String[] propertyNames;
    private Map<String, Class> simplePropertyTypes;
    private Map<String, EventPropertyGetter> simplePropertyGetters;
    private Map<String, EventPropertyDescriptor> simplePropertyDescriptors;
    private Map<String, EventPropertyDescriptor> mappedPropertyDescriptors;
    private Map<String, EventPropertyDescriptor> indexedPropertyDescriptors;
    private EventType[] superTypes;
    private FastClass fastClass;

    /**
     * Constructor takes a java bean class as an argument.
     * @param clazz is the class of a java bean or other POJO
     */
    public BeanEventType(Class clazz)
    {
        this.clazz = clazz;

        initialize();
    }

    public final Class getPropertyType(String propertyName)
    {
        Class propertyType = simplePropertyTypes.get(propertyName);
        if (propertyType != null)
        {
            return propertyType;
        }

        Property prop = PropertyParser.parse(propertyName);
        if (prop instanceof SimpleProperty)
        {
            // there is no such property since it wasn't in simplePropertyTypes
            return null;
        }
        return prop.getPropertyType(this);
    }

    public boolean isProperty(String propertyName)
    {
        if (getPropertyType(propertyName) == null)
        {
            return false;
        }
        return true;
    }

    public final Class getUnderlyingType()
    {
        return clazz;
    }

    public EventPropertyGetter getGetter(String propertyName)
    {
        EventPropertyGetter getter = simplePropertyGetters.get(propertyName);
        if (getter != null)
        {
            return getter;
        }

        Property prop = PropertyParser.parse(propertyName);
        if (prop instanceof SimpleProperty)
        {
            // there is no such property since it wasn't in simplePropertyGetters
            return null;
        }
        return prop.getGetter(this);
    }

    /**
     * Looks up and returns a cached simple property's descriptor.
     * @param propertyName to look up
     * @return property descriptor
     */
    public final EventPropertyDescriptor getSimpleProperty(String propertyName)
    {
        return simplePropertyDescriptors.get(propertyName);
    }

    /**
     * Looks up and returns a cached mapped property's descriptor.
     * @param propertyName to look up
     * @return property descriptor
     */
    public final EventPropertyDescriptor getMappedProperty(String propertyName)
    {
        return mappedPropertyDescriptors.get(propertyName);
    }

    /**
     * Looks up and returns a cached indexed property's descriptor.
     * @param propertyName to look up
     * @return property descriptor
     */
    public final EventPropertyDescriptor getIndexedProperty(String propertyName)
    {
        return indexedPropertyDescriptors.get(propertyName);
    }

    public String[] getPropertyNames()
    {
        return propertyNames;
    }

    public EventType[] getSuperTypes()
    {
        return superTypes;
    }

    /**
     * Returns the fast class reference, if it exists.
     * @return fast class
     */
    public FastClass getFastClass()
    {
        return fastClass;
    }

    public String toString()
    {
        return "BeanEventType" +
               " clazz=" + clazz.getName();
    }

    private void initialize()
    {
        List<EventPropertyDescriptor> properties = PropertyHelper.getProperties(clazz);

        this.propertyNames = new String[properties.size()];
        this.simplePropertyTypes = new HashMap<String, Class>();
        this.simplePropertyGetters = new HashMap<String, EventPropertyGetter>();
        this.simplePropertyDescriptors = new HashMap<String, EventPropertyDescriptor>();
        this.mappedPropertyDescriptors = new HashMap<String, EventPropertyDescriptor>();
        this.indexedPropertyDescriptors = new HashMap<String, EventPropertyDescriptor>();

        // get CGLib fast class
        fastClass = null;
        try
        {
            fastClass = FastClass.create(clazz);
        }
        catch (Throwable ex)
        {
            log.warn(".initialize Unable to obtain CGLib fast class and/or method implementation for class " +
                    clazz.getName() + ", error msg is " + ex.getMessage());
            fastClass = null;
        }

        int count = 0;
        for (EventPropertyDescriptor desc : properties)
        {
            String propertyName = desc.getPropertyName();
            propertyNames[count++] = desc.getListedName();

            if (desc.getPropertyType().equals(EventPropertyType.SIMPLE))
            {
                EventPropertyGetter getter = PropertyHelper.getGetter(desc.getReadMethod(), fastClass);
                simplePropertyTypes.put(propertyName, desc.getReadMethod().getReturnType());
                simplePropertyGetters.put(propertyName, getter);
                simplePropertyDescriptors.put(propertyName, desc);
            }
            else if (desc.getPropertyType().equals(EventPropertyType.MAPPED))
            {
                mappedPropertyDescriptors.put(propertyName, desc);
            }
            else if (desc.getPropertyType().equals(EventPropertyType.INDEXED))
            {
                indexedPropertyDescriptors.put(propertyName, desc);
            }
        }

        // Determine event type super types
        superTypes = getSuperTypes(clazz);
    }

    private static EventType[] getSuperTypes(Class clazz)
    {
        List<Class> superclasses = new LinkedList<Class>();

        // add superclass
        Class superClass = clazz.getSuperclass();
        if (superClass != null)
        {
            superclasses.add(superClass);
        }

        // add interfaces
        Class interfaces[] = clazz.getInterfaces();
        for (int i = 0; i < interfaces.length; i++)
        {
            superclasses.add(interfaces[i]);
        }

        // Build event types, ignoring java language types
        List<EventType> superTypes = new LinkedList<EventType>();
        for (Class superclass : superclasses)
        {
            if (!superclass.getName().startsWith("java"))
            {
                superTypes.add(EventTypeFactory.getInstance().createBeanType(superclass));
            }
        }

        return superTypes.toArray(new EventType[0]);
    }

    private static final Log log = LogFactory.getLog(BeanEventType.class);
}
