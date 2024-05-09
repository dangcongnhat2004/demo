package com.example.demo.service;

import com.example.demo.entity.ClassStudent;
import com.example.demo.repository.ClassStudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClassStudentService {
    private final ClassStudentRepository classStudentRepository;

    public ClassStudent getClass(Long classId){
        return classStudentRepository.findById(classId).orElse(null);
    }

    public List<ClassStudent> getClasses(){
        return classStudentRepository.findAll();
    }

    public void createClass(ClassStudent classStudent){
        classStudentRepository.save(classStudent);
    }

    public void editClass(Long classId, ClassStudent updatedClass){
        ClassStudent existingClass = classStudentRepository.findById(classId).orElse(null);
        if(existingClass != null){
            existingClass.setName(updatedClass.getName());
            existingClass.setSiso(updatedClass.getSiso());
            existingClass.setKhoa(updatedClass.getKhoa());
            // Cập nhật các trường thông tin khác tương ứng
            classStudentRepository.save(existingClass);
        }
    }

    public void deleteClass(Long classId){
        classStudentRepository.deleteById(classId);
    }
}
