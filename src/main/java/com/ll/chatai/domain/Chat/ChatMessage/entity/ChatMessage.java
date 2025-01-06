package com.ll.chatai.domain.Chat.ChatMessage.entity;


import com.ll.member.global.jpa.BaceEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ChatMessage extends BaceEntity {

    public ChatMessage() {

    }
}
