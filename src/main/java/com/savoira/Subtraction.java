package com.savoira;

/**
 * Performs subtraction of two numbers.
 */
public class Subtraction extends Operation implements Calculable {

    /**
     * @param firstNumber first number
     * @param secondNumber second number
     */
    public Subtraction(double firstNumber, double secondNumber) {super(firstNumber, secondNumber);}

    /**
     * Calculates the difference between two numbers.
     */
    @Override
    public double calculate() {return getFirstNumber() - getSecondNumber();}

    @Override
    public String toString() {
        return "Subtraction: " + getFirstNumber() + " - " + getSecondNumber() + " = " + calculate();
    }
}