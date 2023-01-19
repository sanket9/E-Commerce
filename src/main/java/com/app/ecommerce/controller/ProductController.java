package com.app.ecommerce.controller;

import com.app.ecommerce.model.Product;
import com.app.ecommerce.model.ProductCategory;
import com.app.ecommerce.responsehandler.ApiSuccess;
import com.app.ecommerce.responsehandler.ResponseSuccess;
import com.app.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/all")
    public ResponseEntity<ApiSuccess> getAll() {
        try {
            List<Product> pcList = productService.getAll();
            return ResponseSuccess.handleResponse(HttpStatus.OK, pcList);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
}
