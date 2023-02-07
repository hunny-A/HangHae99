package com.example.springwork.repository;

import com.example.springwork.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// public interface 이름 extends JpaRepository <엔티티 ID 유형>
public interface PostRepository extends JpaRepository<Post, Long> {

    //JPA는 메소드 이름만으로 쿼리를 생성할 수 있다.
    List<Post> findAllByOrderByModifiedAtDesc();


}
