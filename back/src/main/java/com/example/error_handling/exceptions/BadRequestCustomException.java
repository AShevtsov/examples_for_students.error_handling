package com.example.error_handling.exceptions;

public class BadRequestCustomException extends Exception {
    public BadRequestCustomException(String message) {
        super(message);
    }
}
