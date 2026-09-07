package com.savoira.w7_atm;

public class MaxAttemptsExceededException extends RuntimeException {
    public MaxAttemptsExceededException(String message) {
        super(message);
    }
}