package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.*;
import org.apache.catalina.User;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

        String minUserId = "5";//sql injection
        String name = "User : 9";

        Query query = session.createQuery("from UserDetails where userId > :minUserId and userName = :name");
        query.setParameter("minUserId", Integer.parseInt(minUserId));
        query.setParameter("name", name);
        List<UserDetails> result = query.list();

        for (UserDetails user : result) {
            System.out.println(user);
        }

        session.getTransaction().commit();
        session.close();
    }
}