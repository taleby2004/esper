/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esperio.regression.adapter;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.dataflow.EPDataFlowInstance;
import com.espertech.esper.client.dataflow.EPDataFlowInstantiationOptions;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.dataflow.util.DefaultSupportCaptureOp;
import com.espertech.esper.dataflow.util.DefaultSupportGraphOpProvider;
import com.espertech.esperio.dataflow.FileSourceFactory;
import junit.framework.TestCase;

import java.util.List;

public class TestFileSourceLineGraphs extends TestCase
{
	private EPServiceProvider epService;

	protected void setUp()
	{
        Configuration configuration = new Configuration();
        configuration.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
        configuration.addImport(FileSourceFactory.class.getName());
		epService = EPServiceProviderManager.getDefaultProvider(configuration);
		epService.initialize();
    }

    public void testPropertyOrderWLoop() throws Exception
    {
        String graph = "create dataflow ReadCSV " +
                "create objectarray schema MyLine (line string)," +
                "FileSource -> mystream<MyLine> { file: 'regression/ints.csv', classpathFile: true, numLoops: 3, format: 'line'}" +
                "DefaultSupportCaptureOp(mystream) {}";
        List<List<Object>> received = runDataFlow(graph);
        assertEquals(1, received.size());
        Object[] compare = received.get(0).toArray();
        EPAssertionUtil.assertEqualsExactOrder(compare, new Object[]{new Object[] {"1, 0"}, new Object[] {"2, 0"}, new Object[] {"3, 0"}});
    }

    private List<List<Object>> runDataFlow(String epl) {
        epService.getEPAdministrator().createEPL(epl);

        DefaultSupportCaptureOp<Object> outputOp = new DefaultSupportCaptureOp<Object>();
        EPDataFlowInstance instance = epService.getEPRuntime().getDataFlowRuntime().instantiate("ReadCSV",
                new EPDataFlowInstantiationOptions().operatorProvider(new DefaultSupportGraphOpProvider(outputOp)));
        instance.run();
        return outputOp.getAndReset();
    }
}
