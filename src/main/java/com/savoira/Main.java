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
            try {
                System.out.print("\nEnter first number (or exit): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("exit")) {break;}

                double firstNumber = Double.parseDouble(input);

                System.out.print("Enter operator (+ - * / %): ");
                String operator = scanner.nextLine().trim();

                System.out.print("Enter second number: ");
                double secondNumber = Double.parseDouble(scanner.nextLine().trim());

                Calculable operation;

                if (operator.equals("+")) {
                    operation = new Addition(firstNumber, secondNumber);
                } else if (operator.equals("-")) {
                    operation = new Subtraction(firstNumber, secondNumber);
                } else if (operator.equals("*")) {
                    operation = new Multiplication(firstNumber, secondNumber);
                } else if (operator.equals("/")) {
                    operation = new Division(firstNumber, secondNumber);
                } else if (operator.equals("%")) {
                    operation = new Modulo(firstNumber, secondNumber);
                } else {
                    throw new InvalidOperationException("Unknown operator: " + operator);
                }

                double result = operation.calculate();
                System.out.printf("Result: %.2f%n", result);

            } catch (NumberFormatException e) {System.out.println("Please enter a valid number.");
            } catch (DivisionByZeroException e) {System.out.println(e.getMessage());
            } catch (InvalidOperationException e) {System.out.println(e.getMessage());

            } finally {System.out.println("------------------------------------");}
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}