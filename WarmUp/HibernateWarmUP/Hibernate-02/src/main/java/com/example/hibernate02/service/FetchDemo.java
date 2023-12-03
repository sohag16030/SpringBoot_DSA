package com.example.hibernate02.service;

import com.example.hibernate02.entity.Address;
import com.example.hibernate02.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        //get,load
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory =cfg.buildSessionFactory();
        Session session = factory.openSession();
        Student student = session.get(Student.class,1);
        System.out.println(student);
        Address address = session.load(Address.class,1);
        System.out.println(address);
        session.close();
        factory.close();

    }
}
