package com.example.hibernate03.com.map.ManyToMany.Service;

import com.example.hibernate03.com.map.ManyToMany.Entity.Employee;
import com.example.hibernate03.com.map.ManyToMany.Entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DataManipulationService {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Employee employee1 = new Employee(101,"Mike");
        Employee employee2 = new Employee(102,"John");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        Project project1 = new Project(1001,"Library Management System");
        Project project2 = new Project(1002,"ChatBot");

        List<Project> projectList = new ArrayList<>();
        projectList.add(project1);
        projectList.add(project2);

        employee1.setProjectList(projectList);
        employee2.setProjectList(projectList);

        project1.setEmployeeList(employeeList);
        project2.setEmployeeList(employeeList);

        Transaction transaction = session.beginTransaction();

        session.save(employee1);
        session.save(employee2);
        session.save(project1);
        session.save(project2);


        transaction.commit();
        session.close();
        factory.close();
    }
}
