package com.savoira;

/**
 * calculates simple calculation
 * just holds the data but doesn't perform any calculation here
 */
public abstract class Operation {

    private double firstNumber;
    private double secondNumber;

    /**
     *
     * @param firstNumber - first number
     * @param secondNumber - second number
     */
    public Operation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     *
     * @return the first number
     */
    public double getFirstNumber() {
        return firstNumber;
    }


    /**
     *
     * @return the second number
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Performs the calculation.
     *
     * @return calculated result
     */
    public abstract double calculate();

}