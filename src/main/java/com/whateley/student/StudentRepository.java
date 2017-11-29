package com.whateley.student;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>{

    public List<Student> findByUniUniId(Long uniId);

}
