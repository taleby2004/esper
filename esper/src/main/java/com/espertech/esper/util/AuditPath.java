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

package com.espertech.esper.util;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.event.EventBeanUtility;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Global boolean for enabling and disable audit path reporting.
 */
public class AuditPath {

    private static final Log log = LogFactory.getLog(AuditPath.class);

    /**
     * Log destination for the query plan logging.
     */
    public static final String QUERYPLAN_LOG = "com.espertech.esper.queryplan"; 

    /**
     * Log destination for the JDBC logging.
     */
    public static final String JDBC_LOG = "com.espertech.esper.jdbc"; 

    /**
     * Log destination for the audit logging.
     */
    public static final String AUDIT_LOG = "com.espertech.esper.audit"; 

    /**
     * Public access.
     */
    public static boolean isAuditEnabled = false;

    private static String auditPattern;

    public static void setAuditPattern(String auditPattern) {
        AuditPath.auditPattern = auditPattern;
    }

    public static void auditInsertInto(String engineURI, String statementName, EventBean event) {
        auditLog(engineURI, statementName, "insert-into " + EventBeanUtility.summarize(event));
    }

    public static void auditLog(String engineURI, String statementName, String message) {
        if (auditPattern == null) {
            log.info("Statement " + statementName + " " + message);
        }
        else {
            String result = auditPattern.replace("%s", statementName).replace("%u", engineURI).replace("%m", message);
            log.info(result);
        }
    }

    public static boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }
}