package com.community.wheelLife.entity.request;

import lombok.Setter;

@Setter
public class MemberJoinDto {
    private String userId;
    private String password;
    private String userName;
    private String nickName;
    private String aboutMe;
    private String joinDate;
}
