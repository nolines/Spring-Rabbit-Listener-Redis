package com.concretepage.repository;

import com.concretepage.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by z003rn5u on 16.01.2017.
 */
public interface MessageRepository{

    public void save(Message message);

    public String read(String id);
}
