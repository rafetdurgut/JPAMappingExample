package com.example.jpamappingexample.Controllers;

import com.example.jpamappingexample.models.Question;
import com.example.jpamappingexample.models.User;
import com.example.jpamappingexample.repos.UserRepository;
import com.example.jpamappingexample.services.QuestionService;
import com.example.jpamappingexample.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final QuestionService questionService;

    @PostMapping()
    public User addUser(@RequestBody User user)
    {
        return userService.AddUser(user);
    }

    @PostMapping("{id}/questions")
    public Question AddQuestion(@PathVariable Long id, @RequestBody Question question)
    {
        question.setUser(userService.GetUser(id));
       return questionService.addQuestion(question);
    }

    @GetMapping("{id}/questions")
    public List<Question> GetQuestions(@PathVariable Long id)
    {
        return userService.GetUser(id).questionList;
    }
    @GetMapping()
    public CollectionModel<User> GetAllUsers()
    {
        List<User> userList = userService.GetAllUsers();
        for (User user : userList) {
            Long userID = user.getId();
            Link selfLink = linkTo(UserController.class).slash(userID).withSelfRel();
            user.add(selfLink);

            Link questionLink = linkTo(methodOn(UserController.class).GetQuestions(userID)).withRel("questions");
            user.add(questionLink);

        }
        Link link = linkTo(UserController.class).withSelfRel();
        CollectionModel<User> result = CollectionModel.of(userList, link);
        return result;
    }



}
