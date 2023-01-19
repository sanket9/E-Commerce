package com.app.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecommerce.model.ProductCategory;
import com.app.ecommerce.responsehandler.ApiSuccess;
import com.app.ecommerce.responsehandler.ResponseSuccess;
import com.app.ecommerce.service.ProductCategoryService;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api/product-category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping(value = "/all")
    public ResponseEntity<ApiSuccess> getAll() {
        try {
            List<ProductCategory> pcList = productCategoryService.getProductCategoryList();
            return ResponseSuccess.handleResponse(HttpStatus.OK, pcList);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

}
