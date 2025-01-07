package com.ll.chatai.domain.Chat.ChatMessage.entity;


import com.ll.chatai.domain.Chat.ChatRoom.entity.ChatRoom;
import com.ll.member.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ChatMessage extends BaseEntity {

    public ChatMessage() {

    }
    public String writerName;
    public String content;

    @ManyToOne
    private ChatRoom chatRoom;
}
;