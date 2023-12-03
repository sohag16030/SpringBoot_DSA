package com.example.hibernateproject1;

import com.example.hibernateproject1.entities.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(HibernateProject1Application.class, args);
    }

}
