package com.example.jpamappingexample.repos;

import com.example.jpamappingexample.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
