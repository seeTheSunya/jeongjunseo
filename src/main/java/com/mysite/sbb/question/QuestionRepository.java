package com.mysite.sbb.question;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // 제목으로 조회
    Question findBySubject(String subject);

    // 제목과 내용으로 조회
    Question findBySubjectAndContent(String subject, String content);

    // 제목에 특정 문자열이 포함된 데이터 조회 (Like 검색)
    List<Question> findBySubjectLike(String subject);
}