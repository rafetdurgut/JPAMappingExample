package com.example.jpamappingexample.utils;


import com.example.jpamappingexample.models.Address;
import com.example.jpamappingexample.models.Answer;
import com.example.jpamappingexample.models.Question;
import com.example.jpamappingexample.models.User;
import com.example.jpamappingexample.services.AddressService;
import com.example.jpamappingexample.services.AnswerService;
import com.example.jpamappingexample.services.QuestionService;
import com.example.jpamappingexample.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class StartApp {

    @Bean
    CommandLineRunner FirstRun(UserService userService, QuestionService questionService, AnswerService answerService, AddressService addressService)
    {
        return  args ->
        {
//            Address address = addressService.addAddress(new Address("Test Address","123456"));
//            User u1 = new User("Rafet Durgut", "rdurgut@bandirma.edu.tr", address);
//            User u2 = new User("Ahmet Yaşar", "rdurgut@bandirma.edu.tr",address);
//            User u3 = new User("Yüksel Alçak", "rdurgut@bandirma.edu.tr",address);
//
//            userService.AddUser(u1);
//            userService.AddUser(u2);
//            userService.AddUser(u3);
//
//            Question q1 = new Question("Test Question 1", "lorem ipsum dolor sit amet.",u1);
//            Question q2 = new Question("Test Question 2", "lorem ipsum dolor sit amet.",u1);
//
//            questionService.AddQuestion(q1);
//            questionService.AddQuestion(q2);
//
//            Answer a = new Answer("Test Answer", q1);
//            answerService.AddAnswer(a);
//
//
//            //userService.DeleteUser(u1);
//
//
//
//            //userService.addQuestion(u1.getId(), q1.getId());
//            //userService.addQuestion(u1.getId(), q2.getId());
//
//            //
//
//
//            for(int i =0;i<100;i++)
//            {
//                User u = new User("Rafet Durgut " + i, "rdurgut@bandirma.edu.tr",null);
//                userService.AddUser(u);
//            }



        };
    }
}
