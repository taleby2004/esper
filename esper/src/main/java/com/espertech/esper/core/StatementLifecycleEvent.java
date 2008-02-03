package com.espertech.esper.core;

import com.espertech.esper.client.EPStatement;

//TODO ALEX put in client API
public class StatementLifecycleEvent
{
    private EPStatement statement;
    private LifecycleEventType eventType;
    private Object[] params;

    public static enum LifecycleEventType {
        CREATE,
        STATECHANGE,
        LISTENER_ADD,//params: listener or stmtawarelistener (requires instanceof test)
        LISTENER_REMOVE,//params: listener or stmtawarelistener (requires instanceof test)
        LISTENER_REMOVE_ALL
    }

    protected StatementLifecycleEvent(EPStatement statement, LifecycleEventType eventType, Object... params)
    {
        this.statement = statement;
        this.eventType = eventType;
        this.params = params;
    }

    public EPStatement getStatement()
    {
        return statement;
    }

    public LifecycleEventType getEventType() {
        return eventType;
    }

    public Object[] getParams() {
        return params;
    }
}
