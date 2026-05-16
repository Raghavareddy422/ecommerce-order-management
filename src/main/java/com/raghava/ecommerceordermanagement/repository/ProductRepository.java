package com.raghava.ecommerceordermanagement.repository;

import com.raghava.ecommerceordermanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
