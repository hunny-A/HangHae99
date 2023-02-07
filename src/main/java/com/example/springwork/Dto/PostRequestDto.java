package com.example.springwork.Dto;

import com.example.springwork.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequestDto {

    private Long id;
    private String title;
    private String username;
    private String contents;

    private String password;
    private String date;

//    public PostRequestDto(Post post) {
//        this.id = post.getId();
//        this.title = post.getTitle();
//        this.username = post.getUsername();
//        this.contents = post.getContents();
//        this.password = post.getPassword();
//    }

}
