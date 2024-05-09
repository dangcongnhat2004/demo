package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Class_Student")
public class ClassStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String siso;

    private String khoa;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;

    // Constructor
    public ClassStudent() {
    }

    public ClassStudent(String name, String siso, String khoa, Student student) {
        this.name = name;
        this.siso = siso;
        this.khoa = khoa;
        this.student = student;
    }

    // Getter và Setter cho trường id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter và Setter cho trường name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho trường siso
    public String getSiso() {
        return siso;
    }

    public void setSiso(String siso) {
        this.siso = siso;
    }

    // Getter và Setter cho trường khoa
    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    // Getter và Setter cho trường student
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
