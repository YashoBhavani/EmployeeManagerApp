package com.sampleproject.employeemanager.exception;

public class UserNotFounfException extends RuntimeException{
    public UserNotFounfException(String message) {
        super(message);
    }
}
