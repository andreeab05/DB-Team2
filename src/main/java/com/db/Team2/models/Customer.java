package com.db.Team2.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Double netWorth;
    @Column
    private String nationality;

    @OneToMany(mappedBy = "customer")
    private List<CustomerStock> customerStocks;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Double netWorth) {
        this.netWorth = netWorth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<CustomerStock> getCustomerStocks() {
        return customerStocks;
    }

    public void setCustomerStocks(List<CustomerStock> customerStocks) {
        this.customerStocks = customerStocks;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", netWorth=" + netWorth +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
