package com.whateley.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll()
        .forEach(students::add);
        return students;
    }

    public Student getStudent(String id){
        return studentRepository.findOne(id);
    }

    public void addStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    public void updateStudent(String id, Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(String id){
        studentRepository.delete(id);
    }

}
