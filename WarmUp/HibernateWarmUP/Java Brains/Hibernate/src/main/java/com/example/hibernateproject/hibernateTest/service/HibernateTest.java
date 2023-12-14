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
        UserDetails user = new UserDetails("Test"); //transient object // hibernate not looked at this object

        //data save using hibernate API
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.save(user); // persistent object // tracked by hibernate..........
        user.setUserName("Updated User");
        user.setUserName("Updated User 2");

        session.getTransaction().commit();
        session.close();//detached object // hibernate not tacked ..................
    }
}
