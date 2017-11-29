package com.whateley.student;


import com.whateley.University.University;
import com.whateley.University.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    private UniversityService universityService;


    public List<Student> getAllStudents(Long uniId){
        List<Student> students = new ArrayList<>();
        studentRepository.findByUniUniId(uniId)
        .forEach(students::add);
        return students;
    }

    public Student getStudent(Long id){
        return studentRepository.findOne(id);
    }

    public void addStudent(Student studentData, Long uniId){
        University uni = universityService.getUniversityById(uniId);
        Student student = StudentBuilder
                .aStudent()
                .withStudentId(studentData.getStudentId())
                .withFirstName(studentData.getFirstName())
                .withLastName(studentData.getLastName())
                .withFavTech(studentData.getFavTech())
                .withUni(uni)
                .build();
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.delete(id);
    }

}
