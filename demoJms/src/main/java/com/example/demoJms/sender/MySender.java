package com.example.demoJms.sender;

import com.example.demoJms.model.Employee;
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

    public void sendEmployeeMessage(){
        jmsTemplate.convertAndSend("demoObjectDestination", Employee.builder().name("Nila").message("Hello there....").build());
    }
}
