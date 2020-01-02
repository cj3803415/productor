package com.example.rabbitmq.productor.receive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@RabbitListener(queues = "api.payment")
public class ApiPaymentReceive {


        @RabbitHandler
        public void order(String msg){
            log.info("api.payment receive message:"+msg);
        }

}
