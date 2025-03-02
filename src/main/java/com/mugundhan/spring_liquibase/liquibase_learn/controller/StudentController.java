package com.mugundhan.spring_liquibase.liquibase_learn.controller;

import com.mugundhan.spring_liquibase.liquibase_learn.model.Student;
import com.mugundhan.spring_liquibase.liquibase_learn.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repository.findAll();
    }
}
