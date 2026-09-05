package com.savoira;

/**
 * Performs calculations
 */
public class Calculator {


    /**
     * Calculates the square root of a number.
     *
     * @param number the number whose square root is required
     * @return the square root
     */
    public static double squareRoot(double number) {

        if (number < 0) {
            System.out.println("Error: cannot take square root of a negative number");
            return Double.NaN;
        }

        return Math.sqrt(number);
    }

    /**
     * Calculates what percentage a part is of a whole.
     *
     * @param part the partial value
     * @param whole the total value
     * @return the percentage
     */
    public static double percentage(double part, double whole) {

        if (whole == 0) {
            System.out.println("Error: cannot calculate percentage of zero");
            return Double.NaN;
        }

        return (part / whole) * 100;
    }
}