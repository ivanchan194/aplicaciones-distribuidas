package com.uade.ad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserErrorException extends RuntimeException {
    public UserErrorException() {
    }
}
