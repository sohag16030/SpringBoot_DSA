package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TwoWheeler extends Vehicle{
    private String steeringHandle;
}
