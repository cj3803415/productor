package com.example.rabbitmq.productor;


import com.example.rabbitmq.productor.publish.PaymentNotifySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentNotifySenderTests {

    @Autowired
    private PaymentNotifySender paymentNotifySender;


    @Test
    public void test_sender(){

    paymentNotifySender.sender("支付订单号："+System.currentTimeMillis());
    }
}
