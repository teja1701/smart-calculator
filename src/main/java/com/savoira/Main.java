package com.savoira;

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
            try {
                System.out.print("\nEnter first number (or exit): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("exit")) {break;}

                double firstNumber = Double.parseDouble(input);

                System.out.print("Enter operator (+ - * / %): ");
                String operator = scanner.nextLine().trim();
                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("%")) {
                    throw new InvalidOperationException("Unknown operator: " + operator);
                }

                System.out.print("Enter second number: ");
                double secondNumber = Double.parseDouble(scanner.nextLine().trim());

                double result = getResult(operator, firstNumber, secondNumber);
                System.out.printf("Result: %.2f%n", result);

            } catch (NumberFormatException e) {System.out.println("Please enter a valid number.");
            } catch (DivisionByZeroException | InvalidOperationException e) {System.out.println(e.getMessage());
            } finally {System.out.println("------------------------");}
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static double getResult(String operator, double firstNumber, double secondNumber) {
        Calculable operation = switch (operator) {
            case "+" -> new Addition(firstNumber, secondNumber);
            case "-" -> new Subtraction(firstNumber, secondNumber);
            case "*" -> new Multiplication(firstNumber, secondNumber);
            case "/" -> new Division(firstNumber, secondNumber);
            default -> new Modulo(firstNumber, secondNumber);
        };
        return operation.calculate();
    }
}