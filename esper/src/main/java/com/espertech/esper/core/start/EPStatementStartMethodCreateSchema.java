/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.core.start;

import com.espertech.esper.client.ConfigurationEventTypeLegacy;
import com.espertech.esper.client.ConfigurationEventTypeMap;
import com.espertech.esper.client.ConfigurationVariantStream;
import com.espertech.esper.client.EventType;
import com.espertech.esper.core.service.EPServicesContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.core.EngineImportException;
import com.espertech.esper.epl.expression.ExprValidationException;
import com.espertech.esper.epl.spec.CreateSchemaDesc;
import com.espertech.esper.epl.spec.StatementSpecCompiled;
import com.espertech.esper.event.EventAdapterException;
import com.espertech.esper.event.EventTypeUtility;
import com.espertech.esper.view.ViewProcessingException;
import com.espertech.esper.view.Viewable;
import com.espertech.esper.view.ViewableDefaultImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;
import java.util.Map;

/**
 * Starts and provides the stop method for EPL statements.
 */
public class EPStatementStartMethodCreateSchema extends EPStatementStartMethodBase
{
    private static final Log log = LogFactory.getLog(EPStatementStartMethodCreateSchema.class);

    public EPStatementStartMethodCreateSchema(StatementSpecCompiled statementSpec, EPServicesContext services, StatementContext statementContext) {
        super(statementSpec, services, statementContext);
    }

    public EPStatementStartResult startInternal(boolean isNewStatement, boolean isRecoveringStatement, boolean isRecoveringResilient) throws ExprValidationException, ViewProcessingException {
        final CreateSchemaDesc spec = statementSpec.getCreateSchemaDesc();
        EventType eventType = null;

        try {
            if (!spec.isVariant()) {
                if (spec.getTypes().isEmpty()) {
                    Map<String, Object> typing = EventTypeUtility.buildType(spec.getColumns(), services.getEventAdapterService(), spec.getCopyFrom());
                    ConfigurationEventTypeMap config = new ConfigurationEventTypeMap();
                    if (spec.getInherits() != null) {
                        config.getSuperTypes().addAll(spec.getInherits());
                    }
                    config.setStartTimestampPropertyName(spec.getStartTimestampProperty());
                    config.setEndTimestampPropertyName(spec.getEndTimestampProperty());
                    Map<String, Object> compiledTyping = EventTypeUtility.compileMapTypeProperties(typing, services.getEventAdapterService());
                    eventType = services.getEventAdapterService().addNestableMapType(spec.getSchemaName(), compiledTyping, config, false, false, true, false, false);
                }
                else {
                    // Java Object/Bean/POJO type definition
                    if (spec.getCopyFrom() != null && !spec.getCopyFrom().isEmpty()) {
                        throw new ExprValidationException("Copy-from types are not allowed with class-provided types");
                    }
                    if (spec.getTypes().size() == 1) {
                        String typeName = spec.getTypes().iterator().next();
                        try {
                            // use the existing configuration, if any, possibly adding the start and end timestamps
                            ConfigurationEventTypeLegacy config = services.getEventAdapterService().getClassLegacyConfigs(typeName);
                            if (spec.getStartTimestampProperty() != null || spec.getEndTimestampProperty() != null) {
                                if (config == null) {
                                    config = new ConfigurationEventTypeLegacy();
                                }
                                config.setStartTimestampPropertyName(spec.getStartTimestampProperty());
                                config.setEndTimestampPropertyName(spec.getEndTimestampProperty());
                                services.getEventAdapterService().setClassLegacyConfigs(Collections.singletonMap(typeName, config));
                            }
                            eventType = services.getEventAdapterService().addBeanType(spec.getSchemaName(), spec.getTypes().iterator().next(), false, false, false, true);
                        }
                        catch (EventAdapterException ex) {
                            Class clazz;
                            try {
                                clazz = services.getEngineImportService().resolveClass(typeName);
                                eventType = services.getEventAdapterService().addBeanType(spec.getSchemaName(), clazz, false, false, true);
                            }
                            catch (EngineImportException e) {
                                log.debug("Engine import failed to resolve event type '" + typeName + "'");
                                throw ex;
                            }
                        }
                    }
                }
            }
            else {
                if (spec.getCopyFrom() != null && !spec.getCopyFrom().isEmpty()) {
                    throw new ExprValidationException("Copy-from types are not allowed with variant types");
                }

                boolean isAny = false;
                ConfigurationVariantStream config = new ConfigurationVariantStream();
                for (String typeName : spec.getTypes()) {
                    if (typeName.trim().equals("*")) {
                        isAny = true;
                        break;
                    }
                    config.addEventTypeName(typeName);
                }
                if (!isAny) {
                    config.setTypeVariance(ConfigurationVariantStream.TypeVariance.PREDEFINED);
                }
                else {
                    config.setTypeVariance(ConfigurationVariantStream.TypeVariance.ANY);
                }
                services.getValueAddEventService().addVariantStream(spec.getSchemaName(), config, services.getEventAdapterService(), services.getEventTypeIdGenerator());
                eventType = services.getValueAddEventService().getValueAddProcessor(spec.getSchemaName()).getValueAddEventType();
            }
        }
        catch (RuntimeException ex) {
            throw new ExprValidationException(ex.getMessage(), ex);
        }

        // enter a reference
        services.getStatementEventTypeRefService().addReferences(statementContext.getStatementName(), Collections.singleton(spec.getSchemaName()));

        final EventType allocatedEventType = eventType;
        EPStatementStopMethod stopMethod = new EPStatementStopMethod() {
            public void stop()
            {
                services.getStatementEventTypeRefService().removeReferencesStatement(statementContext.getStatementName());
                if (services.getStatementEventTypeRefService().getStatementNamesForType(spec.getSchemaName()).isEmpty()) {
                    services.getEventAdapterService().removeType(allocatedEventType.getName());
                    services.getFilterService().removeType(allocatedEventType);
                }
            }
        };
        Viewable viewable = new ViewableDefaultImpl(eventType);
        return new EPStatementStartResult(viewable, stopMethod, null);
    }
}
