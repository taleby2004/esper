package net.esper.support.filter;

import net.esper.filter.FilterParamIndex;
import net.esper.filter.EventEvaluator;
import net.esper.filter.FilterCallback;
import net.esper.filter.FilterOperator;
import net.esper.event.EventBean;
import net.esper.event.EventTypeFactory;
import net.esper.support.bean.SupportBean;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.List;

public class SupportFilterParamIndex extends FilterParamIndex
{
    public SupportFilterParamIndex()
    {
        super("intPrimitive", FilterOperator.EQUAL, EventTypeFactory.getInstance().createBeanType(SupportBean.class));
    }

    protected EventEvaluator get(Object expressionValue)
    {
        return null;
    }

    protected void put(Object expressionValue, EventEvaluator evaluator)
    {
    }

    protected boolean remove(Object expressionValue)
    {
        return true;
    }

    protected int size()
    {
        return 0;
    }

    protected ReadWriteLock getReadWriteLock()
    {
        return null;
    }

    public void matchEvent(EventBean event, List<FilterCallback> matches)
    {
    }
}
