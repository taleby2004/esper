/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.vwap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class VwapMain implements Runnable {

    private static Log log = LogFactory.getLog( VwapMain.class );

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException
    {
        // Run the sample
        VwapMain vwapMain = new VwapMain();
        vwapMain.run();
    }

    public VwapMain()
    {
    }

    public void run()
    {
    }
}
