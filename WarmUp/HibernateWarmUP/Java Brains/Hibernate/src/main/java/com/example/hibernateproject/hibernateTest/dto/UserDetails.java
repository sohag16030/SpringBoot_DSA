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
@Table(name = "USER_DETAILS")
public class UserDetails {
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
//    @EmbeddedId
//    private UeserInfo userId;
    // @Basic(optional = false, fetch = FetchType.LAZY)
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date joinData;
    @Lob
    private String description;
    //    @Transient
    //    private int calculation;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
            @AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PIN_CODE"))
    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE_NAME")),
            @AttributeOverride(name = "pinCode", column = @Column(name = "OFFICE_PIN_CODE"))
    })
    private Address officeAddress;

    public UserDetails(String userName, Date joinData, String description, Address homeAddress, Address officeAddress) {
        this.userName = userName;
        this.joinData = joinData;
        this.description = description;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
    }
}
