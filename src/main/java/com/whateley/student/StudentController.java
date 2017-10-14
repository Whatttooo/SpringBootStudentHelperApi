package com.whateley.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> showAllStudents() {return studentService.getAllStudents();}

    @RequestMapping("/students/{id}")
    public Student showStudent(@PathVariable String id){
        return studentService.getStudent(id);
    }

    @RequestMapping(value="/students", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return student;
    }

    @RequestMapping(value="/students/{id}", method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student updateStudent(@RequestBody Student student ,@PathVariable String id){
        studentService.updateStudent(id, student);
        return student;
    }

}
