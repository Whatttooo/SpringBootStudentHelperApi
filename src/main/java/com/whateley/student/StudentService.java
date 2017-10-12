package com.whateley.student;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = Arrays.asList(
            new Student(1,"Josh", "Whateley"),
            new Student(2,"Harry","Whateley"),
            new Student(3,"Sam", "Rankin-Hastie")
    );

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudent(int id){
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
    }
}
