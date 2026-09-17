package com.savoira.w6;

public class PaymentService {

    private double balance;

    public PaymentService(double balance) { this.balance = balance;}

    public void processPayment(double amount) {
        if (amount <= 0) throw new InvalidAmountException("Payment amount must be greater than zero.");
        if (amount > 200000) throw new DailyLimitExceededException("Daily payment limit exceeded.", amount);
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException("Insufficient funds.", shortfall);
        }
        balance -= amount;
        System.out.println("Payment of Rs." + amount + " processed. New balance: Rs." + balance);
    }
}