package com.x7700.learn.activemq.main;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MyMessageConsumer {

    public static void main(String[] args) throws Exception {
        String user = ActiveMQConnection.DEFAULT_USER;
        String password = ActiveMQConnection.DEFAULT_PASSWORD;
        String url = ActiveMQConnection.DEFAULT_BROKER_URL;
        String subject = "TOOL.DEFAULT";
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
        Connection connection;

        connection = connectionFactory.createConnection();
        connection.start();
        final Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(subject);
        MessageConsumer message = session.createConsumer(destination);
        message.setMessageListener(new MessageListener() {
            public void onMessage(Message msg) {
                MapMessage message = (MapMessage) msg;
                try {
                    System.out.println("接收端收到消息，" + message.getString("seqnum") + ":" + new Date(message.getLong("data")));
                    session.commit();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread.sleep(100000);
        session.close();
        connection.close();
    }
}
