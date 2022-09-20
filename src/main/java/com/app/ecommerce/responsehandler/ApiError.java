package com.app.ecommerce.responsehandler;

import lombok.Getter;
import lombok.Setter;

public class ApiError {
    @Getter
    @Setter
    private int status;
    @Getter
    @Setter
    private String message;
    @Getter
    @Setter
    private Object stack;
}
