package com.smartcalculator;
import java.util.Scanner;

/*
Expected outputs:
1. 10 + 3
   Result: 13.00
2. 10 / 0
   Error: Division by zero
3. 10 ^ 2
   Error: Unknown operator '^'
*/
public class Smartcalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Smart calculator");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter first number (or exit): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

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
                        System.out.println("Error: Division by zero");
                        yield Double.NaN;
                    }
                    yield a / b;
                }
                case "%" -> {
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                        yield Double.NaN;
                    }
                    yield a % b;
                }
                default -> {
                    System.out.println("Error: Unknown operator '" + op + "'");
                    yield Double.NaN;
                }
            };
            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f%n", result);
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
