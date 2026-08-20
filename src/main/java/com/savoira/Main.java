package com.savoira;

import java.util.Scanner;

/**
 * Simple calculations are performed
 * Handles user input and displays calculation results.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to Smart Calculator");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.print("\nEnter first number (or exit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

            double firstNumber;

            try {
                firstNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            System.out.print("Enter operator (+ - * / %): ");
            String operator = scanner.nextLine().trim();

            if (!isValidOperator(operator)) {
                System.out.println("Invalid operator. Please use +, -, *, /, or %.");
                continue;
            }

            System.out.print("Enter second number: ");
            String secondInput = scanner.nextLine().trim();

            double secondNumber;

            try {
                secondNumber = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }

            Operation operation = new Operation(firstNumber,operator,secondNumber);

            double result = calculator.calculate(operation);

            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f%n", result);
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    /**
     * for checking valid operators
     * @param operator - which operator to check
     * @return true if operator is valid
     */
    private static boolean isValidOperator(String operator) {
        return (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%"));
    }
}