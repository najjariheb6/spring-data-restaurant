package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private int details;
    private String orderType;
    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;
    @JoinColumn(name="id_order_customer")
    private Set<Order> orders = new HashSet<Order>();
}