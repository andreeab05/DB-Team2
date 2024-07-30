package com.db.Team2.services;

import com.db.Team2.models.Customer;
import com.db.Team2.models.CustomerStock;
import com.db.Team2.models.Stock;
import com.db.Team2.repositories.PortofolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PortofolioPositionsService {
    @Autowired
    PortofolioRepository portofolioRepository;

    public List<Stock> getStocksByCustomerId(Integer id) {
        return portofolioRepository.findByCustomerId(id)
                .stream()
                .map(CustomerStock::getStock)
                .collect(Collectors.toList());
    }

//    public List<Customer> getAllC(){
//        return portofolioRepository.findAll();
//    }
//
//    public Customer getCustomerById(int id){
//        Optional<Customer> optionalCustomer = portofolioRepository.findById(id);
//        return optionalCustomer.orElse(null);
//    }
}