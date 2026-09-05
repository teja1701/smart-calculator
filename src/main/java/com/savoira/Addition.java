package com.savoira;

/**
 * Performs addition of two numbers.
 */
public class Addition extends Operation implements Calculable {

    /**
     * @param firstNumber first number
     * @param secondNumber second number
     */
    public Addition(double firstNumber, double secondNumber) { super(firstNumber, secondNumber);}

    /**
     * Calculates the sum of two numbers.
     * @return sum of the two numbers
     */
    @Override
    public double calculate() {return getFirstNumber() + getSecondNumber();}

    @Override
    public String toString() {
        return "Addition: " + getFirstNumber() + " + " + getSecondNumber() + " = " + calculate();
    }
}