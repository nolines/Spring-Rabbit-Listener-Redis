package com.concretepage.repository;

import com.concretepage.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by z003rn5u on 16.01.2017.
 */
@Component
public class MessageRepositoryImpl implements MessageRepository{

    @Autowired
    StringRedisTemplate stringRedisTemplate;
//
//    public MessageRepositoryImpl(StringRedisTemplate stringRedisTemplate) {
//        this.stringRedisTemplate = stringRedisTemplate;
//    }

    @Override
    public void save(Message message) {
        stringRedisTemplate.opsForValue().set(message.getId(), message.getDate().toString());
    }

    @Override
    public String read(String id) {
        return stringRedisTemplate.opsForValue().get((id));
    }
}
