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

package com.espertech.esper.client.epn;

import java.io.File;
import java.util.List;

public interface EPNetworkAdmin {
    public void addSource(String sourceName, EventSource eventSource, EventSourceOptions options) throws NetworkAdminException;
    public void openSource(String sourceName) throws NetworkAdminException;
    public void closeSource(String sourceName) throws NetworkAdminException;
    public void closeRemoveSource(String sourceName) throws NetworkAdminException;
    public void removeSource(String sourceName) throws NetworkAdminException;
    public EventSourceDesc getSource(String sourceName);

    public void startall();

    public void addProcessor(String processorName, EventProcessor eventProducerPolled, EventProcessorOptions options) throws NetworkAdminException;
    public void openProcessor(String processorName) throws NetworkAdminException;
    public void closeProcessor(String processorName) throws NetworkAdminException;
    public void closeRemoveProcessor(String processorName) throws NetworkAdminException;
    public void removeProcessor(String processorName) throws NetworkAdminException;
    public EventProcessorDesc getProcessor(String processorName);

    public void uploadFilesyncAddWorkerCPJars(File[] jarFiles, List<String> testClasses);
}
