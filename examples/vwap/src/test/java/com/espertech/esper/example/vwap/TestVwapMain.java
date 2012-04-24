/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.vwap;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.dataflow.EPDataFlowInstantiationOptions;
import com.espertech.esper.dataflow.ops.Filter;
import com.espertech.esper.dataflow.util.DefaultSupportCaptureOp;
import com.espertech.esper.dataflow.util.DefaultSupportGraphOpProvider;
import com.espertech.esper.dataflow.util.DefaultSupportGraphParamProvider;
import com.espertech.esper.util.ResourceLoader;
import com.espertech.esperio.graph.FileSourceFactory;
import junit.framework.TestCase;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class TestVwapMain extends TestCase
{
    private EPServiceProvider epService;

    public void setUp() {
        Configuration config = new Configuration();
        config.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
    }

    // TODO
    // - parse schema
    // - implements CSV stuff
    // - test file read
    public void testEPLGraphOnly() throws Exception {

        epService.getEPAdministrator().getConfiguration().addImport(DefaultSupportCaptureOp.class.getPackage().getName() + ".*");
        epService.getEPAdministrator().getConfiguration().addImport(TestVwapMain.class.getPackage().getName() + ".*");
        epService.getEPAdministrator().getConfiguration().addImport(FileSourceFactory.class.getPackage().getName() + ".*");
        epService.getEPAdministrator().getConfiguration().addImport(Filter.class.getPackage().getName() + ".*");

        String partial = "create dataflow VWAPSample\n" +
                "schema TradeQuoteType (type string, ticker string, price double, volume long, askprice double, asksize long);\n" +
                "FileSource => TradeQuoteStream<TradeQuoteType> {\n" +
                "  format : csv;\n" +
                "}\n" +
                "Filter(TradeQuoteStream) => TradeStream {\n" +
                "  expression : type = 'trade';\n" +
                "}\n" +
                "Filter(TradeQuoteStream) => QuoteStream {\n" +
                "  expression : type = 'quote';\n" +
                "}\n" +
                "EPLSelect(TradeStream) => VwapTrades {\n" +
                "  select: select ticker, sum(price * volume)/sum(volume) as vwap, min(price) as minprice from TradeStream.std:groupwin(ticker).win:length(4) group by ticker;\n" +
                "}\n" +
                "EPLSelect(VwapTrades as T, QuoteStream as Q) => BargainIndex {\n" +
                "  select: " +
                "    select case when vwap > askprice then asksize * Math.exp(vwap - askprice) else 0d end as index\n" +
                "    from T.std:unique(ticker), Q.std:lastevent()\n" +
                "    where T.ticker = Q.ticker;\n" +
                "}\n" +
                "LogSink(BargainIndex) {}";
        epService.getEPAdministrator().createEPL(partial);

        DefaultSupportCaptureOp<Object> graphSupport = new DefaultSupportCaptureOp<Object>(3);
        EPDataFlowInstantiationOptions options = new EPDataFlowInstantiationOptions()
                .operatorProvider(new DefaultSupportGraphOpProvider(graphSupport))
                .parameterProvider(new DefaultSupportGraphParamProvider(Collections.<String, Object>singletonMap("file", getFileNameClasspath("data/vwap.csv"))));
        epService.getEPRuntime().getDataFlowRuntime().instantiate("VWAPSample", options);
        Object[] received = graphSupport.get(2000, TimeUnit.SECONDS);
        System.out.println("Received row#1: " + Arrays.toString((Object[]) received[0]));
        System.out.println("Received row#2: " + Arrays.toString((Object[]) received[1]));

        //assertEquals(Object[].class, received.get(0).getClass());
        //EPAssertionUtil.assertEqualsExactOrder(received, "type,ticker,price,volume".split(","), new Object[][]{{"trade", "GE", 19.41, 1000L}, {"trade", "MSFT", 31.44, 5000L}});

        //EPAssertionUtil.assertEqualsExactOrder(received, "type,ticker,price,volume".split(","), new Object[][]{{"trade", "GE", 19.41, 1000L}, {"quote", "GE", 18.98, 1000L}, {"trade", "MSFT", 31.44, 5000L}});
        String epl = "create dataflow WordCount \n" +
                "schema TradeQuoteType (ticker string, price int);\n" +
                "variable myset monitoredTickers;\n" +
                "FileSource => TradeQuoteStream<TradeQuoteType> {\n" +
                "  file : \"TradesAndQuotes.csv.gz\";\n" +
                "  format : csv;\n" +
                "}\n" +
                "Filter(TradeQuoteStream) => TradeStream {\n" +
                "  expression : ticker in (monitoredTickers) and ticker.ttype = 'Trade';\n" +
                "}\n" +
                "Filter(TradeQuoteStream) => QuoteStream {\n" +
                "  expression : ticker in (monitoredTickers) and ticker.ttype = 'Quote';\n" +
                "}\n" +
                "EPLSelect(TradeStream) => VwapTrades {\n" +
                "  select: ticker, sum(price * volume)/sum(volume) as vwap, min(price) as minprice;\n" +
                "  window: std:groupwin(ticker).win:length(4);\n" +
                "}\n" +
                "EPLJoin(VwapTrades as T, QuoteStream as Q) => BargainIndex {\n" +
                "  select: case when vwap > askprice then asksize * exp(vwap - askprice) else 0d end as index;\n" +
                "  from: V.std:unique(ticker), Q.std:lastevent();\n" +
                "  where: V.ticker = Q.ticker;\n" +
                "}\n" +
                "BargainIndex => FileSink {\n" +
                "    file : \"out\";\n" +
                "    format : txt;\n" +
                "}\n";
    }

    private String getFileNameClasspath(String classpathResource) {
        try {
            URL url = ResourceLoader.getClasspathResourceAsURL(classpathResource, classpathResource);
            File file = new File(url.toURI());
            return file.getAbsolutePath();
        }
        catch (Exception ex) {
            throw new RuntimeException("Failed to find '" + classpathResource + "': " + ex.getMessage());
        }
    }
}
