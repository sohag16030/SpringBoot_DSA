package com.example.hibernate03.service;

import com.example.hibernate03.entity.Certificate;
import com.example.hibernate03.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
    public static void main(String[] args) {
        Certificate certificate1 = new Certificate("Java","2.5 months");
        Certificate certificate2 = new Certificate("Hibernate","6.5 months");
        Student student1 = new Student("Carolina","Russia",certificate1);
        Student student2 = new Student("Mike","Australia",certificate2);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student1);
        session.save(student2);

        transaction.commit();
        session.close();
    }
}
