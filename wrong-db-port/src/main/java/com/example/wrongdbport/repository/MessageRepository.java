package com.example.wrongdbport.repository;

import com.example.wrongdbport.model.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    public List<MessageEntity> findTop100ByOrderById();
}
