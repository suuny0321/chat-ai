package com.ll.member.global.redata;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;
@Getter
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class RsData {
    private String resultCode;
    private String msg;
}
