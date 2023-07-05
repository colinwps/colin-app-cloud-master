package com.colinapp.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class test {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSendMessage(){
        rabbitTemplate.convertAndSend("colin","hello");
    }
}
