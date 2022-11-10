package com.example.jpamappingexample.services;

import com.example.jpamappingexample.models.Address;
import com.example.jpamappingexample.repos.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address addAddress(Address test_address) {
       return addressRepository.save(test_address);

    }
}
