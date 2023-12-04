//package com.example.hibernate03.com.map.OneToOne.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name="tbl_question")
//public class Question {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="question_id")
//    private int id;
//    private String question;
//    @OneToOne
//    private Answer answer;
//
//    public Question(String question, Answer answer) {
//        this.question = question;
//        this.answer = answer;
//    }
//}
