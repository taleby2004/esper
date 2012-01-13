/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.client.hook;

/**
 * Factory for {@link VirtualDataWindow}.
 * <p>
 * Register an implementation of this interface with the engine before use:
 * configuration.addPlugInVirtualDataWindow("test", "vdw", SupportVirtualDWFactory.class.getName());
 */
public interface VirtualDataWindowFactory {
    /**
     * Return a virtual data window to handle the specific event type, named window or paramaters
     * as provided in the context.
     * <p>
     *     This method is invoked for each named window instance.
     * </p>
     * <p>
     *     If using context partitions, the method is invoked once per context partition per named window.
     * </p>
     * @param context provides contextual information such as event type, named window name and parameters.
     * @return virtual data window
     */
    public VirtualDataWindow create(VirtualDataWindowContext context);

    /**
     * Invoked to indicate the named window is destroyed.
     * <p>
     *     This method is invoked once per named window (and not once per context partition).
     * </p>
     * <p>
     *     For reference, the VirtualDataWindow destroy method is called once per context partition,
     *     before this method is invoked.
     * </p>
     */
    public void destroyAllContextPartitions();
}
