package com.example.jpamappingexample.services;

import com.example.jpamappingexample.models.Question;
import com.example.jpamappingexample.repos.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    public Question AddQuestion(Question q1) {
        return questionRepository.save(q1);
    }

    public Question addQuestion(Question question) {
        return  questionRepository.save(question);
    }

    public List<Question> GetAllQuestions() {
        return questionRepository.findAll();
    }
    public List<Question> GetQuestionByUserID(Long id) {
        return questionRepository.findByUserId(id);
    }

    public Question GetQuestionByID(Long id) {
        return questionRepository.findById(id).get();
    }
}
