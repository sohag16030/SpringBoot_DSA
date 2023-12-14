package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.*;
import org.apache.catalina.User;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {


        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
//        for (int i = 0; i < 10; i++) {
//            UserDetails user = new UserDetails("User " + i);
//            session.save(user);
//        }

        UserDetails user =  session.get(UserDetails.class,5);
        user.setUserName("Updated User 5");
        session.update(user);
        //session.delete(user);
        System.out.println(user);
        session.getTransaction().commit();
        session.close();
        //System.out.println(user);
    }
}
