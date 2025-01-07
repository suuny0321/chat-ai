package com.ll.chatai.domain.Chat.ChatMessage.service;

import com.ll.chatai.domain.Chat.ChatMessage.entity.ChatMessage;
import com.ll.chatai.domain.Chat.ChatMessage.repository.ChatMessageRepository;
import com.ll.chatai.domain.Chat.ChatRoom.entity.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public void create(ChatRoom chatRoom, String writerName, String content) {
        ChatMessage chatMessage = ChatMessage.builder()
                .chatRoom(chatRoom)
                .writerName(writerName)
                .content(content)
                .build();

        chatMessageRepository.save(chatMessage);
    }
}
