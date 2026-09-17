package com.savoira.assessment;

public class StringBuilderDemo {

    public static String buildReport(String[] items) {

        StringBuilder report = new StringBuilder("Report: ");
        // StringBuilder is preferred to avoid creating multiple objects during in a loop for efficient memory management.

        for (int i = 0; i < items.length; i++) {
            report.append(items[i]).append(i < items.length - 1 ? " | " : "");
        }
        return report.toString();
    }

    public static void main(String[] args) {

        String[] transactions = {
                "Deposit Rs.500",
                "Withdrawal Rs.1000",
                "Deposit Rs.300",
        };

        System.out.println(buildReport(transactions));
    }
}