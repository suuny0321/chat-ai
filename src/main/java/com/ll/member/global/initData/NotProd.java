package com.ll.member.global.initData;

import com.ll.chatai.domain.Chat.ChatMessage.service.ChatMessageService;
import com.ll.chatai.domain.Chat.ChatRoom.entity.ChatRoom;
import com.ll.chatai.domain.Chat.ChatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean
    public ApplicationRunner applicationRunner(ChatRoomService chatRoomService, ChatMessageService chatMessageService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.create("room1");
            ChatRoom chatRoom2 = chatRoomService.create("room2");
            ChatRoom chatRoom3 = chatRoomService.create("room3");

            IntStream.rangeClosed(1, 100).forEach(num -> {
                chatMessageService.create(chatRoom1, "홍길동", "채팅메세지" + num);
            });
            System.out.println("This is not a production environment.");
        };
    }
}