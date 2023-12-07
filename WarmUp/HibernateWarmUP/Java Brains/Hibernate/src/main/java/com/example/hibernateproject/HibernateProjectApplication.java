package com.example.hibernateproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HibernateProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateProjectApplication.class, args);
    }

}