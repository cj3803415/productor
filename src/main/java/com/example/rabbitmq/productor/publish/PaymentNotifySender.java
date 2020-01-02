package com.example.rabbitmq.productor.publish;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PaymentNotifySender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(String msg){
        log.info("notify.payment send message :"+msg);
        rabbitTemplate.convertAndSend("notify.payment",msg);
    }
}
