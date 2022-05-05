package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payment")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private Integer cardNumber;
    private String amount;
    @ManyToMany(mappedBy = "pays")
    private List<Customer> customers = new ArrayList<>();


}