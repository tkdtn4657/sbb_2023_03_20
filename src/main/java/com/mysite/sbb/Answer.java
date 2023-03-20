package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id; // int id

    @Column(columnDefinition = "TEXT") // text
    private String content;

    private LocalDateTime createDate; // datetime

    private Integer questionId;

}
