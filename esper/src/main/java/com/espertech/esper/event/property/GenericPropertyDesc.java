package com.espertech.esper.event.property;

public class GenericPropertyDesc
{
    private final Class type;
    private final Class generic;

    public GenericPropertyDesc(Class type, Class generic)
    {
        this.type = type;
        this.generic = generic;
    }

    public GenericPropertyDesc(Class type)
    {
        this.type = type;
        this.generic = null;
    }

    public Class getType()
    {
        return type;
    }

    public Class getGeneric()
    {
        return generic;
    }
}
