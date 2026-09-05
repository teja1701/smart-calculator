package com.savoira;

/**
 * Thrown when an invalid operation or operator is provided.
 */
public class InvalidOperationException extends RuntimeException {

    /**
     * @param message error message
     */
    public InvalidOperationException(String message) {
        super(message);
    }
}