package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}