package com.example.jpamappingexample.Controllers;

import com.example.jpamappingexample.models.Answer;
import com.example.jpamappingexample.models.Question;
import com.example.jpamappingexample.repos.QuestionRepository;
import com.example.jpamappingexample.services.AnswerService;
import com.example.jpamappingexample.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    public QuestionController(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }


    @GetMapping("")
    public List<Question> getAllQuestions()
    {
        return questionService.GetAllQuestions();
    }
    @PostMapping("{id}/answers")
    public Answer addAnswertoQuestion(@PathVariable Long id, @RequestBody Answer answer)
    {
        answer.setQuestion(questionService.GetQuestionByID(id));
        answerService.AddAnswer(answer);
        return answer;
    }



}
