package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "dish")
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private float price;
}