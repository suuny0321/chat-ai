package com.ll.chatai.domain.Chat.ChatRoom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/chat/rooms")
@RequiredArgsConstructor
@CrossOrigin(
        origins = "https://cdpn.io"
)
public class ApiV1ChatRoomController {

    @GetMapping
    public String getChatRooms() {
        return "채팅방 목록 조회 완료!";
    }

    @GetMapping("/api/v1/chat/rooms/{roomId}")
    public String getChatRooms(@PathVariable("roomId") Long roomId) {
        return roomId + "번 채팅방 조회 완료";
    }

    @PostMapping
    public String createChatRoom() {
        return "채팅방 생성 완료";
    }


}
