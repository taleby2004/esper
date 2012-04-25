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

package com.espertech.esperio.graph;

import com.espertech.esper.client.EPException;
import com.espertech.esper.client.EventType;
import com.espertech.esper.client.dataflow.EPDataFlowSignalFinalMarker;
import com.espertech.esper.event.arr.ObjectArrayEventType;
import com.espertech.esper.dataflow.annotations.DataFlowContext;
import com.espertech.esper.dataflow.annotations.DataFlowOperator;
import com.espertech.esper.dataflow.annotations.DataFlowOpProvideSignal;
import com.espertech.esper.dataflow.interfaces.*;
import com.espertech.esperio.AdapterInputSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

@DataFlowOperator
@DataFlowOpProvideSignal
public class FileSourceLineUnformatted implements DataFlowSourceOperator {

    private static final Log log = LogFactory.getLog(FileSourceLineUnformatted.class);

    private final AdapterInputSource inputSource;

    private Reader reader;
    private InputStream inputStream;
    private BufferedInputStream bis = null;
    private BufferedReader brd = null;

    @DataFlowContext
    protected EPDataFlowEmitter graphContext;

    public FileSourceLineUnformatted(AdapterInputSource inputSource) {
        this.inputSource = inputSource;
    }

    public DataFlowOpInitializeResult initialize(DataFlowOpInitializateContext context) throws Exception {
        EventType outputEventType = context.getOutputPorts().get(0) != null ? context.getOutputPorts().get(0).getOptionalDeclaredType().getEventType() : null;
        if (outputEventType == null) {
            throw new IllegalArgumentException("No event type provided for output, please provide an event type name");
        }
        if ( (!(outputEventType instanceof ObjectArrayEventType)) ||
             outputEventType.getPropertyNames().length != 1 ||
             outputEventType.getPropertyDescriptors()[0].getPropertyType() != String.class) {
            throw new IllegalArgumentException("Expecting an output event type that is an object-array event type with a single property that is of type string");
        }
        return null;
    }

    public void open(DataFlowOpOpenContext openContext) {
        if (inputSource.getAsReader() != null) {
            reader = inputSource.getAsReader();
            brd = new BufferedReader(reader);
        }
        else {
            inputStream = inputSource.getAsStream();
            bis = new BufferedInputStream(inputStream);
            brd = new BufferedReader(new InputStreamReader(bis));
        }
    }

    public void close(DataFlowOpCloseContext openContext) {
        try {
            if (bis != null) {
                bis.close();
            }
            brd.close();
            if (reader != null) {
                reader.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        catch (IOException ex) {
            log.error("Failed to close file: " + ex.getMessage(), ex);
        }
    }

    public void next() {
        String line;
        try {
            line = brd.readLine();
        }
        catch (IOException e) {
            throw new EPException("Failed to read line: " + e.getMessage(), e);
        }

        if (line != null) {
            if (log.isDebugEnabled()) {
                log.debug("Submitting line '" + line + "'");
            }
            graphContext.submit(new Object[] {line});
        }
        else {
            if (log.isDebugEnabled()) {
                log.debug("Submitting punctuation");
            }
            graphContext.submitSignal(new EPDataFlowSignalFinalMarker() {});
        }
    }
}
