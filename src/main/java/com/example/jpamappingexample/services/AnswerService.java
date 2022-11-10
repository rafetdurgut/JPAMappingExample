package com.example.jpamappingexample.services;

import com.example.jpamappingexample.models.Answer;
import com.example.jpamappingexample.repos.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public Answer AddAnswer(Answer answer)
    {
       return answerRepository.save(answer);
    }
}
