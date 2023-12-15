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
        //UserDetails user = new UserDetails("User 1"); //transient object // hibernate not looked at this object

        //data save using hibernate API
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //session.save(user);

        UserDetails user = session.get(UserDetails.class, 1);
        session.getTransaction().commit();
        session.close();

        user.setUserName("username changed");
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(user);

        session.getTransaction().commit();
        session.close();
    }
}
