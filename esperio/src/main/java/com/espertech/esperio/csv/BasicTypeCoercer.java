package com.espertech.esperio.csv;

public class BasicTypeCoercer extends AbstractTypeCoercer {

	public Object coerce(String property, String source) throws Exception {
		Object[] parameters = new Object[] { source };
		Object value = propertyConstructors.get(property).newInstance(parameters);
		return value;
	}
}
