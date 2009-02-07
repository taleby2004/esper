package com.espertech.esper.event.property;

public class NativePropertyDesc
{
    private final Class type;
    private final Class generic;

    public NativePropertyDesc(Class type, Class generic)
    {
        this.type = type;
        this.generic = generic;
    }

    public NativePropertyDesc(Class type)
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
