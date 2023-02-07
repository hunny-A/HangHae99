package com.example.springwork.service;


import com.example.springwork.Dto.PostRequestDto;
import com.example.springwork.entity.Post;
import com.example.springwork.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Post createPost(PostRequestDto requestDto){
        Post post = new Post(requestDto);   // Post PostrequestDto 생성자 안 만들어줌
        postRepository.save(post);  // save PostRepository Entity와 연결문제
        return post;
    }

    @Transactional(readOnly = true)
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
        //가장 최근에 등록된 순으로
    }

    public Long update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        post.update(requestDto.getTitle(), requestDto.getUsername(), requestDto.getContents());
        return id;
    }


    public PostRequestDto findById(Long id){
        Post post = postRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("해당 게시글이 없습니다. id ="+id)
        );
        return new PostRequestDto(post)
    }

}
