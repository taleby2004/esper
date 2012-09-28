package com.espertech.esper.core.context.mgr;

import java.util.NavigableMap;
import java.util.TreeMap;

public class ContextControllerStateUtil {

    public static ContextControllerState getRecoveryStates(ContextStateCache cache, String contextName) {
        TreeMap<ContextStatePathKey, ContextStatePathValue> state = cache.getContextPaths(contextName);
        if (state == null || state.isEmpty()) {
            return null;
        }
        return new ContextControllerState(state);
    }

    public static NavigableMap<ContextStatePathKey, ContextStatePathValue> getChildContexts(ContextControllerFactoryContext factoryContext, int pathId, TreeMap<ContextStatePathKey, ContextStatePathValue> states) {
        ContextStatePathKey start = new ContextStatePathKey(factoryContext.getOutermostContextName(), factoryContext.getNestingLevel(), pathId, Integer.MIN_VALUE);
        ContextStatePathKey end = new ContextStatePathKey(factoryContext.getOutermostContextName(), factoryContext.getNestingLevel(), pathId, Integer.MAX_VALUE);
        return states.subMap(start, true, end, true);
    }
}

