package com.savoira.w6collections;

import java.math.BigDecimal;

public class PrecisionDemo {

    public static void main(String[] args) {

        System.out.println("----- Using double -----");

        double result = 0.1 + 0.2;

        System.out.println("0.1 + 0.2 using double = " + result);

        System.out.println();
        System.out.println("----- Using BigDecimal -----");

        BigDecimal firstNumber = new BigDecimal("0.1");
        BigDecimal secondNumber = new BigDecimal("0.2");

        BigDecimal bigDecimalResult = firstNumber.add(secondNumber);

        System.out.println("0.1 + 0.2 using BigDecimal = " + bigDecimalResult);

        System.out.println();
        System.out.println("----- Simple financial calculation -----");

        BigDecimal amount = new BigDecimal("1000");
        BigDecimal interest = new BigDecimal("50");

        BigDecimal total = amount.add(interest);

        System.out.println("Amount: Rs." + amount);
        System.out.println("Interest: Rs." + interest);
        System.out.println("Total: Rs." + total);
    }
}