package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class joinPostSummaryDto {
    private int postNum;//글번호
    private String postTitle;//글 제목
    private String startPoint;//출발지
    private String endPoint;//목적지
    private String state;//모집상태
    private int gatheredPeople;//모집 인원
    private int recruitedPeople;//모인 인원
    private String thumbNail;//썸네일 이미지
}
