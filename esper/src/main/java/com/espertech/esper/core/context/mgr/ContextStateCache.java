package com.espertech.esper.core.context.mgr;

import java.util.TreeMap;

public interface ContextStateCache {

    public ContextStatePathValueBinding getBinding(Object bindingInfo);
    public void addContextPath(String contextName, int level, int parentPath, int subPath, Integer optionalContextPartitionId, Object additionalInfo, ContextStatePathValueBinding binding);
    public void removeContextParentPath(String contextName, int level, int parentPath);
    public void removeContextPath(String contextName, int level, int parentPath, int subPath);
    public TreeMap<ContextStatePathKey, ContextStatePathValue> getContextPaths(String contextName);
}
