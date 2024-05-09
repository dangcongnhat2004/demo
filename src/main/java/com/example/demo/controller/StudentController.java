package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/student")
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }
    @PutMapping("/{id}")
    public void editStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.editStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
