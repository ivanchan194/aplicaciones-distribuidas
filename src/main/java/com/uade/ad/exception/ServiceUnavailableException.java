package com.uade.ad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ServiceUnavailableException extends RuntimeException {
    public ServiceUnavailableException(final String message) {
        super(message);
    }
}
