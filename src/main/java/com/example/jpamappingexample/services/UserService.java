package com.example.jpamappingexample.services;

import com.example.jpamappingexample.models.User;
import com.example.jpamappingexample.repos.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User AddUser(User user) {
        this.userRepository.save(user);
        return user;
    }

    public User GetUser(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> GetAllUsers() {
        return userRepository.findAll();
    }
}
