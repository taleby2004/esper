/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esperio.regression.adapter;

import com.espertech.esper.client.*;
import com.espertech.esper.client.dataflow.EPDataFlowExecutionException;
import com.espertech.esper.client.dataflow.EPDataFlowInstance;
import com.espertech.esper.client.dataflow.EPDataFlowInstantiationException;
import com.espertech.esper.client.dataflow.EPDataFlowInstantiationOptions;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.dataflow.util.DefaultSupportCaptureOp;
import com.espertech.esper.dataflow.util.DefaultSupportGraphOpProvider;
import com.espertech.esper.util.EventRepresentationEnum;
import com.espertech.esperio.graph.FileSourceFactory;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.List;

public class TestFileSourceGraphs extends TestCase
{
	private EPServiceProvider epService;

	protected void setUp()
	{
        Configuration configuration = new Configuration();
        configuration.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
        configuration.addImport(FileSourceFactory.class.getName());
		epService = EPServiceProviderManager.getDefaultProvider(configuration);
		epService.initialize();

        HashMap<String, Object> propertyTypes = new HashMap<String, Object>();
        propertyTypes.put("myInt", Integer.class);
        propertyTypes.put("myDouble", Double.class);
        propertyTypes.put("myString", String.class);
        epService.getEPAdministrator().getConfiguration().addEventType("MyMapEvent", propertyTypes);
    }

    public void testCSVGraph() throws Exception {
        runAssertionCSVGraphSchema(EventRepresentationEnum.OBJECTARRAY);
        runAssertionCSVGraphSchema(EventRepresentationEnum.MAP);
    }

    public void testPropertyOrderWLoop() throws Exception
    {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/noTimestampOne.csv', classpathFile: true, propertyNames: ['myInt','myDouble','myString'], numLoops: 3}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(3, received.size());
        for (List<Object> aReceived : received) {
            EPAssertionUtil.assertPropsPerRow(aReceived.toArray(), "myInt,myDouble,myString".split(","), new Object[][]{{1, 1.1, "noTimestampOne.one"}, {2, 2.2, "noTimestampOne.two"}, {3, 3.3, "noTimestampOne.three"}});
        }
    }

    public void testAdditionalProperties() throws EPException {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/moreProperties.csv', classpathFile: true, hasTitleLine: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), "myInt,myDouble,myString".split(","), new Object[][] {{1, 1.1, "moreProperties.one"}, {2, 2.2, "moreProperties.two"}, {3, 3.3, "moreProperties.three"}});
    }

    public void testConflictingPropertyOrderIgnoreTitle()
    {
        epService.getEPAdministrator().createEPL("create schema MyIntRowEvent (intOne int, intTwo int)");
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyIntRowEvent> { file: 'regression/intsTitleRow.csv', hasHeaderLine:true, classpathFile: true, propertyNames: ['intTwo','intOne'], numLoops: 1}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), "intOne,intTwo".split(","), new Object[][] {{0, 1}, {0, 2}, {0, 3}});
    }

    public void testReorder()
    {
        epService.getEPAdministrator().createEPL("create schema MyIntRowEvent (p3 string, p1 int, p0 long, p2 double)");
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyIntRowEvent> { file: 'regression/timestampOne.csv', classpathFile: true, propertyNames: ['p0','p1','p2','p3']}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), "p0,p1,p2,p3".split(","), new Object[][] {{ 100L, 1, 1.1, "timestampOne.one"}, { 300L, 3, 3.3, "timestampOne.three"}, { 500L, 5, 5.5, "timestampOne.five"}});
    }

    public void testStringPropertyTypes()
    {
        epService.getEPAdministrator().createEPL("create schema MyStrRowEvent (myInt string, myDouble string, myString string)");

        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyStrRowEvent> { file: 'regression/noTimestampOne.csv', classpathFile: true, propertyNames: [\"myInt\", \"myDouble\", \"myString\"],}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), "myInt,myDouble,myString".split(","), new Object[][] {{"1", "1.1", "noTimestampOne.one"}, {"2", "2.2", "noTimestampOne.two"}, {"3", "3.3", "noTimestampOne.three"}});
    }

    public void testEmptyFile()
    {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/emptyFile.csv', classpathFile: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        assertTrue(received.get(0).isEmpty());
    }

    public void testTitleRowOnlyFile()
    {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/titleRowOnly.csv', classpathFile: true, hasTitleLine: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        assertTrue(received.get(0).isEmpty());
    }

    public void testInvalid() {
        String graph;

        // file not found
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream<MyMapEvent> { file: 'nonExistentFile', classpathFile: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalidRun("FlowOne", graph, "Exception encountered opening data flow 'FlowOne' in operator FileSourceCSV: Resource 'nonExistentFile' not found in classpath");

        // invalid type for populating (no matching ctor or factory etc)
        epService.getEPAdministrator().getConfiguration().addEventType("MyArgCtorClass", MyArgCtorClass.class);
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream<MyArgCtorClass> { file: 'regression/noTimestampOne.csv', classpathFile: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalid("FlowOne", graph, "Failed to instantiate data flow 'FlowOne': Failed initialization for operator 'FileSource': Event type 'MyArgCtorClass' cannot be written to: Failed to instantiate class 'com.espertech.esperio.regression.adapter.TestFileSourceGraphs$MyArgCtorClass', define a factory method if the class has no suitable constructors");

        // has-title-line and actual column names don't match the expected event type (no properties match)
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/differentMap.csv', hasTitleLine:true, classpathFile: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalidRun("FlowOne", graph, "Exception encountered running data flow 'FlowOne': Failed to match any of the properties [value one, line one] to the event type properties of event type 'MyMapEvent'");

        // no event type provided
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream { file: 'nonExistentFile', classpathFile: true}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalid("FlowOne", graph, "Failed to instantiate data flow 'FlowOne': Failed initialization for operator 'FileSource': No event type provided for output, please provide an event type name");

        // wrong file format
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream { file: 'nonExistentFile', classpathFile: true, format: 'dummy',}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalid("FlowOne", graph, "Failed to instantiate data flow 'FlowOne': Failed to obtain operator 'FileSource', encountered an exception raised by factory class FileSourceFactory: Unrecognized file format 'dummy'");

        // where is the input source
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream<MyMapEvent> {}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalid("FlowOne", graph, "Failed to instantiate data flow 'FlowOne': Failed to obtain operator 'FileSource', encountered an exception raised by factory class FileSourceFactory: Failed to find required parameter, either the file or the adapterInputSource parameter is required");

        // line-format with Map output
        graph = "create dataflow FlowOne " +
                "FileSource -> mystream<MyMapEvent> {format: 'line', file: 'nonExistentFile'}" +
                "DefaultSupportCaptureOp(mystream) {}";
        tryInvalid("FlowOne", graph, "Failed to instantiate data flow 'FlowOne': Failed initialization for operator 'FileSource': Expecting an output event type that is an object-array event type with a single property that is of type string");
    }

    private void tryInvalid(String dataflowName, String epl, String message) {
        EPStatement stmtGraph = epService.getEPAdministrator().createEPL(epl);
        try {
            DefaultSupportCaptureOp<Object> outputOp = new DefaultSupportCaptureOp<Object>();
            epService.getEPRuntime().getDataFlowRuntime().instantiate(dataflowName,
                    new EPDataFlowInstantiationOptions().operatorProvider(new DefaultSupportGraphOpProvider(outputOp)));
            fail();
        }
        catch (EPDataFlowInstantiationException ex) {
            assertEquals(message, ex.getMessage());
        }
        finally {
            stmtGraph.destroy();
        }
    }

    private void tryInvalidRun(String dataflowName, String epl, String message) {
        EPStatement stmtGraph = epService.getEPAdministrator().createEPL(epl);
        DefaultSupportCaptureOp<Object> outputOp = new DefaultSupportCaptureOp<Object>();
        EPDataFlowInstance df = epService.getEPRuntime().getDataFlowRuntime().instantiate(dataflowName,
                new EPDataFlowInstantiationOptions().operatorProvider(new DefaultSupportGraphOpProvider(outputOp)));
        try {
            df.run();
            fail();
        }
        catch (EPDataFlowExecutionException ex) {
            assertEquals(message, ex.getMessage());
        }
        stmtGraph.destroy();
    }

    private List<List<Object>> runDataFlow(String epl) {
        epService.getEPAdministrator().createEPL(epl);

        DefaultSupportCaptureOp<Object> outputOp = new DefaultSupportCaptureOp<Object>();
        EPDataFlowInstance instance = epService.getEPRuntime().getDataFlowRuntime().instantiate("ReadCSV",
                new EPDataFlowInstantiationOptions().operatorProvider(new DefaultSupportGraphOpProvider(outputOp)));
        instance.run();
        return outputOp.getAndReset();
    }

    public void testLoopTitleRow() throws Exception
    {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/titleRow.csv', classpathFile: true, hasTitleLine:true, numLoops: 3}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(3, received.size());
        for (List<Object> aReceived : received) {
            EPAssertionUtil.assertPropsPerRow(aReceived.toArray(), "myInt,myDouble,myString".split(","), new Object[][]{{1, 1.1, "one"}, {3, 3.3, "three"}, {5, 5.5, "five"}});
        }
    }

    public void testCommentAndOtherProp() throws Exception
    {
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyMapEvent> { file: 'regression/comments.csv', classpathFile: true, propertyNames: ['other', 'myInt','myDouble','myString']}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), "myInt,myDouble,myString".split(","), new Object[][]{{1, 1.1, "one"}, {3, 3.3, "three"}, {5, 5.5, "five"}});
    }

    private void runAssertionCSVGraphSchema(EventRepresentationEnum representationEnum) throws Exception {

        String[] fields = "myString,myInt,timestamp, myDouble".split(",");
        epService.getEPAdministrator().createEPL(representationEnum.getAnnotationText() + " create schema MyEvent(myString string, myInt int, timestamp long, myDouble double)");
        String graph = "create dataflow ReadCSV " +
                "FileSource -> mystream<MyEvent> { file: 'regression/titleRow.csv', hasHeaderLine: true, classpathFile: true }" +
                "DefaultSupportCaptureOp(mystream) {}";
        epService.getEPAdministrator().createEPL(graph);

        DefaultSupportCaptureOp outputOp = new DefaultSupportCaptureOp();
        EPDataFlowInstance instance = epService.getEPRuntime().getDataFlowRuntime().instantiate("ReadCSV", new EPDataFlowInstantiationOptions().operatorProvider(new DefaultSupportGraphOpProvider(outputOp)));
        instance.run();
        List<List<Object>> received = outputOp.getAndReset();
        assertEquals(1, received.size());
        EPAssertionUtil.assertPropsPerRow(received.get(0).toArray(), fields, new Object[][] {{"one", 1, 100L, 1.1}, {"three", 3, 300L, 3.3}, {"five", 5, 500L, 5.5}});
        assertTrue(representationEnum.matchesClass(received.get(0).toArray()[0].getClass()));

        epService.getEPAdministrator().destroyAllStatements();
        epService.getEPAdministrator().getConfiguration().removeEventType("MyEvent", true);
	}

    public static class MyArgCtorClass {
        private final String arg;

        public MyArgCtorClass(String arg) {
            this.arg = arg;
        }
    }
}
