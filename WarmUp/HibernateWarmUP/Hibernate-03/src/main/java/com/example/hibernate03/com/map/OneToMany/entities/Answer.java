package com.example.hibernate03.com.map.OneToMany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_answer")
public class Answer {
    @Id
    @Column(name="answer_id")
    private int id;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
