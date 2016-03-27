package com.x7700.smm.learn.jms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class MsgReceiver implements MessageListener {
    private boolean stop = false;

    public static void main(String[] args) {
        new MsgReceiver().receive();
    }

    public void receive() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            // Prompt for JNDI names

            System.out.println("Enter ConnectionFactory name:");

            String factoryName = reader.readLine();

            System.out.println("Enter Destination name:");

            String destinationName = reader.readLine();

            reader.close();

            // Look up administered objects

            InitialContext initContext = new InitialContext();

            ConnectionFactory factory =

            (ConnectionFactory) initContext.lookup(factoryName);

            Destination destination = (Destination) initContext.lookup(destinationName);

            initContext.close();

            // Create JMS objects

            Connection connection = factory.createConnection();

            Session session =

            connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            MessageConsumer receiver = session.createConsumer(destination);

            receiver.setMessageListener(this);

            connection.start();

            // Wait for stop

            while (!stop) {
                Thread.sleep(1000);
            }

            // Exit
            System.out.println("Exiting...");
            connection.close();
            System.out.println("Goodbye!");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void onMessage(Message message) {
        try {
            String msgText = ((TextMessage) message).getText();
            System.out.println(msgText);
            if ("stop".equals(msgText))
                stop = true;
        } catch (JMSException e) {
            e.printStackTrace();
            stop = true;
        }
    }
}
