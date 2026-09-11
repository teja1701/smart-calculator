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
                System.out.print("\nEnter operation (+ - * / % sqrt pct) or exit: ");
                String operator = scanner.nextLine().trim();

                if (operator.equalsIgnoreCase("exit")) break;

                if (operator.equalsIgnoreCase("sqrt")){
                    ProcessSquareRoot(scanner);
                    continue;
                }

                if (operator.equalsIgnoreCase("pct")) {
                    ProcessPercentage(scanner);
                    continue;
                }

                if (!isValidOperator(operator)) throw new InvalidOperationException("Unknown operator: " + operator);

                System.out.print("Enter first number: ");
                double firstNumber = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Enter second number: ");
                double secondNumber = Double.parseDouble(scanner.nextLine().trim());

                double result = getResult(operator, firstNumber, secondNumber);
                System.out.printf("Result: %.2f%n", result);

            } catch (NumberFormatException e) {System.out.println("Please enter a valid number.");}
            catch (DivisionByZeroException | InvalidOperationException e) {System.out.println(e.getMessage());}
            finally {System.out.println("------------------------");}
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");
    }

    private static void ProcessSquareRoot(Scanner scanner) {
        System.out.print("Enter number: ");
        double number = Double.parseDouble(scanner.nextLine().trim());

        double result = Calculator.squareRoot(number);
        System.out.printf("Result: %.2f%n", result);
    }

    private static void ProcessPercentage(Scanner scanner) {
        System.out.print("Enter part: ");
        double part = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter whole: ");
        double whole = Double.parseDouble(scanner.nextLine().trim());

        double result = Calculator.percentage(part, whole);
        System.out.printf("Result: %.2f%%%n", result);
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