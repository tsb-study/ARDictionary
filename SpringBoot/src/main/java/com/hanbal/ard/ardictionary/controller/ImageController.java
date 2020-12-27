package com.hanbal.ard.ardictionary.controller;

import com.hanbal.ard.ardictionary.service.ImageService;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ImageController {
  private final ImageService imageService;

  // 이미지를 전송받으면
  // 사물을 분석해서
  // 어디에 어떤어떤 사물이 있다 단어와 함께 반환한다.

  // 사물을 클릭하면
  // 해당 단어와 자주 사용되는 문장들을 표시한다.

  // 사진 목록 조회
  
  // 사진 하나 조회

  // 사진 삭제

  // 사진 저장
  
}
