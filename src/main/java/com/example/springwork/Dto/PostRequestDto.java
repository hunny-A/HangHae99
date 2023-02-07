package com.example.springwork.Dto;

import com.example.springwork.entity.Post;
import lombok.Getter;

@Getter
public class PostRequestDto {

    private String title;
    private String username;
    private String contents;

    private String password;
    private String date;

    public PostRequestDto(Post post) {
    }
}
