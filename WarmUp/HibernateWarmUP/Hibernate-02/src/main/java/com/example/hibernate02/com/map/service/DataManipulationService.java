package com.example.hibernate02.com.map.service;
import com.example.hibernate02.com.map.entity.Answer;
import com.example.hibernate02.com.map.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataManipulationService {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory =cfg.buildSessionFactory();
        Session session = factory.openSession();
        Answer answer = new Answer("Java is a programming Language");
        Answer answer2 = new Answer("Hibernate is a object relational mapping tool");

        Question question = new Question("What is java",answer);
        Question question2 = new Question("What is Hibernate",answer2);
        Transaction transaction = session.beginTransaction();

        session.save(question);
        session.save(question2);

        transaction.commit();
        session.close();
        factory.close();
    }
}
