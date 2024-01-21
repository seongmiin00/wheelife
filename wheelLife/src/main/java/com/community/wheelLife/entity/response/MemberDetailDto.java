package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class MemberDetailDto {
    private int userNum; //회원번호
    private String userName; //유저 이름
    private String nickName; //닉네임
    private String aboutMe; //한줄 소개
}
