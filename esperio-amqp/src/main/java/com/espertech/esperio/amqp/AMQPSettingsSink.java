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

package com.espertech.esperio.amqp;

public class AMQPSettingsSink extends AMQPSettingsBase
{
    private ObjectToAMQPTransform objectToAmqpTransform;

    public AMQPSettingsSink() {
    }

    public ObjectToAMQPTransform getObjectToAmqpTransform() {
        return objectToAmqpTransform;
    }

    public void setObjectToAmqpTransform(ObjectToAMQPTransform objectToAmqpTransform) {
        this.objectToAmqpTransform = objectToAmqpTransform;
    }

    public String toString() {
        return super.toString() + "  AMQPSettingsSink{" +
            "objectToAmqpTransform=" + objectToAmqpTransform +
            '}';
    }
}
