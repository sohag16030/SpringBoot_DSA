package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import java.util.ArrayList;
import java.util.Collection;


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
    @ElementCollection
    @JoinTable(name = "USER_ADDRESS",
    joinColumns = @JoinColumn(name = "USER_ID"))
    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
    @CollectionId(column = @Column(name = "ADDRESS_ID"), generator = "hilo-gen")
    private Collection<Address> listOfAddres = new ArrayList<>();

    public UserDetails(String userName) {
        this.userName = userName;
    }
}
