package com.example.springwork.entity;

import com.example.springwork.Dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //등록할때마다 자동생성(1씩 올라가는 키), 고유 아이디
    private Long id;

    @Column(nullable = false)   // 안쓰면 빈값 들어감
    private String title;

    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String contents;


//    public Post(String title, String username, String password, String contents){
//        this.title = title;
//        this.username = username;
//        this.password = password;
//        this.contents = contents;
//    }

    public Post(PostRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.contents = requestDto.getContents();
    }

    public void update(PostRequestDto postRequestDto) {
        this.title = postRequestDto.getTitle();
        this.username = postRequestDto.getUsername();
        this.password = postRequestDto.getPassword();
        this.contents = postRequestDto.getContents();
    }

    public void update(String title, String username, String contents) {
        this.title = title;
        this.username = username;
        this.contents = contents;
    }
}
