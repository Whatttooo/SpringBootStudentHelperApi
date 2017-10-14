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

    private List<Student> studentsList = new ArrayList<>(Arrays.asList(
            new Student("JosW001","Josh", "Whateley"),
            new Student("HarW002","Harry","Whateley"),
            new Student("SamR003","Sam", "Rankin-Hastie"),
            new Student("MaxT004","Max", "Tuzzolino"),
            new Student("AlaP005","Alan", "Pang"),
            new Student("MicE006","Michael", "Edkins")
    ));

    public List<Student> getAllStudents(){
        return studentsList;
    }

    public Student getStudent(String id){
        return studentsList.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }

    public void addStudent(@RequestBody Student student){
        studentsList.add(student);
    }

    public void updateStudent(String id, Student student){
        studentsList = studentsList
            .stream()
            .map(studentRef -> studentRef.getId().equals(id) ? student : studentRef)
            .collect(Collectors.toList());
    }

    public void deleteStudent(String id){
        studentsList.removeIf(student -> student.getId().equals(id));
    }

}
