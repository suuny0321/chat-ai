package com.ll.chatai.domain.Chat.ChatMessage.repository;

import com.ll.chatai.domain.Chat.ChatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
