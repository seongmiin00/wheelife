package com.community.wheelLife.entity.response;

import lombok.Getter;

@Getter
public class joinPostDetailDto {
    private int postNum;//글번호
    private String postTitle;//글 제목
    private String contents;//내용
    private String startPoint;//출발지
    private String endPoint;//목적지
    private String writer;//작성자
    private String deadLine;//마감일자
    private String state;//모집상태
    private int gatheredPeople;//모집 인원
    private int recruitedPeople;//모인 인원
    private String detailImage;//상세설명 이미지
    private String writeDate;//작성 일자
}
