package com.example.demoJms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MySender {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMyMessage(){
        jmsTemplate.convertAndSend("demoDestination", "Hello there...");
    }
}
