package com.community.wheelLife.entity.request;

import lombok.Setter;

@Setter
public class JoinPostWriteDto {
    private String postTitle;//글 제목
    private String contents;//내용
    private String startPoint;//출발지
    private String endPoint;//목적지
    private String writer;//작성자
    private String deadLine;//마감일자
    private int gatheredPeople;//모집 인원
    private String thumbNail;//썸네일 이미지
    private String detailImage;//상세설명 이미지
}
