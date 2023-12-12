package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CollectionId;
import java.util.ArrayList;
import java.util.Collection;
import org.hibernate.annotations.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;

    @OneToMany
    @JoinTable(name = "USER_VEHICLE",joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID")
    )
    private Collection<Vehicle> vehicle = new ArrayList<>();

    public UserDetails(String userName) {
        this.userName = userName;
    }
}
