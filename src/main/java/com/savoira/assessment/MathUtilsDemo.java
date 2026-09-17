package com.savoira.assessment;

public class MathUtilsDemo {

    public static void main(String[] args) {

        System.out.println(MathUtils.roundToTwoDecimalPlaces(123.4567));
        System.out.println(MathUtils.calculateSimpleInterest(10000, 5, 2));
        System.out.println(MathUtils.calculateCompoundInterest(10000, 5, 4, 2));
    }
}