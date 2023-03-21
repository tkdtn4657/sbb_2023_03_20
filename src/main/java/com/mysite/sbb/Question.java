package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id; // int id

    @Column(length = 200) // varchar(200)
    private String subject;

    @Column(columnDefinition = "TEXT") // text
    private String content;

    private LocalDateTime createDate; // datetime

    // OneToMany 자바세상에서의 편의를 위해서 필드 생성
    // 이 녀석은 실제 DB 테이블에 칼럼이 생성되지 않는다.
    // 만들어도 되고 안 만들어도 된다.
    // 다만 만들면 해당 객체(질문객체)에서 관련된 답변들을 찾을 때 편하다.
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
