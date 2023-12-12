package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private UserDetails userDetails;

    public Vehicle(String vehicleName) {

        this.vehicleName = vehicleName;
    }
}
