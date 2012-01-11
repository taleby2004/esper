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

import java.util.HashMap;
import java.util.Map;

import com.espertech.esper.support.bean.SupportBean;
import org.junit.Before;
import org.junit.Test;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class RepeatUntilTest {


	public class Listener implements UpdateListener{

		@Override
		public void update(EventBean[] newEvents, EventBean[] oldEvents) {
			System.out.println("detected");

		}

	}
	private EPServiceProvider epServiceProvider;

	@Before
	public void setup(){
		Configuration configuration = new Configuration();
		epServiceProvider = EPServiceProviderManager.getProvider("Test", configuration);
	}

	@Test
	public void testRepeatUntil() throws InterruptedException{
		Map<String, Object> definition = new HashMap<String, Object>();
		definition.put("eventId", String.class);


		epServiceProvider.getEPAdministrator().getConfiguration().addEventType(SupportBean.class);

		String query="select * from pattern [every ([2:]e1=SupportBean(string='2') until timer:interval(5))->([2:]e2=SupportBean(string='3') until timer:interval(2))]";

		EPStatement statement = epServiceProvider.getEPAdministrator().createEPL(query);
		statement.addListener(new Listener());
//		statement.addListener(new SimpleEventListener());

		send("2");
		send("2");
		Thread.sleep(5000);

		send("3");
		send("3");
		send("3");
		send("3");

		Thread.sleep(5000);

		send("2");
		send("2");

		Thread.sleep(5000);


	}
	private void send(String value) {
		epServiceProvider.getEPRuntime().sendEvent(new SupportBean(value, 0));
	}
}