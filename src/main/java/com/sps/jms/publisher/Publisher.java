package com.sps.jms.publisher;

import com.sps.jms.model.SampleMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by kaktas on 02-Mar-20
 */
@Component
public class Publisher {

    private final JmsTemplate jmsTemplate;

    public Publisher(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Value("${jms.activemq.destination}")
    private String destination;

    @Scheduled(fixedRate = 5000)
    public void sendMessage(){
        System.out.println("Message is sending...");
        SampleMessage message = SampleMessage.builder()
                .id(UUID.randomUUID().toString())
                .message("Hello World: "+ System.currentTimeMillis())
                .build();

        jmsTemplate.convertAndSend(destination, message);

        System.out.println("Message was sent!");
    }
}
