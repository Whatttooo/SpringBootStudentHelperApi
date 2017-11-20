package com.whateley.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/universities/{uniId}/students")
    public List<Student> showAllStudents(@PathVariable Long uniId) {return studentService.getAllStudents(uniId);}

    @RequestMapping("/universities/{uniId}/students/{studentId}")
    public Student showStudent(@PathVariable Long studentId){
        return studentService.getStudent(studentId);
    }

    @RequestMapping(value="/universities/{uniId}/students", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> addStudent(@RequestBody Student student, @PathVariable Long uniId){
        studentService.addStudent(student, uniId);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }

    @RequestMapping(value="/universities/{uniId}/students/{studentId}", method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> updateStudent(@RequestBody Student student , @PathVariable Long studentId){
        studentService.updateStudent(studentId, student);
        return new ResponseEntity<Student>(student,HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value="/universities/{uniId}/students/{studentId}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
