package com.ll.chatai.domain.Chat.ChatRoom.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiV1ChatRoomController {

    @GetMapping("/api/v1/chat/rooms")
    public String getChatRooms() {
        return "채팅방 목록 조회 완료!";
    }

    @GetMapping("/{roomId}")
    public String getChatRooms(@PathVariable("roomId") Long roomId) {
        return roomId + "번방 채팅방 조회 완료";
    }

    @PostMapping
    public String ChreateChatRoom() {
        return "채팅방 생성 완료";
    }


}
