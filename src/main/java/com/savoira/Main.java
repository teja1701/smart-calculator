package com.savoira;

import java.util.List;
import java.util.Scanner;

/**
 * Handles user input and displays calculation results.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart Calculator");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.print("\nEnter first number (or exit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {break;}

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

            /*
             * Create the appropriate operation object
             * based on the operator entered by the user.
             */
            if (operator.equals("+")) {
                Calculable operation = new Addition(firstNumber, secondNumber);
                displayResult(operation);

            } else if (operator.equals("-")) {
                Calculable operation = new Subtraction(firstNumber, secondNumber);
                displayResult(operation);

            } else if (operator.equals("*")) {
                Calculable operation = new Multiplication(firstNumber, secondNumber);
                displayResult(operation);

            } else if (operator.equals("/")) {
                Calculable operation = new Division(firstNumber, secondNumber);
                displayResult(operation);

            } else if (operator.equals("%")) {
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                    continue;
                }

                double result = firstNumber % secondNumber;
                System.out.printf("Result: %.2f%n", result);
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    /**
     * Displays the result of a calculable operation.
     *
     * @param operation operation to calculate
     */
    private static void displayResult(Calculable operation) {
        double result = operation.calculate();
        if (!Double.isNaN(result)) {System.out.printf("Result: %.2f%n", result);}
    }

    /**
     * Checks whether the entered operator is valid.
     * @param operator operator entered by the user
     * @return true if the operator is valid
     */
    private static boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");
    }
}