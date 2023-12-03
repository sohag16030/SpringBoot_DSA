package com.example.hibernate02;

import com.example.hibernate02.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Hibernate02Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate02Application.class, args);

//        Configuration cfg  = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
//        //creating student
//        Student st = new Student(1,"JOHN","DELHI");
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.save(st);
//        transaction.commit();
//        session.close();
//        System.out.println(st);
    }

}
