/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.event;

/**
 * Interface for property getters also returning type information for the property.
 * @author pablo
 */
public interface TypedEventPropertyGetter extends EventPropertyGetter {

	/**
	 * Returns type of event property.
	 * @return class of the objects returned by this getter
	 */
	public Class getResultClass();
}
