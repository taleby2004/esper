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

package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.util.List;

public class DataFlowOperatorOutputType implements Serializable {

    private boolean isWildcard;
    private String typeOrClassname;
    private List<DataFlowOperatorOutputType> typeParameters;

    public DataFlowOperatorOutputType(boolean wildcard, String typeOrClassname, List<DataFlowOperatorOutputType> typeParameters) {
        isWildcard = wildcard;
        this.typeOrClassname = typeOrClassname;
        this.typeParameters = typeParameters;
    }

    public boolean isWildcard() {
        return isWildcard;
    }

    public void setWildcard(boolean wildcard) {
        isWildcard = wildcard;
    }

    public String getTypeOrClassname() {
        return typeOrClassname;
    }

    public void setTypeOrClassname(String typeOrClassname) {
        this.typeOrClassname = typeOrClassname;
    }

    public List<DataFlowOperatorOutputType> getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(List<DataFlowOperatorOutputType> typeParameters) {
        this.typeParameters = typeParameters;
    }
}
