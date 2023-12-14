package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
