package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "VEHICLE_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
@Table(name = "VEHICLE_DETAILS")
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
