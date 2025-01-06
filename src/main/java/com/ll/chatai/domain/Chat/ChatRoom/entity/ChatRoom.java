package com.ll.chatai.domain.Chat.ChatRoom.entity;

import com.ll.chatai.domain.Chat.ChatMessage.entity.ChatMessage;
import com.ll.member.global.jpa.BaceEntity;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ChatRoom extends BaceEntity {
    public ChatRoom() {

    }

    private String name;
    @OneToMany
    private List<ChatMessage> chatMessages;
}
