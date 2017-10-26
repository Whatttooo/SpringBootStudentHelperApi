package com.whateley.student;

import com.whateley.University.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/universities/{uniId}/students")
    public List<Student> showAllStudents() {return studentService.getAllStudents();}

    @RequestMapping("/universities/{uniId}/students/{studentId}")
    public Student showStudent(@PathVariable Long studentId){
        return studentService.getStudent(studentId);
    }

    @RequestMapping(value="/universities/{uniId}/students", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody Student student, @PathVariable Long uniId){
        student.setUni(new University(uniId, "","","",""));
        studentService.addStudent(student);
        return student;
    }

    @RequestMapping(value="/universities/{uniId}/students/{studentId}", method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student updateStudent(@RequestBody Student student ,@PathVariable Long studentId){
        studentService.updateStudent(studentId, student);
        return student;
    }

    @RequestMapping(value="/universities/{uniId}/students/{studentId}", method=RequestMethod.DELETE)
    public String deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
        return "Success";
    }

}
