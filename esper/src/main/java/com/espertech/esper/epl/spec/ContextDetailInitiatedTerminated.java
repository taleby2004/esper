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

package com.espertech.esper.epl.spec;

import com.espertech.esper.epl.expression.ExprTimePeriod;
import com.espertech.esper.filter.FilterSpecCompiled;
import com.espertech.esper.pattern.EvalFactoryNode;

public class ContextDetailInitiatedTerminated implements ContextDetail {

    private final EvalFactoryNode initiatedPattern;
    private final FilterSpecRaw initiatedFilter;
    private final String initiatedFilterAsName;
    private final ExprTimePeriod terminatedTimePeriod;

    private PatternStreamSpecCompiled initiatedPatternCompiled;
    private FilterSpecCompiled initiatedFilterCompiled;

    public ContextDetailInitiatedTerminated(EvalFactoryNode initiatedPattern, FilterSpecRaw initiatedFilter, String initiatedFilterAsName, ExprTimePeriod terminatedTimePeriod) {
        this.initiatedPattern = initiatedPattern;
        this.initiatedFilter = initiatedFilter;
        this.initiatedFilterAsName = initiatedFilterAsName;
        this.terminatedTimePeriod = terminatedTimePeriod;
    }

    public EvalFactoryNode getInitiatedPattern() {
        return initiatedPattern;
    }

    public ExprTimePeriod getTerminatedTimePeriod() {
        return terminatedTimePeriod;
    }

    public void setInitiatedPatternCompiled(PatternStreamSpecCompiled initiatedPatternCompiled) {
        this.initiatedPatternCompiled = initiatedPatternCompiled;
    }

    public PatternStreamSpecCompiled getInitiatedPatternCompiled() {
        return initiatedPatternCompiled;
    }

    public FilterSpecRaw getInitiatedFilter() {
        return initiatedFilter;
    }

    public String getInitiatedFilterAsName() {
        return initiatedFilterAsName;
    }

    public FilterSpecCompiled getInitiatedFilterCompiled() {
        return initiatedFilterCompiled;
    }

    public void setInitiatedFilterCompiled(FilterSpecCompiled initiatedFilterCompiled) {
        this.initiatedFilterCompiled = initiatedFilterCompiled;
    }
}
