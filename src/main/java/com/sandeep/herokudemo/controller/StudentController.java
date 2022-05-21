package com.sandeep.herokudemo.controller;

import com.sandeep.herokudemo.model.Student;
import com.sandeep.herokudemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "sandeep says hi";
    }
    @GetMapping(value = "/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable(name = "id") int id){
        return ResponseEntity.ok(studentService.getStudent(id));
    }
    @PostMapping(value = "/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student s){
        Student saved = studentService.addStudent(s);
        return new ResponseEntity<Student>(saved, HttpStatus.CREATED);
    }
//    @GetMapping(value = "/student")
//    public ResponseEntity<Student> getAllStudent(){
//        return new ResponseEntity<Student>((Student) studentService.getAllStudent(), HttpStatus.OK);
//    }
}
