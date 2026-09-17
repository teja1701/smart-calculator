package com.savoira.assessment;
import java.util.Scanner;

public class ATMSimulator {

    private static final double MIN_WITHDRAWAL = 500.0;
    private static final double MAX_WITHDRAWAL = 20000.0;
    private static final double WITHDRAWAL_MULTIPLE = 500.0;
    private static final double INITIAL_BALANCE = 25000.0;
    private static final int MAX_ATTEMPTS = 3;

    private double balance;

    public ATMSimulator(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount < MIN_WITHDRAWAL || amount > MAX_WITHDRAWAL || amount % WITHDRAWAL_MULTIPLE != 0) {
            throw new InvalidAmountException("Invalid amount. Must be between 500 and 20000 and a multiple of 500.");
        }
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance.");
        }

        balance -= amount;
        System.out.println("New balance: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMSimulator atm = new ATMSimulator(INITIAL_BALANCE);
        int attempts = 0;

        while (true) {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(sc.nextLine().trim());

            try {
                atm.withdraw(amount);
                break;
            } catch (InvalidAmountException e) {
                attempts++;
                System.out.println(e.getMessage());
                if (attempts >= MAX_ATTEMPTS) {
                    throw new MaxAttemptsExceededException("Card locked.");
                }
            }
        }
        sc.close();
    }
}