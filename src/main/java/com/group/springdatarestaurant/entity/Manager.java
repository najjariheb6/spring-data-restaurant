package com.group.springdatarestaurant.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "manager")
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private Date birthdate;
    private String contactNum;
    private String username;
    private String password;
}