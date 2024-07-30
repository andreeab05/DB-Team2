package com.db.Team2.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="customer_stock")
@IdClass(CustomerStock.class)
public class CustomerStock implements Serializable {
    @Id
    int customer_id;
    @Id
    int stock_id;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="stock_id")
    private Stock stock;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        CustomerStock otherStock = (CustomerStock) obj;
        return (this.customer_id == otherStock.customer_id && this.stock_id == otherStock.stock_id);
    }





}
