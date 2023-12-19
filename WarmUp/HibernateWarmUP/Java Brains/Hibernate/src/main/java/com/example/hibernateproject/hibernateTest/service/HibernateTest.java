package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.*;
import org.apache.catalina.User;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
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
//        for(int i=1;i<=10;i++)
//        {
//            UserDetails user = new UserDetails("User : "+ i);
//            session.save(user);
//        }
        String userName = "User : 9";

        Query query = session.getNamedNativeQuery("userDetails.byName");
        query.setParameter("userName", userName);
        ((NativeQuery<?>) query).addEntity(UserDetails.class);

        UserDetails result = (UserDetails) query.uniqueResult();

        System.out.println(result);


        session.getTransaction().commit();
        session.close();
    }
}