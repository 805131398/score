package com.yuezhix.score.service;


import com.yuezhix.score.entity.Student;
import com.yuezhix.score.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudentById(Integer id){
        return Optional.ofNullable(studentMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
