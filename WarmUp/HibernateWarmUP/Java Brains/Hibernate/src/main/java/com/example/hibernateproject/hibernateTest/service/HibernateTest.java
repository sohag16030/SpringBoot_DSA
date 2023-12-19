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

        //data save using hibernate API
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String userId = "5";//sql injection
        String name = "User : 9";

        Query query = session.getNamedQuery("userDetails.byId");
        query.setParameter("userId", Integer.parseInt(userId));

        List<UserDetails> result = query.list();

        for (UserDetails user : result) {
            System.out.println(user);
        }

        session.getTransaction().commit();
        session.close();
    }
}