package com.app.ecommerce.responsehandler;

import lombok.Getter;
import lombok.Setter;

public class ApiSuccess {
    @Getter
    @Setter
    private int status;

    @Getter
    @Setter
    private Object data;
}
