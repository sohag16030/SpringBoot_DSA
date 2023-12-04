package com.example.hibernate03.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int addressId;
    @Column(length = 50,name="STREET")
    private String street;
    private String city;
    @Column(name="is_open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name="added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    @Column(name = "image", columnDefinition = "BLOB")
    private byte[] image;

    public Address(String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }
}
