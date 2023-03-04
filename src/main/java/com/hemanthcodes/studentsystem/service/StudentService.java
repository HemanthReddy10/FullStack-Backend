package com.hemanthcodes.studentsystem.service;

import com.hemanthcodes.studentsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student get(Integer id);
    public void delete(Integer id);

}
