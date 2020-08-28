package com.yuezhix.score.controller;

import com.yuezhix.score.entity.Student;
import com.yuezhix.score.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id") Integer id){
        return Optional.ofNullable(studentService.getStudentById(id)).map(Student::toString).orElse("empty String") ;
    }
}
