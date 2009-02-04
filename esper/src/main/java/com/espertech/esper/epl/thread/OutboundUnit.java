package com.espertech.esper.epl.thread;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.collection.UniformPair;
import com.espertech.esper.core.StatementResultServiceImpl;

public class OutboundUnit
{
    private final UniformPair<EventBean[]> events;
    private final StatementResultServiceImpl statementResultService;

    public OutboundUnit(UniformPair<EventBean[]> events, StatementResultServiceImpl statementResultService)
    {
        this.events = events;
        this.statementResultService = statementResultService;
    }

    public UniformPair<EventBean[]> getEvents()
    {
        return events;
    }

    public StatementResultServiceImpl getStatementResultService()
    {
        return statementResultService;
    }
}
