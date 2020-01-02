package com.example.rabbitmq.productor.receive;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
@Slf4j
@RabbitListener(queues = "notify.payment")
public class PaymentNotifyReceive {

    @RabbitHandler
    public void receive(String msg){
        log.info("notify.payment receive message"+msg);
    }
}
