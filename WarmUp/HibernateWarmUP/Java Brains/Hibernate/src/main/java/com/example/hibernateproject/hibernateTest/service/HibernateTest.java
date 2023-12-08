package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.Address;
import com.example.hibernateproject.hibernateTest.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {

        Address homeAddress = new Address( "Main Street","Cityville","Stateville-02","12345");
        Address officeAddress = new Address( "Street Florida","CityTowm","SilliconVali","598787");
        UserDetails userDetails = new UserDetails("Mike",new Date(),"Australia",homeAddress,officeAddress);
        UserDetails userDetails2 = new UserDetails("John",new Date(),"Finland",homeAddress,officeAddress);
        UserDetails userDetails3 = new UserDetails("Fedrik",new Date(),"Netherland",homeAddress,officeAddress);

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
