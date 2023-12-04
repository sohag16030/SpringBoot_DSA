package com.example.hibernate03.com.map.OneToMany.service;
import com.example.hibernate03.com.map.OneToMany.entities.Answer;
import com.example.hibernate03.com.map.OneToMany.entities.Question;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DataManipulationService {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question = new Question("What is Java");
        Question question1 = new Question("What is Hibernate");

        Answer answer1 = new Answer(101, "Java is a programming Language", question);
        Answer answer2 = new Answer(102, "Java is an enrich object-oriented programming language", question);
        Answer answer3 = new Answer(103, "Java is a high-level programming language", question);

        List<Answer> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);

        Answer ans1 = new Answer(104, "Hibernate is an object-relational mapping tool", question1);
        Answer ans2 = new Answer(105, "Hibernate is called as ORM", question1);

        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(ans1);
        answerList1.add(ans2);

        session.save(question);
        session.save(question1);

        for (Answer answer : answerList) {
            session.save(answer);
        }

        for (Answer answer : answerList1) {
            session.save(answer);
        }

        transaction.commit();
        session.close();
        factory.close();
    }
}
