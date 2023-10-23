package com.workintech.burger.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BurgerExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<BurgerErrorResponse> handleException(BurgerException burgerException){
        BurgerErrorResponse burgerErrorResponse = new BurgerErrorResponse(
                burgerException.getStatus().value(),burgerException.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(burgerErrorResponse,burgerException.getStatus());
    }
    @ExceptionHandler
    public ResponseEntity<BurgerErrorResponse> handleException(Exception exception){
        BurgerErrorResponse burgerErrorResponse = new BurgerErrorResponse(
                HttpStatus.BAD_REQUEST.value(), exception.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(burgerErrorResponse,HttpStatus.BAD_REQUEST);
    }
}
