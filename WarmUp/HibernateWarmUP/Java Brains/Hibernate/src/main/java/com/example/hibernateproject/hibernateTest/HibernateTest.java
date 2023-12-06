package com.example.hibernateproject.hibernateTest;

import com.example.hibernateproject.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails(101,"Mike");

        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


    }
}
