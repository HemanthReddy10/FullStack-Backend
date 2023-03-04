package com.hemanthcodes.studentsystem.controller;

import com.hemanthcodes.studentsystem.model.Student;
import com.hemanthcodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
//ResponseEntity represents the whole HTTP response: status code, headers, and body.
// As a result, we can use it to fully configure the HTTP response.
// If we want to use it, we have to return it from the endpoint;
// Spring takes care of the rest.
    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id){
        try {
            Student student=studentService.get(id);
            return new ResponseEntity<Student>(student,HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable Integer id){
        try {
            Student existingStudent=studentService.get(id);
            studentService.saveStudent(student);
            return new  ResponseEntity<Student>(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return  new ResponseEntity<Student>(HttpStatus.NOT_FOUND) ;
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        studentService.delete(id);
        return "Deleted Student with id"+id;
    }

}
