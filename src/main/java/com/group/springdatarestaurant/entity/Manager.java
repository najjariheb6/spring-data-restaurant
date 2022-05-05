package com.group.springdatarestaurant.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "manager")
@Data
@Builder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private Date birthdate;
    private String contactNum;
    private String username;
    private String password;
    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<Menu> menus = new ArrayList<>();

    public Manager() {

    }
}