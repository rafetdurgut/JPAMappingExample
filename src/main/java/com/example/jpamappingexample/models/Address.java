package com.example.jpamappingexample.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", nullable = false)
    private Long id;

    private String address;
    private String zipCode;

    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

    public Address() {

    }
}
