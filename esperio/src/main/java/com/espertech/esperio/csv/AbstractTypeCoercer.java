package com.espertech.esperio.csv;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.espertech.esper.util.JavaClassHelper;

import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastConstructor;

/**
 * Coercer for type conversion.
 */
public abstract class AbstractTypeCoercer {

    /**
     * For logging.
     */
    protected static final Log log = LogFactory.getLog(AbstractTypeCoercer.class);

    /**
     * Constructors for coercion.
     */
    protected Map<String, FastConstructor> propertyConstructors;

    /**
     * Ctor.
     * @param propertyTypes the type conversion to be done
     */
    public void setPropertyTypes(Map<String, Class> propertyTypes) {
		this.propertyConstructors = createPropertyConstructors(propertyTypes);
	}

    /**
     * Convert a value.
     * @param property property name
     * @param source value to convert
     * @return object value
     * @throws Exception if coercion failed
     */
    abstract Object coerce(String property, String source) throws Exception;
	
	private Map<String, FastConstructor> createPropertyConstructors(Map<String, Class> propertyTypes)
	{
		Map<String, FastConstructor> constructors = new HashMap<String, FastConstructor>();

        Class[] parameterTypes = new Class[] { String.class };
        for(String property : propertyTypes.keySet())
		{
			log.debug(".createPropertyConstructors property==" + property + ", type==" + propertyTypes.get(property	));
			FastClass fastClass = FastClass.create(JavaClassHelper.getBoxedType(propertyTypes.get(property)));
			FastConstructor constructor = fastClass.getConstructor(parameterTypes);
			constructors.put(property, constructor);
		}
		return constructors;
	}
}
