package com.db.Team2.services;

import com.db.Team2.models.Customer;
import com.db.Team2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(Integer id){
        return customerRepository.findById(id).get();
    }
}
