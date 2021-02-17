package com.example.error_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Custom bad request status")
public class BadRequestCustomExceptionWithStatus extends Exception {
    public BadRequestCustomExceptionWithStatus(String message) {
        super(message);
    }
}
