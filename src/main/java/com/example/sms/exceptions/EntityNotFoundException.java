package com.example.sms.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException (String message) {
        super(message);
    }
}
