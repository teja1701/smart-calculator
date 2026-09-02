package com.savoira;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
     * @return quotient of the two numbers
     * @throws DivisionByZeroException if the second number is zero
     */
    @Override
    public double calculate() {

        if (getSecondNumber() == 0) {throw new DivisionByZeroException();}

        BigDecimal a = BigDecimal.valueOf(getFirstNumber());
        BigDecimal b = BigDecimal.valueOf(getSecondNumber());
        return a.divide(b, 10, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "Division: " + getFirstNumber() + " / " + getSecondNumber() + " = " + calculate();
    }
}