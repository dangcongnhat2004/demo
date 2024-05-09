package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
   private final StudentRepository studentRepository;
   public Student getStudent(Long studentId){
       return studentRepository.findById(studentId).orElse(null);
   }
   public List<Student> getStudents(){
       return studentRepository.findAll();
   }

   public void createStudent(Student student){
       studentRepository.save(student);
   }

    public void editStudent(Long studentId, Student updatedStudent){
        Student existingStudent = studentRepository.findById(studentId).orElse(null);
        if(existingStudent != null){
            existingStudent.setName(updatedStudent.getName());
            // Cập nhật các trường thông tin khác tương ứng
            studentRepository.save(existingStudent);
        }
    }


    public void deleteStudent(Long studentId){
       studentRepository.deleteById(studentId);
    }

}
