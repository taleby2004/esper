package com.espertech.esper.core;

//TODO ALEX put in client API
public interface StatementLifecycleObserver
{
    public void observe(StatementLifecycleEvent event); 
}
