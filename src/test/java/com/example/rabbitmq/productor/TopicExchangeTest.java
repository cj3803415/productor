package com.example.rabbitmq.productor;


import com.example.rabbitmq.productor.publish.ApiCoreSender;
import com.example.rabbitmq.productor.publish.ApiPaymentSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicExchangeTest {

    @Autowired
    private ApiCoreSender apiCoreSender;


    @Autowired
    private ApiPaymentSender apiPaymentSender;

    @Test
    public void test_user(){
        apiCoreSender.user("用户管理！");
    }

    @Test
    public void test_user_query(){
        apiCoreSender.userQuery("用户信息查询！");
    }

    @Test
    public void test_order(){
        apiPaymentSender.order("订单以下！");
    }

    @Test
    public void testOrderQuery(){
        apiPaymentSender.orderQuery("订单查询！");
    }

    @Test
    public void testOrderQueryDetail(){
        apiPaymentSender.orderDetailQuery("订单明细查询！");
    }
}
