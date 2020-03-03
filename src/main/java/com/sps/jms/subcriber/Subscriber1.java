package com.sps.jms.subcriber;

import com.sps.jms.model.SampleMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

/**
 * Created by kaktas on 02-Mar-20
 */
@Component
public class Subscriber1 {

    @JmsListener(destination =  "${jms.activemq.destination}")
    public void receive(@Payload SampleMessage sampleMessage, @Headers MessageHeaders headers, Message message) throws Exception {
        System.out.println("There is a new Message for Subscriber1!");

        System.out.println(sampleMessage.toString());
      //  headers.forEach((s, o) -> System.out.print(s+" "+o.toString()));

        System.out.println("Message was received by Subscriber1!");
    }
}
