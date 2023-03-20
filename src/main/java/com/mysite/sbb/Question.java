package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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

}
