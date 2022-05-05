package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}