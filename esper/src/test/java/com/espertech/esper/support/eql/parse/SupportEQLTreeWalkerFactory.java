package com.espertech.esper.support.eql.parse;

import com.espertech.esper.epl.parse.EQLTreeWalker;
import com.espertech.esper.epl.core.EngineImportServiceImpl;
import com.espertech.esper.epl.core.EngineImportService;
import com.espertech.esper.epl.variable.VariableService;
import com.espertech.esper.epl.variable.VariableServiceImpl;
import com.espertech.esper.epl.spec.SelectClauseStreamSelectorEnum;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class SupportEQLTreeWalkerFactory
{
    public static EQLTreeWalker makeWalker(Tree tree, EngineImportService engineImportService, VariableService variableService)
    {
        return new EQLTreeWalker(new CommonTreeNodeStream(tree), engineImportService, variableService, System.currentTimeMillis(), SelectClauseStreamSelectorEnum.ISTREAM_ONLY);
    }

    public static EQLTreeWalker makeWalker(Tree tree)
    {
        return makeWalker(tree, new EngineImportServiceImpl(), new VariableServiceImpl(0, null, null));
    }
}
