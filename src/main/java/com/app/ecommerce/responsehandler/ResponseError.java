package com.app.ecommerce.responsehandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResponseError extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleNoHandlerFoundException(ex, headers, status, request);
        ApiError error = new ApiError();
        error.setStatus(status.value());
        error.setMessage(ex.getMessage());
        error.setStack(ex.getStackTrace());
        return new ResponseEntity<Object>(error,status);
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
        ApiError error = new ApiError();
        error.setStatus(status.value());
        error.setMessage(ex.getMessage());
        error.setStack(ex.getStackTrace());
        return new ResponseEntity<Object>(error,status);
    }
}
