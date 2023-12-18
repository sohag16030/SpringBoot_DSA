package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.*;
import org.apache.catalina.User;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


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
//        for(int i=1;i<=10;i++)
//        {
//            UserDetails user = new UserDetails("User : "+ i);
//            session.save(user);
//        }

        Query query = session.createQuery("from UserDetails");
        List<UserDetails> users = query.list();
        session.getTransaction().commit();
        session.close();
        for (UserDetails user : users)
            System.out.println(user);
    }
}