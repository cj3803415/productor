package com.example.rabbitmq.productor.configure;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeadersConfig {

    @Bean
    public Queue creditBankQueue(){
        return new Queue("credit.bank");
    }

    @Bean
    public Queue creditFinanceQueue(){
        return new Queue("credit.finance");
    }
}
