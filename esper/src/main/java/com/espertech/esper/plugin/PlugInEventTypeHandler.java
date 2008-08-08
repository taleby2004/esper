/**************************************************************************************
 * Copyright (C) 2007 Thomas Bernhardt. All rights reserved.                          *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.plugin;

import com.espertech.esper.event.EventType;
import com.espertech.esper.client.EventSender;
import com.espertech.esper.core.EPRuntimeSPI;
import com.espertech.esper.core.EPRuntimeEventSender;

/**
 * Provided once by an {@link PlugInEventRepresentation} for any event type it creates.
 */
public interface PlugInEventTypeHandler
{
    /**
     * Returns the event type.
     * @return event type.
     */
    public EventType getType();

    /**
     * Returns a facility responsible for converting or wrapping event objects.
     * @param runtimeEventSender for sending events into the engine
     * @return sender
     */
    public EventSender getSender(EPRuntimeEventSender runtimeEventSender);
}
