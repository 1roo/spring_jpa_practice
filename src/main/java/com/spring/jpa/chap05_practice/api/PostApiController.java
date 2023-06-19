package com.spring.jpa.chap05_practice.api;

import com.spring.jpa.chap05_practice.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //리액트 사용시는 restcontroller 선언
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostApiController {

    // 리소스: 게시물 (Post)
    /*
        게시물 목록 조회: /posts         -GET방식(조회)
        게시물 개별 조회: /posts/{id}    -GET
        게시물 등록:     /posts         -POST(등록요청)
        게시물 수정:     /posts/{id}    -PATCH(수정) -> PUT으로도 가능
        게시물 삭제:     /posts/{id}    -DELETE
     */


    private final PostService postService;




}
