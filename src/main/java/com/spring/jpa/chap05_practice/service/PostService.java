package com.spring.jpa.chap05_practice.service;

import com.spring.jpa.chap05_practice.repository.HashTagRepository;
import com.spring.jpa.chap05_practice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor //final변수로 선언된 애들 알아서 초기화해줌 (autowired 각각 쓰기 귀찮을때 final 붙이고 사용)
@Transactional //JPA 레파지토리는 트랜잭션 단위로 동작하기 때문에 꼭 작성해야한다.
public class PostService {

    //@Autowired각각 붙이기 귀찮으니까 final 붙이고 맨 위에 @RequiredArgsConstructor 사용
    private final PostRepository postRepository;
    private final HashTagRepository hashTagRepository;




}
