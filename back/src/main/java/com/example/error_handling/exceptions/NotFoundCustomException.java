package com.example.error_handling.exceptions;

public class NotFoundCustomException extends Exception {
    public NotFoundCustomException(String message) {
        super(message);
    }
}
