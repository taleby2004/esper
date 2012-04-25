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

import com.espertech.esper.dataflow.annotations.DataFlowOpPropertyHolder;
import com.espertech.esper.dataflow.annotations.DataFlowOperator;
import com.espertech.esper.dataflow.interfaces.*;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

@DataFlowOperator
public class AMQPSink implements DataFlowOpLifecycle {
    private static final Log log = LogFactory.getLog(AMQPSource.class);

    @DataFlowOpPropertyHolder
    private AMQPSettingsSink settings;

    private transient Connection connection;
    private transient Channel channel;
    private ThreadLocal<ObjectToAMQPCollectorContext> collectorDataTL = new ThreadLocal<ObjectToAMQPCollectorContext>() {
        protected synchronized ObjectToAMQPCollectorContext initialValue() {
            return null;
        }
    };

    public DataFlowOpInitializeResult initialize(DataFlowOpInitializateContext context) throws Exception {
        return null;
    }

    public void open(DataFlowOpOpenContext openContext) {
        log.info("Opening AMQP, settings are: " + settings.toString());

        try {
            final ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(settings.getHost());
            if (settings.getPort() > -1) {
                connectionFactory.setPort(settings.getPort());
            }
            if (settings.getUsername() != null) {
                connectionFactory.setUsername(settings.getUsername());
            }
            if (settings.getPassword() != null) {
                connectionFactory.setPassword(settings.getPassword());
            }
            if (settings.getVhost() != null) {
                connectionFactory.setVirtualHost(settings.getVhost());
            }

            connection = connectionFactory.newConnection();
            channel = connection.createChannel();

            if (settings.getExchange() != null) {
                channel.exchangeDeclarePassive(settings.getExchange());
            }

            final AMQP.Queue.DeclareOk queue;
            if (settings.getQueueName() == null || settings.getQueueName().trim().length() == 0) {
                queue = channel.queueDeclare();
            }
            else {
                // java.lang.String queue,boolean durable,boolean exclusive,boolean autoDelete,java.util.Map<java.lang.String,java.lang.Object> arguments) throws java.io.IOException
                queue = channel.queueDeclare(settings.getQueueName(), settings.isDeclareDurable(), settings.isDeclareExclusive(), settings.isDeclareAutoDelete(), settings.getDeclareAdditionalArgs());
            }
            if (settings.getExchange() != null && settings.getRoutingKey() != null) {
                channel.queueBind(queue.getQueue(), settings.getExchange(), settings.getRoutingKey());
            }

            final String queueName = queue.getQueue();
            log.info("AMQP producting queue " + queueName + (settings.isLogMessages() ? " with logging" : ""));
        }
        catch (IOException e) {
            log.error("AMQP setup failed", e);
        }
    }

    public void onInput(Object event) {

        ObjectToAMQPCollectorContext holder = collectorDataTL.get();
        if (holder == null) {
            holder = new ObjectToAMQPCollectorContext(new AMQPEmitter() {
                public void send(byte[] bytes) {
                    try {
                        channel.basicPublish("", settings.getQueueName(), null, bytes);
                    }
                    catch (IOException e) {
                        String message = "Failed to publish to AMQP: " + e.getMessage();
                        log.error(message, e);
                        throw new RuntimeException(message);
                    }
                }
            }, event);
            collectorDataTL.set(holder);
        }
        else {
            holder.setObject(event);
        }

        settings.getCollector().collect(holder);
    }

    public void close(DataFlowOpCloseContext openContext) {
        try {
            if (channel != null) {
              channel.close();
            }
        }
        catch (IOException e) {
            log.warn("Error closing AMQP channel", e);
        }

        try {
            if (connection != null) {
              connection.close();
            }
        }
        catch (IOException e) {
            log.warn("Error closing AMQP connection", e);
        }
    }
}
