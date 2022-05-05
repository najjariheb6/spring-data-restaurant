package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}