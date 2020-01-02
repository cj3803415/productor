package com.example.rabbitmq.productor.publish;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApiCoreSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void user(String msg){

        log.info("api.core.user send message:"+msg);
        amqpTemplate.convertAndSend("coreExchange","api.core.user",msg);
    }

    public  void userQuery(String msg){

        log.info("api.core.user.query send message:"+msg);
        amqpTemplate.convertAndSend("coreExchange","api.core.user.query",msg);
    }
}


