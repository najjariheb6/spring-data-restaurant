package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}