package net.esper.event;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * Implementation of the {@link EventType} interface for handling plain Maps containing name value pairs.
 */
public final class MapEventType implements EventType
{
    private final String[] propertyNames;       // Cache an array of property names so not to construct one frequently
    private final Map<String, Class> types;     // Mapping of property name and type
    private Map<String, EventPropertyGetter> propertyGetters;   // Mapping of property name and getters

    /**
     * Constructor takes a map of property names and types.
     * @param types is pairs of property name and type
     */
    public MapEventType(Map<String, Class> types)
    {
        this.types = types;

        propertyNames = new String[types.size()];
        propertyGetters = new HashMap<String, EventPropertyGetter>();

        // Initialize getters and names array
        int index = 0;
        for (Map.Entry<String, Class> entry : types.entrySet())
        {
            final String name = entry.getKey();
            propertyNames[index++] = name;

            EventPropertyGetter getter = new EventPropertyGetter()
            {
                public Object get(EventBean obj)
                {
                    // The underlying is expected to be a map
                    if (!(obj.getUnderlying() instanceof Map))
                    {
                        throw new PropertyAccessException("Mismatched property getter to event bean type, " +
                                "the underlying data object is not of type java.lang.Map");
                    }

                    Map map = (Map) obj.getUnderlying();

                    // If the map does not contain the key, this is allowed and represented as null
                    Object value = map.get(name);
                    return value;
                }
            };

            propertyGetters.put(name, getter);
        }
    }

    public final Class getPropertyType(String propertyName)
    {
        return types.get(propertyName);
    }

    public final Class getUnderlyingType()
    {
        return java.util.Map.class;
    }    

    public EventPropertyGetter getGetter(final String propertyName)
    {
        return propertyGetters.get(propertyName);
    }

    public String[] getPropertyNames()
    {
        return propertyNames;
    }

    public boolean isProperty(String propertyName)
    {
        return types.containsKey(propertyName);
    }

    public EventType[] getSuperTypes()
    {
        return null;
    }    

    public String toString()
    {
        return "MapEventType " +
                "propertyNames=" + Arrays.toString(propertyNames);
    }
}
