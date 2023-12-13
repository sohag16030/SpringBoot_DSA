package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.Address;
import com.example.hibernateproject.hibernateTest.dto.UserDetails;
import com.example.hibernateproject.hibernateTest.dto.Vehicle;
import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        UserDetails user = new UserDetails("Mike");
        UserDetails user2 = new UserDetails("John");
        Vehicle vehicle = new Vehicle("Car");
        Vehicle vehicle2 = new Vehicle("Bike");

        user.getVehiclesList().add(vehicle);
        user.getVehiclesList().add(vehicle2);


        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(user);

//        session.save(vehicle);
//        session.save(vehicle2);

        session.getTransaction().commit();

        //data save using hibernate API
//        UserDetails user = null;
//        session = factory.openSession();
//        session.beginTransaction();
//        user = session.get(UserDetails.class, 1);
//        System.out.println(user);
//        session.close();
    }
}
