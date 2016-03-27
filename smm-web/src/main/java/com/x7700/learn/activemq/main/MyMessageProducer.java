package com.x7700.learn.activemq.main;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MyMessageProducer {

    public static void main(String[] args) throws Exception {
        String user = ActiveMQConnection.DEFAULT_USER;
        String password = ActiveMQConnection.DEFAULT_PASSWORD;
        String url = ActiveMQConnection.DEFAULT_BROKER_URL;
        String subject = "TOOL.DEFAULT";
        /** 创建连接工厂 */
        ActiveMQConnectionFactory contectionFactory = new ActiveMQConnectionFactory(user, password, url);

        /** 创建连接 */
        Connection connection = contectionFactory.createConnection();
        connection.start();// 开启连接
        /** 创建session */
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        /** 指定消息的目的地 */
        Destination destination = session.createQueue(subject);
        /** 创建发送消息对象 */
        MessageProducer producer = session.createProducer(destination);

        for (int i = 0; i <= 100; i++) {
            MapMessage message = session.createMapMessage();
            Date date = new Date();
            message.setLong("date", date.getTime());
            message.setString("seqnum", String.valueOf(i));
            session.commit();
            Thread.sleep(1000);
            producer.send(message);
            System.out.println("发送端发送消息：" + date);
        }
        session.commit();
        session.close();
        connection.close();

    }
}
