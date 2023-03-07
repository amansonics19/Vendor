package com.aman.vendor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public final ResponseEntity<?> handleWalletException(VendorException ex, WebRequest request){
        VendorWalletExceptionResponse response = new VendorWalletExceptionResponse(ex.getMessage());
        return new ResponseEntity<VendorWalletExceptionResponse>(response, HttpStatus.BAD_REQUEST);
    }
}
