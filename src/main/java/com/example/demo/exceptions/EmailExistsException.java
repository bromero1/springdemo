package com.example.demo.exceptions;

public class EmailExistsException extends RuntimeException {
    public EmailExistsException(String email){
        super("Email already exists.");
    }
}
