package com.example.error_handling.controllers;

import com.example.error_handling.dto.SimpleDTO;
import com.example.error_handling.exceptions.BadRequestCustomException;
import com.example.error_handling.exceptions.BadRequestCustomExceptionWithStatus;
import com.example.error_handling.exceptions.NotFoundCustomException;
import com.example.error_handling.exceptions.NotFoundCustomExceptionWithStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;


/**
 * https://www.baeldung.com/spring-mvc-controller-custom-http-status-code
 * https://stackoverflow.com/questions/32441919/how-return-error-message-in-spring-mvc-controller
 *
 */
@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping("/api")
public class SimleErrorController {


    @GetMapping("/get_responce_entity")
    public ResponseEntity getResponseEntityMethod(@RequestParam(required = false, defaultValue = "0") int number) {
        SimpleDTO result = new SimpleDTO("Test String", BigInteger.TEN);

        switch (number){
            case 1 : return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found custom error message");
            case 2 : return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request custom error message");

        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/get_exception")
    public SimpleDTO getExceptionMethod(@RequestParam(required = false, defaultValue = "0") int number) throws Exception {
        SimpleDTO result = new SimpleDTO("Test String", BigInteger.TEN);

        switch (number){
            case 1 : throw new NotFoundCustomException("Not found custom exception message");
            case 2 : throw new BadRequestCustomException("Bad request custom exception message");
        }

        return result;
    }

    @GetMapping("/get_status")
    public SimpleDTO getStatusMethod(@RequestParam(required = false, defaultValue = "0") int number) throws Exception {
        SimpleDTO result = new SimpleDTO("Test String", BigInteger.TEN);

        switch (number){
            case 1 : throw new NotFoundCustomExceptionWithStatus("Not found custom exception message");
            case 2 : throw new BadRequestCustomExceptionWithStatus("Bad request custom exception message");
        }

        return result;
    }

}
