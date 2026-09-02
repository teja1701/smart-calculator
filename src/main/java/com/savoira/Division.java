package com.savoira;

/**
 * Performs division of two numbers.
 */
public class Division extends Operation implements Calculable {

    /**
     * @param firstNumber first number
     * @param secondNumber second number
     */
    public Division(double firstNumber, double secondNumber) { super(firstNumber, secondNumber);}

    /**
     * @return quotient of the two numbers, or NaN if dividing by zero
     */
    @Override
    public double calculate() {
        if (getSecondNumber() == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }

        return getFirstNumber() / getSecondNumber();
    }


    @Override
    public String toString() {
        return "Division: " + getFirstNumber() + " / " + getSecondNumber() + " = " + calculate();
    }
}