package com.concretepage.rabbit;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by z003rn5u on 24.01.2017.
 */
@Service
public class Consumer {

    @RabbitListener(queues = "queue.log")
    public void receiveMessage(Message message){
        System.out.println("Received Message <" + message.getBody() + ">");
    }
}
