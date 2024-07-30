package com.db.Team2.repositories;

import com.db.Team2.models.Customer;
import com.db.Team2.models.CustomerStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortofolioRepository extends JpaRepository<CustomerStock, Integer> {
    List<CustomerStock> findByCustomerId(Integer customer_id);
}
