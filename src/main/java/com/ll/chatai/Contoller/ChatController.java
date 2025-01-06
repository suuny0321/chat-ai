package com.ll.chatai.Contoller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/api/vi/chat")
@RestController
public class ChatController {
    private final OpenAiChatModel openAiChatModel;

    public ChatController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @GetMapping("/ai")
    public Map<String, String> chat(@RequestBody String message) {
        Map<String, String> responses = new HashMap<>();

        String openAiRessponse =openAiChatModel.call(message);
        responses.put("OpenAI -ChatGPT 응답", openAiRessponse);
        return responses;
    }



}
