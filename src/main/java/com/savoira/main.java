package com.savoira;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Smart calculator");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.print("Enter first number (or exit): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {break;}
            double a = Double.parseDouble(input);

            System.out.print("Enter operator (+ - * / %): ");
            String op = sc.nextLine().trim();

            System.out.print("Enter second number: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            double result = switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> {
                    if (b == 0) {
                        System.out.println("Error: INVALID operation(/ by zero)");
                        yield Double.NaN;
                    }
                    yield a / b;
                }
                case "%" -> a % b;
                default -> {
                    System.out.println("Unknown operator");
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) System.out.printf("Result: %.2f%n", result);
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}