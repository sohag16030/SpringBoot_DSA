package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VEHICLE_DETAILS")
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private UserDetails user;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
