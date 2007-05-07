package net.esper.regression.eql;

import junit.framework.TestCase;
import net.esper.client.EPServiceProvider;
import net.esper.client.EPServiceProviderManager;
import net.esper.client.EPStatement;
import net.esper.client.Configuration;
import net.esper.support.util.SupportUpdateListener;
import net.esper.support.bean.SupportMarketDataBean;
import net.esper.support.bean.SupportBean;

import java.util.Map;
import java.util.HashMap;

public class TestJoinMapType extends TestCase
{
    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        Map<String, Class> typeInfo = new HashMap<String, Class>();
        typeInfo.put("id", String.class);
        typeInfo.put("p00", int.class);
        
        Configuration config = new Configuration();
        config.addEventTypeAlias("MapS0", typeInfo);
        config.addEventTypeAlias("MapS1", typeInfo);

        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
        listener = new SupportUpdateListener();
    }

    public void testJoinCoercion()
    {
        String joinStatement = "select S0.id, S1.id, S0.p00, S1.p00 from MapS0 as S0, MapS1 as S1" +
                " where S0.id = S1.id";

        EPStatement stmt = epService.getEPAdministrator().createEQL(joinStatement);
        stmt.addListener(listener);

        sendMapEvent("MapS0", "a", 1000);
    }

    private void sendMapEvent(String alias, String id, int p00)
    {
        Map<String, Object> event = new HashMap<String, Object>();
        event.put("id", id);
        event.put("p00", p00);
        epService.getEPRuntime().sendEvent(event, alias);
    }
}
