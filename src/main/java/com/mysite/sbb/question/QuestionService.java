package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.ArrayList; // 추가
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page; // 추가
import org.springframework.data.domain.PageRequest; // 추가
import org.springframework.data.domain.Pageable; // 추가
import org.springframework.data.domain.Sort; // 추가
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    // 수정: 페이징 기능과 정렬 기능(최신순) 추가
    public Page<Question> getList(int page) {
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate")); // 작성일시 역순으로 정렬
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts)); // 페이지 번호, 개수(10), 정렬 기준 설정
        return this.questionRepository.findAll(pageable);
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }

    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }
}