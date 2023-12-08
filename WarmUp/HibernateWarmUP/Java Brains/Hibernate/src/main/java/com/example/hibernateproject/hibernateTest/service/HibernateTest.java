package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.Address;
import com.example.hibernateproject.hibernateTest.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {

        Address address = new Address( "123 Main Street","Cityville","Stateville","12345");
        UserDetails userDetails = new UserDetails("Mike",new Date(),"Australia",address);
        UserDetails userDetails2 = new UserDetails("John",new Date(),"Finland",address);
        UserDetails userDetails3 = new UserDetails("Fedrik",new Date(),"Netherland",address);

        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.save(userDetails);
        session.save(userDetails2);
        session.save(userDetails3);

        session.getTransaction().commit();
        session.close();

        userDetails = null;
        Session session2 = factory.openSession();
        session2.beginTransaction();
        userDetails =  session2.get(UserDetails.class,1);
        System.out.println(userDetails);
    }
}
