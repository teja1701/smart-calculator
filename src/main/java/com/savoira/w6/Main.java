package com.savoira.w6;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(50000);

        // Payment 1
        try {
            paymentService.processPayment(15000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        // Payment 2
        try {
            paymentService.processPayment(-500);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        // Payment 3
        try {
            paymentService.processPayment(250000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        // Payment 4
        try {
            paymentService.processPayment(40000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        // Payment 5
        try {
            paymentService.processPayment(10000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }
    }
}