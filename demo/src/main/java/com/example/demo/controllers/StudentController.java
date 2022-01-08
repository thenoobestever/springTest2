package com.example.demo.controllers;

import com.example.demo.Models.Student;
import com.example.demo.Raghad;
import com.example.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    Raghad raghad;

    // https requests get/post/update/delete
    @GetMapping
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.get();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        Student addedStudent = studentRepository.save(student);
        return addedStudent;
    }


}
