package com.espertech.esperio.csv;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.espertech.esper.util.JavaClassHelper;

import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastConstructor;

public abstract class AbstractTypeCoercer {

	protected static final Log log = LogFactory.getLog(AbstractTypeCoercer.class);
	
	protected Map<String, FastConstructor> propertyConstructors;

	public void setPropertyTypes(Map<String, Class> propertyTypes) {
		this.propertyConstructors = createPropertyConstructors(propertyTypes);
	}
	
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
