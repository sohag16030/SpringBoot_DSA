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

        Query query = session.createQuery("select MAX(u.userId) from UserDetails u");

        Object result = query.uniqueResult();
        if (result != null) {
            Integer maxUserId = (Integer) result;
            System.out.println("Maximum userId: " + maxUserId);
        } else {
            System.out.println("No records in UserDetails");
        }

        session.getTransaction().commit();
        session.close();

    }
}