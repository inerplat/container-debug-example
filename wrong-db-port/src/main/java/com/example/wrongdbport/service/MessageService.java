package com.example.wrongdbport.service;

import com.example.wrongdbport.model.MessageEntity;
import com.example.wrongdbport.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<String> getAllMessage() {
        List<String> messages = new ArrayList<>();
        messageRepository.findTop100ByOrderById()
                .stream()
                .map(MessageEntity::getMessage)
                .forEach(messages::add);
        return messages;
    }

    public void saveMessage(String message) {
        messageRepository.save(MessageEntity.of(message));
    }
}
