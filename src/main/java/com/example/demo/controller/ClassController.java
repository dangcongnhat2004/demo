package com.example.demo.controller;

import com.example.demo.entity.ClassStudent;
import com.example.demo.service.ClassStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/class")
public class ClassController {
    private final ClassStudentService classStudentService;

    @GetMapping("/{id}")
    public ClassStudent getClass(@PathVariable Long id){
        return classStudentService.getClass(id);
    }

    @GetMapping
    public List<ClassStudent> getClasses(){
        return classStudentService.getClasses();
    }

    @PostMapping
    public void createClass(@RequestBody ClassStudent classStudent){
        classStudentService.createClass(classStudent);
    }

    @PutMapping("/{id}")
    public void editClass(@PathVariable Long id, @RequestBody ClassStudent classStudent){
        classStudentService.editClass(id, classStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id){
        classStudentService.deleteClass(id);
    }
}
