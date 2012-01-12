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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.core.context.util.AgentInstanceContext;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.spec.ContextDetailConditionPattern;
import com.espertech.esper.epl.spec.PatternStreamSpecCompiled;
import com.espertech.esper.pattern.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContextControllerConditionPattern implements ContextControllerCondition, PatternMatchCallback {

    private final EPServicesContext servicesContext;
    private final AgentInstanceContext agentInstanceContext;
    private final ContextDetailConditionPattern endpointPatternSpec;
    private final ContextControllerConditionCallback callback;

    protected PatternStopCallback patternStopCallback;

    public ContextControllerConditionPattern(EPServicesContext servicesContext, AgentInstanceContext agentInstanceContext, ContextDetailConditionPattern endpointPatternSpec, ContextControllerConditionCallback callback) {
        this.servicesContext = servicesContext;
        this.agentInstanceContext = agentInstanceContext;
        this.endpointPatternSpec = endpointPatternSpec;
        this.callback = callback;
    }

    public void activate(EventBean optionalTriggeringEvent, MatchedEventMap priorMatches, long timeOffset) {
        if (patternStopCallback != null) {
            patternStopCallback.stop();
        }

        PatternStreamSpecCompiled patternStreamSpec = endpointPatternSpec.getPatternCompiled();
        StatementContext stmtContext = agentInstanceContext.getStatementContext();

        EvalRootFactoryNode rootFactoryNode = servicesContext.getPatternNodeFactory().makeRootNode();
        PatternContext patternContext = stmtContext.getPatternContextFactory().createContext(stmtContext, 0, rootFactoryNode, !patternStreamSpec.getArrayEventTypes().isEmpty());
        rootFactoryNode.addChildNode(patternStreamSpec.getEvalFactoryNode());

        PatternAgentInstanceContext patternAgentInstanceContext = stmtContext.getPatternContextFactory().createPatternAgentContext(patternContext, agentInstanceContext, false);
        EvalRootNode rootNode = EvalNodeUtil.makeRootNodeFromFactory(rootFactoryNode, patternAgentInstanceContext);

        if (priorMatches == null) {
            priorMatches = new MatchedEventMapImpl();
        }
        patternStopCallback = rootNode.start(this, patternContext, priorMatches);
    }

    public void matchFound(Map<String, Object> matchEvent) {
        Map<String, Object> matchEventInclusive = null;
        if (endpointPatternSpec.isInclusive()) {
            if (matchEvent.size() < 2) {
                matchEventInclusive = matchEvent;
            }
            else {
                // need to reorder according to tag order
                LinkedHashMap<String, Object> ordered = new LinkedHashMap<String, Object>();
                for (String key : endpointPatternSpec.getPatternCompiled().getTaggedEventTypes().keySet()) {
                    ordered.put(key, matchEvent.get(key));
                }
                for (String key : endpointPatternSpec.getPatternCompiled().getArrayEventTypes().keySet()) {
                    ordered.put(key, matchEvent.get(key));
                }
                matchEventInclusive = ordered;
            }
        }
        callback.rangeNotification(matchEvent, this, null, matchEventInclusive);
    }

    public void deactivate() {
        if (patternStopCallback != null) {
            patternStopCallback.stop();
            patternStopCallback = null;
        }
    }

    public boolean isRunning() {
        return patternStopCallback != null;
    }

    public Long getExpectedEndTime() {
        return null;
    }
}
