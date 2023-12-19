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

        Query query = session.createQuery("select new map(userId,userName) from UserDetails");
//        query.setFirstResult(5);//starting the point nth point
//        query.setMaxResults(2); // maximum result for this query
        List<Map<String, Object>> userDetailsList = query.list();

        for (Map<String, Object> userDetailsMap : userDetailsList) {
            Integer userId = (Integer) userDetailsMap.get("0");
            String userName = (String) userDetailsMap.get("1");
            System.out.println(userId + " " + userName);
            // Process the userId and userName as needed
        }
        session.getTransaction().commit();
        session.close();
//        for (String username : usersname)
//            System.out.println(username);
    }
}