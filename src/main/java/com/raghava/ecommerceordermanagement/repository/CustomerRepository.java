package com.raghava.ecommerceordermanagement.repository;

import com.raghava.ecommerceordermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}