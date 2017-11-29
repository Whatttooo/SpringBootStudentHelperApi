package com.whateley.student;

import com.whateley.University.University;

public final class StudentBuilder {
    private Long studentId;
    private String firstName;
    private String lastName;
    private String favTech;
    private University uni;

    private StudentBuilder() {
    }

    public static StudentBuilder aStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder withStudentId(Long studentId) {
        this.studentId = studentId;
        return this;
    }

    public StudentBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder withFavTech(String favTech) {
        this.favTech = favTech;
        return this;
    }

    public StudentBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder withUni(University uni) {
        this.uni = uni;
        return this;
    }

    public Student build() {
        Student student = new Student();
        student.setStudentId(studentId);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setFavTech(favTech);
        student.setUni(uni);
        return student;
    }
}
