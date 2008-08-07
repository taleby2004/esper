package com.espertech.esperio.ext;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;

import com.espertech.esperio.csv.BasicTypeCoercer;

public class BasicTypeCoercerDateFormat extends BasicTypeCoercer {

	private Map<String, DateFormat> dateFormats = new HashMap<String, DateFormat>();

	@Override
	public Object coerce(String property, String source) throws Exception {
		DateFormat df = dateFormats.get(property);
		if (df != null) {
			return df.parse(source).getTime();
		}
		return super.coerce(property, source);
	}
	
	public void addDateFormat(String propertyName, DateFormat df) {
		this.dateFormats.put(propertyName, df);
	}
}
