package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    Manager findByName(String name);
}