package com.example.hibernateproject.hibernateTest.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.LinkOption;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="USER_DETAILS")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
   // @Basic(optional = false, fetch = FetchType.LAZY)
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date joinData;
    @Lob
    private String description;
//    @Transient
//    private int calculation;
    //@Embedded //Not mandatory
    private Address address;

    public UserDetails(String userName, Date joinData, String description, Address address) {
        this.userName = userName;
        this.joinData = joinData;
        this.description = description;
        this.address = address;
    }
}
