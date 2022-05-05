package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private Integer details;
    private String orderType;
    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "dish_id")
    private List<Dish> dishes = new ArrayList<>();;
}