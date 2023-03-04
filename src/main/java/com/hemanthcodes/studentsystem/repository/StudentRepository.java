package com.hemanthcodes.studentsystem.repository;

import com.hemanthcodes.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//used to indicate that the class provides the mechanism for storage, retrieval,
// search, update and delete operation on objects.
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
// Connecting springboot with mysql database

}
