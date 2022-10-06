package com.example.demo.student;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
//    Select * from student where email = ?
    @Query(" select  s from Student s where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
