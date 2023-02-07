package com.example.springwork.controller;

import com.example.springwork.Dto.PostRequestDto;
import com.example.springwork.Dto.PostResponseDto;
import com.example.springwork.entity.Post;
import com.example.springwork.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 메소드 사용
@RequiredArgsConstructor    // final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
@RestController     // Json 형태로 객체 데이터를 반환하는 것   // Ajax와 가장 많이 활용   // RestController는 'REST'를 위한 전용 컨트롤러
public class PostController {

    private final PostService postService;  //@RequiredArgsConstructor 어노테이션 덕분에 생성자를 따로 만들 필요가 없음

    /* 게시글 추가 */
    @PostMapping("/api/posts")
    public Post creatPost(@RequestBody PostRequestDto requestDto){
        return postService.createPost(requestDto);
    }

    /* 전체 게시글 조회 */
    @GetMapping("/api/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    /* 선택 게시글 조회*/
    @GetMapping("/api/posts/{id}")
    public Post findById(@PathVariable Long id){    //위의 {id} 부분 사용하기 위한 어노테이션(URL 변수)
        return postService.getPostfindById(id);
    }

    /* 선택 게시글 수정 */
    @PutMapping("/api/posts/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        return postService.update(id, requestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public PostRequestDto deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        return postService.delete(id,requestDto);
    }

}
