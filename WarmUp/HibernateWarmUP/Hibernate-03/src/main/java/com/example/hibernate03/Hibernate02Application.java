package com.example.hibernate03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Hibernate02Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Hibernate02Application.class, args);
    }
}