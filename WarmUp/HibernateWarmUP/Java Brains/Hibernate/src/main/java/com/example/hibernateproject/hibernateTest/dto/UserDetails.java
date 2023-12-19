package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name = "userDetails.byId", query = "from UserDetails where userId = :userId")
@NamedNativeQuery(name="userDetails.byName", query = "select * from User_Details where userName = :userName")
@Table(name = "User_Details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;

    public UserDetails(String userName) {
        this.userName = userName;
    }
}
