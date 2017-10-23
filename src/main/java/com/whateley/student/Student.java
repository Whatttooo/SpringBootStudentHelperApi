package com.whateley.student;

import com.whateley.University.University;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    @ManyToOne
    private University uni;

    public Student(){}

    public Student(String id, String firstName, String lastName, String uniId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uni = new University(uniId, "","","","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
