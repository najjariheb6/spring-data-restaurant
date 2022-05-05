package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}