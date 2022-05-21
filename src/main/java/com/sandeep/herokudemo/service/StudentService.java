package com.sandeep.herokudemo.service;

import com.sandeep.herokudemo.model.Student;
import com.sandeep.herokudemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(int id){
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
