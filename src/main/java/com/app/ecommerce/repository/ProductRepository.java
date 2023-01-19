package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByIsActiveTrue();

}
