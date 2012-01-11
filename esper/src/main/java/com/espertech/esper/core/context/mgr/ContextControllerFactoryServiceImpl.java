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

package com.espertech.esper.core.context.mgr;

import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.*;

import java.util.HashSet;
import java.util.Set;

public class ContextControllerFactoryServiceImpl implements ContextControllerFactoryService {

    public final static ContextControllerFactoryServiceImpl DEFAULT_FACTORY = new ContextControllerFactoryServiceImpl();

    public ContextControllerFactory[] getFactory(ContextControllerFactoryServiceContext serviceContext) throws ExprValidationException {
        if (!(serviceContext.getDetail() instanceof ContextDetailNested)) {
            ContextControllerFactory factory = buildContextFactory(serviceContext, serviceContext.getContextName(), serviceContext.getDetail(), 1);
            factory.validateFactory();
            return new ContextControllerFactory[] {factory};
        }
        return buildNestedContextFactories(serviceContext);
    }

    private ContextControllerFactory[] buildNestedContextFactories(ContextControllerFactoryServiceContext serviceContext) throws ExprValidationException {
        Set<String> namesUsed = new HashSet<String>();
        ContextDetailNested nestedSpec = (ContextDetailNested) serviceContext.getDetail();
        ContextControllerFactory[] hierarchy = new ContextControllerFactory[nestedSpec.getContexts().size()];
        for (int i = 0; i < nestedSpec.getContexts().size(); i++) {
            CreateContextDesc context = nestedSpec.getContexts().get(i);

            if (namesUsed.contains(context.getContextName())) {
                throw new ExprValidationException("Context by name '" + context.getContextName() + "' has already been declared within nested context '" + serviceContext.getContextName() + "'");
            }
            namesUsed.add(context.getContextName());

            int nestingLevel = i + 1;
            hierarchy[i] = buildContextFactory(serviceContext, context.getContextName(), context.getContextDetail(), nestingLevel);
            hierarchy[i].validateFactory();
        }
        return hierarchy;
    }

    private ContextControllerFactory buildContextFactory(ContextControllerFactoryServiceContext serviceContext, String contextName, ContextDetail detail, int nestingLevel) throws ExprValidationException {
        ContextControllerFactoryContext factoryContext = new ContextControllerFactoryContext(serviceContext.getContextName(), contextName, serviceContext.getServicesContext(), serviceContext.getAgentInstanceContextCreate(), nestingLevel);
        return buildContextFactory(factoryContext, detail);
    }

    protected ContextControllerFactory buildContextFactory(ContextControllerFactoryContext factoryContext, ContextDetail detail) throws ExprValidationException {

        ContextControllerFactory factory;
        if (detail instanceof ContextDetailInitiatedTerminated) {
            factory = new ContextControllerInitTermFactory(factoryContext, (ContextDetailInitiatedTerminated) detail);
        }
        else if (detail instanceof ContextDetailPartitioned) {
            factory = new ContextControllerPartitionedFactory(factoryContext, (ContextDetailPartitioned) detail);
        }
        else if (detail instanceof ContextDetailCategory) {
            factory = new ContextControllerCategoryFactory(factoryContext, (ContextDetailCategory) detail);
        }
        else if (detail instanceof ContextDetailHash) {
            factory = new ContextControllerHashFactory(factoryContext, (ContextDetailHash) detail);
        }
        else {
            throw new UnsupportedOperationException("Context detail " + detail + " is not yet supported in a nested context");
        }

        return factory;
    }
}
