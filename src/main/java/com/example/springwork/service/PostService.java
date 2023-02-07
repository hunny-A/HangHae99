package com.example.springwork.service;


import com.example.springwork.Dto.PostRequestDto;
import com.example.springwork.Dto.PostResponseDto;
import com.example.springwork.entity.Post;
import com.example.springwork.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



// 메소드 구현
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    public Thread checkPassword;

    /* 선택 게시글 추가 */
    @Transactional
    public Post createPost(PostRequestDto requestDto){
        Post post = new Post(requestDto);   // Post PostrequestDto 생성자 안 만들어줌
        postRepository.save(post);  // save PostRepository Entity와 연결문제
        return post;
    }

    /* 전체 게시글 조회 */
    @Transactional(readOnly = true)
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc(); //가장 최근에 등록된 순으로
    }

    /* 선택 게시글 조회 */
    @Transactional(readOnly = true)
    public Post getPostfindById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        return post;
    }

    /* 선택 게시글 수정 */
    @Transactional
    public PostResponseDto update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if(requestDto.getPassword().equals(post.getPassword())) {
            post.update(requestDto);
        }
        return new PostResponseDto(post);
    }

    /* 선택 게시글 삭제 */
    @Transactional
    public PostRequestDto delete(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if(requestDto.getPassword().equals(post.getPassword())) {
            postRepository.delete(post);
        }
        return requestDto;
    }
}
