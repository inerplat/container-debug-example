package com.example.wrongdbport.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "message")
public class MessageEntity {
    private MessageEntity(String message){
        this.message = message;
    }

    public MessageEntity() {

    }

    public static MessageEntity of(String message){
        return new MessageEntity(message);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "msg")
    private String message = "";

    public String getMessage(){
        return message;
    }
}
