package com.example.springwork.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // 객체의 입장에서 공통 매핑 정보가 필요할 때
@EntityListeners(AuditingEntityListener.class)  // JPA Entity에 이벤트가 발생할 때 콜백을 처리하고 코드를 실행하는 방법
public class Timestamped {

    @CreatedDate
    protected LocalDateTime createdAt;

    @LastModifiedDate
    protected LocalDateTime modifiedAt;

}
