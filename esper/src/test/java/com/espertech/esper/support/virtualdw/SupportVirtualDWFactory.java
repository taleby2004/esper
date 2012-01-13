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

package com.espertech.esper.support.virtualdw;

import com.espertech.esper.client.hook.VirtualDataWindow;
import com.espertech.esper.client.hook.VirtualDataWindowContext;
import com.espertech.esper.client.hook.VirtualDataWindowFactory;

import java.util.ArrayList;
import java.util.List;

public class SupportVirtualDWFactory implements VirtualDataWindowFactory {

    private static List<SupportVirtualDW> windows = new ArrayList<SupportVirtualDW>();
    private static boolean destroyed;

    public SupportVirtualDWFactory() {
    }

    public static List<SupportVirtualDW> getWindows() {
        return windows;
    }

    public static boolean isDestroyed() {
        return destroyed;
    }

    public static void setDestroyed(boolean destroyed) {
        SupportVirtualDWFactory.destroyed = destroyed;
    }

    public VirtualDataWindow create(VirtualDataWindowContext context) {
        SupportVirtualDW vdw = new SupportVirtualDW(context);
        windows.add(vdw);
        return vdw;
    }

    public void destroyAllContextPartitions() {
        destroyed = true;
    }
}
