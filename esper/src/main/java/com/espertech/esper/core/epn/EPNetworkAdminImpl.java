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

package com.espertech.esper.core.epn;

import com.espertech.esper.client.EPException;
import com.espertech.esper.client.epn.*;
import com.espertech.esper.core.service.EPRuntimeSPI;
import com.espertech.esper.core.thread.ThreadingService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Node;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EPNetworkAdminImpl implements EPNetworkAdmin {
    private static final Log log = LogFactory.getLog(EPNetworkAdminImpl.class);

    private final String engineURI;
    private final EventCollector epRuntimeCollector;
    private final ThreadingService threadingService;

    private final ConcurrentHashMap<String, SourceEntry> sources = new ConcurrentHashMap<String, SourceEntry>();
    private final ConcurrentHashMap<String, ProcessorEntry> processors = new ConcurrentHashMap<String, ProcessorEntry>();

    public void startall() {
    }

    public void uploadFilesyncAddWorkerCPJars(File[] jarFiles, List<String> testClasses) {

    }

    public EPNetworkAdminImpl(String engineURI, final EPRuntimeSPI runtimeSPI, ThreadingService threadingService) {
        this.engineURI = engineURI;
        this.threadingService = threadingService;
        this.epRuntimeCollector = new EventCollector() {
                public void sendEvent(Object object) throws EPException {
                    runtimeSPI.sendEvent(object);
                }

                public void sendEvent(Map map, String eventTypeName) throws EPException {
                    runtimeSPI.sendEvent(map, eventTypeName);
                }

                public void sendEvent(Node node) throws EPException {
                    runtimeSPI.sendEvent(node);
                }
        };
    }

    public synchronized void addSource(String sourceName, EventSource eventSource, EventSourceOptions options) {
        if (options == null) {
            options = new EventSourceOptions();
        }
        SourceEntry entry = sources.get(sourceName);
        if (entry != null && !options.isIgnoreIfExists()) {
            throw new NetworkAlreadyExistsException("Source '" + sourceName + "' already exists");
        }
        if (options.isIgnoreIfExists() && entry != null) {
            return;
        }
        sources.put(sourceName, new SourceEntry(eventSource, options, EventSourceState.CLOSED));
    }

    public synchronized void openSource(String sourceName) {
        SourceEntry entry = sources.get(sourceName);
        if (entry == null) {
            throw new NetworkNotFoundException("Source '" + sourceName + "' not found");
        }
        if (entry.getState() == EventSourceState.OPEN) {
            return;
        }

        EventSourceOpenContext context = new EventSourceOpenContext(engineURI, sourceName);

        EventCollector collector;
        if (entry.getOptions().getOptionalOverrideCollector() != null) {
            collector = entry.getOptions().getOptionalOverrideCollector();
        }
        else {
            collector = epRuntimeCollector;
        }

        try {
            entry.getSource().open(context, collector);
        }
        catch (RuntimeException ex) {
            throw new NetworkAdminException("Failed to open '" + sourceName + ": " + ex.getMessage(), ex);
        }

        entry.setState(EventSourceState.OPEN);

        if (entry.getOptions().isNoThreading() || !(entry.getSource() instanceof EventSourcePolled)) {
            return;
        }

        // start thread for polling
        EventSourcePolledRunnable runnable = new EventSourcePolledRunnable(engineURI, sourceName, (EventSourcePolled) entry.getSource());
        Thread thread = threadingService.makeEventSourceThread(engineURI, sourceName, runnable);
        entry.setRunnable(runnable);
        entry.setThread(thread);

        log.info("Starting thread " + thread.getName() + " for source '" + sourceName + "'");
        thread.start();
    }

    public synchronized void closeSource(String sourceName) {
        SourceEntry entry = sources.get(sourceName);
        if (entry == null) {
            throw new NetworkNotFoundException("Source '" + sourceName + "' not found");
        }
        if (entry.getState() == EventSourceState.CLOSED) {
            return;
        }
        try {
            closeSourceRunnable(sourceName, entry);
            entry.setState(EventSourceState.CLOSED);
            entry.getSource().close(new EventSourceCloseContext(engineURI, sourceName));
        }
        catch (RuntimeException ex) {
            throw new NetworkAdminException("Failed to close '" + sourceName + ": " + ex.getMessage(), ex);
        }
    }

    public synchronized void closeRemoveSource(String sourceName) {
        SourceEntry entry = sources.get(sourceName);
        if (entry == null) {
            throw new NetworkNotFoundException("Source '" + sourceName + "' not found");
        }

        if (entry.getState() == EventSourceState.OPEN) {
            try {
                closeSourceRunnable(sourceName, entry);
                entry.setState(EventSourceState.CLOSED);
                entry.getSource().close(new EventSourceCloseContext(engineURI, sourceName));
            }
            catch (RuntimeException ex) {
                log.error("Failed to close '" + sourceName + ": " + ex.getMessage(), ex);
            }
        }
        sources.remove(sourceName);
    }

    public synchronized void removeSource(String sourceName) {
        SourceEntry entry = sources.get(sourceName);
        if (entry == null) {
            throw new NetworkNotFoundException("Source '" + sourceName + "' not found");
        }
        if (entry.getState() == EventSourceState.OPEN) {
            throw new NetworkInvalidStateException("Source '" + sourceName + "' still open, it must be closed first");
        }
        sources.remove(sourceName);
    }

    public synchronized EventSourceDesc getSource(String sourceName) {
        SourceEntry entry = sources.get(sourceName);
        if (entry == null) {
            return null;
        }
        return new EventSourceDesc(entry.getState(), entry.getSource());
    }

    public void addProcessor(String processorName, EventProcessor eventProcessor, EventProcessorOptions options) throws NetworkAdminException {
        if (options == null) {
            options = new EventProcessorOptions();
        }
        ProcessorEntry entry = processors.get(processorName);
        if (entry != null && !options.isIgnoreIfExists()) {
            throw new NetworkAlreadyExistsException("Processor '" + processorName + "' already exists");
        }
        if (options.isIgnoreIfExists() && entry != null) {
            return;
        }
        processors.put(processorName, new ProcessorEntry(eventProcessor, options, EventProcessorState.CLOSED));
    }

    public void openProcessor(String processorName) throws NetworkAdminException {
        ProcessorEntry entry = processors.get(processorName);
        if (entry == null) {
            throw new NetworkNotFoundException("Processor '" + processorName + "' not found");
        }
        if (entry.getState() == EventProcessorState.OPEN) {
            return;
        }

        EventProcessorOpenContext context = new EventProcessorOpenContext(engineURI, processorName);

        try {
            entry.getProcessor().open(context);
        }
        catch (RuntimeException ex) {
            throw new NetworkAdminException("Failed to open '" + processorName + ": " + ex.getMessage(), ex);
        }

        entry.setState(EventProcessorState.OPEN);
    }

    public void closeProcessor(String processorName) throws NetworkAdminException {
        ProcessorEntry entry = processors.get(processorName);
        if (entry == null) {
            throw new NetworkNotFoundException("Processor '" + processorName + "' not found");
        }
        if (entry.getState() == EventProcessorState.CLOSED) {
            return;
        }
        try {
            entry.setState(EventProcessorState.CLOSED);
            entry.getProcessor().close(new EventProcessorCloseContext(engineURI, processorName));
        }
        catch (RuntimeException ex) {
            throw new NetworkAdminException("Failed to close '" + processorName + ": " + ex.getMessage(), ex);
        }
    }

    public void closeRemoveProcessor(String processorName) throws NetworkAdminException {
        ProcessorEntry entry = processors.get(processorName);
        if (entry == null) {
            throw new NetworkNotFoundException("Processor '" + processorName + "' not found");
        }

        if (entry.getState() == EventProcessorState.OPEN) {
            try {
                entry.setState(EventProcessorState.CLOSED);
                entry.getProcessor().close(new EventProcessorCloseContext(engineURI, processorName));
            }
            catch (RuntimeException ex) {
                log.error("Failed to close '" + processorName + ": " + ex.getMessage(), ex);
            }
        }
        processors.remove(processorName);
    }

    public void removeProcessor(String processorName) throws NetworkAdminException {
        ProcessorEntry entry = processors.get(processorName);
        if (entry == null) {
            throw new NetworkNotFoundException("Processor '" + processorName + "' not found");
        }
        if (entry.getState() == EventProcessorState.OPEN) {
            throw new NetworkInvalidStateException("Processor '" + processorName + "' still open, it must be closed first");
        }
        processors.remove(processorName);
    }

    public EventProcessorDesc getProcessor(String processorName) {
        ProcessorEntry entry = processors.get(processorName);
        if (entry == null) {
            return null;
        }
        return new EventProcessorDesc(entry.getState(), entry.getProcessor());
    }

    private void closeSourceRunnable(String sourceName, SourceEntry entry) {
        if (entry.getRunnable() != null) {
            entry.getRunnable().setShutdown();
        }

        if (entry.getThread() != null) {
            try {
                log.info("Joining thread " + entry.getThread().getName() + " for source '" + sourceName + "'");
                entry.getThread().join(10000);
            }
            catch (InterruptedException e) {
                // expected
            }
        }
    }
}
