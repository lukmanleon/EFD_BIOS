package com.emilfreydigital.bios.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException exception) {
        // 1. Create payload containing exception and details

        ApiException apiException = new ApiException(
                exception.getMessage() + exception,
                exception.getHttpStatus(),
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        // 2. Return the response entity
        return new ResponseEntity<>(apiException, apiException.getHttpStatus());
    }
}
