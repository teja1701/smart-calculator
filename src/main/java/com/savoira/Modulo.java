package com.savoira;

/**
 * Performs modulo operation on two numbers.
 */
public class Modulo extends Operation implements Calculable {

    /**
     * @param firstNumber first number
     * @param secondNumber second number
     */
    public Modulo(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    /**
     * @return remainder of the division
     */
    @Override
    public double calculate() {
        if (getSecondNumber() == 0) {throw new DivisionByZeroException();}
        return getFirstNumber() % getSecondNumber();
    }

    /**
     * @return operation description
     */
    @Override
    public String toString() {
        return "Modulo: " + getFirstNumber() + " % " + getSecondNumber() + " = " + calculate();
    }
}