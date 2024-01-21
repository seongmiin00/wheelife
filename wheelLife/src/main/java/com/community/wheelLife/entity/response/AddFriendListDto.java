package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class AddFriendListDto {
    private int listNum;
    private String senderId;
    private String receiverId;
}
