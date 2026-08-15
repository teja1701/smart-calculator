package com.savoira.assessment;

public class AccountFormatter {

    public static String formatAccountSummary(String name, double balance, String accountType) {
        return String.format(
                "Account Holder: %s | Type: %s | Balance: ₹%.2f",
                name.toUpperCase(),
                accountType,
                balance
        );
    }

    public static void main(String[] args) {
        System.out.println(formatAccountSummary("Sushmitha", 500, "SAVINGS"));
        System.out.println(formatAccountSummary("Teja", 5000.5, "SALARY"));
        System.out.println(formatAccountSummary("Raj", 50000, "LOAN"));
    }
}