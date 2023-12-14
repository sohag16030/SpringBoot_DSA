package com.example.hibernateproject.hibernateTest.service;

import com.example.hibernateproject.hibernateTest.dto.*;
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
        Vehicle car = new Vehicle("Car");
//        Vehicle vehicle2 = new Vehicle("Bike");

//        user.getVehiclesList().add(vehicle);
//        user.getVehiclesList().add(vehicle2);
//
//        vehicle.setUserDetails(user);  // Set the association
//        vehicle2.setUserDetails(user); // Set the association

        TwoWheeler bike = new TwoWheeler();
        bike.setVehicleName("Bike");
        bike.setSteeringHandle("Bike Steering Handle");

        FourWheeler bmw = new FourWheeler();
        bmw.setVehicleName("BMW");
        bmw.setSteeringWheel("BMW Steering Wheel");

        //data save using hibernate API
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        session.save(user);
        session.save(car);
        session.save(bike);
        session.save(bmw);

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
