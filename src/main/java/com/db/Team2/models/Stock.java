package com.db.Team2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stock")
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int stock_id;

    @Column
    private int stock_name;

    @Column
    private String country_market;

    @Column
    private int price;

    @Column
    private int growth_rate;
}
