package com.BankAccount;

public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;
    private int transactionCount;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= BankConfig.MAX_DEPOSIT) {
            balance += amount;
            transactionCount++;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0
                && amount <= balance
                && amount <= BankConfig.MAX_WITHDRAWAL
                && transactionCount < BankConfig.MAX_DAILY_TXN) {

            balance -= amount;
            transactionCount++;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    @Override
    public String toString() {
        return "ACC" + accountNumber +
                " | " + holderName +
                " | Balance: Rs." + balance +
                " | Txn: " + transactionCount;
    }
}