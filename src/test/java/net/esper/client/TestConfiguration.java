package net.esper.client;

import junit.framework.TestCase;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.File;


public class TestConfiguration extends TestCase
{
    private final static String SAMPLE_EVENT_NAME = "MySampleEvent";
    private final static String SAMPLE_EVENT_CLASS = "com.mycompany.myapp.MySampleEvent";
    private final static String SAMPLE_IMPORT_PACKAGE = "com.mycompany.myapp.*";
    private final static String SAMPLE_MAP_ALIAS = "mapEvent";
    private final Map<String, String> typeMap = new HashMap<String, String>();
    
    private Configuration config;

    public void setUp()
    {
        config = new Configuration();
    	typeMap.put("myString", "String");
    	typeMap.put("myInt", "Integer");
    }

    public void testDefault() throws Exception
    {
        config.configure();
        assertConfig(config, false);
        assertConfigMap(config);
    }

    public void testString() throws Exception
    {
        config.configure(Configuration.ESPER_DEFAULT_CONFIG);
        assertConfig(config, false);
        assertConfigMap(config);
    }

    public void testURL() throws Exception
    {
        URL url = this.getClass().getClassLoader().getResource(Configuration.ESPER_DEFAULT_CONFIG);
        config.configure(url);
        assertConfig(config, false);
        assertConfigMap(config);
    }

    public void testFile() throws Exception
    {
        URL url = this.getClass().getClassLoader().getResource(Configuration.ESPER_DEFAULT_CONFIG);
        File file = new File(url.toURI());
        config.configure(file);
        assertConfig(config, false);
        assertConfigMap(config);
    }

    public void testAddEventMapping()
    {
        config.addEventTypeAlias(SAMPLE_EVENT_NAME, SAMPLE_EVENT_CLASS);
    	assertConfig(config, true);
    }
    
    public void testAddMapAliases()
    {
    	config.addMapEvent(SAMPLE_MAP_ALIAS, typeMap);
    	assertConfigMap(config);
    }
    
    private void assertConfig(Configuration config, boolean isUsingDefaultImports)
    {
        assertEquals(1, config.getEventTypeAliases().size());
        assertEquals(SAMPLE_EVENT_CLASS, config.getEventTypeAliases().get(SAMPLE_EVENT_NAME));

        if(isUsingDefaultImports)
        {
            assertEquals(4, config.getImports().size());
            assertEquals("java.lang.*", config.getImports().get(0));
            assertEquals("java.math.*", config.getImports().get(1));
            assertEquals("java.text.*", config.getImports().get(2));
            assertEquals("java.util.*", config.getImports().get(3));
        }
        else
        {
        	assertEquals(1, config.getImports().size());
        	assertEquals(SAMPLE_IMPORT_PACKAGE, config.getImports().get(0));
        }        
    }
    
    private void assertConfigMap(Configuration config)
    {
        assertEquals(1, config.getMapAliases().size());
        assertEquals(typeMap, config.getMapAliases().get(SAMPLE_MAP_ALIAS));
    }
}
