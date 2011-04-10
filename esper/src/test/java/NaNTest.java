import java.io.StringReader;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;

import junit.framework.Assert;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.ConfigurationEventTypeXMLDOM;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EventSender;


public class NaNTest extends TestCase
{
	private static EPServiceProvider _engine;

    public void setUp() throws Exception {
        _engine = EPServiceProviderManager.getProvider("Engine", getConfiguration());

        provisionRule("1",
                "create window HitsWindow2.std:firstunique(ProductID, EventTime) as Event",
                "insert into HitsWindow2 select event from pattern [every ( event=Event(not java.lang.Double.isNaN(LocationCenterX) and NaNTest.isInShapes(LocationCenterX, LocationCenterY, { 'POLYGON((7.18016517454538 51.6894090367488,6.35925114284703 51.6894090367488,6.35925114284703 52.4960463026786,7.18016517454538 52.4960463026786,7.18016517454538 51.6894090367488))' })))]");
    }

	public void testNaN() throws Exception
	{
		sendEvent(System.nanoTime(), "");
	}
	
	public void testNaN2() throws Exception
	{
		sendEvent(System.nanoTime(), "1.0");
	}
//
//	@Test
//	public void testNaN3() throws Exception 
//	{
//		sendEvent(System.nanoTime(), "");
//	}

	private static void provisionRule(String ruleId, String... statements) throws Exception
	{
		System.out.println("Provisioning statements: " + Arrays.toString(statements));

		for (String statement : statements)
		{
			_engine.getEPAdministrator().createEPL(statement, ruleId);
		}
	}


	protected void sendEvent(long eventTime, String xValue)
	{
		try
		{
			String eventXML = getEvent(eventTime, xValue);

			// Parse the XML
			InputSource source = new InputSource(new StringReader(eventXML));
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			builderFactory.setNamespaceAware(true);

			Document doc = builderFactory.newDocumentBuilder().parse(source);
			Node event = doc.getDocumentElement();

			System.out.println("Sending event: " + eventXML);

			EventSender sender = _engine.getEPRuntime().getEventSender("Event");
			sender.sendEvent(event);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	private String getEvent(long eventTime, String xValue)
	{
		String event =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +"<Event>" +
			"<Field Name=\"ProductID\" Value=\"1000000790373\"/>" +
			"<Field Name=\"ProductType\" Value=\"2\"/>" +
			"<Field Name=\"EventType\" Value=\"\"/>" +
			"<Field Name=\"EventTime\" Value=\"" + eventTime + "\"/>" +
			"<Field Name=\"LocationCenterX\" Value=\"" + xValue + "\"/>" +
			"<Field Name=\"LocationCenterY\" Value=\"\"/>" +
			"<Field Name=\"EntityID\" Value=\"37568\"/>" +
			"<Field Name=\"TargetID\" Value=\"37568\"/>" +
			"<Field Name=\"EventStage\" Value=\"END\"/>" +
			"</Event>";

		return event;
	}

	public static Configuration getConfiguration()
	{
		Configuration config = new Configuration();
		
		config.addImport(NaNTest.class);
		
		ConfigurationEventTypeXMLDOM configEventType = new ConfigurationEventTypeXMLDOM();
		configEventType.setRootElementName("Event");
		
		configEventType.addXPathProperty("EntityID", 
				"/Event/Field[@Name='EntityID']/@Value",
				XPathConstants.STRING);
		
		configEventType.addXPathProperty("TargetID", 
				"/Event/Field[@Name='TargetID']/@Value",
				XPathConstants.STRING);
		
		configEventType.addXPathProperty("EventStage", 
				"/Event/Field[@Name='EventStage']/@Value",
				XPathConstants.STRING);
		
		configEventType.addXPathProperty("ProductType", 
				"/Event/Field[@Name='ProductType']/@Value",
				XPathConstants.STRING);
		
		configEventType.addXPathProperty("ProductID", 
				"/Event/Field[@Name='ProductID']/@Value",
				XPathConstants.STRING);
		
		configEventType.addXPathProperty("LocationCenterX",
				"/Event/Field[@Name='LocationCenterX']/@Value", XPathConstants.NUMBER);
		
		configEventType.addXPathProperty("LocationCenterY",
				"/Event/Field[@Name='LocationCenterY']/@Value", XPathConstants.NUMBER);
		
				
		config.addEventType("Event", configEventType);
		return config;
	}
	
	public static boolean isInShapes(double x, double y, String[] shapesRepresentations) 
    {
        System.out.println("===================");
    	System.out.println("x=" + x + ",y=" + y + ", shapes: " + Arrays.toString(shapesRepresentations));
    	return false;	// Just for testing
    }
}