package com.group.springdatarestaurant.repository;

import com.group.springdatarestaurant.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}