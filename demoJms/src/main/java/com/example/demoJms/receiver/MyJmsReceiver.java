package com.example.demoJms.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyJmsReceiver {

    @JmsListener(destination = "demoDestination")
    public void receiveSimpleMessage(String message){

        log.info("Message received {}", message);
    }
}
