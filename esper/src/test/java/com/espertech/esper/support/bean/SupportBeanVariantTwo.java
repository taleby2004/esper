package com.espertech.esper.support.bean;

import java.io.Serializable;
import java.util.*;

public class SupportBeanVariantTwo implements Serializable
{
    private ISupportBaseAB p0;
    private ISupportAImplSuperGImplPlus p1;
    private LinkedList p2;
    private List p3;
    private List p4;
    private Collection p5;
    private int[] indexed;
    private Map<String, String> mapped;
    private SupportBeanVariantOne.SupportBeanVariantOneInner inner;

    public SupportBeanVariantTwo()
    {
        indexed = new int[] {10, 20, 30};
        mapped = new HashMap<String, String>();
        mapped.put("a", "val2");
        inner = new SupportBeanVariantOne.SupportBeanVariantOneInner("i2");
    }

    public ISupportBaseAB getP0()
    {
        return p0;
    }

    public ISupportAImplSuperGImplPlus getP1()
    {
        return p1;
    }

    public LinkedList getP2()
    {
        return p2;
    }

    public List getP3()
    {
        return p3;
    }

    public List getP4()
    {
        return p4;
    }

    public Collection getP5()
    {
        return p5;
    }

    public int[] getIndexed()
    {
        return indexed;
    }

    public int getIndexArr(int index)
    {
        return indexed[index];
    }

    public Map getMapped()
    {
        return mapped;
    }

    public String getMappedKey(String key)
    {
        return mapped.get(key);
    }

    public SupportBeanVariantOne.SupportBeanVariantOneInner getInner()
    {
        return inner;
    }
}
