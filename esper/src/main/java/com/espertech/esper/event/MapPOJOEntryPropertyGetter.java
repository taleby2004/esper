package com.espertech.esper.event;

import java.util.Map;

public class MapPOJOEntryPropertyGetter implements EventPropertyGetter {

    private final String propertyMap;
    private final EventPropertyGetter mapEntryGetter;
    private final EventAdapterService eventAdapterService;

    public MapPOJOEntryPropertyGetter(String propertyMap, EventPropertyGetter mapEntryGetter, EventAdapterService eventAdapterService) {
        this.propertyMap = propertyMap;
        this.mapEntryGetter = mapEntryGetter;
        this.eventAdapterService = eventAdapterService;
    }

    public Object get(EventBean obj)
    {
        Object underlying = obj.getUnderlying();

        // The underlying is expected to be a map
        if (!(underlying instanceof Map))
        {
            throw new PropertyAccessException("Mismatched property getter to event bean type, " +
                    "the underlying data object is not of type java.lang.Map");
        }

        Map map = (Map) underlying;

        // If the map does not contain the key, this is allowed and represented as null
        Object value = map.get(propertyMap);

        if (value == null)
        {
            return null;
        }

        // Object within the map
        EventBean event = eventAdapterService.adapterForBean(value);
        return mapEntryGetter.get(event);
    }

    public boolean isExistsProperty(EventBean eventBean)
    {
        return true; // Property exists as the property is not dynamic (unchecked)
    }
}

