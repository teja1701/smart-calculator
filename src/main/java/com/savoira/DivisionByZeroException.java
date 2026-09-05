package com.savoira;

/**
 * Thrown when division by zero is attempted.
 */
public class DivisionByZeroException extends ArithmeticException {

    /**
     * Creates a division by zero exception.
     */
    public DivisionByZeroException() {
        super("Cannot divide by zero");
    }
}