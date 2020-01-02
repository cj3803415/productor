package com.example.rabbitmq.productor.receive;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RabbitListener(queues = "api.core")
public class ApiCoreReceive {

    @RabbitHandler
    public void user(String msg){
      log.info("api.core receive message:"+msg);
    }
}
