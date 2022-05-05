package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "menu")
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String details;
    private String list;
    @ManyToMany(mappedBy = "selects")
    private List<Customer> customers = new ArrayList<>();
}