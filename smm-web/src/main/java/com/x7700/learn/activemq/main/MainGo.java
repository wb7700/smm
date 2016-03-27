package com.x7700.learn.activemq.main;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class MainGo {

    public static void main(String[] args) throws Exception {
        codeByRunning("Broker1","61616");
        //codeByRunning("Broker2","61617");
    }

    public static void codeByRunning(String name,String port) throws Exception {
        BrokerService broker = new BrokerService();
        broker.setBrokerName(name);// 如果启动多个Broker时，必须为Broker设置一个名称
        broker.addConnector("tcp://localhost:" + port);
        broker.start();
    }

    public static void factoryByRunning() throws URISyntaxException, Exception {
        BrokerService broker = BrokerFactory.createBroker(new URI("broker:tcp://localhost:61616"));
        broker.start();
    }
}
