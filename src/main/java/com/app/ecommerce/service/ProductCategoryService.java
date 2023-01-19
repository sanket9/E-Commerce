package com.app.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecommerce.model.ProductCategory;
import com.app.ecommerce.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
    @Autowired
    ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> getProductCategoryList() {

        return productCategoryRepository.findAll();

    }

}
