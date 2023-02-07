package com.example.springwork.entity;

import com.example.springwork.Dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;



// 도메인 객체 생성
@Getter // 코드를 작성하지 않아도 get, set 함수 사용 가능 (Lombok 어노테이션)   뫄뫄라는 필드에 선언하면 자동으로 겟뫄뫄()라는 메소드를 생성해준다.
@Entity //테이블임을 나타낸다.
@NoArgsConstructor  // 매개변수가 없는 생성자 코드 삭제
public class Post extends Timestamped {
    @Id // Id값, PK로 사용하겠다는 뜻.
    @GeneratedValue(strategy = GenerationType.AUTO) //등록할때마다 자동생성(1씩 올라가는 키), 고유 아이디
    private Long id;

    @Column(nullable = false)   // 안쓰면 빈값 들어감, 반드시 값이 존재해야 함을 뜻함
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

    public Post(PostRequestDto requestDto){ // 생성자 오버로딩
        this.id = requestDto.getId();
        this.title = requestDto.getTitle(); //getTitle : @Getter로 만들어진 메소드
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


}
