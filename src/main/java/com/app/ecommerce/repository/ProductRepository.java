package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
