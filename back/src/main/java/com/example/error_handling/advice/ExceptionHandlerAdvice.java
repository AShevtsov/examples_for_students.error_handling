package com.example.error_handling.advice;

import com.example.error_handling.exceptions.BadRequestCustomException;
import com.example.error_handling.exceptions.NotFoundCustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(NotFoundCustomException.class)
    public ResponseEntity handleException(NotFoundCustomException e) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }

    @ExceptionHandler(BadRequestCustomException.class)
    public ResponseEntity handleException(BadRequestCustomException e) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
}
