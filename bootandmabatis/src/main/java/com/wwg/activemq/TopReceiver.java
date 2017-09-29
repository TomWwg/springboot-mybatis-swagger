package com.wwg.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 订阅模式的接收端代码
 * Created by wwg on 2017/9/29.
 */
public class TopReceiver {
    //连接账号
    private String userName = "";
    //连接密码
    private String password = "";
    //连接地址
    private String brokerURL = "tcp://localhost:61616";
    //connection的工厂
    private ConnectionFactory factory;
    //连接对象
    private Connection connection;
    //一个操作会话
    private Session session;
    //目的地，其实就是连接到哪个队列，如果是点对点，那么它的实现是Queue，如果是订阅模式，那它的实现是Topic
    private Destination destination;
    //消费者，消息接收者
    private MessageConsumer consumer;

    public static void main(String[] args){
        TopReceiver receiver = new TopReceiver();
        receiver.start();
    }

    public void start(){
        factory = new ActiveMQConnectionFactory(userName, password , brokerURL);
        try{
            //构造从工厂得到连接对象
            connection = factory.createConnection();
            //启动
            connection.start();
            //获取操作连接
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            destination = session.createTopic("topic-text");
            consumer = session.createConsumer(destination);
            while(true){
                //设置接收者接收消息的时间，为了便于测试，这里设定为10s
                TextMessage message = (TextMessage) consumer.receive(100000);
                if (null != message){
                    System.out.println("收到消息" + message.getText());
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != connection)
                    connection.close();
            } catch (Throwable ignore){

            }
        }
    }

}
