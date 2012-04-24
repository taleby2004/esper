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

package com.espertech.esper.regression.dataflow;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EPStatementException;
import com.espertech.esper.client.dataflow.EPDataFlowInstantiationException;
import com.espertech.esper.client.deploy.Module;
import com.espertech.esper.dataflow.util.DefaultSupportSourceOp;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

public class TestAPICreateStartStopDestroy extends TestCase {

    private EPServiceProvider epService;

    public void setUp() {
        epService = EPServiceProviderManager.getDefaultProvider(SupportConfigFactory.getConfiguration());
        epService.initialize();
    }

    public void testCreateStartStop() throws Exception {
        String epl = "create dataflow MyGraph Emitter -> outstream<?> {}";
        EPStatement stmt = epService.getEPAdministrator().createEPL(epl);
        epService.getEPRuntime().getDataFlowRuntime().instantiate("MyGraph");

        // test duplicate
        tryInvalidCompile(epl, "Error starting statement: Data flow by name 'MyGraph' has already been declared [");

        // stop - can no longer instantiate but still exists
        stmt.stop();    // not removed
        tryInvalidCompile(epl, "Error starting statement: Data flow by name 'MyGraph' has already been declared [");
        tryInstantiate("MyGraph", "Data flow by name 'MyGraph' is currently in STOPPED statement state");
        tryInstantiate("DUMMY", "Data flow by name 'DUMMY' has not been defined");

        // destroy - should be gone
        stmt.destroy(); // removed, create again
        tryInstantiate("MyGraph", "Data flow by name 'MyGraph' has not been defined");
        try {
            stmt.start();
            fail();
        }
        catch (IllegalStateException ex) {
            assertEquals("Cannot start statement, statement is in destroyed state", ex.getMessage());
        }

        // new one, try start-stop-start
        stmt = epService.getEPAdministrator().createEPL(epl);
        stmt.stop();
        stmt.start();
        epService.getEPRuntime().getDataFlowRuntime().instantiate("MyGraph");
    }

    public void testDeploymentAdmin() throws Exception {

        epService.getEPAdministrator().getConfiguration().addImport(DefaultSupportSourceOp.class.getPackage().getName() + ".*");
        epService.getEPAdministrator().getConfiguration().addEventType(SupportBean.class);

        String eplModule = "create dataflow TheGraph\n" +
                "create schema ABC as " + SupportBean.class.getName() + "," +
                "DefaultSupportSourceOp -> outstream<SupportBean> {}\n" +
                "Select(outstream) -> selectedData {select: (select theString, intPrimitive from outstream) }\n" +
                "DefaultSupportCaptureOp(selectedData) {};";
        Module module = epService.getEPAdministrator().getDeploymentAdmin().parse(eplModule);
        assertEquals(1, module.getItems().size());
        epService.getEPAdministrator().getDeploymentAdmin().deploy(module, null);
        
        epService.getEPRuntime().getDataFlowRuntime().instantiate("TheGraph");
    }

    private void tryInvalidCompile(String epl, String message) {
        try {
            epService.getEPAdministrator().createEPL(epl);
            fail();
        }
        catch (EPStatementException ex) {
            assertException(message, ex.getMessage());
        }
    }

    private void tryInstantiate(String graph, String message) {
        try {
            epService.getEPRuntime().getDataFlowRuntime().instantiate(graph);
            fail();
        }
        catch (EPDataFlowInstantiationException ex) {
            assertEquals(message, ex.getMessage());
        }
    }

    private void assertException(String expected, String message) {
        String received = message.substring(0, message.indexOf("[") + 1);
        assertEquals(expected, received);
    }
}
