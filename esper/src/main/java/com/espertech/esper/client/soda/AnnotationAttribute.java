package com.espertech.esper.client.soda;

import java.io.Serializable;

/**
 * Represents a single annotation attribute, the value of which may itself be a single value, array or further annotations.
 */
public class AnnotationAttribute implements Serializable {

    private String name;
    private Object value;

    /**
     * Ctor.
     */
    public AnnotationAttribute() {
    }

    /**
     * Ctor.
     * @param name annotation name
     * @param value annotation value, could be a primitive, array or another annotation
     */
    public AnnotationAttribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns annotation name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets annotation name.
     * @param name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns annotation value.
     * @return value
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets annotation value.
     * @param value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }
}