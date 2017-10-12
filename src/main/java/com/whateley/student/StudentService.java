package com.whateley.student;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private HashMap<Long, Student> studentHashMap;

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Josh", "Whateley"),
            new Student(2,"Harry","Whateley"),
            new Student(3,"Sam", "Rankin-Hastie"),
            new Student(4,"Max", "Tuzzolino"),
            new Student(5,"Alan", "Pang"),
            new Student(6,"Michael", "Edkins")
    ));

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudent(int id){
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
    }

    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

    public void updateStudent(int id, Student student){
        students = students
            .stream()
            .map(studentRef -> studentRef.getId() == id ? student : studentRef)
            .collect(Collectors.toList());

    }

}
