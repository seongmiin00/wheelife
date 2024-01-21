package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class CommunityDetailDto {
    private int postNum;
    private String title;
    private String contents;
    private String image;
    private String writer;
    private int recommend;
    private int hits;
    private String writeDate;
}
