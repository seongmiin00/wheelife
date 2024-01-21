package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class NoticeDetailDto {
    private int postNum;
    private String title;
    private String contents;
    private String image;
    private int hits;
}
