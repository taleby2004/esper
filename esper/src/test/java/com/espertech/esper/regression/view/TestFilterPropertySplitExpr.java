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

package com.espertech.esper.regression.view;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EPStatementException;
import com.espertech.esper.client.scopetest.EPAssertionUtil;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.espertech.esper.client.soda.EPStatementObjectModel;
import com.espertech.esper.support.bean.SupportBean;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

import java.util.*;

public class TestFilterPropertySplitExpr extends TestCase
{
    private EPServiceProvider epService;
    private SupportUpdateListener listener;

    public void setUp()
    {
        epService = EPServiceProviderManager.getDefaultProvider(SupportConfigFactory.getConfiguration());
        epService.initialize();
        listener = new SupportUpdateListener();
    }

    protected void tearDown() throws Exception {
        listener = null;
    }

    public void testSingleRowSplitAndType() {
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("splitSentence", this.getClass().getName(), "splitSentenceMethod");
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("splitSentenceBean", this.getClass().getName(), "splitSentenceBeanMethod");
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("splitWord", this.getClass().getName(), "splitWordMethod");
        epService.getEPAdministrator().getConfiguration().addPlugInSingleRowFunction("invalidSentence", this.getClass().getName(), "invalidSentenceMethod");

        epService.getEPAdministrator().createEPL("create schema SentenceEvent(sentence String)");
        epService.getEPAdministrator().createEPL("create schema WordEvent(word String)");
        epService.getEPAdministrator().createEPL("create schema CharacterEvent(char String)");

        String stmtText;
        EPStatement stmt;
        String[] fields = "word".split(",");

        // test single-row method
        stmtText = "select * from SentenceEvent[splitSentence(sentence)@type(WordEvent)]";
        stmt = epService.getEPAdministrator().createEPL(stmtText);
        stmt.addListener(listener);
        assertEquals("WordEvent", stmt.getEventType().getName());

        epService.getEPRuntime().sendEvent(Collections.singletonMap("sentence", "I am testing this code"), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"I"}, {"am"}, {"testing"}, {"this"}, {"code"}});

        epService.getEPRuntime().sendEvent(Collections.singletonMap("sentence", "the second event"), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"the"}, {"second"}, {"event"}});

        stmt.destroy();

        // test SODA
        EPStatementObjectModel model = epService.getEPAdministrator().compileEPL(stmtText);
        assertEquals(stmtText, model.toEPL());
        stmt = epService.getEPAdministrator().create(model);
        assertEquals(stmtText, stmt.getText());
        stmt.addListener(listener);

        epService.getEPRuntime().sendEvent(Collections.singletonMap("sentence", "the third event"), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"the"}, {"third"}, {"event"}});

        stmt.destroy();

        // test script
        stmtText = "expression Collection js:splitSentenceJS(sentence) [" +
                "  importPackage(java.util);" +
                "  var words = new ArrayList();" +
                "  words.add(Collections.singletonMap('word', 'wordOne'));" +
                "  words.add(Collections.singletonMap('word', 'wordTwo'));" +
                "  words;" +
                "]" +
                "select * from SentenceEvent[splitSentenceJS(sentence)@type(WordEvent)]";
        stmt = epService.getEPAdministrator().createEPL(stmtText);
        stmt.addListener(listener);
        assertEquals("WordEvent", stmt.getEventType().getName());

        epService.getEPRuntime().sendEvent(Collections.emptyMap(), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"wordOne"}, {"wordTwo"}});

        stmt.destroy();

        // test multiple splitters
        stmtText = "select * from SentenceEvent[splitSentence(sentence)@type(WordEvent)][splitWord(word)@type(CharacterEvent)]";
        stmt = epService.getEPAdministrator().createEPL(stmtText);
        stmt.addListener(listener);
        assertEquals("CharacterEvent", stmt.getEventType().getName());

        epService.getEPRuntime().sendEvent(Collections.singletonMap("sentence", "I am"), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), "char".split(","), new Object[][]{{"I"}, {"a"}, {"m"}});

        stmt.destroy();

        // test wildcard parameter
        stmtText = "select * from SentenceEvent[splitSentenceBean(*)@type(WordEvent)]";
        stmt = epService.getEPAdministrator().createEPL(stmtText);
        stmt.addListener(listener);
        assertEquals("WordEvent", stmt.getEventType().getName());

        epService.getEPRuntime().sendEvent(Collections.singletonMap("sentence", "another test sentence"), "SentenceEvent");
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"another"}, {"test"}, {"sentence"}});

        stmt.destroy();

        // test property returning untyped collection
        epService.getEPAdministrator().getConfiguration().addEventType(CollectionEvent.class);

        stmtText = "select * from CollectionEvent[someCollection@type(WordEvent)]";
        stmt = epService.getEPAdministrator().createEPL(stmtText);
        stmt.addListener(listener);
        assertEquals("WordEvent", stmt.getEventType().getName());

        Collection<Map> coll = new ArrayList<Map>();
        coll.add(Collections.singletonMap("word", "this"));
        coll.add(Collections.singletonMap("word", "is"));
        coll.add(Collections.singletonMap("word", "collection"));
        
        epService.getEPRuntime().sendEvent(new CollectionEvent(coll));
        EPAssertionUtil.assertPropsPerRow(listener.getAndResetLastNewData(), fields, new Object[][]{{"this"}, {"is"}, {"collection"}});

        // invalid: event type not found
        tryInvalid("select * from SentenceEvent[splitSentence(sentence)@type(XYZ)]",
                   "Event type by name 'XYZ' could not be found [select * from SentenceEvent[splitSentence(sentence)@type(XYZ)]]");

        // invalid lib-function annotation
        tryInvalid("select * from SentenceEvent[splitSentence(sentence)@dummy(WordEvent)]",
                   "Missing @type(name) declaration providing the event type name of the return type for expression 'splitSentence(sentence)' [select * from SentenceEvent[splitSentence(sentence)@dummy(WordEvent)]]");
        
        // invalid type assignment to event type
        tryInvalid("select * from SentenceEvent[invalidSentence(sentence)@type(WordEvent)]",
                   "Event type 'WordEvent' underlying type java.util.Map cannot be assigned a value of type");

        // invalid subquery
        tryInvalid("select * from SentenceEvent[splitSentence((select * from SupportBean.win:keepall()))@type(WordEvent)]",
                   "Invalid contained-event expression: Aggregation, sub-select, previous or prior functions are not supported in this context [select * from SentenceEvent[splitSentence((select * from SupportBean.win:keepall()))@type(WordEvent)]]");
    }

    public static Map[] splitSentenceMethod(String sentence) {
        String[] words = sentence.split(" ");
        Map[] events = new Map[words.length];
        for (int i = 0; i < words.length; i++) {
            events[i] = Collections.singletonMap("word", words[i]);
        }
        return events;
    }

    public static Map[] splitSentenceBeanMethod(Map sentenceEvent) {
        return splitSentenceMethod((String) sentenceEvent.get("sentence"));
    }

    public static Map[] splitWordMethod(String word) {
        List<Map> maps = new ArrayList<Map>();
        for (int i = 0; i < word.length(); i++) {
            maps.add(Collections.singletonMap("char", Character.toString(word.charAt(i))));
        }
        return maps.toArray(new Map[maps.size()]);
    }

    public static SupportBean[] invalidSentenceMethod(String sentence) {
        return null;
    }

    private void tryInvalid(String epl, String expected) {
        try {
            epService.getEPAdministrator().createEPL(epl);
            fail();
        }
        catch (EPStatementException ex) {
            assertFalse(expected.isEmpty());
            assertTrue("Received message: " + ex.getMessage(), ex.getMessage().startsWith(expected));
        }
    }

    public static class CollectionEvent {
        private Collection someCollection;

        public CollectionEvent(Collection someCollection) {
            this.someCollection = someCollection;
        }

        public Collection getSomeCollection() {
            return someCollection;
        }

        public void setSomeCollection(Collection someCollection) {
            this.someCollection = someCollection;
        }
    }
}
