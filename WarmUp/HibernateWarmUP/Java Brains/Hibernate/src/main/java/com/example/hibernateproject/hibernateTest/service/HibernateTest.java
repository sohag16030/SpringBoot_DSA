package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.Address;
import com.example.hibernateproject.hibernateTest.dto.UserDetails;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class HibernateTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
//        UserDetails userDetails = new UserDetails("Mike");
//        UserDetails userDetails2 = new UserDetails("John");
//        UserDetails userDetails3 = new UserDetails("Fedrik");
//
//        Address homeAddress = new Address("Main Street", "Cityville", "Stateville-02", "12345");
//        Address homeAddress2 = new Address("Main Street1", "Cityville11", "Stateville-0211", "1234511");
//
//        userDetails.getListOfAddress().add(homeAddress);
//        userDetails.getListOfAddress().add(homeAddress2);
//
//        userDetails2.getListOfAddress().add(homeAddress);
//
//        userDetails3.getListOfAddress().add(homeAddress2);
//
//        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

//        session.save(userDetails);
//        session.save(userDetails2);
//        session.save(userDetails3);
//        session.getTransaction().commit();

        //data save using hibernate API

        UserDetails user = null;
        session = factory.openSession();
        session.beginTransaction();
        user = session.get(UserDetails.class, 1);
        System.out.println(user);
        session.close();
        System.out.println(user.getListOfAddress());
        session.close();
    }
}
