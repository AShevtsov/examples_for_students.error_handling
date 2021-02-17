package com.example.error_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Custom not found status")
public class NotFoundCustomExceptionWithStatus extends Exception {
    public NotFoundCustomExceptionWithStatus(String message) {
        super(message);
    }
}
