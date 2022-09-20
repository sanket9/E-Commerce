package com.app.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecommerce.responsehandler.ApiSuccess;
import com.app.ecommerce.responsehandler.ResponseSuccess;

@RestController
public class ApiController {

    @GetMapping("/api")
    public ResponseEntity<ApiSuccess> apiHandle() {
        return ResponseSuccess.handleResponse(HttpStatus.OK, "Api Is Working. ❤️🎉");
    }

}
