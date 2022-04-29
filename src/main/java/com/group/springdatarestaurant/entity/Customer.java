package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@Data
public class Customer extends Manager{
    private String address;
    private int payment;
    /*@JoinColumn(name="id_order_customer")
    private Set<Order>orders = new HashSet<Order>();*/
}