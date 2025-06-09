package com.example.sms.exceptions;

public class EmptyResultDataAccessException extends RuntimeException{
    public EmptyResultDataAccessException (String message) {
        super(message);
    }
}
