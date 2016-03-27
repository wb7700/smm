package com.x7700.learn.jms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class MsgSender {

    public static void main(String[] args) {
        new MsgSender().send();
    }

    public void send() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Prompt for JNDI names
            System.out.println("Enter ConnectionFactory name:");
            String factoryName = reader.readLine();
            System.out.println("Enter Destination name:");
            String destinationName = reader.readLine();
            // Look up administered objects
            
            InitialContext initContext = null;
            /*
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            props.setProperty("java.naming.provider.url", "tcp://localhost:61616");
            InitialContext initContext = new InitialContext(props);
            */
            initContext = new InitialContext();
            ConnectionFactory factory = (ConnectionFactory) initContext.lookup(factoryName);
            Destination destination = (Destination) initContext.lookup(destinationName);
            initContext.close();

            // Create JMS objects
            Connection connection = factory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer sender = session.createProducer(destination);
            // Send messages
            String messageText = null;

            while (true) {
                System.out.println("Enter message to send or 'quit':");
                messageText = reader.readLine();
                if ("quit".equals(messageText))
                    break;
                TextMessage message = session.createTextMessage(messageText);
                sender.send(message);
            }

            // Exit
            System.out.println("Exiting...");
            reader.close();
            connection.close();
            System.out.println("Goodbye!");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
