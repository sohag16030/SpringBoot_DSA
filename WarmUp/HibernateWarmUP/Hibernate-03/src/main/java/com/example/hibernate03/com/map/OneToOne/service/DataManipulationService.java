//package com.example.hibernate03.com.map.OneToOne.service;
//import com.example.hibernate03.com.map.OneToOne.entities.Answer;
//import com.example.hibernate03.com.map.OneToOne.entities.Question;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class DataManipulationService {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory factory =cfg.buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Answer answer = new Answer(101,"Java is a programming Language");
//        Answer answer2 = new Answer(102,"Hibernate is a object relational mapping tool");
//
//        session.save(answer);
//        session.save(answer2);
//
//        Question question = new Question("What is java",answer);
//        Question question2 = new Question("What is Hibernate",answer2);
//
//        session.save(question);
//        session.save(question2);
//
//        transaction.commit();
//        session.close();
//        factory.close();
//    }
//}
