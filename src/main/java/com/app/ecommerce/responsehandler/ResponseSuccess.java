package com.app.ecommerce.responsehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseSuccess {
    public static ResponseEntity<ApiSuccess> handleResponse(HttpStatus status, Object data) {
        ApiSuccess success = new ApiSuccess();
        success.setStatus(status.value());
        success.setData(data);
        return new ResponseEntity<ApiSuccess>(success, status);
    }
}
