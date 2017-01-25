package com.concretepage.controller;

import com.concretepage.domain.Message;
import com.concretepage.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by z003rn5u on 16.01.2017.
 */
@RestController
@RequestMapping("/msg")
public class MessageController {

    @Autowired
    MessageRepository messageRepository;


    @RequestMapping("/save/{id}")
    public void saveMsg(@PathVariable("id") String id){
        Message msg = new Message(id, new Date());
        messageRepository.save(msg);
    }


//    System.out.println(messageRepository.save(msg));
}
