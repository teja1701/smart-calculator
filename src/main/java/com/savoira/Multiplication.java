package com.savoira;

/**
 * Performs multiplication of two numbers.
 */
public class Multiplication extends Operation implements Calculable {

    /**
     * @param firstNumber first number
     * @param secondNumber second number
     */
    public Multiplication(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    /**
     * @return product of the two numbers
     */
    @Override
    public double calculate() {return getFirstNumber() * getSecondNumber();}

    @Override
    public String toString() {
        return "Multiplication: " + getFirstNumber() + " * " + getSecondNumber() + " = " + calculate();
    }
}