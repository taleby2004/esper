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

import com.espertech.esper.epl.expression.ExprNode;

import java.util.List;

public class ContextDetailTemporalFixed implements ContextDetail {

    private static final long serialVersionUID = -8082004791526916308L;
    private List<ExprNode> crontabStart;
    private List<ExprNode> crontabEnd;

    public ContextDetailTemporalFixed(List<ExprNode> crontabStart, List<ExprNode> crontabEnd) {
        this.crontabStart = crontabStart;
        this.crontabEnd = crontabEnd;
    }

    public List<ExprNode> getCrontabStart() {
        return crontabStart;
    }

    public List<ExprNode> getCrontabEnd() {
        return crontabEnd;
    }
}
