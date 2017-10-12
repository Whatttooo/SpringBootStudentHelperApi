package com.whateley.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> showAllStudents() {return studentService.getAllStudents();}

    @RequestMapping("/students/{id}")
    public Student showStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

}
