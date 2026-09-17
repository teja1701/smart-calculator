package com.savoira.w6collections;

import java.math.BigDecimal;
import java.util.*;

/**
 * LoanLedger
 * A small in-memory ledger for tracking loan accounts. This class shows
 * three different Java collections working together on the same dataset.
 */
public class LoanLedger {

    static class LoanAccount {
        final String loanId;
        final String borrower;
        BigDecimal outstandingBalance;
        boolean isActive;

        LoanAccount(String loanId, String borrower, BigDecimal outstandingBalance, boolean isActive) {
            this.loanId = loanId;
            this.borrower = borrower;
            this.outstandingBalance = outstandingBalance;
            this.isActive = isActive;
        }
    }

    public static void main(String[] args) {

        // List: master record of every loan account,
        List<LoanAccount> ledgerEntries = new ArrayList<>();
        ledgerEntries.add(new LoanAccount("101", "Raj", new BigDecimal("75000.00"), true));
        ledgerEntries.add(new LoanAccount("102", "Teju", new BigDecimal("32500.50"), true));
        ledgerEntries.add(new LoanAccount("103", "Arjun", new BigDecimal("0.00"), false));
        ledgerEntries.add(new LoanAccount("104", "Arya", new BigDecimal("158200.75"), true));

        // Map: build an index for O(1) lookup by loan ID
        Map<String, LoanAccount> ledgerIndex = new HashMap<>();
        for (LoanAccount entry : ledgerEntries) ledgerIndex.put(entry.loanId, entry);


        // Set: collect IDs of active loans only, kept sorted
        Set<String> activeLoanIds = new TreeSet<>();
        for (LoanAccount entry : ledgerEntries) if (entry.isActive) activeLoanIds.add(entry.loanId);


        System.out.println("--- Balance per account (List) ---");
        for (LoanAccount entry : ledgerEntries) System.out.printf("%-8s | %-14s | Rs.%-12s | %s%n", entry.loanId, entry.borrower, entry.outstandingBalance, entry.isActive ? "ACTIVE" : "CLOSED");


        System.out.println();
        System.out.println("--- Direct lookup by ID (Map) ---");
        String lookupId = "104";
        LoanAccount found = ledgerIndex.get(lookupId);
        if (found != null) System.out.println(lookupId + " -> " + found.borrower + ", balance Rs." + found.outstandingBalance);
        else System.out.println(lookupId + " not found in ledger.");

        System.out.println();
        System.out.println("--- Active accounts (Set) ---");
        System.out.println("Active loan IDs (sorted): " + activeLoanIds);
        System.out.println("Count of active accounts: " + activeLoanIds.size());
    }
}