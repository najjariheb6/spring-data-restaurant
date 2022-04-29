package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private int cardNumber;
    private String amount;



}