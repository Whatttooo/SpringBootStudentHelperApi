package com.whateley.student;

import com.whateley.University.University;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;

    @ManyToOne
    private University uni;

    public Student(){}

    public Student(Long id, String firstName, String lastName, Long uniId) {
        this.studentId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uni = new University(uniId, "","","","");
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

}
