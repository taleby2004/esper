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

package com.espertech.esper.core.context.factory;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.epl.join.base.JoinSetComposerDesc;
import com.espertech.esper.view.Viewable;

import java.util.ArrayDeque;

public class StatementAgentInstancePostLoadSelect implements StatementAgentInstancePostLoad {
    private final Viewable[] streamViews;
    private final JoinSetComposerDesc joinSetComposer;

    public StatementAgentInstancePostLoadSelect(Viewable[] streamViews, JoinSetComposerDesc joinSetComposer) {
        this.streamViews = streamViews;
        this.joinSetComposer = joinSetComposer;
    }

    public void executePostLoad() {
        if (joinSetComposer == null) {
            return;
        }
        EventBean[][] events = new EventBean[streamViews.length][];
        for (int stream = 0; stream < streamViews.length; stream++) {
            ArrayDeque<EventBean> eventsInWindow = new ArrayDeque<EventBean>();
            for (EventBean aConsumerView : streamViews[stream]) {
                eventsInWindow.add(aConsumerView);
            }
            events[stream] = eventsInWindow.toArray(new EventBean[eventsInWindow.size()]);
        }
        joinSetComposer.getJoinSetComposer().init(events);
    }
}
