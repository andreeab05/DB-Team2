package com.db.Team2.controllers;

import com.db.Team2.models.Customer;
import com.db.Team2.models.Stock;
import com.db.Team2.services.CustomerService;
import com.db.Team2.services.PortofolioPositionsService;
import org.antlr.v4.runtime.misc.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portofolio_positions")
public class PortofolioPositionsController {
    @Autowired
    PortofolioPositionsService portofolioService;

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    public Pair<Customer, List<Stock>> getCustomerById(@PathVariable int id) {
        List<Stock> customerStocks = portofolioService.getStocksByCustomerId(id);
        Customer customer = customerService.getCustomerById(id);
        return new Pair<>(customer, customerStocks);
    }

//    @GetMapping("/all")
//    public List<Customer> getAllCustomers() {
//        List<Customer> customers = portofolioService.getAllCustomers();
//        System.out.println(customers);
//        return customers;
//    }
}
