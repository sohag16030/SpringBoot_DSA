package com.example.hibernate03.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private Certificate certificate;

    public Student(String name, String city, Certificate certificate) {
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }
}
