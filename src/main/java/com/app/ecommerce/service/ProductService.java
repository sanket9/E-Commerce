package com.app.ecommerce.service;

import com.app.ecommerce.model.Product;
import com.app.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findByIsActiveTrue();
    }
}
