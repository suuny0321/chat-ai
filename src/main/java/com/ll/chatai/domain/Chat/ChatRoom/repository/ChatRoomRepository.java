package com.ll.chatai.domain.Chat.ChatRoom.repository;

import com.ll.chatai.domain.Chat.ChatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom,Long> {
}
