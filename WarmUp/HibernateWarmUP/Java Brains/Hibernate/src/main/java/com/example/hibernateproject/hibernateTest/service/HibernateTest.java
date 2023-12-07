package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails(101,"Mike",new Date(),"Australia","student visa");
        UserDetails userDetails2 = new UserDetails(102,"John",new Date(),"Finland","worker visa");

        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.save(userDetails);
        session.save(userDetails2);

        session.getTransaction().commit();
        session.close();

        userDetails = null;
        Session session2 = factory.openSession();
        session2.beginTransaction();
        userDetails =  session2.get(UserDetails.class,101);
        System.out.println(userDetails);
    }
}
