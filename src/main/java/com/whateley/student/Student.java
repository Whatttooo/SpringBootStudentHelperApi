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
    private University uniId;

    public Student(){}

    public Student(String id, String firstName, String lastName, String uniId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniId = new University(uniId, "","","","");
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

    public University getUniId() {
        return uniId;
    }

    public void setUniId(University uniId) {
        this.uniId = uniId;
    }

}
