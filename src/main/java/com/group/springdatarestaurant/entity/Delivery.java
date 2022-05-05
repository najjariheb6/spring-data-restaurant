package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "delivery")
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private Date date;
    private String address;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}