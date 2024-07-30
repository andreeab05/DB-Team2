package com.db.Team2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "stock")
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer stock_id;

    @Column
    private int stock_name;

    @Column
    private String country_market;

    @Column
    private int price;

    @Column
    private int growth_rate;

    @OneToMany(mappedBy = "stock")
    private List<CustomerStock> customerStocks;

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public int getStock_name() {
        return stock_name;
    }

    public void setStock_name(int stock_name) {
        this.stock_name = stock_name;
    }

    public String getCountry_market() {
        return country_market;
    }

    public void setCountry_market(String country_market) {
        this.country_market = country_market;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGrowth_rate() {
        return growth_rate;
    }

    public void setGrowth_rate(int growth_rate) {
        this.growth_rate = growth_rate;
    }

    public List<CustomerStock> getCustomerStocks() {
        return customerStocks;
    }

    public void setCustomerStocks(List<CustomerStock> customerStocks) {
        this.customerStocks = customerStocks;
    }
}
