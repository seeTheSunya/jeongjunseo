package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import com.mysite.sbb.user.SiteUser;
import jakarta.persistence.ManyToMany;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mysite.sbb.question.QuestionService;

import java.util.Set;
import com.mysite.sbb.user.SiteUser;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate; // 수정 일시

    @ManyToOne
    private Question question;

    // ▼ 이 부분이 있어야 getAuthor()를 쓸 수 있습니다.
    @ManyToOne
    private SiteUser author;

    @ManyToMany
    Set<SiteUser> voter; // 추천인
}