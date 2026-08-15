package com.savoira.assessment;

/**
 * Bank Account
 */
public class BankAccount {

    private final String accountNumber;
    private final String holderName;
    private double balance;
    private int transactionCount;

    /**
     *
     * @param accountNumber
     * @param holderName
     * @param initialBalance
     */
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    /**
     *
     * @param accountNumber
     * @param holderName
     */
    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    /**
     *
     * @param amount - for deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionCount++;
        }
    }

    /**
     *
     * @param amount - for withdrawal
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionCount++;
        }
    }

    /**
     *
     * @return current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return no of transactions
     */
    public int getTransactionCount() {
        return transactionCount;
    }

    /**
     *
     * @return account summary
     */
    public String getSummary() {
        return "Account: " + accountNumber
                + " | Holder: " + holderName
                + " | Balance: " + balance
                + " | Transactions: " + transactionCount;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1", "Teja", 1000);
        BankAccount account2 = new BankAccount("2", "Raj");

        account1.deposit(500);
        account1.withdraw(200);
        account1.withdraw(-100);

        account2.deposit(1000);
        account2.withdraw(-50);

        System.out.println(account1.getSummary());
        System.out.println(account2.getSummary());
    }
}