package com.savoira;

/**
 * Performs calculations
 */
public class Calculator {

    /**
     * Calculates the result of the given operation.
     *
     * @param operation the operation containing operands and operator
     * @return the result of the calculation, or NaN for an invalid operation
     */
    public double calculate(Operation operation) {

        double firstNumber = operation.getFirstNumber();
        double secondNumber = operation.getSecondNumber();
        String operator = operation.getOperator();

        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println(
                            "Error: INVALID operation(/ by zero)"
                    );
                    yield Double.NaN;
                }
                yield firstNumber / secondNumber;
            }
            case "%" -> {
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                    yield Double.NaN;
                }
                yield firstNumber % secondNumber;
            }
            default -> {
                System.out.println("Unknown operator");
                yield Double.NaN;
            }
        };
    }

    /**
     * Calculates the square root of a number.
     *
     * @param number the number whose square root is required
     * @return the square root
     */
    public static double squareRoot(double number) {

        if (number < 0) {
            System.out.println(
                    "Error: cannot take square root of a negative number"
            );
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
            System.out.println(
                    "Error: cannot calculate percentage of zero"
            );
            return Double.NaN;
        }

        return (part / whole) * 100;
    }
}