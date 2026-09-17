package com.BankAccount;

public class Demo {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "teja", 100);
        BankAccount account2 = new BankAccount(102, "raj", 200);

        account1.deposit(50);
        account1.withdraw(20);
        account1.withdraw(500);

        account2.deposit(100);
        account2.withdraw(50);
        account2.withdraw(500);

        System.out.println(account1);
        System.out.println(account2);
    }
}