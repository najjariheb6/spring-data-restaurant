package com.group.springdatarestaurant.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
@Data
@Builder
public class Customer extends Manager{
    private String address;
    private Integer payment;
    @OneToMany(mappedBy = "customer")
    @JoinColumn(name="id_customer")
    private Set<Order>orders;
    @ManyToMany
    @JoinTable(
            name = "customer_menu",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id"))
    private List<Menu> selects = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "customer_payment",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id"))
    private List<Payment> pays = new ArrayList<>();;

    public Customer() {
    }

}