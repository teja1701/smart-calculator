package com.savoira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Smart calculator");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.print("Enter first number (or exit): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {break;}
            double first_num = Double.parseDouble(input);

            System.out.print("Enter operator (+ - * / %): ");
            String operator = sc.nextLine().trim();

            System.out.print("Enter second number: ");
            double second_num = Double.parseDouble(sc.nextLine().trim());

            double result = switch (operator) {
                case "+" -> first_num + second_num;
                case "-" -> first_num - second_num;
                case "*" -> first_num * second_num;
                case "/" -> {
                    if (second_num == 0) {
                        System.out.println("Error: INVALID operation(/ by zero)");
                        yield Double.NaN;
                    }
                    yield first_num / second_num;
                }
                case "%" -> {
                    if (second_num == 0) {
                        System.out.println("Error: Division by zero");
                        yield Double.NaN;
                    }
                    yield first_num % second_num;
                }
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