package com.espertech.esper.support.eql;

import com.espertech.esper.epl.agg.AggregationResultFuture;

public class SupportAggregationResultFuture implements AggregationResultFuture
{
    private Object[] values;

    public SupportAggregationResultFuture(Object[] values)
    {
        this.values = values;
    }

    public Object getValue(int column)
    {
        return values[column];
    }
}
