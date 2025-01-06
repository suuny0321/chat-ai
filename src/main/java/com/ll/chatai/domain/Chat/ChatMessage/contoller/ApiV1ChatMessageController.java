package com.ll.chatai.domain.Chat.ChatMessage.contoller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ApiV1ChatMessageController {
    private final OpenAiChatModel openAiChatModel;

    public ApiV1ChatMessageController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @GetMapping("/ai")
    public Map<String, String> chat(@RequestBody String message) {
        Map<String, String> responses = new HashMap<>();

        String openAiRessponse = openAiChatModel.call(message);
        responses.put("OpenAI -ChatGPT 응답", openAiRessponse);
        return responses;
    }

    @GetMapping("/api/vi/chat/rooms/{roomId}/messages")
    // 1번채팅방 메시지 목록 조회 완료 id : 2
    public String getChatMessages(@PathVariable("roomId") Long roomId, @RequestParam(value = "afterChatMessageId") Long afterChatMessageId) {
        return roomId + "번 채팅방 메시지 목록 조회 완료 id " + afterChatMessageId;

    }

    @PostMapping("/api/vi/chat/rooms/{roomId}/messages")
    public String createChatMessage(@PathVariable("roomId") Long roomId) {
        return roomId + "채팅방 메시지 생성 완료";
    }

}
