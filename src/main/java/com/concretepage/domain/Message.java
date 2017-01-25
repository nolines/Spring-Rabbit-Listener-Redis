package com.concretepage.domain;

import java.util.Date;

/**
 * Created by z003rn5u on 16.01.2017.
 */
public class Message {

    private String id;
    private Date date;

    public Message(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
