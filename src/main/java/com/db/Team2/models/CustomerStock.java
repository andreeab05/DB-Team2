package com.db.Team2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="customer_stock")
@IdClass(CustomerStock.class)
public class CustomerStock implements Serializable {
    @Id
    int customer_id;
    @Id
    int stock_id;

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
