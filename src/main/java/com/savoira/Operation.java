package com.savoira;

/**
 * calculates simple calculation
 * just holds the data but doesn't perform any calculation here
 */
public class Operation {

    private double firstNumber;
    private String operator;
    private double secondNumber;

    /**
     *
     * @param firstNumber - first number
     * @param operator - operator
     * @param secondNumber - second number
     */
    public Operation(double firstNumber, String operator, double secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
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
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     *
     * @return the second number
     */
    public double getSecondNumber() {
        return secondNumber;
    }
}